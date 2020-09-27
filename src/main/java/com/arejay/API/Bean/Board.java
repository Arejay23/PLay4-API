package com.arejay.API.Bean;

public class Board {
	int row=6;
	int column=7;
	int[][] playBoard;
	// values to keep track of the last empty row for each column
	int c1=0;
	int numMoves;
	int ver=0;
	int hor=0;
	int diagright=0;
	int diagleft=0;
	
	public int getDiagright() {
		return diagright;
	}


	public void setDiagright(int diagright) {
		this.diagright = diagright;
	}


	public int getDiagleft() {
		return diagleft;
	}


	public void setDiagleft(int diagleft) {
		this.diagleft = diagleft;
	}


	public int getVer() {
		return ver;
	}


	public void setVer(int ver) {
		this.ver = ver;
	}


	public int getHor() {
		return hor;
	}


	public void setHor(int hor) {
		this.hor = hor;
	}


	public int getNumMoves() {
		return numMoves;
	}


	public void setNumMoves(int numMoves) {
		this.numMoves = numMoves;
	}
	
	public int getplayBoard(int r,int c) {
		return playBoard[r][c];
	}
	
	public void setplayBoard(int r,int c,int val) {
		playBoard[r][c]=val;
	}


	public int getC1() {
		return c1;
	}


	public void setC1(int c1) {
		this.c1 = c1;
	}


	public int getC2() {
		return c2;
	}


	public void setC2(int c2) {
		this.c2 = c2;
	}


	public int getC3() {
		return c3;
	}


	public void setC3(int c3) {
		this.c3 = c3;
	}


	public int getC4() {
		return c4;
	}


	public void setC4(int c4) {
		this.c4 = c4;
	}


	public int getC5() {
		return c5;
	}


	public void setC5(int c5) {
		this.c5 = c5;
	}


	public int getC6() {
		return c6;
	}


	public void setC6(int c6) {
		this.c6 = c6;
	}


	public int getC7() {
		return c7;
	}


	public void setC7(int c7) {
		this.c7 = c7;
	}


	int c2=0;
	int c3=0;
	int c4=0;
	int c5=0;
	int c6=0;
	int c7=0;
	
	
	public Board(){
		playBoard=new int[row][column];
		c1=6;
		c2=6;
		c3=6;
		c4=6;
		c5=6;
		c6=6;
		c7=6;
		numMoves=1;
		
	}
}
