package com.cg.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class UndoRedoFucntionality {
	private static void performActionFromFrontEnd(String action, Deque<String> actionHistory) {
		System.out.println("Performing Actin" + action);
		actionHistory.addFirst(action);
	}
private static void performActionFromRearEnd(String action, Deque<String> actionHistory) {
	actionHistory.addLast(action);
	}

	public static void main(String[] args) {
		Deque<String> actionHistory = new ArrayDeque<>();
		performActionFromFrontEnd("input 1",actionHistory);
		performActionFromFrontEnd("input 2",actionHistory);
		performActionFromFrontEnd("input 3",actionHistory);
		System.out.println(actionHistory);
		
		performActionFromRearEnd("Actin 1", actionHistory);
		performActionFromRearEnd("Actin 2", actionHistory);
		performActionFromRearEnd("Actin 3", actionHistory);
		System.out.println(actionHistory);
		
		if(!actionHistory.isEmpty()) {
			String LastAction = actionHistory.removeLast();
			System.out.println("Undo:" + LastAction);
		}
		if(!actionHistory.isEmpty()) {
			String LastAction = actionHistory.removeFirst();
			System.out.println("Redo:" + LastAction);
		}
		
	}

}
