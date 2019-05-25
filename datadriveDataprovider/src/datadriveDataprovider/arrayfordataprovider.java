package datadriveDataprovider;

public class arrayfordataprovider {
	
	public static void main(String[]args) {
	/*	
		String[] rowaddition = {"rohan","rohana","rohanb","rohanc"};
		
	int l =	rowaddition.length;
	System.out.println(l);
	for (int i=0 ;i<l;i++) {
		
		System.out.println(rowaddition[i]);
	}*/
		
		/*int[] arr = new int[5];
		arr[0]=2 ;
		arr[1]=4;
		arr[2]=7 ;
		arr[3]=9 ;
		arr[4]=8 ;
		for (int i=0 ; i<arr.length ;i++) {
			System.out.println(arr[i]);
		}*/
			
	/*	//print * with #
		for (int i=0 ;i<5 ;i++) {
			
			for(int j=0 ;j<5-i ;j++) {
				
				System.out.print("*");
			}
			for(int k=0 ; k<=i ;k++) {
				System.out.print("#");
			}
			
			System.out.println();*/
		
	/*	
		 int[][] arr= { {2,7,9},{3,6,1},{7,4,2} };
		 
		 for(int i=0 ;i<arr.length ;i++) {
			 
			 for (int j=0 ;j<3 ;j++) {
				 System.out.println( "array value at posittion "+ i+j+":"+arr[i][j]);
				}
			 }
			 
		 */
	
	/*	
		for (int i=0;i<5 ;i++) {
			
			for(int j =0 ;j<5-i ;j++) {
				
				System.out.print(" ");
			}
			for (int k =0 ;k<=i ; k++) {
				System.out.print("* ");
			}
			for(int l=0 ;l<5-i ;l++) {
			System.out.print("$ ");	
			}
			for(int m=0; m<5-i ;m++) {
				System.out.print("* ");
			}
			for(int n=0; n<5-i ;n++) {
				System.out.print("# ");
		    }
			for(int p=0; p<i+1; p++) {
				System.out.print("* ");
				
			}
			
			System.out.println();
		}*/
		
		
		for(int i=0 ; i<6 ;i++) {
			
			for (int j=0 ;j<6-i;j++) {
				System.out.print(" ");
			}
			for(int k=0 ;k<i+1; k++ ) {
				System.out.print("* ");
			}
			
			for(int l=0 ;l<6-i;l++) {
				System.out.print(". ");
			}
			for(int n=0; n<i+1 ;n++) {
				System.out.print("* ");
			}
			for(int s=0 ;s<6-i; s++) {
				System.out.print(".  ");
			}

			for(int d=0 ;d<6-i;d++) {
				System.out.print(".  ");
			}
			for(int g =0; g<i+1 ;g++) {
				System.out.print("* ");
			}
			for(int x=0 ;x<6-i; x++) {
				System.out.print(". ");
			}
			System.out.println();
			
		    }
		
		}
		
		
		
		
	}

	
