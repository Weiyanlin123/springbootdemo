package com.example.xioamademo.test;

import java.util.concurrent.*;

public class Demo08 {
public static void main(String[] args) throws InterruptedException, ExecutionException {
// 1. 定义一个任务类对象
	Callable<Integer> task = new Test08(100);

	// 2. 创建一个线程池对象
	ExecutorService exec = Executors.newSingleThreadExecutor();

// 3. 提交任务
	Future<Integer> future = exec.submit(task);

	System.out.println("... 任务已提交 ...");
	// 4. 调用future对象的get方法, 获取结果
	// 如有必要，等待计算完成，然后获取其结果.
	Integer result = future.get();

	// 5. 查看结果
	System.out.println("result = " + result);

	System.out.println("... main线程代码执行完成 ...");
   }
   }

class Test08 implements Callable<Integer> {
	// 属性
	private int number;

	public Test08(int number) {
		this.number = number;
	}

	@Override
	public Integer call() throws Exception {
	int sum = 0;
	// 模拟耗时操作, 睡 3 秒钟
	//Thread.sleep(3000);
	for (int i = 1; i <= number; i++) {
		sum += i;
	}
	return sum;
	}
  }