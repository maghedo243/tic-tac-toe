import java.util.Random;

public class TTTAI {
	
	private String outType;
	
	public void easyMove(String[] top, String[] mid, String[]low) {
		Boolean turning = true;
		int space;
		Random rndm = new Random();
		
		while(turning) {
			space = rndm.nextInt(1,10);
			
			if(space == 1) {
				if(!top[0].equals("-")) {
					continue;
				}
				top[0] = "O";
			} else if(space == 2) {
				if(!top[1].equals("-")) {
					continue;
				}
				top[1] = "O";
			} else if(space == 3) {
				if(!top[2].equals("-")) {
					continue;
				}
				top[2] = "O";
			} else if(space == 4) {
				if(!mid[0].equals("-")) {
					continue;
				}
				mid[0] = "O";
			} else if(space == 5) {
				if(!mid[1].equals("-")) {
					continue;
				}
				mid[1] = "O";
			} else if(space == 6) {
				if(!mid[2].equals("-")) {
					continue;
				}
				mid[2] = "O";
			} else if(space == 7) {
				if(!low[0].equals("-")) {
					continue;
				}
				low[0] = "O";
			} else if(space == 8) {
				if(!low[1].equals("-")) {
					continue;
				}
				low[1] = "O";
			} else if(space == 9) {
				if(!mid[2].equals("-")) {
					continue;
				}
				low[2] = "O";
			}
			turning = false;
		}
	}

	public void mediumMove(String[] top, String[] mid, String[]low) {
		Boolean turning = true;
		int space;
		Random rndm = new Random();
		if(true) {
			//Horizontal Lane Sensing
			if(top[0].equals("X") && top[1].equals("X") && top[2].equals("-")) {
				top[2] = "O";
			} else if(mid[0].equals("X") && mid[1].equals("X") && mid[2].equals("-")) {
				mid[2] = "O";
			} else if(low[0].equals("X") && low[1].equals("X") && low[2].equals("-")) {
				low[2] = "O";
			} else if(top[1].equals("X") && top[2].equals("X") && top[0].equals("-")) {
				top[0] = "O";
			} else if(mid[1].equals("X") && mid[2].equals("X") && mid[0].equals("-")) {
				mid[0] = "O";
			} else if(low[1].equals("X") && low[2].equals("X") && low[0].equals("-")) {
				low[0] = "O";
			} else if(top[2].equals("X") && top[0].equals("X") && top[1].equals("-")) {
				top[1] = "O";
			} else if(mid[2].equals("X") && mid[0].equals("X") && mid[1].equals("-")) {
				mid[1] = "O";
			} else if(low[2].equals("X") && low[0].equals("X") && low[1].equals("-")) {
				low[1] = "O";
			} //Vertical Lane Sensing
			else if(top[0].equals("X") && mid[0].equals("X") && low[0].equals("-")) {
				low[0] = "O";
			} else if(top[1].equals("X") && mid[1].equals("X") && low[1].equals("-")) {
				low[1] = "O";
			} else if(top[2].equals("X") && mid[2].equals("X") && low[2].equals("-")) {
				low[2] = "O";
			} 
			else if(low[0].equals("X") && mid[0].equals("X") && top[0].equals("-")) {
				top[0] = "O";
			} else if(low[1].equals("X") && mid[1].equals("X") && top[1].equals("-")) {
				top[1] = "O";
			} else if(low[2].equals("X") && mid[2].equals("X") && top[2].equals("-")) {
				top[2] = "O";
			}
			else if(top[0].equals("X") && low[0].equals("X") && mid[0].equals("-")) {
				mid[0] = "O";
			} else if(top[1].equals("X") && low[1].equals("X") && mid[1].equals("-")) {
				mid[1] = "O";
			} else if(top[2].equals("X") && low[2].equals("X") && mid[2].equals("-")) {
				mid[2] = "O";
			} //Diagonal Lane Sensing
			else if(top[0].equals("X") && mid[1].equals("X") && low[2].equals("-")) {
				low[2] = "O";
			} else if(top[0].equals("X") && low[2].equals("X") && mid[1].equals("-")) {
				mid[1] = "O";
			} else if(low[2].equals("X") && mid[1].equals("X") && top[0].equals("-")) {
				top[0] = "O";
			} 
			else if(top[2].equals("X") && mid[1].equals("X") && low[0].equals("-")) {
				low[0] = "O";
			} else if(top[2].equals("X") && low[0].equals("X") && mid[1].equals("-")) {
				mid[1] = "O";
			} else if(low[0].equals("X") && mid[1].equals("X") && top[2].equals("-")) {
				top[2] = "O";
			} else {
				while(turning) {
					space = rndm.nextInt(1,10);
					
					if(space == 1) {
						if(!top[0].equals("-")) {
							continue;
						}
						top[0] = "O";
					} else if(space == 2) {
						if(!top[1].equals("-")) {
							continue;
						}
						top[1] = "O";
					} else if(space == 3) {
						if(!top[2].equals("-")) {
							continue;
						}
						top[2] = "O";
					} else if(space == 4) {
						if(!mid[0].equals("-")) {
							continue;
						}
						mid[0] = "O";
					} else if(space == 5) {
						if(!mid[1].equals("-")) {
							continue;
						}
						mid[1] = "O";
					} else if(space == 6) {
						if(!mid[2].equals("-")) {
							continue;
						}
						mid[2] = "O";
					} else if(space == 7) {
						if(!low[0].equals("-")) {
							continue;
						}
						low[0] = "O";
					} else if(space == 8) {
						if(!low[1].equals("-")) {
							continue;
						}
						low[1] = "O";
					} else if(space == 9) {
						if(!mid[2].equals("-")) {
							continue;
						}
						low[2] = "O";
					}
					turning = false;
				}
			}
			
		}
	}

	public void hardMove(String[] top, String[] mid, String[] low, int moves) {
		if (moves == 2) {
			if(top[0].equals("X")) {
				outType = "TL";
			} else if(top[1].equals("X")) {
				outType = "TC";
			} else if(top[2].equals("X")) {
				outType = "TR";
			} else if(mid[0].equals("X")) {
				outType = "ML";
			}  else if(mid[1].equals("X")) {
				outType = "C";
			}  else if(mid[2].equals("X")) {
				outType = "MR";
			} else if(low[0].equals("X")) {
				outType = "BL";
			} else if(low[1].equals("X")) {
				outType = "BC";
			} else if(low[2].equals("X")) {
				outType = "BR";
			} 
			
			if(outType.equals("TL") || outType.equals("TC") || outType.equals("TR") || outType.equals("ML") ||outType.equals("MR") || outType.equals("BL") || outType.equals("BC") || outType.equals("BR")) {
				mid[1] = "O";
			} else if(outType.equals("C")) {
				top[0] = "O";
			}
		} else if (moves == 4) {
			if(outType.equals("TL")) {
				if(top[1].equals("X")) {
					top[2] = "O";
				} else if (top[2].equals("X") || low[2].equals("X")) {
					top[1] = "O";
				} else if (mid[0].equals("X")) {
					low[0] = "O";
				} else if (low[0].equals("X")) {
					mid[0] = "O";
				} else if (low[1].equals("X")) {
					mid[2] = "O";
				} else if (mid[2].equals("X")) {
					low[1] = "O";
				}
			}
		} else if (moves == 6) {
			if(outType.equals("TL")) {
				if(top[0].equals("X") && top[1].equals("X") && mid[0].equals("X")) {
					if(top[2].equals("O")) {
						low[0] = "O";
					} else if (low[0].equals("O")) {
						top[2] = "O";
					}
				} else if (top[0].equals("X") && top[2].equals("X") && low[2].equals("X")) {
					if(top[1].equals("O")) {
						low[1] = "O";
					} else if (low[1].equals("O")) {
						top[1] = "O";
					}
				} else if(top[0].equals("X") && top[2].equals("X") && low[0].equals("X")) {
					if(mid[0].equals("O")) {
						mid[2] = "O";
					} else if (top[1].equals("O")) {
						low[1] = "O";
					}
				} else if (top[0].equals("X") && low[0].equals("X") && low[2].equals("X")) {
					if(mid[0].equals("O")) {
						mid[2] = "O";
					} else if (top[1].equals("O")) {
						low[1] = "O";
					}
				} else if (top[0].equals("X") && low[0].equals("X") && low[1].equals("X")) {
					if (mid[0].equals("O")) {
						mid[2] = "O";
					} else if (mid[2].equals("O")) {
						mid[0] = "O";
					}
				} else if (top[0].equals("X") && top[2].equals("X") && mid[2].equals("X")) {
					if (top[1].equals("O")) {
						low[1] = "O";
					} else if (low[1].equals("O")) {
						top[1] = "O";
					}
				} else if(top[0].equals("X") && mid[0].equals("X") && mid[2].equals("X")) {
					if(low[0].equals("O")) {
						top[2] = "O";
					} else if (low[1].equals("O")) {
						top[1] = "O";
					}
				} else if (top[0].equals("X") && mid[2].equals("X") && low[2].equals("X")) {
					if(top[1].equals("O")) {
						low[1] = "O";
					} else if (low[1].equals("O")) {
						top[1] = "O";
					}
				} else if (top[0].equals("X") && top[1].equals("X") && low[1].equals("X")) {
					if(top[2].equals("O")) {
						low[0] = "O";
					} else if (mid[2].equals("O")) {
						mid[0] = "O";
					}
				} else if (top[0].equals("X") && mid[0].equals("X") && top[2].equals("X")) {
					if(top[1].equals("O")) {
						low[1] = "O";
					} else if(low[0].equals("O")) {
						top[1] = "O";
					}
				} else if (top[0].equals("X") && top[1].equals("X") && low[0].equals("X")) {
					if(mid[0].equals("O")) {
						mid[2] = "O";
					} else if (top[2].equals("O")) {
						mid[0] = "O";
					}
				} else if (top[0].equals("X") && top[1].equals("X") && mid[2].equals("X")) {
					if(top[2].equals("O")) {
						low[0] = "O";
					} else if (low[1].equals("O")) {
						top[2] = "O";
					}
				} else if (top[0].equals("X") && low[1].equals("X") && low[2].equals("X")) {
					if(mid[2].equals("O")) {
						mid[0] = "O";
					} else if (top[1].equals("O")) {
						low[0] = "O";
					}
				} else if (top[0].equals("X") && mid[0].equals("X") && low[1].equals("X")) {
					if(low[0].equals("O")) {
						top[2] = "O";
					} else if(mid[2].equals("O")) {
						low[0] = "O";
					}
				} else if(top[0].equals("X") && top[2].equals("X") && low[1].equals("X")){
					if(mid[2].equals("O")) {
						mid[0] = "O";
					} else if (top[1].equals("O")) {
						mid[0] = "O";
					}
				} else if (top[0].equals("X") && low[0].equals("X") && mid[2].equals("X")) {
					if(low[1].equals("O")) {
						top[1] = "O";
					} else if(mid[0].equals("O")) {
						top[1] = "O";
					}
				} else if (top[0].equals("X") && mid[0].equals("X") && low[2].equals("X")) {
					if(low[0].equals("O")) {
						top[2] = "O";
					} else if(top[1].equals("O")) {
						low[1] = "O";
					}
				} else if (top[0].equals("X") && top[1].equals("X") && low[2].equals("X")) {
					low[0] = "O";
				}
			} // end TL if
		} else if (moves == 8) {
			if (outType.equals("TL")) {
				if (top[0].equals("X") && top[2].equals("X") && mid[0].equals("X") && mid[2].equals("X")) {
					low[1] = "O";
				} else if (top[1].equals("O") && mid[1].equals("O") && low[0].equals("O")) {
					if(top[2].equals("X")) {
						if(low[1].equals("X")) {
							mid[2] = "O";
						} else {
							low[1] = "O";
						}
					} else {
						if(top[1].equals("O")) {
							top[2] = "O";
						} else {
							top[1] = "O";
						}
					}
				} else if (top[0].equals("X") && top[1].equals("X") && mid[2].equals("X") && low[2].equals("X")) {
					if (top[2].equals("O") && mid[1].equals("O") && low[0].equals("-")){
						low[0] = "O";
					} else if(mid[0].equals("O")) {
						low[1] = "O";
					} else if (low[1].equals("O")) {
						mid[0] = "O";
					}
				} else if (top[0].equals("X") && top[1].equals("X") && mid[0].equals("X") && mid[2].equals("X")) {
					low[0] = "O";
				} else if (top[0].equals("X") && top[1].equals("X") && low[0].equals("X") && low[1].equals("X")) {
					mid[2] = "O";
				} else if (mid[1].equals("X") && top[0].equals("X") && low[0].equals("X") && low[1].equals("X")) {
					low[2] = "O";
				} else if (top[2].equals("X") && top[0].equals("X") && mid[2].equals("X") && low[1].equals("X")) {
					low[2] = "O";
				} else if (top[0].equals("X") && mid[0].equals("X") && low[1].equals("X") && low[2].equals("X")) {
					if (top[2].equals("X")) {
						top[1] = "O";
					} else {
						top[2] = "O";
					}
				} else if (top[0].equals("X") && top[1].equals("X") && mid[0].equals("X") && low[1].equals("X")) {
					top[2] = "O";
				} else if (top[0].equals("X") && top[1].equals("X") && low[0].equals("X") && low[2].equals("X")) {
					mid[2] = "O";
				} else if (top[0].equals("X") && top[2].equals("X")&& mid[2].equals("X") && low[0].equals("X")) {
					low[1] = "O";
				} else if (top[0].equals("X") && low[2].equals("X")&& mid[2].equals("X") && low[0].equals("X")) {
					low[1] = "O";
				} else if (top[0].equals("X") && top[2].equals("X") && low[0].equals("X") && low[1].equals("X")) {
					mid[2] = "O";
				} else if (top[0].equals("X") && top[2].equals("X") && low[2].equals("X") && low[1].equals("X")) {
					mid[2] = "O";
				} else if (top[0].equals("X") && top[1].equals("X") && mid[2].equals("X") && low[0].equals("X")) {
					if(low[1].equals("O")) {
						mid[0] = "O";
					} else {
						low[1] = "O";
					}
				} else if (top[0].equals("X") && top[2].equals("X") && mid[0].equals("X") && low[1].equals("X")) {
					top[1] = "O";
				} else if (top[0].equals("X") && mid[2].equals("X") && low[0].equals("X") && low[1].equals("X")) {
					low[2] = "O";
				}
			} // end TL if
		}
	}

}

