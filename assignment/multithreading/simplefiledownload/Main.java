package assignment.multithreading.simplefiledownload;

import java.util.Scanner;

public class Main {

 	public static void main(String[] args) {
 		
 		//https://masstamilan.com.in/download/hash/78073
 		//C:\\Users\\ASUS\\Desktop\\sample\\myfile.mp3
 		
 		Scanner scanner=new Scanner(System.in);
 		
 		System.out.println("👇 Put Your File Downloade link 👇");
 		String fileURL = scanner.nextLine();
 		
 		System.out.println("👇 Put Your System Local Path 👇");
        String downloadePath = scanner.nextLine();

        FileDownloader downloader = new FileDownloader(fileURL, downloadePath);
        downloader.start();

        try {
            Thread.sleep(10000);
            downloader.stopDownload();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}

}
