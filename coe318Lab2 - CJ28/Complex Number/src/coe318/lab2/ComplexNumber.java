package coe318.lab2;

/**
 * ComplexNumber models a complex number expressed in rectangular form (real and
 * imaginary parts). It is an <em>immutable</em> object.
 *
 * @author Your Name
 */
public class ComplexNumber {
//Instance variable declarations
    private double Imaginary;
    private double Real;

    /**
     * Construct a ComplexNumber given its real and imaginary parts.
     *
     * @param re The real component
     * @param im The imaginary component
     */
    public ComplexNumber(double re, double im) {
//Initialize the instance variables
    Imaginary = im;
    Real = re;
    }

    /**
     * Returns the real component.
     *
     * @return the real
     */
    public double getReal() {
        return Real;	//A stub: to be fixed
    }

    /**
     * Returns the imaginary component.
     *
     * @return the imaginary
     */
    public double getImaginary() {
        return Imaginary;	//A stub: to be fixed
    }

    /**
     * Returns a new ComplexNumber number that is the negative of <em>this</em>.
     * Note: the original ComplexNumber is <b>NOT</b>
     * modified.
     *
     * @return -this
     */
    public ComplexNumber negate() {
        ComplexNumber yn = new ComplexNumber(Real, Imaginary);     
        yn.Real = -1 * this.Real; 
        yn.Imaginary = -1 * this.Imaginary; 
        
        return yn; //A stub: to be fixed
    }

    /**
     * Returns a new ComplexNumber that is the sum of <em>this</em>	and
     * <em>z</em>. Note: the	original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @param z
     * @return this + z
     */
    public ComplexNumber add(ComplexNumber z) {
        ComplexNumber ya = new ComplexNumber(Real, Imaginary);
        ya.Real = z.Real + this.Real;
        ya.Imaginary = z.Imaginary + this.Imaginary;
              
        return ya;	//A stub: to be fixed
    }

    /**
     * Returns a new ComplexNumber that is the difference of <em>this</em>	and
     * <em>z</em>. Note: the	original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @param z
     * @return this + z
     */
    public ComplexNumber subtract(ComplexNumber z) {
        ComplexNumber ys = new ComplexNumber(Real, Imaginary);
        ys.Real = this.Real - z.Real;
        ys.Imaginary = this.Imaginary - z.Imaginary;
        
        return ys;	//A stub: to be fixed
    }

    /**
     * Returns a new ComplexNumber that is the product of <em>this</em> and
     * <em>z</em>. Note: the original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @param z
     * @return this * z
     */
    public ComplexNumber multiply(ComplexNumber z) {
        ComplexNumber ym = new ComplexNumber(Real, Imaginary);
        ym.Real = ((z.Real)*(this.Real)-(z.Imaginary)*(this.Imaginary));
        ym.Imaginary = ((z.Real)*(this.Imaginary)+(z.Imaginary)*(this.Real));
        return ym;	//A stub: to be fixed
    }

    /**
     * Returns a new ComplexNumber that is the reciprocal of <em>this</em>.
     * Note: the original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @return 1.0 / this
     */
    public ComplexNumber reciprocal() {
        ComplexNumber yr = new ComplexNumber(Real, Imaginary);
        yr.Real = 1 / this.Real;
        yr.Imaginary = 1 / this.Imaginary;
        
        return yr;	//A stub: to be fixed
    }

    /**
     * Returns a new ComplexNumber that is
     * <em>this</em> divided by <em>z</em>. Note: the original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @param z
     * @return this / z
     */
    public ComplexNumber divide(ComplexNumber z) {
        ComplexNumber yd = new ComplexNumber(Real, Imaginary);
        yd.Real = ((this.Real)*(z.Real)+(this.Imaginary)*(z.Imaginary)) / (((z.Real)*(z.Real))) + (((z.Imaginary)*(z.Imaginary)));
        yd.Imaginary = ((z.Imaginary)*(this.Real) - (z.Real)*(this.Imaginary)) / ((this.Real)*(this.Real)) + ((this.Imaginary)*(this.Imaginary));
        return yd;	//A stub: to be fixed
    }

    /**
     * Returns a String representation of
     * <em>this</em> in the format:
     * <pre>
     *	real +-(optional) i imaginary
     * </pre> If the imaginary part is zero, only the real part is converted to
     * a String. A "+" or "-" is placed between the real and imaginary parts
     * depending on the the sign of the imagrinary part.
     * <p>
     * Examples:
     * <pre>
     *	..println(new ComplexNumber(0,0); -> "0.0"
     *	..println(new ComplexNumber(1,1); -> "1.0 + i1.0"
     *	..println(new ComplexNumber(1,-1); -> "1.0 - i1.0"
     * </pre>
     *
     * @return the String representation.
     */
    @Override
    public String toString() {
//DO NOT MODIFY THIS CODE!
        String str = "" + this.getReal();
        if (this.getImaginary() == 0.0) {
            return str;
        }
        if (this.getImaginary() > 0) {
            return str + " + i" + this.getImaginary();
        } else {
            return str + " - i" + -this.getImaginary();
        }
    }
}
