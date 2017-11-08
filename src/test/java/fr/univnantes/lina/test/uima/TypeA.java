

/* First created by JCasGen Wed Nov 08 11:31:04 CET 2017 */
package fr.univnantes.lina.test.uima;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Nov 08 11:31:04 CET 2017
 * XML source: /home/damien/git/uima-tokens-regex/src/test/resources/TestTypeSystem.xml
 * @generated */
public class TypeA extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TypeA.class);
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
  protected TypeA() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public TypeA(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public TypeA(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public TypeA(JCas jcas, int begin, int end) {
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
  //* Feature: fInt

  /** getter for fInt - gets 
   * @generated
   * @return value of the feature 
   */
  public int getFInt() {
    if (TypeA_Type.featOkTst && ((TypeA_Type)jcasType).casFeat_fInt == null)
      jcasType.jcas.throwFeatMissing("fInt", "fr.univnantes.lina.test.uima.TypeA");
    return jcasType.ll_cas.ll_getIntValue(addr, ((TypeA_Type)jcasType).casFeatCode_fInt);}
    
  /** setter for fInt - sets  
   * @generated
   * @param v value to testDifferentTypes into the feature
   */
  public void setFInt(int v) {
    if (TypeA_Type.featOkTst && ((TypeA_Type)jcasType).casFeat_fInt == null)
      jcasType.jcas.throwFeatMissing("fInt", "fr.univnantes.lina.test.uima.TypeA");
    jcasType.ll_cas.ll_setIntValue(addr, ((TypeA_Type)jcasType).casFeatCode_fInt, v);}    
   
    
  //*--------------*
  //* Feature: fString

  /** getter for fString - gets 
   * @generated
   * @return value of the feature 
   */
  public String getFString() {
    if (TypeA_Type.featOkTst && ((TypeA_Type)jcasType).casFeat_fString == null)
      jcasType.jcas.throwFeatMissing("fString", "fr.univnantes.lina.test.uima.TypeA");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TypeA_Type)jcasType).casFeatCode_fString);}
    
  /** setter for fString - sets  
   * @generated
   * @param v value to testDifferentTypes into the feature
   */
  public void setFString(String v) {
    if (TypeA_Type.featOkTst && ((TypeA_Type)jcasType).casFeat_fString == null)
      jcasType.jcas.throwFeatMissing("fString", "fr.univnantes.lina.test.uima.TypeA");
    jcasType.ll_cas.ll_setStringValue(addr, ((TypeA_Type)jcasType).casFeatCode_fString, v);}    
   
    
  //*--------------*
  //* Feature: fFloat

  /** getter for fFloat - gets 
   * @generated
   * @return value of the feature 
   */
  public float getFFloat() {
    if (TypeA_Type.featOkTst && ((TypeA_Type)jcasType).casFeat_fFloat == null)
      jcasType.jcas.throwFeatMissing("fFloat", "fr.univnantes.lina.test.uima.TypeA");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((TypeA_Type)jcasType).casFeatCode_fFloat);}
    
  /** setter for fFloat - sets  
   * @generated
   * @param v value to testDifferentTypes into the feature
   */
  public void setFFloat(float v) {
    if (TypeA_Type.featOkTst && ((TypeA_Type)jcasType).casFeat_fFloat == null)
      jcasType.jcas.throwFeatMissing("fFloat", "fr.univnantes.lina.test.uima.TypeA");
    jcasType.ll_cas.ll_setFloatValue(addr, ((TypeA_Type)jcasType).casFeatCode_fFloat, v);}    
   
    
  //*--------------*
  //* Feature: fBoolean

  /** getter for fBoolean - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getFBoolean() {
    if (TypeA_Type.featOkTst && ((TypeA_Type)jcasType).casFeat_fBoolean == null)
      jcasType.jcas.throwFeatMissing("fBoolean", "fr.univnantes.lina.test.uima.TypeA");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((TypeA_Type)jcasType).casFeatCode_fBoolean);}
    
  /** setter for fBoolean - sets  
   * @generated
   * @param v value to testDifferentTypes into the feature
   */
  public void setFBoolean(boolean v) {
    if (TypeA_Type.featOkTst && ((TypeA_Type)jcasType).casFeat_fBoolean == null)
      jcasType.jcas.throwFeatMissing("fBoolean", "fr.univnantes.lina.test.uima.TypeA");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((TypeA_Type)jcasType).casFeatCode_fBoolean, v);}    
  }

    