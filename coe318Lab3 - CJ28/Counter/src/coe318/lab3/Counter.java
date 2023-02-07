/**
 *
 * @author Syeda Jahan
 */
package coe318.lab3;
public class Counter {
    private int Modulus;
    private int dig;
    private Counter Left;
    
    //Instance variables here
    public Counter(int modulus, Counter left) {
        this.Modulus = modulus;
        this.Left= left;
        this.dig = 0;
        
    }


    /**
     * @return the modulus
     */
    public int getModulus() {
        return Modulus;
    }

    /**
     * Returns the Counter to the left attached to this
     * Counter.  Returns null if there is no Counter
     * to the left.
     * @return the left
     */
    public Counter getLeft() {
        if (this.Left == null){
            return null;
        } else {
            return this.Left;
        }
        
    }

    /**
     * @return the digit
     */
    public int getDigit() {
        return this.dig;
    }

    /**
     * @param digit the digit to set
     */
    public void setDigit(int digit) {
        if (digit>=this.Modulus){
            this.dig = 0;
        } else {
            this.dig = digit;
        }
    }

    /**
     * Increment this counter.  If it rolls over,
     * its left Counter is also incremented if it
     * exists.
     */
    public void increment() {
        dig +=1;
        if (dig==Modulus){
            dig = 0;
            if (Left!= null) {
                Left.increment();
            }
        }
    }

    /** Return the count of this Counter combined
     * with any Counter to its left.
     *
     * @return the count
     */
    public int getCount() {
        if (Left == null){
            return dig;
        }else{
           return (dig + (Modulus*Left.getCount()));
        }
    }

    /** Returns a String representation of the Counter's
     * total count (including its left neighbour).
     * @return the String representation
     */
    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE
        return "" + getCount();
    }

}
