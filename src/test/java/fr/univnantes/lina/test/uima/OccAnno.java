

/* First created by JCasGen Fri Jul 07 14:21:28 CEST 2017 */
package fr.univnantes.lina.test.uima;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Fri Jul 07 14:21:28 CEST 2017
 * XML source: /home/cram-d/git/uima-tokens-regex/src/test/resources/TestTypeSystem.xml
 * @generated */
public class OccAnno extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(OccAnno.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected OccAnno() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public OccAnno(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public OccAnno(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public OccAnno(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: rule

  /** getter for rule - gets 
   * @generated
   * @return value of the feature 
   */
  public String getRule() {
    if (OccAnno_Type.featOkTst && ((OccAnno_Type)jcasType).casFeat_rule == null)
      jcasType.jcas.throwFeatMissing("rule", "fr.univnantes.lina.test.uima.OccAnno");
    return jcasType.ll_cas.ll_getStringValue(addr, ((OccAnno_Type)jcasType).casFeatCode_rule);}
    
  /** setter for rule - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRule(String v) {
    if (OccAnno_Type.featOkTst && ((OccAnno_Type)jcasType).casFeat_rule == null)
      jcasType.jcas.throwFeatMissing("rule", "fr.univnantes.lina.test.uima.OccAnno");
    jcasType.ll_cas.ll_setStringValue(addr, ((OccAnno_Type)jcasType).casFeatCode_rule, v);}    
   
    
  //*--------------*
  //* Feature: pattern

  /** getter for pattern - gets 
   * @generated
   * @return value of the feature 
   */
  public String getPattern() {
    if (OccAnno_Type.featOkTst && ((OccAnno_Type)jcasType).casFeat_pattern == null)
      jcasType.jcas.throwFeatMissing("pattern", "fr.univnantes.lina.test.uima.OccAnno");
    return jcasType.ll_cas.ll_getStringValue(addr, ((OccAnno_Type)jcasType).casFeatCode_pattern);}
    
  /** setter for pattern - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPattern(String v) {
    if (OccAnno_Type.featOkTst && ((OccAnno_Type)jcasType).casFeat_pattern == null)
      jcasType.jcas.throwFeatMissing("pattern", "fr.univnantes.lina.test.uima.OccAnno");
    jcasType.ll_cas.ll_setStringValue(addr, ((OccAnno_Type)jcasType).casFeatCode_pattern, v);}    
  }

    