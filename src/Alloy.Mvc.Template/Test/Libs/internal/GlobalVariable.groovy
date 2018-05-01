package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object URL
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['URL' : 'http://194.47.174.53/'])
        allVariables.put('Production', allVariables['default'] + [:])
        allVariables.put('QA', allVariables['default'] + ['URL' : 'http://194.47.174.53/'])
        allVariables.put('local', allVariables['default'] + ['URL' : 'http://localhost:54709'])
        
        String profileName = RunConfiguration.getExecutionProfile()
        
        def selectedVariables = allVariables[profileName]
        URL = selectedVariables['URL']
        
    }
}
