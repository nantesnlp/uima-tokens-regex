
/* First created by JCasGen Fri Jul 07 14:21:28 CEST 2017 */
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
 * Updated by JCasGen Fri Jul 07 14:21:28 CEST 2017
 * @generated */
public class OccAnno_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (OccAnno_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = OccAnno_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new OccAnno(addr, OccAnno_Type.this);
  			   OccAnno_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new OccAnno(addr, OccAnno_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = OccAnno.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("fr.univnantes.lina.test.uima.OccAnno");
 
  /** @generated */
  final Feature casFeat_rule;
  /** @generated */
  final int     casFeatCode_rule;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getRule(int addr) {
        if (featOkTst && casFeat_rule == null)
      jcas.throwFeatMissing("rule", "fr.univnantes.lina.test.uima.OccAnno");
    return ll_cas.ll_getStringValue(addr, casFeatCode_rule);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRule(int addr, String v) {
        if (featOkTst && casFeat_rule == null)
      jcas.throwFeatMissing("rule", "fr.univnantes.lina.test.uima.OccAnno");
    ll_cas.ll_setStringValue(addr, casFeatCode_rule, v);}
    
  
 
  /** @generated */
  final Feature casFeat_pattern;
  /** @generated */
  final int     casFeatCode_pattern;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getPattern(int addr) {
        if (featOkTst && casFeat_pattern == null)
      jcas.throwFeatMissing("pattern", "fr.univnantes.lina.test.uima.OccAnno");
    return ll_cas.ll_getStringValue(addr, casFeatCode_pattern);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPattern(int addr, String v) {
        if (featOkTst && casFeat_pattern == null)
      jcas.throwFeatMissing("pattern", "fr.univnantes.lina.test.uima.OccAnno");
    ll_cas.ll_setStringValue(addr, casFeatCode_pattern, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public OccAnno_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_rule = jcas.getRequiredFeatureDE(casType, "rule", "uima.cas.String", featOkTst);
    casFeatCode_rule  = (null == casFeat_rule) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_rule).getCode();

 
    casFeat_pattern = jcas.getRequiredFeatureDE(casType, "pattern", "uima.cas.String", featOkTst);
    casFeatCode_pattern  = (null == casFeat_pattern) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_pattern).getCode();

  }
}



    