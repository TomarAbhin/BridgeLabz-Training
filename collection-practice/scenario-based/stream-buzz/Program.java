package stream-buzz;

import java.util.*;

public class Program {

	
	public static void registerCreator(CreatorStats record) {
		CreatorStats.engagementBoard.add(record);
		System.out.println("Creator Registered Successfully.");
		
	}
	
	public static  Map<String,Integer> getTopPostCounts(List<CreatorStats> records,double likeThresold){
		Map<String,Integer> ans=new HashMap<>();
		
		for(CreatorStats stats: records) {
			int count =0;
			for(double likes: stats.getWeeklyLikes()) {
				if(likes>=likeThresold) {
					count++;
				}
				
			}
			
			if(count>0) {
				ans.put(stats.getCreatorName(), count);
			}
		}
		return ans;
	}
	
	public double calculateAverageLikes() {

	    double totalLikes = 0.0;
	    int totalWeeks = 0;

	    for (CreatorStats stats : CreatorStats.engagementBoard) {
	        for (double likes : stats.getWeeklyLikes()) {
	            totalLikes += likes;
	            totalWeeks++;
	        }
	    }

	    if (totalWeeks == 0) {
	        return 0.0;
	    }

	    return totalLikes / totalWeeks;
	}
	
	public static void main(String[] args) {
		Program program=new Program();
		Scanner s=new Scanner(System.in);
		while(true) {
			System.out.println("1. Register Creator\r\n"
					+ "2. Show Top Posts\r\n"
					+ "3. Calculate Average Likes\r\n"
					+ "4. Exit\r\n"
					+ "Enter Option: ");
			
			int option=s.nextInt();
			
			switch(option) {
			
			case 1: System.out.println("Enter Creator Name: ");
					String creatorName=s.next();
					double []likes=new double[4];
					System.out.println("Enter Weekly Likes(Week 1 to 4): ");
					for(int i=0;i<4;i++) {
						likes[i]=s.nextInt();
					}
					s.nextLine();
					CreatorStats stats=new CreatorStats(creatorName,likes);
					program.registerCreator(stats);
					System.out.println();
					break;
					
			 case 2:
                 System.out.println("Enter like threshold:");
                 double threshold = s.nextDouble();
                 s.nextLine();

                 Map<String, Integer> topPosts =
                         program.getTopPostCounts(CreatorStats.engagementBoard, threshold);

                 if (topPosts.isEmpty()) {
                     System.out.println("No top-performing posts this week");
                 } else {
                     for (Map.Entry<String, Integer> entry : topPosts.entrySet()) {
                         System.out.println(entry.getKey() + " - " + entry.getValue());
                     }
                 }
                 System.out.println();
                 break;

             case 3:
                 double avg = program.calculateAverageLikes();
                 System.out.println("Overall average weekly likes: " + (int) avg);
                 System.out.println();
                 break;

             case 4:
                 System.out.println("Logging off - Keep Creating with StreamBuzz!");
                 return;

             default:
                 System.out.println("Invalid choice"); 
					
			}
		}
		
		
	}

}
