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
		//线程池用来管控线程数量进而控制负载
		//大于5时 放到缓存队列中排队 大于10时 拒绝
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
