
/* First created by JCasGen Wed Nov 08 11:31:04 CET 2017 */
package fr.univnantes.lina.test.uima;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Wed Nov 08 11:31:04 CET 2017
 * @generated */
public class TypeA_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (TypeA_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = TypeA_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new TypeA(addr, TypeA_Type.this);
  			   TypeA_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new TypeA(addr, TypeA_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = TypeA.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("fr.univnantes.lina.test.uima.TypeA");
 
  /** @generated */
  final Feature casFeat_fInt;
  /** @generated */
  final int     casFeatCode_fInt;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getFInt(int addr) {
        if (featOkTst && casFeat_fInt == null)
      jcas.throwFeatMissing("fInt", "fr.univnantes.lina.test.uima.TypeA");
    return ll_cas.ll_getIntValue(addr, casFeatCode_fInt);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFInt(int addr, int v) {
        if (featOkTst && casFeat_fInt == null)
      jcas.throwFeatMissing("fInt", "fr.univnantes.lina.test.uima.TypeA");
    ll_cas.ll_setIntValue(addr, casFeatCode_fInt, v);}
    
  
 
  /** @generated */
  final Feature casFeat_fString;
  /** @generated */
  final int     casFeatCode_fString;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getFString(int addr) {
        if (featOkTst && casFeat_fString == null)
      jcas.throwFeatMissing("fString", "fr.univnantes.lina.test.uima.TypeA");
    return ll_cas.ll_getStringValue(addr, casFeatCode_fString);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFString(int addr, String v) {
        if (featOkTst && casFeat_fString == null)
      jcas.throwFeatMissing("fString", "fr.univnantes.lina.test.uima.TypeA");
    ll_cas.ll_setStringValue(addr, casFeatCode_fString, v);}
    
  
 
  /** @generated */
  final Feature casFeat_fFloat;
  /** @generated */
  final int     casFeatCode_fFloat;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public float getFFloat(int addr) {
        if (featOkTst && casFeat_fFloat == null)
      jcas.throwFeatMissing("fFloat", "fr.univnantes.lina.test.uima.TypeA");
    return ll_cas.ll_getFloatValue(addr, casFeatCode_fFloat);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFFloat(int addr, float v) {
        if (featOkTst && casFeat_fFloat == null)
      jcas.throwFeatMissing("fFloat", "fr.univnantes.lina.test.uima.TypeA");
    ll_cas.ll_setFloatValue(addr, casFeatCode_fFloat, v);}
    
  
 
  /** @generated */
  final Feature casFeat_fBoolean;
  /** @generated */
  final int     casFeatCode_fBoolean;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getFBoolean(int addr) {
        if (featOkTst && casFeat_fBoolean == null)
      jcas.throwFeatMissing("fBoolean", "fr.univnantes.lina.test.uima.TypeA");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_fBoolean);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFBoolean(int addr, boolean v) {
        if (featOkTst && casFeat_fBoolean == null)
      jcas.throwFeatMissing("fBoolean", "fr.univnantes.lina.test.uima.TypeA");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_fBoolean, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public TypeA_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_fInt = jcas.getRequiredFeatureDE(casType, "fInt", "uima.cas.Integer", featOkTst);
    casFeatCode_fInt  = (null == casFeat_fInt) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_fInt).getCode();

 
    casFeat_fString = jcas.getRequiredFeatureDE(casType, "fString", "uima.cas.String", featOkTst);
    casFeatCode_fString  = (null == casFeat_fString) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_fString).getCode();

 
    casFeat_fFloat = jcas.getRequiredFeatureDE(casType, "fFloat", "uima.cas.Float", featOkTst);
    casFeatCode_fFloat  = (null == casFeat_fFloat) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_fFloat).getCode();

 
    casFeat_fBoolean = jcas.getRequiredFeatureDE(casType, "fBoolean", "uima.cas.Boolean", featOkTst);
    casFeatCode_fBoolean  = (null == casFeat_fBoolean) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_fBoolean).getCode();

  }
}



    