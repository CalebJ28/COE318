package coe318.lab5;

public class Card implements Comparable {
  //Symbolic constants

  public static final int CLUB = 0;
  public static final int DIAMOND = 1;
  public static final int HEART = 2;
  public static final int SPADE = 3;

  private int Rank;
  private int Suit;
  private boolean FaceSideUp;
  /**
   * Construct a card of the given rank, suit and whether it is faceup or
   * facedown. The rank is an integer from 2 to 14. Numbered cards (2 to 10)
   * have a rank equal to their number. Jack, Queen, King and Ace have the ranks
   * 11, 12, 13, and 14 respectively. The suit is an integer from 0 to 3 for
   * Clubs, Diamonds, Hearts and Spades respectively.
   *
   * @param rank
   * @param suit
   * @param faceUp
   */
  public Card(int rank, int suit, boolean faceUp) {
      this.Rank = rank;
      this.Suit = suit;
      this.FaceSideUp = faceUp;
    //FIX THIS
  }

  /**
   * @return the faceUp
   */
  public boolean isFaceUp() {
      if(this.FaceSideUp != true){
          return false;
      }
    return true; //FIX THIS
  }

  /**
   * @param faceUp the faceUp to set
   */
  public void setFaceUp(boolean faceUp) {
       if(this.FaceSideUp == faceUp){
          FaceSideUp = faceUp;
      }
      
    //FIX THIS
  }

  /**
   * @return the rank
   */
  public int getRank() {
    return this.Rank; //FIX THIS
  }

  /**
   * @return the suit
   */
  public int getSuit() {
    return this.Suit;//FIX THIS
  }

  @Override
  public boolean equals(Object ob) {
    if (!(ob instanceof Card)) {
      return false;
    }
    Card c = (Card) ob;
    if(this.Suit == c.Suit && this.Rank == c.Rank){//add comment
        return true;
    } else {
        return false;
    }
  }

  @Override
  public int hashCode() {//DO NOT MODIFY
    int hash = 7;
    hash = 31 * hash + this.getRank();
    hash = 31 * hash + this.getSuit();
    return hash;
  }

  @Override
  public int compareTo(Object obj) {//DO NOT MODIFY
    return compareTo((Card) obj);
  }

  public int compareTo(Card c) {
    return (this.Rank - c.Rank);//FIX THIS //add comment
  }

  /**
   * Return the rank as a String. For example, the 3 of Hearts produces the
   * String "3". The King of Diamonds produces the String "King".
   *
   * @return the rank String
   */
  public String getRankString() {
      String outR = "";//add comment
      if ((this.Rank) < 11){
          outR = String.valueOf(this.Rank);
      } else if((this.Rank) == 11){
          outR = "JACK";
      }else if((this.Rank) == 12){
          outR = "QUEEN";
      }else if((this.Rank) == 13){
          outR = "KING";  
      }else if((this.Rank) == 14){
          outR = "ACE";
          
      }
      
    return outR;//FIX THIS
  }

  /**
   * Return the suit as a String: "Clubs", "Diamonds", "Hearts" or "Spades".
   *
   * @return the suit String
   */
  public String getSuitString() {//add comment
      String outS = "";
      if (this.Suit == 0){
          outS = "CLUB";
      } else if((this.Suit) == 1){
          outS = "DIAMOND";
          } else if((this.Suit) == 2){
              outS = "HEART";            
              } else {
              outS = "SPADE";       
      }
    return outS; //FIX THIS
  }

  /**
   * Return "?" if the card is facedown; otherwise, the rank and suit of the
   * card.
   *
   * @return the String representation
   */
  @Override
  public String toString() {
      String out = "?";
      if(isFaceUp() == false){
          return out;   
      } else {
          String out2 = " Rank of card : " + getRankString() + ", " + " Suit of card : " + getSuitString();
          return out2;
      }
  }

  public static void main(String[] args) {
    //Create 5 of clubs
    Card club5 = new Card(5, 0, true);
    System.out.println("club5: " + club5);
    Card spadeAce = new Card(14, SPADE, true);
    System.out.println("spadeAce: " + spadeAce);
    System.out.println("club5 compareTo spadeAce: "
            + club5.compareTo(spadeAce));
    System.out.println("club5 compareTo club5: "
            + club5.compareTo(club5));
    System.out.println("club5 equals spadeAce: "
            + club5.equals(spadeAce));
    System.out.println("club5 equals club5: "
            + club5.equals(club5));
  }
}
