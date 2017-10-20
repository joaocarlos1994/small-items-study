package br.com.smallitemsstudy.itemsix;

/**
* ###### Valor Inteiro (Whole Value) - Cunningham ######
* 
* A whole value is a quantity used to describe things in a domain. Whole values are
* not themselves things, but measures of things. As such they do not have an identity
* of consequence.
* 
* For example, we might say a company is worth 50,000,000 dollars. Some thing, the 
* company, its stock, or a proposed investment, is being measured. The thing is a 
* real object while the 50,000,000 dollars is a value, a property of the thing.
* 
* In object oriented computing it is commonplace and good practice to model values 
* as objects. Key to this is defining a notion of equality that is independent of 
* object identity. Another key, and the point of the WholeValue pattern, is that 
* the objects model the whole property being measured, not just some part of it. 
* In the example above the whole value is 50,000,000 dollars, not just 50,000,000 
* and not just "dollars".
* 
* WholeValue is a concept introduced to the pattern world by WardCunningham's 
* ChecksPatternLanguage where its partitioning of checking responsibility is 
* featured. For example, if I know a field will contain a whole value or nil, I do
* not have to be concerned with any conditions outside those modeled by the whole
* value once I have established that it is not nil. The whole value pattern 
* argues that whole values should be entered in single fields and checked to be 
* well formed in one place (In Fit the TypeAdapter is, or is an interface to, that
* one place).
* 
* */
public class Main {
	public static void main(String[] args) {

	}
}
