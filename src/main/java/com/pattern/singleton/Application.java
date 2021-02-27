package com.pattern.singleton;

public class Application {

	public static void main(String[] args) {
		
		PerformanceStage stage = PerformanceStage.getInstance();
		stage.turnOnLights();
		System.out.println(stage.getCounter());

		PerformanceStage stage2 = PerformanceStage.getInstance();
		PerformanceStage stage3 = PerformanceStage.getInstance();
		PerformanceStage stage4 = PerformanceStage.getInstance();
		PerformanceStage stage5 = PerformanceStage.getInstance();
		
		System.out.println(stage5.getCounter());
		
	}

}
