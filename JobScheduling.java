import java.io.*;
import java.lang.*;
import java.util.*;

public class JobScheduling {
	static void jobScheduling(ArrayList<Job> arr) {
        int n = arr.size();
        Collections.sort(arr, (a, b) -> {
            return a.deadline - b.deadline;
        });

        ArrayList<Job> result = new ArrayList<>();
        PriorityQueue<Job> maxHeap = new PriorityQueue<>((a, b) -> {
            return b.profit - a.profit;
        });

        for (int i = n - 1; i > -1; i--) {
            int slot_available;
            if (i == 0)
                slot_available = arr.get(i).deadline;
            else
                slot_available = arr.get(i).deadline - arr.get(i - 1).deadline;

            maxHeap.add(arr.get(i));

            while (slot_available > 0 && maxHeap.size() > 0) {
                Job job = maxHeap.remove();
                slot_available--;
                result.add(job);
            }
        }

        Collections.sort(result, (a, b) -> {
            return a.deadline - b.deadline;
        });

        System.out.print("\n\n\nJob Scheduling Problem:\nFollowing is maximum profit sequence of jobs: \n");
        for (Job job : result) {
            System.out.printf("[%s, %d, %d] -> ", job.job_id, job.deadline, + job.profit);
        }
        System.out.print("Finish");
    }
	
	public static void main(String ar[])
	{
		
		jobScheduling(new ArrayList<Job>(Arrays.asList(
	            new Job('A', 2, 100),
	            new Job('B', 1, 19),
	            new Job('C', 2, 27),
	            new Job('D', 1, 25),
	            new Job('E', 3, 15)
	        )));
	}


}
