package com.williamdy.bp.math;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


public class HavyLoadCPU {

	
	public static class MyTask implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {
				Thread.sleep(10000);
				System.out.println("circle " + System.currentTimeMillis());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	};
	
	public static void main(String[] args) {
		TimeUnit unit = TimeUnit.SECONDS;
		HavyLoadCPU.MyTask task = new MyTask();
		BlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<>(5);
		//�̳߳������ܿ��߳������������Ƹ���
		//����5ʱ �ŵ�����������Ŷ� ����10ʱ �ܾ�
		ThreadPoolExecutor executor  = new ThreadPoolExecutor(5, 10, 500, unit , workQueue );
		executor.execute(task);
		executor.execute(task);
		executor.execute(task);
		executor.execute(task);
		executor.execute(task);
		executor.execute(task);
		executor.execute(task);
		executor.execute(task);
		executor.execute(task);
		executor.execute(task);
		executor.execute(task);
		executor.execute(task);
		executor.shutdown();
	}
	
}
