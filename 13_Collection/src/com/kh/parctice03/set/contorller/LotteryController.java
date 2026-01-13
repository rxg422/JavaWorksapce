package com.kh.parctice03.set.contorller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import com.kh.parctice03.set.compare.SortedLottery;
import com.kh.parctice03.set.mode.vo.Lottery;

public class LotteryController {
	
	private HashSet<Lottery> lottery = new HashSet<>();
	private HashSet<Lottery> win = new HashSet<>();
	
	public boolean insertObject(Lottery l) {
		Lottery lt = searchObject(l);
		
		if(lt != null) {
			return false;
		}
		
		lottery.add(l);
		return true;
	}
	
	public boolean deleteObject(Lottery l) {
		Lottery lt = searchObject(l);
		
		if(lt == null) {
			return false;
		}
		
		lottery.remove(lt);
		
		if(searchWinner(l)) {
			win.remove(lt);
		}
		
		return true;
	}
	
	public HashSet<Lottery> winObject() {
		ArrayList<Lottery> list = new ArrayList<>(lottery);
		Lottery l;
		
		if(lottery.size()<4) {
			return null;
		}
		
		while(true) {
			if(win.size() >= 4 ) {
				break;
			}
			
			l = list.get((int) ((Math.random()*list.size())));
			if(!searchWinner(l)) {
				win.add(l);
			}
		}
		
		return win;
	}
	
	public TreeSet<Lottery> sortedWinObject() {
		TreeSet<Lottery> tree = new TreeSet<Lottery>(new SortedLottery());
		tree.addAll(win);
		
		return tree;
	}
	
	public boolean searchWinner(Lottery l) {
		Iterator<Lottery> iter = win.iterator();
		
		while(iter.hasNext()) {
			Lottery lt = iter.next();
			
			if(lt.equals(l)) {
				return true;
			}
		}
		
		return false;
	}
	
	public Lottery searchObject(Lottery l) {
		Iterator<Lottery> iter = lottery.iterator();
		
		while(iter.hasNext()) {
			Lottery lt = iter.next();
			
			if(lt.equals(l)) {
				return lt;
			}
		}
		
		return null;
	}
	
}
