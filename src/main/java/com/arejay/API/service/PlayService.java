package com.arejay.API.service;

import org.springframework.stereotype.Service;

import com.arejay.API.Bean.Board;
import com.arejay.API.Bean.Player1;
import com.arejay.API.Bean.Player2;

@Service
public class PlayService {
	
	Board board;
	Player1 p1;
	Player2 p2;

	// Validate Player 1 move Yellow=1 and RED= -1
	public String validateMoveP1(int col) {
		if (board == null) {
			return "PLease start the game using api call /play4/START";
		}
		if (p1.getColor().equals("Yellow")) {
			if (board.getNumMoves() % 2 != 0) {
				if (col < 0 || col > 7) {
					return "Column value is not present on board.Please select a value from 1 to 7";
				} else {
					if (col == 1) {
						if (board.getC1() == 0) {
							return "No more empty space in column 1.";
						} else {
							board.setplayBoard(board.getC1() - 1, col - 1, 1);
							board.setC1(board.getC1() - 1);
							p1.setMoves(p1.getMoves() + col + " ");
							board.setNumMoves(board.getNumMoves() + 1);
						}
					} else if (col == 2) {
						if (board.getC2() == 0) {
							return "No more empty space in column 2.";
						} else {
							board.setplayBoard(board.getC2() - 1, col - 1, 1);
							board.setC2(board.getC2() - 1);
							p1.setMoves(p1.getMoves() + col + " ");
							board.setNumMoves(board.getNumMoves() + 1);
						}
					} else if (col == 3) {
						if (board.getC3() == 0) {
							return "No more empty space in column 3.";
						} else {
							board.setplayBoard(board.getC3() - 1, col - 1, 1);
							board.setC3(board.getC3() - 1);
							p1.setMoves(p1.getMoves() + col + " ");
							board.setNumMoves(board.getNumMoves() + 1);
						}
					} else if (col == 4) {
						if (board.getC4() == 0) {
							return "No more empty space in column 4.";
						} else {
							board.setplayBoard(board.getC4() - 1, col - 1, 1);
							board.setC4(board.getC4() - 1);
							p1.setMoves(p1.getMoves() + col + " ");
							board.setNumMoves(board.getNumMoves() + 1);
						}
					} else if (col == 5) {
						if (board.getC5() == 0) {
							return "No more empty space in column 5.";
						} else {
							board.setplayBoard(board.getC5() - 1, col - 1, 1);
							board.setC5(board.getC5() - 1);
							p1.setMoves(p1.getMoves() + col + " ");
							board.setNumMoves(board.getNumMoves() + 1);
						}
					} else if (col == 6) {
						if (board.getC6() == 0) {
							return "No more empty space in column 6.";
						} else {
							board.setplayBoard(board.getC6() - 1, col - 1, 1);
							board.setC6(board.getC6() - 1);
							p1.setMoves(p1.getMoves() + col + " ");
							board.setNumMoves(board.getNumMoves() + 1);
						}
					} else if (col == 7) {
						if (board.getC7() == 0) {
							return "No more empty space in column 7.";
						} else {
							board.setplayBoard(board.getC7() - 1, col - 1, 1);
							board.setC7(board.getC7() - 1);
							p1.setMoves(p1.getMoves() + col + " ");
							board.setNumMoves(board.getNumMoves() + 1);
						}
					}
				}
				if (board.getNumMoves() > 7) {
					return validateWin();
				}
				return "Valid Move \nPlayer1 :" + p1.getName() + "\nPlayer1 moves:" + p1.getMoves() + "\nPlayer2 :"
						+ p2.getName() + "\nPlayer2 moves:" + p2.getMoves();
			} else {
				return "It's not your turn";
			}
		} else {
			if (board.getNumMoves() % 2 == 0) {
				if (col < 0 || col > 7) {
					return "Column value is not present on board.Please select a value from 1 to 7";
				} else {
					if (col == 1) {
						if (board.getC1() == 0) {
							return "No more empty space in column 1.";
						} else {
							board.setplayBoard(board.getC1() - 1, col - 1, -1);
							board.setC1(board.getC1() - 1);
							p1.setMoves(p1.getMoves() + col + " ");
							board.setNumMoves(board.getNumMoves() + 1);
						}
					} else if (col == 2) {
						if (board.getC2() == 0) {
							return "No more empty space in column 2.";
						} else {
							board.setplayBoard(board.getC2() - 1, col - 1, -1);
							board.setC2(board.getC2() - 1);
							p1.setMoves(p1.getMoves() + col + " ");
							board.setNumMoves(board.getNumMoves() + 1);
						}
					} else if (col == 3) {
						if (board.getC3() == 0) {
							return "No more empty space in column 3.";
						} else {
							board.setplayBoard(board.getC3() - 1, col - 1, -1);
							board.setC3(board.getC3() - 1);
							p1.setMoves(p1.getMoves() + col + " ");
							board.setNumMoves(board.getNumMoves() + 1);
						}
					} else if (col == 4) {
						if (board.getC4() == 0) {
							return "No more empty space in column 4.";
						} else {
							board.setplayBoard(board.getC4() - 1, col - 1, -1);
							board.setC4(board.getC4() - 1);
							p1.setMoves(p1.getMoves() + col + " ");
							board.setNumMoves(board.getNumMoves() + 1);
						}
					} else if (col == 5) {
						if (board.getC5() == 0) {
							return "No more empty space in column 5.";
						} else {
							board.setplayBoard(board.getC5() - 1, col - 1, -1);
							board.setC5(board.getC5() - 1);
							p1.setMoves(p1.getMoves() + col + " ");
							board.setNumMoves(board.getNumMoves() + 1);
						}
					} else if (col == 6) {
						if (board.getC6() == 0) {
							return "No more empty space in column 6.";
						} else {
							board.setplayBoard(board.getC6() - 1, col - 1, -1);
							board.setC6(board.getC6() - 1);
							p1.setMoves(p1.getMoves() + col + " ");
							board.setNumMoves(board.getNumMoves() + 1);
						}
					} else if (col == 7) {
						if (board.getC7() == 0) {
							return "No more empty space in column 7.";
						} else {
							board.setplayBoard(board.getC7() - 1, col - 1, -1);
							board.setC7(board.getC7() - 1);
							p1.setMoves(p1.getMoves() + col + " ");
							board.setNumMoves(board.getNumMoves() + 1);
						}
					}
				}
				if (board.getNumMoves() > 7) {
					return validateWin();
				}
				return "Valid Move \nPlayer1 :" + p1.getName() + "\nPlayer1 moves:" + p1.getMoves() + "\nPlayer2 :"
						+ p2.getName() + "\nPlayer2 moves:" + p2.getMoves();
			} else {
				return "It's not your turn";
			}
		}

		// return null;
	}

	private String validateWin() {
		// System.out.println("*************Inside validate vin***************");
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				if (board.getplayBoard(i, j) == -1) {
					if (j + 3 < 7) {
						board.setHor(1);
						boolean falgHort = validatehorizontal(i, j + 1, -1);
						if (board.getHor() >= 4) {
							return "Yellow wins";
						}
					}
					if (i + 3 < 6) {
						board.setVer(1);
						boolean flagVert = validateVerticle(i + 1, j, -1);
						if (board.getVer() >= 4) {
							return "Yellow wins";
						}
					}
					if (i + 3 < 6 && j + 3 < 7) {
						board.setDiagright(1);
						boolean flagdiagRight = validateDiagright(i + 1, j + 1, -1);
						if (board.getDiagright() >= 4) {
							return "Yellow wins";
						}
					}
					if (i - 3 >= 0 && j + 3 < 7) {
						board.setDiagleft(1);
						boolean flagdiagLeft = validateDiagleft(i + 1, j - 1, -1);
						if (board.getDiagleft() >= 4) {
							return "Yellow wins";
						}
					}
				} else if (board.getplayBoard(i, j) == 1) {
					if (j + 3 < 7) {
						board.setHor(1);
						boolean falgHort = validatehorizontal(i, j + 1, 1);
						if (board.getHor() >= 4) {
							return "Red wins";
						}
					}
					if (i + 3 < 6) {
						board.setVer(1);
						boolean flagVert = validateVerticle(i + 1, j, 1);
						if (board.getVer() >= 4) {
							return "Red wins";
						}
					}
					if (i + 3 < 6 && j + 3 < 7) {
						board.setDiagright(1);
						boolean flagdiagRight = validateDiagright(i + 1, j + 1, 1);
						if (board.getDiagright() >= 4) {
							return "Red wins";
						}
					}
					if (i - 3 >= 0 && j + 3 < 7) {
						board.setDiagleft(1);
						boolean flagdiagLeft = validateDiagleft(i + 1, j - 1, 1);
						if (board.getDiagleft() >= 4) {
							return "Red wins";
						}
					}
				}

			}
		}
		return "Valid Move \nPlayer1 :" + p1.getName() + "\nPlayer1 moves:" + p1.getMoves() + "\nPlayer2 :"
				+ p2.getName() + "\nPlayer2 moves:" + p2.getMoves();
	}

	private boolean validateDiagleft(int i, int j, int val) {
		if (i == 6 || j < 0) {

			return false;
		}
		if (board.getDiagleft() == 4) {
			return true;
		}

		if (board.getplayBoard(i, j) == val) {
			board.setDiagleft(board.getDiagleft() + 1);
			validateDiagleft(i + 1, j - 1, val);
		}
		return false;
	}

	private boolean validateDiagright(int i, int j, int val) {
		if (i == 6 || j == 7) {

			return false;
		}
		if (board.getDiagright() == 4) {
			return true;
		}
		if (board.getplayBoard(i, j) == val) {
			board.setDiagright(board.getDiagright() + 1);
			validateDiagright(i + 1, j + 1, val);
		}
		return false;
	}

	private boolean validateVerticle(int i, int j, int val) {
		if (i == 6) {

			return false;
		}
		if (board.getVer() == 4) {
			return true;
		}
		if (board.getplayBoard(i, j) == val) {
			board.setVer(board.getVer() + 1);
			validateVerticle(i + 1, j, val);
		}
		return false;

	}

	private boolean validatehorizontal(int i, int j, int val) {
		if (j == 7) {

			return false;
		}
		if (board.getHor() == 4) {
			return true;
		}
		if (board.getplayBoard(i, j) == val) {
			board.setHor(board.getHor() + 1);
			validatehorizontal(i, j + 1, val);
		}
		return false;

	}

	// Validate Player 2 move
	public String validateMoveP2(int col) {
		if (board == null) {
			return "PLease start the game using api call /play4/START";
		}
		if (p2.getColor().equals("Yellow")) {
			if (board.getNumMoves() % 2 != 0) {
				if (col < 0 || col > 7) {
					return "Column value is not present on board.Please select a value from 1 to 7";
				} else {
					if (col == 1) {
						if (board.getC1() == 0) {
							return "No more empty space in column 1.";
						} else {
							board.setplayBoard(board.getC1() - 1, col - 1, 1);
							board.setC1(board.getC1() - 1);
							p2.setMoves(p2.getMoves() + col + " ");
							board.setNumMoves(board.getNumMoves() + 1);
						}
					} else if (col == 2) {
						if (board.getC2() == 0) {
							return "No more empty space in column 2.";
						} else {
							board.setplayBoard(board.getC2() - 1, col - 1, 1);
							board.setC2(board.getC2() - 1);
							p2.setMoves(p2.getMoves() + col + " ");
							board.setNumMoves(board.getNumMoves() + 1);
						}
					} else if (col == 3) {
						if (board.getC3() == 0) {
							return "No more empty space in column 3.";
						} else {
							board.setplayBoard(board.getC3(), col - 1, 1);
							board.setC3(board.getC3() - 1);
							p2.setMoves(p2.getMoves() + col + " ");
							board.setNumMoves(board.getNumMoves() + 1);
						}
					} else if (col == 4) {
						if (board.getC4() == 0) {
							return "No more empty space in column 4.";
						} else {
							board.setplayBoard(board.getC4() - 1, col - 1, 1);
							board.setC4(board.getC4() - 1);
							p2.setMoves(p2.getMoves() + col + " ");
							board.setNumMoves(board.getNumMoves() + 1);
						}
					} else if (col == 5) {
						if (board.getC5() == 0) {
							return "No more empty space in column 5.";
						} else {
							board.setplayBoard(board.getC5() - 1, col - 1, 1);
							board.setC5(board.getC5() - 1);
							p2.setMoves(p2.getMoves() + col + " ");
							board.setNumMoves(board.getNumMoves() + 1);
						}
					} else if (col == 6) {
						if (board.getC6() == 0) {
							return "No more empty space in column 6.";
						} else {
							board.setplayBoard(board.getC6() - 1, col - 1, 1);
							board.setC6(board.getC6() - 1);
							p2.setMoves(p2.getMoves() + col + " ");
							board.setNumMoves(board.getNumMoves() + 1);
						}
					} else if (col == 7) {
						if (board.getC7() == 0) {
							return "No more empty space in column 7.";
						} else {
							board.setplayBoard(board.getC7() - 1, col - 1, 1);
							board.setC7(board.getC7() - 1);
							p2.setMoves(p2.getMoves() + col + " ");
							board.setNumMoves(board.getNumMoves() + 1);
						}
					}
				}
				if (board.getNumMoves() > 7) {
					return validateWin();
				}
				return "Valid Move \nPlayer1 :" + p1.getName() + "\nPlayer1 moves:" + p1.getMoves() + "\nPlayer2 :"
						+ p2.getName() + "\nPlayer2 moves:" + p2.getMoves();
			} else {
				return "It's not your turn";
			}
		} else {
			if (board.getNumMoves() % 2 == 0) {
				if (col < 0 || col > 7) {
					return "Column value is not present on board.Please select a value from 1 to 7";
				} else {
					if (col == 1) {
						if (board.getC1() == 0) {
							return "No more empty space in column 1.";
						} else {
							board.setplayBoard(board.getC1() - 1, col - 1, -1);
							board.setC1(board.getC1() - 1);
							p2.setMoves(p2.getMoves() + col + " ");
							board.setNumMoves(board.getNumMoves() + 1);
						}
					} else if (col == 2) {
						if (board.getC2() == 0) {
							return "No more empty space in column 2.";
						} else {
							board.setplayBoard(board.getC2() - 1, col - 1, -1);
							board.setC2(board.getC2() - 1);
							p2.setMoves(p2.getMoves() + col + " ");
							board.setNumMoves(board.getNumMoves() + 1);
						}
					} else if (col == 3) {
						if (board.getC3() == 0) {
							return "No more empty space in column 3.";
						} else {
							board.setplayBoard(board.getC3()-1, col - 1, -1);
							board.setC3(board.getC3() - 1);
							p2.setMoves(p2.getMoves() + col + " ");
							board.setNumMoves(board.getNumMoves() + 1);
						}
					} else if (col == 4) {
						if (board.getC4() == 0) {
							return "No more empty space in column 4.";
						} else {
							board.setplayBoard(board.getC4() - 1, col - 1, -1);
							board.setC4(board.getC4() - 1);
							p2.setMoves(p2.getMoves() + col + " ");
							board.setNumMoves(board.getNumMoves() + 1);
						}
					} else if (col == 5) {
						if (board.getC5() == 0) {
							return "No more empty space in column 5.";
						} else {
							board.setplayBoard(board.getC5() - 1, col - 1, -1);
							board.setC5(board.getC5() - 1);
							p2.setMoves(p2.getMoves() + col + " ");
							board.setNumMoves(board.getNumMoves() + 1);
						}
					} else if (col == 6) {
						if (board.getC6() == 0) {
							return "No more empty space in column 6.";
						} else {
							board.setplayBoard(board.getC6() - 1, col - 1, -1);
							board.setC6(board.getC6() - 1);
							p2.setMoves(p2.getMoves() + col + " ");
							board.setNumMoves(board.getNumMoves() + 1);
						}
					} else if (col == 7) {
						if (board.getC7() == 0) {
							return "No more empty space in column 7.";
						} else {
							board.setplayBoard(board.getC7() - 1, col - 1, -1);
							board.setC7(board.getC7() - 1);
							p2.setMoves(p2.getMoves() + col + " ");
							board.setNumMoves(board.getNumMoves() + 1);
						}
					}
				}
				if (board.getNumMoves() > 7) {
					return validateWin();
				}
				return "Valid Move \nPlayer1 :" + p1.getName() + "\nPlayer1 moves:" + p1.getMoves() + "\nPlayer2 :"
						+ p2.getName() + "\nPlayer2 moves:" + p2.getMoves();
			} else {
				return "It's not your turn";
			}
		}

		// return null;
	}

	// Initialising the board
	public String initBoard() {
		board = new Board();
		p1 = new Player1();
		p2 = new Player2();
		return "Ready \nPlayer1 name="+p1.getName()+"\nPlayer2 name="+p2.getName();

	}

	// Setting player color
	public String setPlayersColor(String color) {
		if (color.equals("Yellow")) {
			p1.setColor("Yellow");
			p2.setColor("Red");
		} else if(color.equals("RED")){
			p2.setColor("Yellow");
			p1.setColor("Red");
		}
		return "Player1 " + p1.getName() + " chose color " + p1.getColor() + ". Plyer2 " + p2.getName()
				+ " chose color " + p2.getColor();
	}
}
