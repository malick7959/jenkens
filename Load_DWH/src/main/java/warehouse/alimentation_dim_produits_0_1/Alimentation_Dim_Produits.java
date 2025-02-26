// ============================================================================
//
// Copyright (c) 2006-2015, Talend SA
//
// Ce code source a été automatiquement généré par_Talend Open Studio for Data Integration
// / Soumis à la Licence Apache, Version 2.0 (la "Licence") ;
// votre utilisation de ce fichier doit respecter les termes de la Licence.
// Vous pouvez obtenir une copie de la Licence sur
// http://www.apache.org/licenses/LICENSE-2.0
// 
// Sauf lorsqu'explicitement prévu par la loi en vigueur ou accepté par écrit, le logiciel
// distribué sous la Licence est distribué "TEL QUEL",
// SANS GARANTIE OU CONDITION D'AUCUNE SORTE, expresse ou implicite.
// Consultez la Licence pour connaître la terminologie spécifique régissant les autorisations et
// les limites prévues par la Licence.


package warehouse.alimentation_dim_produits_0_1;

import routines.Numeric;
import routines.DataOperation;
import routines.TalendDataGenerator;
import routines.TalendStringUtil;
import routines.TalendString;
import routines.StringHandling;
import routines.Relational;
import routines.TalendDate;
import routines.Mathematical;
import routines.system.*;
import routines.system.api.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.Comparator;
 




	//the import part of tJava_1
	//import java.util.List;


@SuppressWarnings("unused")

/**
 * Job: Alimentation_Dim_Produits Purpose: <br>
 * Description:  <br>
 * @author user@talend.com
 * @version 8.0.1.20211109_1610
 * @status PROD
 */
public class Alimentation_Dim_Produits implements TalendJob {

protected static void logIgnoredError(String message, Throwable cause) {
       System.err.println(message);
       if (cause != null) {
               cause.printStackTrace();
       }

}


	public final Object obj = new Object();

	// for transmiting parameters purpose
	private Object valueObject = null;

	public Object getValueObject() {
		return this.valueObject;
	}

	public void setValueObject(Object valueObject) {
		this.valueObject = valueObject;
	}
	
	private final static String defaultCharset = java.nio.charset.Charset.defaultCharset().name();

	
	private final static String utf8Charset = "UTF-8";
	//contains type for every context property
	public class PropertiesWithType extends java.util.Properties {
		private static final long serialVersionUID = 1L;
		private java.util.Map<String,String> propertyTypes = new java.util.HashMap<>();
		
		public PropertiesWithType(java.util.Properties properties){
			super(properties);
		}
		public PropertiesWithType(){
			super();
		}
		
		public void setContextType(String key, String type) {
			propertyTypes.put(key,type);
		}
	
		public String getContextType(String key) {
			return propertyTypes.get(key);
		}
	}
	
	// create and load default properties
	private java.util.Properties defaultProps = new java.util.Properties();
	// create application properties with default
	public class ContextProperties extends PropertiesWithType {

		private static final long serialVersionUID = 1L;

		public ContextProperties(java.util.Properties properties){
			super(properties);
		}
		public ContextProperties(){
			super();
		}

		public void synchronizeContext(){
			
		}
		
		//if the stored or passed value is "<TALEND_NULL>" string, it mean null
		public String getStringValue(String key) {
			String origin_value = this.getProperty(key);
			if(NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY.equals(origin_value)) {
				return null;
			}
			return origin_value;
		}

	}
	protected ContextProperties context = new ContextProperties(); // will be instanciated by MS.
	public ContextProperties getContext() {
		return this.context;
	}
	private final String jobVersion = "0.1";
	private final String jobName = "Alimentation_Dim_Produits";
	private final String projectName = "WAREHOUSE";
	public Integer errorCode = null;
	private String currentComponent = "";
	
		private final java.util.Map<String, Object> globalMap = new java.util.HashMap<String, Object>();
        private final static java.util.Map<String, Object> junitGlobalMap = new java.util.HashMap<String, Object>();
	
		private final java.util.Map<String, Long> start_Hash = new java.util.HashMap<String, Long>();
		private final java.util.Map<String, Long> end_Hash = new java.util.HashMap<String, Long>();
		private final java.util.Map<String, Boolean> ok_Hash = new java.util.HashMap<String, Boolean>();
		public  final java.util.List<String[]> globalBuffer = new java.util.ArrayList<String[]>();
	

private RunStat runStat = new RunStat();

	// OSGi DataSource
	private final static String KEY_DB_DATASOURCES = "KEY_DB_DATASOURCES";
	
	private final static String KEY_DB_DATASOURCES_RAW = "KEY_DB_DATASOURCES_RAW";

	public void setDataSources(java.util.Map<String, javax.sql.DataSource> dataSources) {
		java.util.Map<String, routines.system.TalendDataSource> talendDataSources = new java.util.HashMap<String, routines.system.TalendDataSource>();
		for (java.util.Map.Entry<String, javax.sql.DataSource> dataSourceEntry : dataSources.entrySet()) {
			talendDataSources.put(dataSourceEntry.getKey(), new routines.system.TalendDataSource(dataSourceEntry.getValue()));
		}
		globalMap.put(KEY_DB_DATASOURCES, talendDataSources);
		globalMap.put(KEY_DB_DATASOURCES_RAW, new java.util.HashMap<String, javax.sql.DataSource>(dataSources));
	}
	
	public void setDataSourceReferences(List serviceReferences) throws Exception{
		
		java.util.Map<String, routines.system.TalendDataSource> talendDataSources = new java.util.HashMap<String, routines.system.TalendDataSource>();
		java.util.Map<String, javax.sql.DataSource> dataSources = new java.util.HashMap<String, javax.sql.DataSource>();
		
		for (java.util.Map.Entry<String, javax.sql.DataSource> entry : BundleUtils.getServices(serviceReferences,  javax.sql.DataSource.class).entrySet()) {
                    dataSources.put(entry.getKey(), entry.getValue());
                    talendDataSources.put(entry.getKey(), new routines.system.TalendDataSource(entry.getValue()));
		}

		globalMap.put(KEY_DB_DATASOURCES, talendDataSources);
		globalMap.put(KEY_DB_DATASOURCES_RAW, new java.util.HashMap<String, javax.sql.DataSource>(dataSources));
	}


private final java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
private final java.io.PrintStream errorMessagePS = new java.io.PrintStream(new java.io.BufferedOutputStream(baos));

public String getExceptionStackTrace() {
	if ("failure".equals(this.getStatus())) {
		errorMessagePS.flush();
		return baos.toString();
	}
	return null;
}

private Exception exception;

public Exception getException() {
	if ("failure".equals(this.getStatus())) {
		return this.exception;
	}
	return null;
}

private class TalendException extends Exception {

	private static final long serialVersionUID = 1L;

	private java.util.Map<String, Object> globalMap = null;
	private Exception e = null;
	private String currentComponent = null;
	private String virtualComponentName = null;
	
	public void setVirtualComponentName (String virtualComponentName){
		this.virtualComponentName = virtualComponentName;
	}

	private TalendException(Exception e, String errorComponent, final java.util.Map<String, Object> globalMap) {
		this.currentComponent= errorComponent;
		this.globalMap = globalMap;
		this.e = e;
	}

	public Exception getException() {
		return this.e;
	}

	public String getCurrentComponent() {
		return this.currentComponent;
	}

	
    public String getExceptionCauseMessage(Exception e){
        Throwable cause = e;
        String message = null;
        int i = 10;
        while (null != cause && 0 < i--) {
            message = cause.getMessage();
            if (null == message) {
                cause = cause.getCause();
            } else {
                break;          
            }
        }
        if (null == message) {
            message = e.getClass().getName();
        }   
        return message;
    }

	@Override
	public void printStackTrace() {
		if (!(e instanceof TalendException || e instanceof TDieException)) {
			if(virtualComponentName!=null && currentComponent.indexOf(virtualComponentName+"_")==0){
				globalMap.put(virtualComponentName+"_ERROR_MESSAGE",getExceptionCauseMessage(e));
			}
			globalMap.put(currentComponent+"_ERROR_MESSAGE",getExceptionCauseMessage(e));
			System.err.println("Exception in component " + currentComponent + " (" + jobName + ")");
		}
		if (!(e instanceof TDieException)) {
			if(e instanceof TalendException){
				e.printStackTrace();
			} else {
				e.printStackTrace();
				e.printStackTrace(errorMessagePS);
				Alimentation_Dim_Produits.this.exception = e;
			}
		}
		if (!(e instanceof TalendException)) {
		try {
			for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
				if (m.getName().compareTo(currentComponent + "_error") == 0) {
					m.invoke(Alimentation_Dim_Produits.this, new Object[] { e , currentComponent, globalMap});
					break;
				}
			}

			if(!(e instanceof TDieException)){
			}
		} catch (Exception e) {
			this.e.printStackTrace();
		}
		}
	}
}

			public void tPrejob_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tPrejob_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tChronometerStart_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tChronometerStart_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBConnection_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBConnection_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBConnection_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBConnection_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tPostjob_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tPostjob_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBClose_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBClose_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBClose_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBClose_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tChronometerStop_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tChronometerStop_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tJava_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tJava_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_row2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_row3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_row5_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tSortRow_1_SortOut_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
							tSortRow_1_SortIn_error(exception, errorComponent, globalMap);
						
						}
					
			public void tSortRow_1_SortIn_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tSortRow_2_SortOut_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
							tSortRow_2_SortIn_error(exception, errorComponent, globalMap);
						
						}
					
			public void tSortRow_2_SortIn_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tPrejob_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tChronometerStart_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBConnection_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBConnection_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBInput_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tPostjob_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBClose_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBClose_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tChronometerStop_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tJava_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
	





public void tPrejob_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tPrejob_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tPrejob_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tPrejob_1", false);
		start_Hash.put("tPrejob_1", System.currentTimeMillis());
		
	
	currentComponent="tPrejob_1";

	
		int tos_count_tPrejob_1 = 0;
		

 



/**
 * [tPrejob_1 begin ] stop
 */
	
	/**
	 * [tPrejob_1 main ] start
	 */

	

	
	
	currentComponent="tPrejob_1";

	

 


	tos_count_tPrejob_1++;

/**
 * [tPrejob_1 main ] stop
 */
	
	/**
	 * [tPrejob_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tPrejob_1";

	

 



/**
 * [tPrejob_1 process_data_begin ] stop
 */
	
	/**
	 * [tPrejob_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tPrejob_1";

	

 



/**
 * [tPrejob_1 process_data_end ] stop
 */
	
	/**
	 * [tPrejob_1 end ] start
	 */

	

	
	
	currentComponent="tPrejob_1";

	

 

ok_Hash.put("tPrejob_1", true);
end_Hash.put("tPrejob_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk1", 0, "ok");
				}
				tChronometerStart_1Process(globalMap);



/**
 * [tPrejob_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tPrejob_1 finally ] start
	 */

	

	
	
	currentComponent="tPrejob_1";

	

 



/**
 * [tPrejob_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tPrejob_1_SUBPROCESS_STATE", 1);
	}
	

public void tChronometerStart_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tChronometerStart_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tChronometerStart_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tChronometerStart_1", false);
		start_Hash.put("tChronometerStart_1", System.currentTimeMillis());
		
	
	currentComponent="tChronometerStart_1";

	
		int tos_count_tChronometerStart_1 = 0;
		

	
	
	Long currentTimetChronometerStart_1 = System.currentTimeMillis();
	
	globalMap.put("tChronometerStart_1",currentTimetChronometerStart_1);
	globalMap.put("tChronometerStart_1_STARTTIME", currentTimetChronometerStart_1);
 



/**
 * [tChronometerStart_1 begin ] stop
 */
	
	/**
	 * [tChronometerStart_1 main ] start
	 */

	

	
	
	currentComponent="tChronometerStart_1";

	

 


	tos_count_tChronometerStart_1++;

/**
 * [tChronometerStart_1 main ] stop
 */
	
	/**
	 * [tChronometerStart_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tChronometerStart_1";

	

 



/**
 * [tChronometerStart_1 process_data_begin ] stop
 */
	
	/**
	 * [tChronometerStart_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tChronometerStart_1";

	

 



/**
 * [tChronometerStart_1 process_data_end ] stop
 */
	
	/**
	 * [tChronometerStart_1 end ] start
	 */

	

	
	
	currentComponent="tChronometerStart_1";

	

 

ok_Hash.put("tChronometerStart_1", true);
end_Hash.put("tChronometerStart_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk2", 0, "ok");
				}
				tDBConnection_1Process(globalMap);



/**
 * [tChronometerStart_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tChronometerStart_1 finally ] start
	 */

	

	
	
	currentComponent="tChronometerStart_1";

	

 



/**
 * [tChronometerStart_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tChronometerStart_1_SUBPROCESS_STATE", 1);
	}
	

public void tDBConnection_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBConnection_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tDBConnection_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBConnection_1", false);
		start_Hash.put("tDBConnection_1", System.currentTimeMillis());
		
	
	currentComponent="tDBConnection_1";

	
		int tos_count_tDBConnection_1 = 0;
		


	
            String dbProperties_tDBConnection_1 = "";
            String url_tDBConnection_1 = "jdbc:postgresql://"+"leuk.laiterieduberger.sn"+":"+"5432"+"/"+"leuk_webapp_production";
            
            if(dbProperties_tDBConnection_1 != null && !"".equals(dbProperties_tDBConnection_1.trim())) {
                url_tDBConnection_1 = url_tDBConnection_1 + "?" + dbProperties_tDBConnection_1;
            }
	String dbUser_tDBConnection_1 = "malick.diouf";
	
	
		 
	final String decryptedPassword_tDBConnection_1 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:NspTC6nKqZ66Wx9V5VLbxhKrtjHc8LsYT8TwSO+wTRlliAM81Okgwm+S");
		String dbPwd_tDBConnection_1 = decryptedPassword_tDBConnection_1;
	
	
	java.sql.Connection conn_tDBConnection_1 = null;
	
        java.util.Enumeration<java.sql.Driver> drivers_tDBConnection_1 =  java.sql.DriverManager.getDrivers();
        java.util.Set<String> redShiftDriverNames_tDBConnection_1 = new java.util.HashSet<String>(java.util.Arrays
                .asList("com.amazon.redshift.jdbc.Driver","com.amazon.redshift.jdbc41.Driver","com.amazon.redshift.jdbc42.Driver"));
    while (drivers_tDBConnection_1.hasMoreElements()) {
        java.sql.Driver d_tDBConnection_1 = drivers_tDBConnection_1.nextElement();
        if (redShiftDriverNames_tDBConnection_1.contains(d_tDBConnection_1.getClass().getName())) {
            try {
                java.sql.DriverManager.deregisterDriver(d_tDBConnection_1);
                java.sql.DriverManager.registerDriver(d_tDBConnection_1);
            } catch (java.lang.Exception e_tDBConnection_1) {
globalMap.put("tDBConnection_1_ERROR_MESSAGE",e_tDBConnection_1.getMessage());
                    //do nothing
            }
        }
    }
					String driverClass_tDBConnection_1 = "org.postgresql.Driver";
			java.lang.Class jdbcclazz_tDBConnection_1 = java.lang.Class.forName(driverClass_tDBConnection_1);
			globalMap.put("driverClass_tDBConnection_1", driverClass_tDBConnection_1);
		
			conn_tDBConnection_1 = java.sql.DriverManager.getConnection(url_tDBConnection_1,dbUser_tDBConnection_1,dbPwd_tDBConnection_1);

		globalMap.put("conn_tDBConnection_1", conn_tDBConnection_1);
	if (null != conn_tDBConnection_1) {
		
			conn_tDBConnection_1.setAutoCommit(true);
	}

	globalMap.put("schema_" + "tDBConnection_1","public");

 



/**
 * [tDBConnection_1 begin ] stop
 */
	
	/**
	 * [tDBConnection_1 main ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";

	

 


	tos_count_tDBConnection_1++;

/**
 * [tDBConnection_1 main ] stop
 */
	
	/**
	 * [tDBConnection_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";

	

 



/**
 * [tDBConnection_1 process_data_begin ] stop
 */
	
	/**
	 * [tDBConnection_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";

	

 



/**
 * [tDBConnection_1 process_data_end ] stop
 */
	
	/**
	 * [tDBConnection_1 end ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";

	

 

ok_Hash.put("tDBConnection_1", true);
end_Hash.put("tDBConnection_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk3", 0, "ok");
				}
				tDBConnection_2Process(globalMap);



/**
 * [tDBConnection_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBConnection_1 finally ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";

	

 



/**
 * [tDBConnection_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBConnection_1_SUBPROCESS_STATE", 1);
	}
	

public void tDBConnection_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBConnection_2_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tDBConnection_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBConnection_2", false);
		start_Hash.put("tDBConnection_2", System.currentTimeMillis());
		
	
	currentComponent="tDBConnection_2";

	
		int tos_count_tDBConnection_2 = 0;
		


	
            String dbProperties_tDBConnection_2 = "";
            String url_tDBConnection_2 = "jdbc:postgresql://"+"163.172.166.119"+":"+"5432"+"/"+"leuk_analytics";
            
            if(dbProperties_tDBConnection_2 != null && !"".equals(dbProperties_tDBConnection_2.trim())) {
                url_tDBConnection_2 = url_tDBConnection_2 + "?" + dbProperties_tDBConnection_2;
            }
	String dbUser_tDBConnection_2 = "malick.diouf";
	
	
		 
	final String decryptedPassword_tDBConnection_2 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:eaTUCac75AUS8H6QX4cW3AL/LrCn0hqmcR7CERxsmfyRNBf0k9s=");
		String dbPwd_tDBConnection_2 = decryptedPassword_tDBConnection_2;
	
	
	java.sql.Connection conn_tDBConnection_2 = null;
	
        java.util.Enumeration<java.sql.Driver> drivers_tDBConnection_2 =  java.sql.DriverManager.getDrivers();
        java.util.Set<String> redShiftDriverNames_tDBConnection_2 = new java.util.HashSet<String>(java.util.Arrays
                .asList("com.amazon.redshift.jdbc.Driver","com.amazon.redshift.jdbc41.Driver","com.amazon.redshift.jdbc42.Driver"));
    while (drivers_tDBConnection_2.hasMoreElements()) {
        java.sql.Driver d_tDBConnection_2 = drivers_tDBConnection_2.nextElement();
        if (redShiftDriverNames_tDBConnection_2.contains(d_tDBConnection_2.getClass().getName())) {
            try {
                java.sql.DriverManager.deregisterDriver(d_tDBConnection_2);
                java.sql.DriverManager.registerDriver(d_tDBConnection_2);
            } catch (java.lang.Exception e_tDBConnection_2) {
globalMap.put("tDBConnection_2_ERROR_MESSAGE",e_tDBConnection_2.getMessage());
                    //do nothing
            }
        }
    }
					String driverClass_tDBConnection_2 = "org.postgresql.Driver";
			java.lang.Class jdbcclazz_tDBConnection_2 = java.lang.Class.forName(driverClass_tDBConnection_2);
			globalMap.put("driverClass_tDBConnection_2", driverClass_tDBConnection_2);
		
			conn_tDBConnection_2 = java.sql.DriverManager.getConnection(url_tDBConnection_2,dbUser_tDBConnection_2,dbPwd_tDBConnection_2);

		globalMap.put("conn_tDBConnection_2", conn_tDBConnection_2);
	if (null != conn_tDBConnection_2) {
		
			conn_tDBConnection_2.setAutoCommit(true);
	}

	globalMap.put("schema_" + "tDBConnection_2","public");

 



/**
 * [tDBConnection_2 begin ] stop
 */
	
	/**
	 * [tDBConnection_2 main ] start
	 */

	

	
	
	currentComponent="tDBConnection_2";

	

 


	tos_count_tDBConnection_2++;

/**
 * [tDBConnection_2 main ] stop
 */
	
	/**
	 * [tDBConnection_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBConnection_2";

	

 



/**
 * [tDBConnection_2 process_data_begin ] stop
 */
	
	/**
	 * [tDBConnection_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBConnection_2";

	

 



/**
 * [tDBConnection_2 process_data_end ] stop
 */
	
	/**
	 * [tDBConnection_2 end ] start
	 */

	

	
	
	currentComponent="tDBConnection_2";

	

 

ok_Hash.put("tDBConnection_2", true);
end_Hash.put("tDBConnection_2", System.currentTimeMillis());




/**
 * [tDBConnection_2 end ] stop
 */
				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tDBConnection_2:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk1", 0, "ok");
								} 
							
							tDBInput_1Process(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBConnection_2 finally ] start
	 */

	

	
	
	currentComponent="tDBConnection_2";

	

 



/**
 * [tDBConnection_2 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBConnection_2_SUBPROCESS_STATE", 1);
	}
	


public static class Update_Existing_DataStruct implements routines.system.IPersistableRow<Update_Existing_DataStruct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Produits = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_Dim_Produits = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public long id_produit;

				public long getId_produit () {
					return this.id_produit;
				}
				
			    public Long id_pilier;

				public Long getId_pilier () {
					return this.id_pilier;
				}
				
			    public String produits;

				public String getProduits () {
					return this.produits;
				}
				
			    public String pilier;

				public String getPilier () {
					return this.pilier;
				}
				
			    public Integer prix;

				public Integer getPrix () {
					return this.prix;
				}
				
			    public Double tva;

				public Double getTva () {
					return this.tva;
				}
				
			    public Integer volume_unitaire;

				public Integer getVolume_unitaire () {
					return this.volume_unitaire;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
							result = prime * result + (int) this.id_produit;
						
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final Update_Existing_DataStruct other = (Update_Existing_DataStruct) obj;
		
						if (this.id_produit != other.id_produit)
							return false;
					

		return true;
    }

	public void copyDataTo(Update_Existing_DataStruct other) {

		other.id_produit = this.id_produit;
	            other.id_pilier = this.id_pilier;
	            other.produits = this.produits;
	            other.pilier = this.pilier;
	            other.prix = this.prix;
	            other.tva = this.tva;
	            other.volume_unitaire = this.volume_unitaire;
	            
	}

	public void copyKeysDataTo(Update_Existing_DataStruct other) {

		other.id_produit = this.id_produit;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Produits.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Produits.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Produits = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Produits = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Produits, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Produits, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Produits.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Produits.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Produits = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Produits = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Produits, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Produits, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }
	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Produits) {

        	try {

        		int length = 0;
		
			        this.id_produit = dis.readLong();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.id_pilier = null;
           				} else {
           			    	this.id_pilier = dis.readLong();
           				}
					
					this.produits = readString(dis);
					
					this.pilier = readString(dis);
					
						this.prix = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.tva = null;
           				} else {
           			    	this.tva = dis.readDouble();
           				}
					
						this.volume_unitaire = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Produits) {

        	try {

        		int length = 0;
		
			        this.id_produit = dis.readLong();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.id_pilier = null;
           				} else {
           			    	this.id_pilier = dis.readLong();
           				}
					
					this.produits = readString(dis);
					
					this.pilier = readString(dis);
					
						this.prix = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.tva = null;
           				} else {
           			    	this.tva = dis.readDouble();
           				}
					
						this.volume_unitaire = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id_produit);
					
					// Long
				
						if(this.id_pilier == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.id_pilier);
		            	}
					
					// String
				
						writeString(this.produits,dos);
					
					// String
				
						writeString(this.pilier,dos);
					
					// Integer
				
						writeInteger(this.prix,dos);
					
					// Double
				
						if(this.tva == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.tva);
		            	}
					
					// Integer
				
						writeInteger(this.volume_unitaire,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id_produit);
					
					// Long
				
						if(this.id_pilier == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.id_pilier);
		            	}
					
					// String
				
						writeString(this.produits,dos);
					
					// String
				
						writeString(this.pilier,dos);
					
					// Integer
				
						writeInteger(this.prix,dos);
					
					// Double
				
						if(this.tva == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.tva);
		            	}
					
					// Integer
				
						writeInteger(this.volume_unitaire,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id_produit="+String.valueOf(id_produit));
		sb.append(",id_pilier="+String.valueOf(id_pilier));
		sb.append(",produits="+produits);
		sb.append(",pilier="+pilier);
		sb.append(",prix="+String.valueOf(prix));
		sb.append(",tva="+String.valueOf(tva));
		sb.append(",volume_unitaire="+String.valueOf(volume_unitaire));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(Update_Existing_DataStruct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.id_produit, other.id_produit);
						if(returnValue != 0) {
							return returnValue;
						}

					
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class row6Struct implements routines.system.IPersistableRow<row6Struct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Produits = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_Dim_Produits = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public long id_produit;

				public long getId_produit () {
					return this.id_produit;
				}
				
			    public Long id_pilier;

				public Long getId_pilier () {
					return this.id_pilier;
				}
				
			    public String produits;

				public String getProduits () {
					return this.produits;
				}
				
			    public String pilier;

				public String getPilier () {
					return this.pilier;
				}
				
			    public Integer prix;

				public Integer getPrix () {
					return this.prix;
				}
				
			    public Double tva;

				public Double getTva () {
					return this.tva;
				}
				
			    public Integer volume_unitaire;

				public Integer getVolume_unitaire () {
					return this.volume_unitaire;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
							result = prime * result + (int) this.id_produit;
						
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final row6Struct other = (row6Struct) obj;
		
						if (this.id_produit != other.id_produit)
							return false;
					

		return true;
    }

	public void copyDataTo(row6Struct other) {

		other.id_produit = this.id_produit;
	            other.id_pilier = this.id_pilier;
	            other.produits = this.produits;
	            other.pilier = this.pilier;
	            other.prix = this.prix;
	            other.tva = this.tva;
	            other.volume_unitaire = this.volume_unitaire;
	            
	}

	public void copyKeysDataTo(row6Struct other) {

		other.id_produit = this.id_produit;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Produits.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Produits.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Produits = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Produits = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Produits, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Produits, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Produits.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Produits.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Produits = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Produits = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Produits, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Produits, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }
	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Produits) {

        	try {

        		int length = 0;
		
			        this.id_produit = dis.readLong();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.id_pilier = null;
           				} else {
           			    	this.id_pilier = dis.readLong();
           				}
					
					this.produits = readString(dis);
					
					this.pilier = readString(dis);
					
						this.prix = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.tva = null;
           				} else {
           			    	this.tva = dis.readDouble();
           				}
					
						this.volume_unitaire = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Produits) {

        	try {

        		int length = 0;
		
			        this.id_produit = dis.readLong();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.id_pilier = null;
           				} else {
           			    	this.id_pilier = dis.readLong();
           				}
					
					this.produits = readString(dis);
					
					this.pilier = readString(dis);
					
						this.prix = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.tva = null;
           				} else {
           			    	this.tva = dis.readDouble();
           				}
					
						this.volume_unitaire = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id_produit);
					
					// Long
				
						if(this.id_pilier == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.id_pilier);
		            	}
					
					// String
				
						writeString(this.produits,dos);
					
					// String
				
						writeString(this.pilier,dos);
					
					// Integer
				
						writeInteger(this.prix,dos);
					
					// Double
				
						if(this.tva == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.tva);
		            	}
					
					// Integer
				
						writeInteger(this.volume_unitaire,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id_produit);
					
					// Long
				
						if(this.id_pilier == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.id_pilier);
		            	}
					
					// String
				
						writeString(this.produits,dos);
					
					// String
				
						writeString(this.pilier,dos);
					
					// Integer
				
						writeInteger(this.prix,dos);
					
					// Double
				
						if(this.tva == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.tva);
		            	}
					
					// Integer
				
						writeInteger(this.volume_unitaire,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id_produit="+String.valueOf(id_produit));
		sb.append(",id_pilier="+String.valueOf(id_pilier));
		sb.append(",produits="+produits);
		sb.append(",pilier="+pilier);
		sb.append(",prix="+String.valueOf(prix));
		sb.append(",tva="+String.valueOf(tva));
		sb.append(",volume_unitaire="+String.valueOf(volume_unitaire));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row6Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.id_produit, other.id_produit);
						if(returnValue != 0) {
							return returnValue;
						}

					
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class OnRowsEndStructtSortRow_2 implements routines.system.IPersistableRow<OnRowsEndStructtSortRow_2> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Produits = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_Dim_Produits = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public long id_produit;

				public long getId_produit () {
					return this.id_produit;
				}
				
			    public Long id_pilier;

				public Long getId_pilier () {
					return this.id_pilier;
				}
				
			    public String produits;

				public String getProduits () {
					return this.produits;
				}
				
			    public String pilier;

				public String getPilier () {
					return this.pilier;
				}
				
			    public Integer prix;

				public Integer getPrix () {
					return this.prix;
				}
				
			    public Double tva;

				public Double getTva () {
					return this.tva;
				}
				
			    public Integer volume_unitaire;

				public Integer getVolume_unitaire () {
					return this.volume_unitaire;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
							result = prime * result + (int) this.id_produit;
						
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final OnRowsEndStructtSortRow_2 other = (OnRowsEndStructtSortRow_2) obj;
		
						if (this.id_produit != other.id_produit)
							return false;
					

		return true;
    }

	public void copyDataTo(OnRowsEndStructtSortRow_2 other) {

		other.id_produit = this.id_produit;
	            other.id_pilier = this.id_pilier;
	            other.produits = this.produits;
	            other.pilier = this.pilier;
	            other.prix = this.prix;
	            other.tva = this.tva;
	            other.volume_unitaire = this.volume_unitaire;
	            
	}

	public void copyKeysDataTo(OnRowsEndStructtSortRow_2 other) {

		other.id_produit = this.id_produit;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Produits.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Produits.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Produits = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Produits = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Produits, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Produits, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Produits.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Produits.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Produits = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Produits = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Produits, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Produits, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }
	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Produits) {

        	try {

        		int length = 0;
		
			        this.id_produit = dis.readLong();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.id_pilier = null;
           				} else {
           			    	this.id_pilier = dis.readLong();
           				}
					
					this.produits = readString(dis);
					
					this.pilier = readString(dis);
					
						this.prix = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.tva = null;
           				} else {
           			    	this.tva = dis.readDouble();
           				}
					
						this.volume_unitaire = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Produits) {

        	try {

        		int length = 0;
		
			        this.id_produit = dis.readLong();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.id_pilier = null;
           				} else {
           			    	this.id_pilier = dis.readLong();
           				}
					
					this.produits = readString(dis);
					
					this.pilier = readString(dis);
					
						this.prix = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.tva = null;
           				} else {
           			    	this.tva = dis.readDouble();
           				}
					
						this.volume_unitaire = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id_produit);
					
					// Long
				
						if(this.id_pilier == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.id_pilier);
		            	}
					
					// String
				
						writeString(this.produits,dos);
					
					// String
				
						writeString(this.pilier,dos);
					
					// Integer
				
						writeInteger(this.prix,dos);
					
					// Double
				
						if(this.tva == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.tva);
		            	}
					
					// Integer
				
						writeInteger(this.volume_unitaire,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id_produit);
					
					// Long
				
						if(this.id_pilier == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.id_pilier);
		            	}
					
					// String
				
						writeString(this.produits,dos);
					
					// String
				
						writeString(this.pilier,dos);
					
					// Integer
				
						writeInteger(this.prix,dos);
					
					// Double
				
						if(this.tva == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.tva);
		            	}
					
					// Integer
				
						writeInteger(this.volume_unitaire,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id_produit="+String.valueOf(id_produit));
		sb.append(",id_pilier="+String.valueOf(id_pilier));
		sb.append(",produits="+produits);
		sb.append(",pilier="+pilier);
		sb.append(",prix="+String.valueOf(prix));
		sb.append(",tva="+String.valueOf(tva));
		sb.append(",volume_unitaire="+String.valueOf(volume_unitaire));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(OnRowsEndStructtSortRow_2 other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.id_produit, other.id_produit);
						if(returnValue != 0) {
							return returnValue;
						}

					
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class Insert_New_DataStruct implements routines.system.IPersistableRow<Insert_New_DataStruct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Produits = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_Dim_Produits = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public long id_produit;

				public long getId_produit () {
					return this.id_produit;
				}
				
			    public Long id_pilier;

				public Long getId_pilier () {
					return this.id_pilier;
				}
				
			    public String produits;

				public String getProduits () {
					return this.produits;
				}
				
			    public String pilier;

				public String getPilier () {
					return this.pilier;
				}
				
			    public Integer prix;

				public Integer getPrix () {
					return this.prix;
				}
				
			    public Double tva;

				public Double getTva () {
					return this.tva;
				}
				
			    public Integer volume_unitaire;

				public Integer getVolume_unitaire () {
					return this.volume_unitaire;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
							result = prime * result + (int) this.id_produit;
						
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final Insert_New_DataStruct other = (Insert_New_DataStruct) obj;
		
						if (this.id_produit != other.id_produit)
							return false;
					

		return true;
    }

	public void copyDataTo(Insert_New_DataStruct other) {

		other.id_produit = this.id_produit;
	            other.id_pilier = this.id_pilier;
	            other.produits = this.produits;
	            other.pilier = this.pilier;
	            other.prix = this.prix;
	            other.tva = this.tva;
	            other.volume_unitaire = this.volume_unitaire;
	            
	}

	public void copyKeysDataTo(Insert_New_DataStruct other) {

		other.id_produit = this.id_produit;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Produits.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Produits.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Produits = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Produits = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Produits, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Produits, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Produits.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Produits.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Produits = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Produits = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Produits, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Produits, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }
	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Produits) {

        	try {

        		int length = 0;
		
			        this.id_produit = dis.readLong();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.id_pilier = null;
           				} else {
           			    	this.id_pilier = dis.readLong();
           				}
					
					this.produits = readString(dis);
					
					this.pilier = readString(dis);
					
						this.prix = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.tva = null;
           				} else {
           			    	this.tva = dis.readDouble();
           				}
					
						this.volume_unitaire = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Produits) {

        	try {

        		int length = 0;
		
			        this.id_produit = dis.readLong();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.id_pilier = null;
           				} else {
           			    	this.id_pilier = dis.readLong();
           				}
					
					this.produits = readString(dis);
					
					this.pilier = readString(dis);
					
						this.prix = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.tva = null;
           				} else {
           			    	this.tva = dis.readDouble();
           				}
					
						this.volume_unitaire = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id_produit);
					
					// Long
				
						if(this.id_pilier == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.id_pilier);
		            	}
					
					// String
				
						writeString(this.produits,dos);
					
					// String
				
						writeString(this.pilier,dos);
					
					// Integer
				
						writeInteger(this.prix,dos);
					
					// Double
				
						if(this.tva == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.tva);
		            	}
					
					// Integer
				
						writeInteger(this.volume_unitaire,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id_produit);
					
					// Long
				
						if(this.id_pilier == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.id_pilier);
		            	}
					
					// String
				
						writeString(this.produits,dos);
					
					// String
				
						writeString(this.pilier,dos);
					
					// Integer
				
						writeInteger(this.prix,dos);
					
					// Double
				
						if(this.tva == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.tva);
		            	}
					
					// Integer
				
						writeInteger(this.volume_unitaire,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id_produit="+String.valueOf(id_produit));
		sb.append(",id_pilier="+String.valueOf(id_pilier));
		sb.append(",produits="+produits);
		sb.append(",pilier="+pilier);
		sb.append(",prix="+String.valueOf(prix));
		sb.append(",tva="+String.valueOf(tva));
		sb.append(",volume_unitaire="+String.valueOf(volume_unitaire));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(Insert_New_DataStruct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.id_produit, other.id_produit);
						if(returnValue != 0) {
							return returnValue;
						}

					
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class Update_DataStruct implements routines.system.IPersistableRow<Update_DataStruct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Produits = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_Dim_Produits = new byte[0];

	
			    public Long id_produit;

				public Long getId_produit () {
					return this.id_produit;
				}
				
			    public Long id_pilier;

				public Long getId_pilier () {
					return this.id_pilier;
				}
				
			    public String nomProduit;

				public String getNomProduit () {
					return this.nomProduit;
				}
				
			    public String nomPilier;

				public String getNomPilier () {
					return this.nomPilier;
				}
				
			    public Integer prix;

				public Integer getPrix () {
					return this.prix;
				}
				
			    public Integer volume_unitaire;

				public Integer getVolume_unitaire () {
					return this.volume_unitaire;
				}
				
			    public double tva;

				public double getTva () {
					return this.tva;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Produits.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Produits.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Produits = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Produits = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Produits, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Produits, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Produits.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Produits.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Produits = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Produits = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Produits, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Produits, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }
	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Produits) {

        	try {

        		int length = 0;
		
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.id_produit = null;
           				} else {
           			    	this.id_produit = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.id_pilier = null;
           				} else {
           			    	this.id_pilier = dis.readLong();
           				}
					
					this.nomProduit = readString(dis);
					
					this.nomPilier = readString(dis);
					
						this.prix = readInteger(dis);
					
						this.volume_unitaire = readInteger(dis);
					
			        this.tva = dis.readDouble();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Produits) {

        	try {

        		int length = 0;
		
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.id_produit = null;
           				} else {
           			    	this.id_produit = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.id_pilier = null;
           				} else {
           			    	this.id_pilier = dis.readLong();
           				}
					
					this.nomProduit = readString(dis);
					
					this.nomPilier = readString(dis);
					
						this.prix = readInteger(dis);
					
						this.volume_unitaire = readInteger(dis);
					
			        this.tva = dis.readDouble();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// Long
				
						if(this.id_produit == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.id_produit);
		            	}
					
					// Long
				
						if(this.id_pilier == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.id_pilier);
		            	}
					
					// String
				
						writeString(this.nomProduit,dos);
					
					// String
				
						writeString(this.nomPilier,dos);
					
					// Integer
				
						writeInteger(this.prix,dos);
					
					// Integer
				
						writeInteger(this.volume_unitaire,dos);
					
					// double
				
		            	dos.writeDouble(this.tva);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// Long
				
						if(this.id_produit == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.id_produit);
		            	}
					
					// Long
				
						if(this.id_pilier == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.id_pilier);
		            	}
					
					// String
				
						writeString(this.nomProduit,dos);
					
					// String
				
						writeString(this.nomPilier,dos);
					
					// Integer
				
						writeInteger(this.prix,dos);
					
					// Integer
				
						writeInteger(this.volume_unitaire,dos);
					
					// double
				
		            	dos.writeDouble(this.tva);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id_produit="+String.valueOf(id_produit));
		sb.append(",id_pilier="+String.valueOf(id_pilier));
		sb.append(",nomProduit="+nomProduit);
		sb.append(",nomPilier="+nomPilier);
		sb.append(",prix="+String.valueOf(prix));
		sb.append(",volume_unitaire="+String.valueOf(volume_unitaire));
		sb.append(",tva="+String.valueOf(tva));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(Update_DataStruct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class row4Struct implements routines.system.IPersistableRow<row4Struct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Produits = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_Dim_Produits = new byte[0];

	
			    public Long id_produit;

				public Long getId_produit () {
					return this.id_produit;
				}
				
			    public Long id_pilier;

				public Long getId_pilier () {
					return this.id_pilier;
				}
				
			    public String nomProduit;

				public String getNomProduit () {
					return this.nomProduit;
				}
				
			    public String nomPilier;

				public String getNomPilier () {
					return this.nomPilier;
				}
				
			    public Integer prix;

				public Integer getPrix () {
					return this.prix;
				}
				
			    public Integer volume_unitaire;

				public Integer getVolume_unitaire () {
					return this.volume_unitaire;
				}
				
			    public double tva;

				public double getTva () {
					return this.tva;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Produits.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Produits.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Produits = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Produits = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Produits, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Produits, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Produits.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Produits.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Produits = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Produits = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Produits, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Produits, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }
	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Produits) {

        	try {

        		int length = 0;
		
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.id_produit = null;
           				} else {
           			    	this.id_produit = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.id_pilier = null;
           				} else {
           			    	this.id_pilier = dis.readLong();
           				}
					
					this.nomProduit = readString(dis);
					
					this.nomPilier = readString(dis);
					
						this.prix = readInteger(dis);
					
						this.volume_unitaire = readInteger(dis);
					
			        this.tva = dis.readDouble();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Produits) {

        	try {

        		int length = 0;
		
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.id_produit = null;
           				} else {
           			    	this.id_produit = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.id_pilier = null;
           				} else {
           			    	this.id_pilier = dis.readLong();
           				}
					
					this.nomProduit = readString(dis);
					
					this.nomPilier = readString(dis);
					
						this.prix = readInteger(dis);
					
						this.volume_unitaire = readInteger(dis);
					
			        this.tva = dis.readDouble();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// Long
				
						if(this.id_produit == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.id_produit);
		            	}
					
					// Long
				
						if(this.id_pilier == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.id_pilier);
		            	}
					
					// String
				
						writeString(this.nomProduit,dos);
					
					// String
				
						writeString(this.nomPilier,dos);
					
					// Integer
				
						writeInteger(this.prix,dos);
					
					// Integer
				
						writeInteger(this.volume_unitaire,dos);
					
					// double
				
		            	dos.writeDouble(this.tva);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// Long
				
						if(this.id_produit == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.id_produit);
		            	}
					
					// Long
				
						if(this.id_pilier == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.id_pilier);
		            	}
					
					// String
				
						writeString(this.nomProduit,dos);
					
					// String
				
						writeString(this.nomPilier,dos);
					
					// Integer
				
						writeInteger(this.prix,dos);
					
					// Integer
				
						writeInteger(this.volume_unitaire,dos);
					
					// double
				
		            	dos.writeDouble(this.tva);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id_produit="+String.valueOf(id_produit));
		sb.append(",id_pilier="+String.valueOf(id_pilier));
		sb.append(",nomProduit="+nomProduit);
		sb.append(",nomPilier="+nomPilier);
		sb.append(",prix="+String.valueOf(prix));
		sb.append(",volume_unitaire="+String.valueOf(volume_unitaire));
		sb.append(",tva="+String.valueOf(tva));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row4Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class OnRowsEndStructtSortRow_1 implements routines.system.IPersistableRow<OnRowsEndStructtSortRow_1> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Produits = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_Dim_Produits = new byte[0];

	
			    public Long id_produit;

				public Long getId_produit () {
					return this.id_produit;
				}
				
			    public Long id_pilier;

				public Long getId_pilier () {
					return this.id_pilier;
				}
				
			    public String nomProduit;

				public String getNomProduit () {
					return this.nomProduit;
				}
				
			    public String nomPilier;

				public String getNomPilier () {
					return this.nomPilier;
				}
				
			    public Integer prix;

				public Integer getPrix () {
					return this.prix;
				}
				
			    public Integer volume_unitaire;

				public Integer getVolume_unitaire () {
					return this.volume_unitaire;
				}
				
			    public double tva;

				public double getTva () {
					return this.tva;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Produits.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Produits.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Produits = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Produits = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Produits, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Produits, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Produits.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Produits.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Produits = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Produits = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Produits, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Produits, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }
	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Produits) {

        	try {

        		int length = 0;
		
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.id_produit = null;
           				} else {
           			    	this.id_produit = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.id_pilier = null;
           				} else {
           			    	this.id_pilier = dis.readLong();
           				}
					
					this.nomProduit = readString(dis);
					
					this.nomPilier = readString(dis);
					
						this.prix = readInteger(dis);
					
						this.volume_unitaire = readInteger(dis);
					
			        this.tva = dis.readDouble();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Produits) {

        	try {

        		int length = 0;
		
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.id_produit = null;
           				} else {
           			    	this.id_produit = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.id_pilier = null;
           				} else {
           			    	this.id_pilier = dis.readLong();
           				}
					
					this.nomProduit = readString(dis);
					
					this.nomPilier = readString(dis);
					
						this.prix = readInteger(dis);
					
						this.volume_unitaire = readInteger(dis);
					
			        this.tva = dis.readDouble();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// Long
				
						if(this.id_produit == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.id_produit);
		            	}
					
					// Long
				
						if(this.id_pilier == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.id_pilier);
		            	}
					
					// String
				
						writeString(this.nomProduit,dos);
					
					// String
				
						writeString(this.nomPilier,dos);
					
					// Integer
				
						writeInteger(this.prix,dos);
					
					// Integer
				
						writeInteger(this.volume_unitaire,dos);
					
					// double
				
		            	dos.writeDouble(this.tva);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// Long
				
						if(this.id_produit == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.id_produit);
		            	}
					
					// Long
				
						if(this.id_pilier == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.id_pilier);
		            	}
					
					// String
				
						writeString(this.nomProduit,dos);
					
					// String
				
						writeString(this.nomPilier,dos);
					
					// Integer
				
						writeInteger(this.prix,dos);
					
					// Integer
				
						writeInteger(this.volume_unitaire,dos);
					
					// double
				
		            	dos.writeDouble(this.tva);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id_produit="+String.valueOf(id_produit));
		sb.append(",id_pilier="+String.valueOf(id_pilier));
		sb.append(",nomProduit="+nomProduit);
		sb.append(",nomPilier="+nomPilier);
		sb.append(",prix="+String.valueOf(prix));
		sb.append(",volume_unitaire="+String.valueOf(volume_unitaire));
		sb.append(",tva="+String.valueOf(tva));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(OnRowsEndStructtSortRow_1 other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class out1Struct implements routines.system.IPersistableRow<out1Struct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Produits = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_Dim_Produits = new byte[0];

	
			    public Long id_produit;

				public Long getId_produit () {
					return this.id_produit;
				}
				
			    public Long id_pilier;

				public Long getId_pilier () {
					return this.id_pilier;
				}
				
			    public String nomProduit;

				public String getNomProduit () {
					return this.nomProduit;
				}
				
			    public String nomPilier;

				public String getNomPilier () {
					return this.nomPilier;
				}
				
			    public Integer prix;

				public Integer getPrix () {
					return this.prix;
				}
				
			    public Integer volume_unitaire;

				public Integer getVolume_unitaire () {
					return this.volume_unitaire;
				}
				
			    public double tva;

				public double getTva () {
					return this.tva;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Produits.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Produits.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Produits = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Produits = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Produits, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Produits, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Produits.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Produits.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Produits = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Produits = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Produits, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Produits, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }
	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Produits) {

        	try {

        		int length = 0;
		
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.id_produit = null;
           				} else {
           			    	this.id_produit = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.id_pilier = null;
           				} else {
           			    	this.id_pilier = dis.readLong();
           				}
					
					this.nomProduit = readString(dis);
					
					this.nomPilier = readString(dis);
					
						this.prix = readInteger(dis);
					
						this.volume_unitaire = readInteger(dis);
					
			        this.tva = dis.readDouble();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Produits) {

        	try {

        		int length = 0;
		
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.id_produit = null;
           				} else {
           			    	this.id_produit = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.id_pilier = null;
           				} else {
           			    	this.id_pilier = dis.readLong();
           				}
					
					this.nomProduit = readString(dis);
					
					this.nomPilier = readString(dis);
					
						this.prix = readInteger(dis);
					
						this.volume_unitaire = readInteger(dis);
					
			        this.tva = dis.readDouble();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// Long
				
						if(this.id_produit == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.id_produit);
		            	}
					
					// Long
				
						if(this.id_pilier == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.id_pilier);
		            	}
					
					// String
				
						writeString(this.nomProduit,dos);
					
					// String
				
						writeString(this.nomPilier,dos);
					
					// Integer
				
						writeInteger(this.prix,dos);
					
					// Integer
				
						writeInteger(this.volume_unitaire,dos);
					
					// double
				
		            	dos.writeDouble(this.tva);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// Long
				
						if(this.id_produit == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.id_produit);
		            	}
					
					// Long
				
						if(this.id_pilier == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.id_pilier);
		            	}
					
					// String
				
						writeString(this.nomProduit,dos);
					
					// String
				
						writeString(this.nomPilier,dos);
					
					// Integer
				
						writeInteger(this.prix,dos);
					
					// Integer
				
						writeInteger(this.volume_unitaire,dos);
					
					// double
				
		            	dos.writeDouble(this.tva);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id_produit="+String.valueOf(id_produit));
		sb.append(",id_pilier="+String.valueOf(id_pilier));
		sb.append(",nomProduit="+nomProduit);
		sb.append(",nomPilier="+nomPilier);
		sb.append(",prix="+String.valueOf(prix));
		sb.append(",volume_unitaire="+String.valueOf(volume_unitaire));
		sb.append(",tva="+String.valueOf(tva));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(out1Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class row1Struct implements routines.system.IPersistableRow<row1Struct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Produits = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_Dim_Produits = new byte[0];

	
			    public long id;

				public long getId () {
					return this.id;
				}
				
			    public String sku_commcare;

				public String getSku_commcare () {
					return this.sku_commcare;
				}
				
			    public String sku_sage;

				public String getSku_sage () {
					return this.sku_sage;
				}
				
			    public Integer price;

				public Integer getPrice () {
					return this.price;
				}
				
			    public Double tva;

				public Double getTva () {
					return this.tva;
				}
				
			    public Integer stock_min;

				public Integer getStock_min () {
					return this.stock_min;
				}
				
			    public Integer stock_maxi;

				public Integer getStock_maxi () {
					return this.stock_maxi;
				}
				
			    public long category_id;

				public long getCategory_id () {
					return this.category_id;
				}
				
			    public java.util.Date created_at;

				public java.util.Date getCreated_at () {
					return this.created_at;
				}
				
			    public java.util.Date updated_at;

				public java.util.Date getUpdated_at () {
					return this.updated_at;
				}
				
			    public Boolean is_accessorie;

				public Boolean getIs_accessorie () {
					return this.is_accessorie;
				}
				
			    public Boolean activate;

				public Boolean getActivate () {
					return this.activate;
				}
				
			    public Integer box_quantity;

				public Integer getBox_quantity () {
					return this.box_quantity;
				}
				
			    public Integer cooler_quantity;

				public Integer getCooler_quantity () {
					return this.cooler_quantity;
				}
				
			    public Integer volume;

				public Integer getVolume () {
					return this.volume;
				}
				
			    public Integer pallet;

				public Integer getPallet () {
					return this.pallet;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Produits.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Produits.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Produits = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Produits = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Produits, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Produits, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Produits.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Produits.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Produits = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Produits = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Produits, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Produits, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }
	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Produits) {

        	try {

        		int length = 0;
		
			        this.id = dis.readLong();
					
					this.sku_commcare = readString(dis);
					
					this.sku_sage = readString(dis);
					
						this.price = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.tva = null;
           				} else {
           			    	this.tva = dis.readDouble();
           				}
					
						this.stock_min = readInteger(dis);
					
						this.stock_maxi = readInteger(dis);
					
			        this.category_id = dis.readLong();
					
					this.created_at = readDate(dis);
					
					this.updated_at = readDate(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.is_accessorie = null;
           				} else {
           			    	this.is_accessorie = dis.readBoolean();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.activate = null;
           				} else {
           			    	this.activate = dis.readBoolean();
           				}
					
						this.box_quantity = readInteger(dis);
					
						this.cooler_quantity = readInteger(dis);
					
						this.volume = readInteger(dis);
					
						this.pallet = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Produits) {

        	try {

        		int length = 0;
		
			        this.id = dis.readLong();
					
					this.sku_commcare = readString(dis);
					
					this.sku_sage = readString(dis);
					
						this.price = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.tva = null;
           				} else {
           			    	this.tva = dis.readDouble();
           				}
					
						this.stock_min = readInteger(dis);
					
						this.stock_maxi = readInteger(dis);
					
			        this.category_id = dis.readLong();
					
					this.created_at = readDate(dis);
					
					this.updated_at = readDate(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.is_accessorie = null;
           				} else {
           			    	this.is_accessorie = dis.readBoolean();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.activate = null;
           				} else {
           			    	this.activate = dis.readBoolean();
           				}
					
						this.box_quantity = readInteger(dis);
					
						this.cooler_quantity = readInteger(dis);
					
						this.volume = readInteger(dis);
					
						this.pallet = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id);
					
					// String
				
						writeString(this.sku_commcare,dos);
					
					// String
				
						writeString(this.sku_sage,dos);
					
					// Integer
				
						writeInteger(this.price,dos);
					
					// Double
				
						if(this.tva == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.tva);
		            	}
					
					// Integer
				
						writeInteger(this.stock_min,dos);
					
					// Integer
				
						writeInteger(this.stock_maxi,dos);
					
					// long
				
		            	dos.writeLong(this.category_id);
					
					// java.util.Date
				
						writeDate(this.created_at,dos);
					
					// java.util.Date
				
						writeDate(this.updated_at,dos);
					
					// Boolean
				
						if(this.is_accessorie == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.is_accessorie);
		            	}
					
					// Boolean
				
						if(this.activate == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.activate);
		            	}
					
					// Integer
				
						writeInteger(this.box_quantity,dos);
					
					// Integer
				
						writeInteger(this.cooler_quantity,dos);
					
					// Integer
				
						writeInteger(this.volume,dos);
					
					// Integer
				
						writeInteger(this.pallet,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id);
					
					// String
				
						writeString(this.sku_commcare,dos);
					
					// String
				
						writeString(this.sku_sage,dos);
					
					// Integer
				
						writeInteger(this.price,dos);
					
					// Double
				
						if(this.tva == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.tva);
		            	}
					
					// Integer
				
						writeInteger(this.stock_min,dos);
					
					// Integer
				
						writeInteger(this.stock_maxi,dos);
					
					// long
				
		            	dos.writeLong(this.category_id);
					
					// java.util.Date
				
						writeDate(this.created_at,dos);
					
					// java.util.Date
				
						writeDate(this.updated_at,dos);
					
					// Boolean
				
						if(this.is_accessorie == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.is_accessorie);
		            	}
					
					// Boolean
				
						if(this.activate == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.activate);
		            	}
					
					// Integer
				
						writeInteger(this.box_quantity,dos);
					
					// Integer
				
						writeInteger(this.cooler_quantity,dos);
					
					// Integer
				
						writeInteger(this.volume,dos);
					
					// Integer
				
						writeInteger(this.pallet,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id="+String.valueOf(id));
		sb.append(",sku_commcare="+sku_commcare);
		sb.append(",sku_sage="+sku_sage);
		sb.append(",price="+String.valueOf(price));
		sb.append(",tva="+String.valueOf(tva));
		sb.append(",stock_min="+String.valueOf(stock_min));
		sb.append(",stock_maxi="+String.valueOf(stock_maxi));
		sb.append(",category_id="+String.valueOf(category_id));
		sb.append(",created_at="+String.valueOf(created_at));
		sb.append(",updated_at="+String.valueOf(updated_at));
		sb.append(",is_accessorie="+String.valueOf(is_accessorie));
		sb.append(",activate="+String.valueOf(activate));
		sb.append(",box_quantity="+String.valueOf(box_quantity));
		sb.append(",cooler_quantity="+String.valueOf(cooler_quantity));
		sb.append(",volume="+String.valueOf(volume));
		sb.append(",pallet="+String.valueOf(pallet));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row1Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class after_tDBInput_1Struct implements routines.system.IPersistableRow<after_tDBInput_1Struct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Produits = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_Dim_Produits = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public long id;

				public long getId () {
					return this.id;
				}
				
			    public String sku_commcare;

				public String getSku_commcare () {
					return this.sku_commcare;
				}
				
			    public String sku_sage;

				public String getSku_sage () {
					return this.sku_sage;
				}
				
			    public Integer price;

				public Integer getPrice () {
					return this.price;
				}
				
			    public Double tva;

				public Double getTva () {
					return this.tva;
				}
				
			    public Integer stock_min;

				public Integer getStock_min () {
					return this.stock_min;
				}
				
			    public Integer stock_maxi;

				public Integer getStock_maxi () {
					return this.stock_maxi;
				}
				
			    public long category_id;

				public long getCategory_id () {
					return this.category_id;
				}
				
			    public java.util.Date created_at;

				public java.util.Date getCreated_at () {
					return this.created_at;
				}
				
			    public java.util.Date updated_at;

				public java.util.Date getUpdated_at () {
					return this.updated_at;
				}
				
			    public Boolean is_accessorie;

				public Boolean getIs_accessorie () {
					return this.is_accessorie;
				}
				
			    public Boolean activate;

				public Boolean getActivate () {
					return this.activate;
				}
				
			    public Integer box_quantity;

				public Integer getBox_quantity () {
					return this.box_quantity;
				}
				
			    public Integer cooler_quantity;

				public Integer getCooler_quantity () {
					return this.cooler_quantity;
				}
				
			    public Integer volume;

				public Integer getVolume () {
					return this.volume;
				}
				
			    public Integer pallet;

				public Integer getPallet () {
					return this.pallet;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
							result = prime * result + (int) this.id;
						
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final after_tDBInput_1Struct other = (after_tDBInput_1Struct) obj;
		
						if (this.id != other.id)
							return false;
					

		return true;
    }

	public void copyDataTo(after_tDBInput_1Struct other) {

		other.id = this.id;
	            other.sku_commcare = this.sku_commcare;
	            other.sku_sage = this.sku_sage;
	            other.price = this.price;
	            other.tva = this.tva;
	            other.stock_min = this.stock_min;
	            other.stock_maxi = this.stock_maxi;
	            other.category_id = this.category_id;
	            other.created_at = this.created_at;
	            other.updated_at = this.updated_at;
	            other.is_accessorie = this.is_accessorie;
	            other.activate = this.activate;
	            other.box_quantity = this.box_quantity;
	            other.cooler_quantity = this.cooler_quantity;
	            other.volume = this.volume;
	            other.pallet = this.pallet;
	            
	}

	public void copyKeysDataTo(after_tDBInput_1Struct other) {

		other.id = this.id;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Produits.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Produits.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Produits = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Produits = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Produits, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Produits, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Produits.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Produits.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Produits = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Produits = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Produits, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Produits, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }
	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Produits) {

        	try {

        		int length = 0;
		
			        this.id = dis.readLong();
					
					this.sku_commcare = readString(dis);
					
					this.sku_sage = readString(dis);
					
						this.price = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.tva = null;
           				} else {
           			    	this.tva = dis.readDouble();
           				}
					
						this.stock_min = readInteger(dis);
					
						this.stock_maxi = readInteger(dis);
					
			        this.category_id = dis.readLong();
					
					this.created_at = readDate(dis);
					
					this.updated_at = readDate(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.is_accessorie = null;
           				} else {
           			    	this.is_accessorie = dis.readBoolean();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.activate = null;
           				} else {
           			    	this.activate = dis.readBoolean();
           				}
					
						this.box_quantity = readInteger(dis);
					
						this.cooler_quantity = readInteger(dis);
					
						this.volume = readInteger(dis);
					
						this.pallet = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Produits) {

        	try {

        		int length = 0;
		
			        this.id = dis.readLong();
					
					this.sku_commcare = readString(dis);
					
					this.sku_sage = readString(dis);
					
						this.price = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.tva = null;
           				} else {
           			    	this.tva = dis.readDouble();
           				}
					
						this.stock_min = readInteger(dis);
					
						this.stock_maxi = readInteger(dis);
					
			        this.category_id = dis.readLong();
					
					this.created_at = readDate(dis);
					
					this.updated_at = readDate(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.is_accessorie = null;
           				} else {
           			    	this.is_accessorie = dis.readBoolean();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.activate = null;
           				} else {
           			    	this.activate = dis.readBoolean();
           				}
					
						this.box_quantity = readInteger(dis);
					
						this.cooler_quantity = readInteger(dis);
					
						this.volume = readInteger(dis);
					
						this.pallet = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id);
					
					// String
				
						writeString(this.sku_commcare,dos);
					
					// String
				
						writeString(this.sku_sage,dos);
					
					// Integer
				
						writeInteger(this.price,dos);
					
					// Double
				
						if(this.tva == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.tva);
		            	}
					
					// Integer
				
						writeInteger(this.stock_min,dos);
					
					// Integer
				
						writeInteger(this.stock_maxi,dos);
					
					// long
				
		            	dos.writeLong(this.category_id);
					
					// java.util.Date
				
						writeDate(this.created_at,dos);
					
					// java.util.Date
				
						writeDate(this.updated_at,dos);
					
					// Boolean
				
						if(this.is_accessorie == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.is_accessorie);
		            	}
					
					// Boolean
				
						if(this.activate == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.activate);
		            	}
					
					// Integer
				
						writeInteger(this.box_quantity,dos);
					
					// Integer
				
						writeInteger(this.cooler_quantity,dos);
					
					// Integer
				
						writeInteger(this.volume,dos);
					
					// Integer
				
						writeInteger(this.pallet,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id);
					
					// String
				
						writeString(this.sku_commcare,dos);
					
					// String
				
						writeString(this.sku_sage,dos);
					
					// Integer
				
						writeInteger(this.price,dos);
					
					// Double
				
						if(this.tva == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.tva);
		            	}
					
					// Integer
				
						writeInteger(this.stock_min,dos);
					
					// Integer
				
						writeInteger(this.stock_maxi,dos);
					
					// long
				
		            	dos.writeLong(this.category_id);
					
					// java.util.Date
				
						writeDate(this.created_at,dos);
					
					// java.util.Date
				
						writeDate(this.updated_at,dos);
					
					// Boolean
				
						if(this.is_accessorie == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.is_accessorie);
		            	}
					
					// Boolean
				
						if(this.activate == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.activate);
		            	}
					
					// Integer
				
						writeInteger(this.box_quantity,dos);
					
					// Integer
				
						writeInteger(this.cooler_quantity,dos);
					
					// Integer
				
						writeInteger(this.volume,dos);
					
					// Integer
				
						writeInteger(this.pallet,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id="+String.valueOf(id));
		sb.append(",sku_commcare="+sku_commcare);
		sb.append(",sku_sage="+sku_sage);
		sb.append(",price="+String.valueOf(price));
		sb.append(",tva="+String.valueOf(tva));
		sb.append(",stock_min="+String.valueOf(stock_min));
		sb.append(",stock_maxi="+String.valueOf(stock_maxi));
		sb.append(",category_id="+String.valueOf(category_id));
		sb.append(",created_at="+String.valueOf(created_at));
		sb.append(",updated_at="+String.valueOf(updated_at));
		sb.append(",is_accessorie="+String.valueOf(is_accessorie));
		sb.append(",activate="+String.valueOf(activate));
		sb.append(",box_quantity="+String.valueOf(box_quantity));
		sb.append(",cooler_quantity="+String.valueOf(cooler_quantity));
		sb.append(",volume="+String.valueOf(volume));
		sb.append(",pallet="+String.valueOf(pallet));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(after_tDBInput_1Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.id, other.id);
						if(returnValue != 0) {
							return returnValue;
						}

					
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void tDBInput_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
		String currentVirtualComponent = null;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;


		tDBInput_2Process(globalMap);
		tDBInput_3Process(globalMap);
		tDBInput_4Process(globalMap);

		row1Struct row1 = new row1Struct();
out1Struct out1 = new out1Struct();
row4Struct row4 = new row4Struct();
Insert_New_DataStruct Insert_New_Data = new Insert_New_DataStruct();
row6Struct row6 = new row6Struct();
Update_DataStruct Update_Data = new Update_DataStruct();
Update_Existing_DataStruct Update_Existing_Data = new Update_Existing_DataStruct();





	
	/**
	 * [tSortRow_1_SortOut begin ] start
	 */

	

	
		
		ok_Hash.put("tSortRow_1_SortOut", false);
		start_Hash.put("tSortRow_1_SortOut", System.currentTimeMillis());
		
	
		currentVirtualComponent = "tSortRow_1";
	
	currentComponent="tSortRow_1_SortOut";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"out1");
					}
				
		int tos_count_tSortRow_1_SortOut = 0;
		


class Comparableout1Struct extends out1Struct implements Comparable<Comparableout1Struct> {
	
	public int compareTo(Comparableout1Struct other) {

		if(this.nomPilier == null && other.nomPilier != null){
			return -1;
						
		}else if(this.nomPilier != null && other.nomPilier == null){
			return 1;
						
		}else if(this.nomPilier != null && other.nomPilier != null){
			if(!this.nomPilier.equals(other.nomPilier)){
				return this.nomPilier.compareTo(other.nomPilier);
			}
		}
		return 0;
	}
}

java.util.List<Comparableout1Struct> list_tSortRow_1_SortOut = new java.util.ArrayList<Comparableout1Struct>();


 



/**
 * [tSortRow_1_SortOut begin ] stop
 */



	
	/**
	 * [tMap_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_1", false);
		start_Hash.put("tMap_1", System.currentTimeMillis());
		
	
	currentComponent="tMap_1";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row1");
					}
				
		int tos_count_tMap_1 = 0;
		




// ###############################
// # Lookup's keys initialization
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row2Struct> tHash_Lookup_row2 = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row2Struct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row2Struct>) 
					globalMap.get( "tHash_Lookup_row2" ))
					;					
					
	

row2Struct row2HashKey = new row2Struct();
row2Struct row2Default = new row2Struct();
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_1__Struct  {
	double tva;
}
Var__tMap_1__Struct Var__tMap_1 = new Var__tMap_1__Struct();
// ###############################

// ###############################
// # Outputs initialization
out1Struct out1_tmp = new out1Struct();
// ###############################

        
        



        









 



/**
 * [tMap_1 begin ] stop
 */



	
	/**
	 * [tDBInput_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_1", false);
		start_Hash.put("tDBInput_1", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_1";

	
		int tos_count_tDBInput_1 = 0;
		
	
    
	
		    int nb_line_tDBInput_1 = 0;
		    java.sql.Connection conn_tDBInput_1 = null;
				String driverClass_tDBInput_1 = "org.postgresql.Driver";
			    java.lang.Class jdbcclazz_tDBInput_1 = java.lang.Class.forName(driverClass_tDBInput_1);
				String dbUser_tDBInput_1 = "malick.diouf";
				
				 
	final String decryptedPassword_tDBInput_1 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:Y9oQ9Zt3e2qinPrsoE7QHF0t/aqkGLESYnD1CIPUo+WTmdPxePmk9L4w");
				
				String dbPwd_tDBInput_1 = decryptedPassword_tDBInput_1;
				
				String url_tDBInput_1 = "jdbc:postgresql://" + "leuk.laiterieduberger.sn" + ":" + "5432" + "/" + "leuk_webapp_production";
				
				conn_tDBInput_1 = java.sql.DriverManager.getConnection(url_tDBInput_1,dbUser_tDBInput_1,dbPwd_tDBInput_1);
		        
				conn_tDBInput_1.setAutoCommit(false);
			
		    
			java.sql.Statement stmt_tDBInput_1 = conn_tDBInput_1.createStatement();

		    String dbquery_tDBInput_1 = "SELECT \n  \"public\".\"products\".\"id\", \n  \"public\".\"products\".\"sku_commcare\", \n  \"public\".\"products\".\"sku"
+"_sage\", \n  \"public\".\"products\".\"price\", \n  \"public\".\"products\".\"tva\", \n  \"public\".\"products\".\"stock_mi"
+"n\", \n  \"public\".\"products\".\"stock_maxi\", \n  \"public\".\"products\".\"category_id\", \n  \"public\".\"products\"."
+"\"created_at\", \n  \"public\".\"products\".\"updated_at\", \n  \"public\".\"products\".\"is_accessorie\", \n  \"public\"."
+"\"products\".\"activate\", \n  \"public\".\"products\".\"box_quantity\", \n  \"public\".\"products\".\"cooler_quantity\", "
+"\n  \"public\".\"products\".\"volume\", \n  \"public\".\"products\".\"pallet\"\nFROM \"public\".\"products\"";
		    

            	globalMap.put("tDBInput_1_QUERY",dbquery_tDBInput_1);
		    java.sql.ResultSet rs_tDBInput_1 = null;

		    try {
		    	rs_tDBInput_1 = stmt_tDBInput_1.executeQuery(dbquery_tDBInput_1);
		    	java.sql.ResultSetMetaData rsmd_tDBInput_1 = rs_tDBInput_1.getMetaData();
		    	int colQtyInRs_tDBInput_1 = rsmd_tDBInput_1.getColumnCount();

		    String tmpContent_tDBInput_1 = null;
		    
		    
		    while (rs_tDBInput_1.next()) {
		        nb_line_tDBInput_1++;
		        
							if(colQtyInRs_tDBInput_1 < 1) {
								row1.id = 0;
							} else {
		                          
            row1.id = rs_tDBInput_1.getLong(1);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 2) {
								row1.sku_commcare = null;
							} else {
	                         		
        	row1.sku_commcare = routines.system.JDBCUtil.getString(rs_tDBInput_1, 2, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 3) {
								row1.sku_sage = null;
							} else {
	                         		
        	row1.sku_sage = routines.system.JDBCUtil.getString(rs_tDBInput_1, 3, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 4) {
								row1.price = null;
							} else {
		                          
            row1.price = rs_tDBInput_1.getInt(4);
            if(rs_tDBInput_1.wasNull()){
                    row1.price = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 5) {
								row1.tva = null;
							} else {
	                         		
            row1.tva = rs_tDBInput_1.getDouble(5);
            if(rs_tDBInput_1.wasNull()){
                    row1.tva = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 6) {
								row1.stock_min = null;
							} else {
		                          
            row1.stock_min = rs_tDBInput_1.getInt(6);
            if(rs_tDBInput_1.wasNull()){
                    row1.stock_min = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 7) {
								row1.stock_maxi = null;
							} else {
		                          
            row1.stock_maxi = rs_tDBInput_1.getInt(7);
            if(rs_tDBInput_1.wasNull()){
                    row1.stock_maxi = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 8) {
								row1.category_id = 0;
							} else {
		                          
            row1.category_id = rs_tDBInput_1.getLong(8);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 9) {
								row1.created_at = null;
							} else {
										
			row1.created_at = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 9);
		                    }
							if(colQtyInRs_tDBInput_1 < 10) {
								row1.updated_at = null;
							} else {
										
			row1.updated_at = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 10);
		                    }
							if(colQtyInRs_tDBInput_1 < 11) {
								row1.is_accessorie = null;
							} else {
	                         		
            row1.is_accessorie = rs_tDBInput_1.getBoolean(11);
            if(rs_tDBInput_1.wasNull()){
                    row1.is_accessorie = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 12) {
								row1.activate = null;
							} else {
	                         		
            row1.activate = rs_tDBInput_1.getBoolean(12);
            if(rs_tDBInput_1.wasNull()){
                    row1.activate = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 13) {
								row1.box_quantity = null;
							} else {
		                          
            row1.box_quantity = rs_tDBInput_1.getInt(13);
            if(rs_tDBInput_1.wasNull()){
                    row1.box_quantity = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 14) {
								row1.cooler_quantity = null;
							} else {
		                          
            row1.cooler_quantity = rs_tDBInput_1.getInt(14);
            if(rs_tDBInput_1.wasNull()){
                    row1.cooler_quantity = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 15) {
								row1.volume = null;
							} else {
		                          
            row1.volume = rs_tDBInput_1.getInt(15);
            if(rs_tDBInput_1.wasNull()){
                    row1.volume = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 16) {
								row1.pallet = null;
							} else {
		                          
            row1.pallet = rs_tDBInput_1.getInt(16);
            if(rs_tDBInput_1.wasNull()){
                    row1.pallet = null;
            }
		                    }
					


 



/**
 * [tDBInput_1 begin ] stop
 */
	
	/**
	 * [tDBInput_1 main ] start
	 */

	

	
	
	currentComponent="tDBInput_1";

	

 


	tos_count_tDBInput_1++;

/**
 * [tDBInput_1 main ] stop
 */
	
	/**
	 * [tDBInput_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_1";

	

 



/**
 * [tDBInput_1 process_data_begin ] stop
 */

	
	/**
	 * [tMap_1 main ] start
	 */

	

	
	
	currentComponent="tMap_1";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row1"
						
						);
					}
					

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_1 = false;
		

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_1 = false;
		  boolean mainRowRejected_tMap_1 = false;
            				    								  
		

				///////////////////////////////////////////////
				// Starting Lookup Table "row2" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLooprow2 = false;
       		  	    	
       		  	    	
 							row2Struct row2ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_1) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_1 = false;
								
	                        		    	Object exprKeyValue_row2__id = row1.category_id ;
	                        		    	if(exprKeyValue_row2__id == null) {
	                        		    		hasCasePrimitiveKeyWithNull_tMap_1 = true;
	                        		    	} else {
                        		    			row2HashKey.id = (long)(Long) exprKeyValue_row2__id;
                        		    		}
                        		    		

								
		                        	row2HashKey.hashCodeDirty = true;
                        		
	  					
	  							
	
		  							if(!hasCasePrimitiveKeyWithNull_tMap_1) { // G_TM_M_091
		  							
			  					
			  					
			  					
	  					
		  							tHash_Lookup_row2.lookup( row2HashKey );

	  							

	  							

			  						} // G_TM_M_091
			  						
			  					

 								
								  
								  if(hasCasePrimitiveKeyWithNull_tMap_1 || !tHash_Lookup_row2.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_1 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row2 != null && tHash_Lookup_row2.getCount(row2HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row2' and it contains more one result from keys :  row2.id = '" + row2HashKey.id + "'");
								} // G 071
							

							row2Struct row2 = null;
                    		  	 
							   
                    		  	 
	       		  	    	row2Struct fromLookup_row2 = null;
							row2 = row2Default;
										 
							
								 
							
							
								if (tHash_Lookup_row2 !=null && tHash_Lookup_row2.hasNext()) { // G 099
								
							
								
								fromLookup_row2 = tHash_Lookup_row2.next();

							
							
								} // G 099
							
							

							if(fromLookup_row2 != null) {
								row2 = fromLookup_row2;
							}
							
							
							
			  							
								
	                    		  	
		                    
	            	
	            	
	            // ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_1__Struct Var = Var__tMap_1;
Var.tva = row1.tva != null ? row1.tva : 1.18 ;// ###############################
        // ###############################
        // # Output tables

out1 = null;

if(!rejectedInnerJoin_tMap_1 ) {

// # Output table : 'out1'
out1_tmp.id_produit = row1.id ;
out1_tmp.id_pilier = row2.id ;
out1_tmp.nomProduit = row1.sku_sage ;
out1_tmp.nomPilier = row2.libelle ;
out1_tmp.prix = row1.price ;
out1_tmp.volume_unitaire = row1.volume ;
out1_tmp.tva = Var.tva ;
out1 = out1_tmp;
}  // closing inner join bracket (2)
// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_1 = false;










 


	tos_count_tMap_1++;

/**
 * [tMap_1 main ] stop
 */
	
	/**
	 * [tMap_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMap_1";

	

 



/**
 * [tMap_1 process_data_begin ] stop
 */
// Start of branch "out1"
if(out1 != null) { 



	
	/**
	 * [tSortRow_1_SortOut main ] start
	 */

	

	
	
		currentVirtualComponent = "tSortRow_1";
	
	currentComponent="tSortRow_1_SortOut";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"out1"
						
						);
					}
					



	Comparableout1Struct arrayRowtSortRow_1_SortOut = new Comparableout1Struct();

	arrayRowtSortRow_1_SortOut.id_produit = out1.id_produit;
	arrayRowtSortRow_1_SortOut.id_pilier = out1.id_pilier;
	arrayRowtSortRow_1_SortOut.nomProduit = out1.nomProduit;
	arrayRowtSortRow_1_SortOut.nomPilier = out1.nomPilier;
	arrayRowtSortRow_1_SortOut.prix = out1.prix;
	arrayRowtSortRow_1_SortOut.volume_unitaire = out1.volume_unitaire;
	arrayRowtSortRow_1_SortOut.tva = out1.tva;	
	list_tSortRow_1_SortOut.add(arrayRowtSortRow_1_SortOut);

 


	tos_count_tSortRow_1_SortOut++;

/**
 * [tSortRow_1_SortOut main ] stop
 */
	
	/**
	 * [tSortRow_1_SortOut process_data_begin ] start
	 */

	

	
	
		currentVirtualComponent = "tSortRow_1";
	
	currentComponent="tSortRow_1_SortOut";

	

 



/**
 * [tSortRow_1_SortOut process_data_begin ] stop
 */
	
	/**
	 * [tSortRow_1_SortOut process_data_end ] start
	 */

	

	
	
		currentVirtualComponent = "tSortRow_1";
	
	currentComponent="tSortRow_1_SortOut";

	

 



/**
 * [tSortRow_1_SortOut process_data_end ] stop
 */

} // End of branch "out1"




	
	/**
	 * [tMap_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_1";

	

 



/**
 * [tMap_1 process_data_end ] stop
 */



	
	/**
	 * [tDBInput_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_1";

	

 



/**
 * [tDBInput_1 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_1 end ] start
	 */

	

	
	
	currentComponent="tDBInput_1";

	

	}
}finally{
	if (rs_tDBInput_1 != null) {
		rs_tDBInput_1.close();
	}
	if (stmt_tDBInput_1 != null) {
		stmt_tDBInput_1.close();
	}
	if(conn_tDBInput_1 != null && !conn_tDBInput_1.isClosed()) {
		
			conn_tDBInput_1.commit();
			
		
			conn_tDBInput_1.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
			}
			
	}
	
}
globalMap.put("tDBInput_1_NB_LINE",nb_line_tDBInput_1);
 

ok_Hash.put("tDBInput_1", true);
end_Hash.put("tDBInput_1", System.currentTimeMillis());




/**
 * [tDBInput_1 end ] stop
 */

	
	/**
	 * [tMap_1 end ] start
	 */

	

	
	
	currentComponent="tMap_1";

	


// ###############################
// # Lookup hashes releasing
					if(tHash_Lookup_row2 != null) {
						tHash_Lookup_row2.endGet();
					}
					globalMap.remove( "tHash_Lookup_row2" );

					
					
				
// ###############################      





				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row1");
			  	}
			  	
 

ok_Hash.put("tMap_1", true);
end_Hash.put("tMap_1", System.currentTimeMillis());




/**
 * [tMap_1 end ] stop
 */

	
	/**
	 * [tSortRow_1_SortOut end ] start
	 */

	

	
	
		currentVirtualComponent = "tSortRow_1";
	
	currentComponent="tSortRow_1_SortOut";

	

out1Struct[] array_tSortRow_1_SortOut = list_tSortRow_1_SortOut.toArray(new Comparableout1Struct[0]);

java.util.Arrays.sort(array_tSortRow_1_SortOut);

globalMap.put("tSortRow_1",array_tSortRow_1_SortOut);


				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"out1");
			  	}
			  	
 

ok_Hash.put("tSortRow_1_SortOut", true);
end_Hash.put("tSortRow_1_SortOut", System.currentTimeMillis());




/**
 * [tSortRow_1_SortOut end ] stop
 */



	
	/**
	 * [tSortRow_2_SortOut begin ] start
	 */

	

	
		
		ok_Hash.put("tSortRow_2_SortOut", false);
		start_Hash.put("tSortRow_2_SortOut", System.currentTimeMillis());
		
	
		currentVirtualComponent = "tSortRow_2";
	
	currentComponent="tSortRow_2_SortOut";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"Insert_New_Data");
					}
				
		int tos_count_tSortRow_2_SortOut = 0;
		


class ComparableInsert_New_DataStruct extends Insert_New_DataStruct implements Comparable<ComparableInsert_New_DataStruct> {
	
	public int compareTo(ComparableInsert_New_DataStruct other) {

		if(this.pilier == null && other.pilier != null){
			return -1;
						
		}else if(this.pilier != null && other.pilier == null){
			return 1;
						
		}else if(this.pilier != null && other.pilier != null){
			if(!this.pilier.equals(other.pilier)){
				return this.pilier.compareTo(other.pilier);
			}
		}
		return 0;
	}
}

java.util.List<ComparableInsert_New_DataStruct> list_tSortRow_2_SortOut = new java.util.ArrayList<ComparableInsert_New_DataStruct>();


 



/**
 * [tSortRow_2_SortOut begin ] stop
 */





	
	/**
	 * [tDBOutput_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_3", false);
		start_Hash.put("tDBOutput_3", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_3";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"Update_Existing_Data");
					}
				
		int tos_count_tDBOutput_3 = 0;
		





String dbschema_tDBOutput_3 = null;
	dbschema_tDBOutput_3 = "public";
	

String tableName_tDBOutput_3 = null;
if(dbschema_tDBOutput_3 == null || dbschema_tDBOutput_3.trim().length() == 0) {
	tableName_tDBOutput_3 = ("Dim_Produits");
} else {
	tableName_tDBOutput_3 = dbschema_tDBOutput_3 + "\".\"" + ("Dim_Produits");
}

        int updateKeyCount_tDBOutput_3 = 1;
        if(updateKeyCount_tDBOutput_3 < 1) {
            throw new RuntimeException("For update, Schema must have a key");
        } else if (updateKeyCount_tDBOutput_3 == 7 && true) {        
                throw new RuntimeException("For update, every Schema column can not be a key");
        }

int nb_line_tDBOutput_3 = 0;
int nb_line_update_tDBOutput_3 = 0;
int nb_line_inserted_tDBOutput_3 = 0;
int nb_line_deleted_tDBOutput_3 = 0;
int nb_line_rejected_tDBOutput_3 = 0;

int deletedCount_tDBOutput_3=0;
int updatedCount_tDBOutput_3=0;
int insertedCount_tDBOutput_3=0;
int rowsToCommitCount_tDBOutput_3=0;
int rejectedCount_tDBOutput_3=0;

boolean whetherReject_tDBOutput_3 = false;

java.sql.Connection conn_tDBOutput_3 = null;
String dbUser_tDBOutput_3 = null;

	
    java.lang.Class.forName("org.postgresql.Driver");
    
        String url_tDBOutput_3 = "jdbc:postgresql://"+"163.172.166.119"+":"+"5432"+"/"+"leuk_analytics";
    dbUser_tDBOutput_3 = "malick.diouf";
 
	final String decryptedPassword_tDBOutput_3 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:Xx/Ki3BPAXURapbVdA2TwY2cDAFt0UJXyfiqfRvVniKPJywVxdg=");

    String dbPwd_tDBOutput_3 = decryptedPassword_tDBOutput_3;

    conn_tDBOutput_3 = java.sql.DriverManager.getConnection(url_tDBOutput_3,dbUser_tDBOutput_3,dbPwd_tDBOutput_3);
	
	resourceMap.put("conn_tDBOutput_3", conn_tDBOutput_3);
        conn_tDBOutput_3.setAutoCommit(false);
        int commitEvery_tDBOutput_3 = 1000;
        int commitCounter_tDBOutput_3 = 0;


   int batchSize_tDBOutput_3 = 1000;
   int batchSizeCounter_tDBOutput_3=0;

int count_tDBOutput_3=0;
	    String update_tDBOutput_3 = "UPDATE \"" + tableName_tDBOutput_3 + "\" SET \"id_pilier\" = ?,\"produits\" = ?,\"pilier\" = ?,\"prix\" = ?,\"tva\" = ?,\"volume_unitaire\" = ? WHERE \"id_produit\" = ?";
	    java.sql.PreparedStatement pstmt_tDBOutput_3 = conn_tDBOutput_3.prepareStatement(update_tDBOutput_3);
	    resourceMap.put("pstmt_tDBOutput_3", pstmt_tDBOutput_3);
	    

 



/**
 * [tDBOutput_3 begin ] stop
 */



	
	/**
	 * [tMap_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_3", false);
		start_Hash.put("tMap_3", System.currentTimeMillis());
		
	
	currentComponent="tMap_3";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"Update_Data");
					}
				
		int tos_count_tMap_3 = 0;
		




// ###############################
// # Lookup's keys initialization
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row5Struct> tHash_Lookup_row5 = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row5Struct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row5Struct>) 
					globalMap.get( "tHash_Lookup_row5" ))
					;					
					
	

row5Struct row5HashKey = new row5Struct();
row5Struct row5Default = new row5Struct();
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_3__Struct  {
}
Var__tMap_3__Struct Var__tMap_3 = new Var__tMap_3__Struct();
// ###############################

// ###############################
// # Outputs initialization
Update_Existing_DataStruct Update_Existing_Data_tmp = new Update_Existing_DataStruct();
// ###############################

        
        



        









 



/**
 * [tMap_3 begin ] stop
 */



	
	/**
	 * [tMap_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_2", false);
		start_Hash.put("tMap_2", System.currentTimeMillis());
		
	
	currentComponent="tMap_2";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row4");
					}
				
		int tos_count_tMap_2 = 0;
		




// ###############################
// # Lookup's keys initialization
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row3Struct> tHash_Lookup_row3 = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row3Struct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row3Struct>) 
					globalMap.get( "tHash_Lookup_row3" ))
					;					
					
	

row3Struct row3HashKey = new row3Struct();
row3Struct row3Default = new row3Struct();
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_2__Struct  {
}
Var__tMap_2__Struct Var__tMap_2 = new Var__tMap_2__Struct();
// ###############################

// ###############################
// # Outputs initialization
Insert_New_DataStruct Insert_New_Data_tmp = new Insert_New_DataStruct();
Update_DataStruct Update_Data_tmp = new Update_DataStruct();
// ###############################

        
        



        









 



/**
 * [tMap_2 begin ] stop
 */



	
	/**
	 * [tSortRow_1_SortIn begin ] start
	 */

	

	
		
		ok_Hash.put("tSortRow_1_SortIn", false);
		start_Hash.put("tSortRow_1_SortIn", System.currentTimeMillis());
		
	
		currentVirtualComponent = "tSortRow_1";
	
	currentComponent="tSortRow_1_SortIn";

	
		int tos_count_tSortRow_1_SortIn = 0;
		


out1Struct[] array_tSortRow_1_SortIn = (out1Struct[]) globalMap.remove("tSortRow_1");

int nb_line_tSortRow_1_SortIn = 0;

out1Struct current_tSortRow_1_SortIn = null;

for(int i_tSortRow_1_SortIn = 0; i_tSortRow_1_SortIn < array_tSortRow_1_SortIn.length; i_tSortRow_1_SortIn++){
	current_tSortRow_1_SortIn = array_tSortRow_1_SortIn[i_tSortRow_1_SortIn];
	row4.id_produit = current_tSortRow_1_SortIn.id_produit;
	row4.id_pilier = current_tSortRow_1_SortIn.id_pilier;
	row4.nomProduit = current_tSortRow_1_SortIn.nomProduit;
	row4.nomPilier = current_tSortRow_1_SortIn.nomPilier;
	row4.prix = current_tSortRow_1_SortIn.prix;
	row4.volume_unitaire = current_tSortRow_1_SortIn.volume_unitaire;
	row4.tva = current_tSortRow_1_SortIn.tva;
	// increase number of line sorted
	nb_line_tSortRow_1_SortIn++;

 



/**
 * [tSortRow_1_SortIn begin ] stop
 */
	
	/**
	 * [tSortRow_1_SortIn main ] start
	 */

	

	
	
		currentVirtualComponent = "tSortRow_1";
	
	currentComponent="tSortRow_1_SortIn";

	

 


	tos_count_tSortRow_1_SortIn++;

/**
 * [tSortRow_1_SortIn main ] stop
 */
	
	/**
	 * [tSortRow_1_SortIn process_data_begin ] start
	 */

	

	
	
		currentVirtualComponent = "tSortRow_1";
	
	currentComponent="tSortRow_1_SortIn";

	

 



/**
 * [tSortRow_1_SortIn process_data_begin ] stop
 */

	
	/**
	 * [tMap_2 main ] start
	 */

	

	
	
	currentComponent="tMap_2";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row4"
						
						);
					}
					

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_2 = false;
		

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_2 = false;
		  boolean mainRowRejected_tMap_2 = false;
            				    								  
		

				///////////////////////////////////////////////
				// Starting Lookup Table "row3" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLooprow3 = false;
       		  	    	
       		  	    	
 							row3Struct row3ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_2) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_2 = false;
								
	                        		    	Object exprKeyValue_row3__id_produit = row4.id_produit ;
	                        		    	if(exprKeyValue_row3__id_produit == null) {
	                        		    		hasCasePrimitiveKeyWithNull_tMap_2 = true;
	                        		    	} else {
                        		    			row3HashKey.id_produit = (long)(Long) exprKeyValue_row3__id_produit;
                        		    		}
                        		    		

								
		                        	row3HashKey.hashCodeDirty = true;
                        		
	  					
	  							
	
		  							if(!hasCasePrimitiveKeyWithNull_tMap_2) { // G_TM_M_091
		  							
			  					
			  					
			  					
	  					
		  							tHash_Lookup_row3.lookup( row3HashKey );

	  							

	  							

			  						} // G_TM_M_091
			  						
			  					

 								
								  
								  if(hasCasePrimitiveKeyWithNull_tMap_2 || !tHash_Lookup_row3.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_2 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row3 != null && tHash_Lookup_row3.getCount(row3HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row3' and it contains more one result from keys :  row3.id_produit = '" + row3HashKey.id_produit + "'");
								} // G 071
							

							row3Struct row3 = null;
                    		  	 
							   
                    		  	 
	       		  	    	row3Struct fromLookup_row3 = null;
							row3 = row3Default;
										 
							
								 
							
							
								if (tHash_Lookup_row3 !=null && tHash_Lookup_row3.hasNext()) { // G 099
								
							
								
								fromLookup_row3 = tHash_Lookup_row3.next();

							
							
								} // G 099
							
							

							if(fromLookup_row3 != null) {
								row3 = fromLookup_row3;
							}
							
							
							
			  							
								
	                    		  	
		                    
	            	
	            	
	            // ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_2__Struct Var = Var__tMap_2;// ###############################
        // ###############################
        // # Output tables

Update_Data = null;
Insert_New_Data = null;

if(!rejectedInnerJoin_tMap_2 ) {

// # Output table : 'Update_Data'
Update_Data_tmp.id_produit = row4.id_produit ;
Update_Data_tmp.id_pilier = row4.id_pilier ;
Update_Data_tmp.nomProduit = row4.nomProduit ;
Update_Data_tmp.nomPilier = row4.nomPilier ;
Update_Data_tmp.prix = row4.prix ;
Update_Data_tmp.volume_unitaire = row4.volume_unitaire ;
Update_Data_tmp.tva = row4.tva ;
Update_Data = Update_Data_tmp;
} // closing inner join bracket (1)
// ###### START REJECTS ##### 

// # Output reject table : 'Insert_New_Data'
// # Filter conditions 
if( rejectedInnerJoin_tMap_2 ) {
Insert_New_Data_tmp.id_produit = row4.id_produit ;
Insert_New_Data_tmp.id_pilier = row4.id_pilier ;
Insert_New_Data_tmp.produits = row4.nomProduit ;
Insert_New_Data_tmp.pilier = row4.nomPilier ;
Insert_New_Data_tmp.prix = row4.prix ;
Insert_New_Data_tmp.tva = row4.tva ;
Insert_New_Data_tmp.volume_unitaire = row4.volume_unitaire ;
Insert_New_Data = Insert_New_Data_tmp;
} // closing filter/reject
// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_2 = false;










 


	tos_count_tMap_2++;

/**
 * [tMap_2 main ] stop
 */
	
	/**
	 * [tMap_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMap_2";

	

 



/**
 * [tMap_2 process_data_begin ] stop
 */
// Start of branch "Insert_New_Data"
if(Insert_New_Data != null) { 



	
	/**
	 * [tSortRow_2_SortOut main ] start
	 */

	

	
	
		currentVirtualComponent = "tSortRow_2";
	
	currentComponent="tSortRow_2_SortOut";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"Insert_New_Data"
						
						);
					}
					



	ComparableInsert_New_DataStruct arrayRowtSortRow_2_SortOut = new ComparableInsert_New_DataStruct();

	arrayRowtSortRow_2_SortOut.id_produit = Insert_New_Data.id_produit;
	arrayRowtSortRow_2_SortOut.id_pilier = Insert_New_Data.id_pilier;
	arrayRowtSortRow_2_SortOut.produits = Insert_New_Data.produits;
	arrayRowtSortRow_2_SortOut.pilier = Insert_New_Data.pilier;
	arrayRowtSortRow_2_SortOut.prix = Insert_New_Data.prix;
	arrayRowtSortRow_2_SortOut.tva = Insert_New_Data.tva;
	arrayRowtSortRow_2_SortOut.volume_unitaire = Insert_New_Data.volume_unitaire;	
	list_tSortRow_2_SortOut.add(arrayRowtSortRow_2_SortOut);

 


	tos_count_tSortRow_2_SortOut++;

/**
 * [tSortRow_2_SortOut main ] stop
 */
	
	/**
	 * [tSortRow_2_SortOut process_data_begin ] start
	 */

	

	
	
		currentVirtualComponent = "tSortRow_2";
	
	currentComponent="tSortRow_2_SortOut";

	

 



/**
 * [tSortRow_2_SortOut process_data_begin ] stop
 */
	
	/**
	 * [tSortRow_2_SortOut process_data_end ] start
	 */

	

	
	
		currentVirtualComponent = "tSortRow_2";
	
	currentComponent="tSortRow_2_SortOut";

	

 



/**
 * [tSortRow_2_SortOut process_data_end ] stop
 */

} // End of branch "Insert_New_Data"




// Start of branch "Update_Data"
if(Update_Data != null) { 



	
	/**
	 * [tMap_3 main ] start
	 */

	

	
	
	currentComponent="tMap_3";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"Update_Data"
						
						);
					}
					

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_3 = false;
		

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_3 = false;
		  boolean mainRowRejected_tMap_3 = false;
            				    								  
		

				///////////////////////////////////////////////
				// Starting Lookup Table "row5" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLooprow5 = false;
       		  	    	
       		  	    	
 							row5Struct row5ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_3) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_3 = false;
								
	                        		    	Object exprKeyValue_row5__id_produit = Update_Data.id_produit ;
	                        		    	if(exprKeyValue_row5__id_produit == null) {
	                        		    		hasCasePrimitiveKeyWithNull_tMap_3 = true;
	                        		    	} else {
                        		    			row5HashKey.id_produit = (long)(Long) exprKeyValue_row5__id_produit;
                        		    		}
                        		    		

								
		                        	row5HashKey.hashCodeDirty = true;
                        		
	  					
	  							
	
		  							if(!hasCasePrimitiveKeyWithNull_tMap_3) { // G_TM_M_091
		  							
			  					
			  					
			  					
	  					
		  							tHash_Lookup_row5.lookup( row5HashKey );

	  							

	  							

			  						} // G_TM_M_091
			  						
			  					

 								
								  
								  if(hasCasePrimitiveKeyWithNull_tMap_3 || !tHash_Lookup_row5.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_3 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row5 != null && tHash_Lookup_row5.getCount(row5HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row5' and it contains more one result from keys :  row5.id_produit = '" + row5HashKey.id_produit + "'");
								} // G 071
							

							row5Struct row5 = null;
                    		  	 
							   
                    		  	 
	       		  	    	row5Struct fromLookup_row5 = null;
							row5 = row5Default;
										 
							
								 
							
							
								if (tHash_Lookup_row5 !=null && tHash_Lookup_row5.hasNext()) { // G 099
								
							
								
								fromLookup_row5 = tHash_Lookup_row5.next();

							
							
								} // G 099
							
							

							if(fromLookup_row5 != null) {
								row5 = fromLookup_row5;
							}
							
							
							
			  							
								
	                    		  	
		                    
	            	
	            	
	            // ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_3__Struct Var = Var__tMap_3;// ###############################
        // ###############################
        // # Output tables

Update_Existing_Data = null;

if(!rejectedInnerJoin_tMap_3 ) {
} // closing inner join bracket (1)
// ###### START REJECTS ##### 

// # Output reject table : 'Update_Existing_Data'
// # Filter conditions 
if( rejectedInnerJoin_tMap_3 ) {
Update_Existing_Data_tmp.id_produit = Update_Data.id_produit ;
Update_Existing_Data_tmp.id_pilier = Update_Data.id_pilier ;
Update_Existing_Data_tmp.produits = Update_Data.nomProduit ;
Update_Existing_Data_tmp.pilier = Update_Data.nomPilier ;
Update_Existing_Data_tmp.prix = Update_Data.prix ;
Update_Existing_Data_tmp.tva = Update_Data.tva ;
Update_Existing_Data_tmp.volume_unitaire = Update_Data.volume_unitaire ;
Update_Existing_Data = Update_Existing_Data_tmp;
} // closing filter/reject
// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_3 = false;










 


	tos_count_tMap_3++;

/**
 * [tMap_3 main ] stop
 */
	
	/**
	 * [tMap_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMap_3";

	

 



/**
 * [tMap_3 process_data_begin ] stop
 */
// Start of branch "Update_Existing_Data"
if(Update_Existing_Data != null) { 



	
	/**
	 * [tDBOutput_3 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_3";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"Update_Existing_Data"
						
						);
					}
					



        whetherReject_tDBOutput_3 = false;
                    if(Update_Existing_Data.id_pilier == null) {
pstmt_tDBOutput_3.setNull(1, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_3.setLong(1, Update_Existing_Data.id_pilier);
}

                    if(Update_Existing_Data.produits == null) {
pstmt_tDBOutput_3.setNull(2, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_3.setString(2, Update_Existing_Data.produits);
}

                    if(Update_Existing_Data.pilier == null) {
pstmt_tDBOutput_3.setNull(3, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_3.setString(3, Update_Existing_Data.pilier);
}

                    if(Update_Existing_Data.prix == null) {
pstmt_tDBOutput_3.setNull(4, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_3.setInt(4, Update_Existing_Data.prix);
}

                    if(Update_Existing_Data.tva == null) {
pstmt_tDBOutput_3.setNull(5, java.sql.Types.DOUBLE);
} else {pstmt_tDBOutput_3.setDouble(5, Update_Existing_Data.tva);
}

                    if(Update_Existing_Data.volume_unitaire == null) {
pstmt_tDBOutput_3.setNull(6, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_3.setInt(6, Update_Existing_Data.volume_unitaire);
}

                    pstmt_tDBOutput_3.setLong(7 + count_tDBOutput_3, Update_Existing_Data.id_produit);


    		pstmt_tDBOutput_3.addBatch();
    		nb_line_tDBOutput_3++;
    		  
    		  
    		  batchSizeCounter_tDBOutput_3++;
    		  
    			if ((batchSize_tDBOutput_3 > 0) && (batchSize_tDBOutput_3 <= batchSizeCounter_tDBOutput_3)) {
                try {
						int countSum_tDBOutput_3 = 0;
						    
						for(int countEach_tDBOutput_3: pstmt_tDBOutput_3.executeBatch()) {
							countSum_tDBOutput_3 += (countEach_tDBOutput_3 < 0 ? 0 : countEach_tDBOutput_3);
						}
				    	rowsToCommitCount_tDBOutput_3 += countSum_tDBOutput_3;
				    	
				    		updatedCount_tDBOutput_3 += countSum_tDBOutput_3;
				    	
            	    	batchSizeCounter_tDBOutput_3 = 0;
                }catch (java.sql.BatchUpdateException e_tDBOutput_3){
globalMap.put("tDBOutput_3_ERROR_MESSAGE",e_tDBOutput_3.getMessage());
				    	java.sql.SQLException ne_tDBOutput_3 = e_tDBOutput_3.getNextException(),sqle_tDBOutput_3=null;
				    	String errormessage_tDBOutput_3;
						if (ne_tDBOutput_3 != null) {
							// build new exception to provide the original cause
							sqle_tDBOutput_3 = new java.sql.SQLException(e_tDBOutput_3.getMessage() + "\ncaused by: " + ne_tDBOutput_3.getMessage(), ne_tDBOutput_3.getSQLState(), ne_tDBOutput_3.getErrorCode(), ne_tDBOutput_3);
							errormessage_tDBOutput_3 = sqle_tDBOutput_3.getMessage();
						}else{
							errormessage_tDBOutput_3 = e_tDBOutput_3.getMessage();
						}
				    	
				    		if (ne_tDBOutput_3 != null) {
				    			throw(sqle_tDBOutput_3);
				    		}else{
				            	throw(e_tDBOutput_3);
				            }
				    	
					}
    			}
    		
    		    commitCounter_tDBOutput_3++;
                if(commitEvery_tDBOutput_3 <= commitCounter_tDBOutput_3) {
                if ((batchSize_tDBOutput_3 > 0) && (batchSizeCounter_tDBOutput_3 > 0)) {
                try {
                		int countSum_tDBOutput_3 = 0;
                		    
						for(int countEach_tDBOutput_3: pstmt_tDBOutput_3.executeBatch()) {
							countSum_tDBOutput_3 += (countEach_tDBOutput_3 < 0 ? 0 : countEach_tDBOutput_3);
						}
            	    	rowsToCommitCount_tDBOutput_3 += countSum_tDBOutput_3;
            	    	
            	    		updatedCount_tDBOutput_3 += countSum_tDBOutput_3;
            	    	
                batchSizeCounter_tDBOutput_3 = 0;
               }catch (java.sql.BatchUpdateException e_tDBOutput_3){
globalMap.put("tDBOutput_3_ERROR_MESSAGE",e_tDBOutput_3.getMessage());
			    	java.sql.SQLException ne_tDBOutput_3 = e_tDBOutput_3.getNextException(),sqle_tDBOutput_3=null;
			    	String errormessage_tDBOutput_3;
					if (ne_tDBOutput_3 != null) {
						// build new exception to provide the original cause
						sqle_tDBOutput_3 = new java.sql.SQLException(e_tDBOutput_3.getMessage() + "\ncaused by: " + ne_tDBOutput_3.getMessage(), ne_tDBOutput_3.getSQLState(), ne_tDBOutput_3.getErrorCode(), ne_tDBOutput_3);
						errormessage_tDBOutput_3 = sqle_tDBOutput_3.getMessage();
					}else{
						errormessage_tDBOutput_3 = e_tDBOutput_3.getMessage();
					}
			    	
			    		if (ne_tDBOutput_3 != null) {
			    			throw(sqle_tDBOutput_3);
			    		}else{
			            	throw(e_tDBOutput_3);
			            }
			    	
				}
            }
                    if(rowsToCommitCount_tDBOutput_3 != 0){
                    	
                    }
                    conn_tDBOutput_3.commit();
                    if(rowsToCommitCount_tDBOutput_3 != 0){
                    	
                    	rowsToCommitCount_tDBOutput_3 = 0;
                    }
                    commitCounter_tDBOutput_3=0;
                }

 


	tos_count_tDBOutput_3++;

/**
 * [tDBOutput_3 main ] stop
 */
	
	/**
	 * [tDBOutput_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBOutput_3";

	

 



/**
 * [tDBOutput_3 process_data_begin ] stop
 */
	
	/**
	 * [tDBOutput_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBOutput_3";

	

 



/**
 * [tDBOutput_3 process_data_end ] stop
 */

} // End of branch "Update_Existing_Data"




	
	/**
	 * [tMap_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_3";

	

 



/**
 * [tMap_3 process_data_end ] stop
 */

} // End of branch "Update_Data"




	
	/**
	 * [tMap_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_2";

	

 



/**
 * [tMap_2 process_data_end ] stop
 */



	
	/**
	 * [tSortRow_1_SortIn process_data_end ] start
	 */

	

	
	
		currentVirtualComponent = "tSortRow_1";
	
	currentComponent="tSortRow_1_SortIn";

	

 



/**
 * [tSortRow_1_SortIn process_data_end ] stop
 */
	
	/**
	 * [tSortRow_1_SortIn end ] start
	 */

	

	
	
		currentVirtualComponent = "tSortRow_1";
	
	currentComponent="tSortRow_1_SortIn";

	


}

globalMap.put("tSortRow_1_SortIn_NB_LINE",nb_line_tSortRow_1_SortIn);

 

ok_Hash.put("tSortRow_1_SortIn", true);
end_Hash.put("tSortRow_1_SortIn", System.currentTimeMillis());




/**
 * [tSortRow_1_SortIn end ] stop
 */

	
	/**
	 * [tMap_2 end ] start
	 */

	

	
	
	currentComponent="tMap_2";

	


// ###############################
// # Lookup hashes releasing
					if(tHash_Lookup_row3 != null) {
						tHash_Lookup_row3.endGet();
					}
					globalMap.remove( "tHash_Lookup_row3" );

					
					
				
// ###############################      





				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row4");
			  	}
			  	
 

ok_Hash.put("tMap_2", true);
end_Hash.put("tMap_2", System.currentTimeMillis());




/**
 * [tMap_2 end ] stop
 */

	
	/**
	 * [tSortRow_2_SortOut end ] start
	 */

	

	
	
		currentVirtualComponent = "tSortRow_2";
	
	currentComponent="tSortRow_2_SortOut";

	

Insert_New_DataStruct[] array_tSortRow_2_SortOut = list_tSortRow_2_SortOut.toArray(new ComparableInsert_New_DataStruct[0]);

java.util.Arrays.sort(array_tSortRow_2_SortOut);

globalMap.put("tSortRow_2",array_tSortRow_2_SortOut);


				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"Insert_New_Data");
			  	}
			  	
 

ok_Hash.put("tSortRow_2_SortOut", true);
end_Hash.put("tSortRow_2_SortOut", System.currentTimeMillis());




/**
 * [tSortRow_2_SortOut end ] stop
 */


	
	/**
	 * [tDBOutput_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_1", false);
		start_Hash.put("tDBOutput_1", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_1";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row6");
					}
				
		int tos_count_tDBOutput_1 = 0;
		





String dbschema_tDBOutput_1 = null;
	dbschema_tDBOutput_1 = "public";
	

String tableName_tDBOutput_1 = null;
if(dbschema_tDBOutput_1 == null || dbschema_tDBOutput_1.trim().length() == 0) {
	tableName_tDBOutput_1 = ("Dim_Produits");
} else {
	tableName_tDBOutput_1 = dbschema_tDBOutput_1 + "\".\"" + ("Dim_Produits");
}

        int updateKeyCount_tDBOutput_1 = 1;
        if(updateKeyCount_tDBOutput_1 < 1) {
            throw new RuntimeException("For update, Schema must have a key");
        } else if (updateKeyCount_tDBOutput_1 == 7 && true) {
                    System.err.println("For update, every Schema column can not be a key");
        }

int nb_line_tDBOutput_1 = 0;
int nb_line_update_tDBOutput_1 = 0;
int nb_line_inserted_tDBOutput_1 = 0;
int nb_line_deleted_tDBOutput_1 = 0;
int nb_line_rejected_tDBOutput_1 = 0;

int deletedCount_tDBOutput_1=0;
int updatedCount_tDBOutput_1=0;
int insertedCount_tDBOutput_1=0;
int rowsToCommitCount_tDBOutput_1=0;
int rejectedCount_tDBOutput_1=0;

boolean whetherReject_tDBOutput_1 = false;

java.sql.Connection conn_tDBOutput_1 = null;
String dbUser_tDBOutput_1 = null;

	
    java.lang.Class.forName("org.postgresql.Driver");
    
        String url_tDBOutput_1 = "jdbc:postgresql://"+"163.172.166.119"+":"+"5432"+"/"+"leuk_analytics";
    dbUser_tDBOutput_1 = "malick.diouf";
 
	final String decryptedPassword_tDBOutput_1 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:ZIbpDfeJzn6p7/jrBgv5nvS8fE3eTHp8eeF4tB9AWg9UouAL7vc=");

    String dbPwd_tDBOutput_1 = decryptedPassword_tDBOutput_1;

    conn_tDBOutput_1 = java.sql.DriverManager.getConnection(url_tDBOutput_1,dbUser_tDBOutput_1,dbPwd_tDBOutput_1);
	
	resourceMap.put("conn_tDBOutput_1", conn_tDBOutput_1);
        conn_tDBOutput_1.setAutoCommit(false);
        int commitEvery_tDBOutput_1 = 1000;
        int commitCounter_tDBOutput_1 = 0;



int count_tDBOutput_1=0;
	    java.sql.PreparedStatement pstmt_tDBOutput_1 = conn_tDBOutput_1.prepareStatement("SELECT COUNT(1) FROM \"" + tableName_tDBOutput_1 + "\" WHERE \"id_produit\" = ?");
	    resourceMap.put("pstmt_tDBOutput_1", pstmt_tDBOutput_1);
	    String insert_tDBOutput_1 = "INSERT INTO \"" + tableName_tDBOutput_1 + "\" (\"id_produit\",\"id_pilier\",\"produits\",\"pilier\",\"prix\",\"tva\",\"volume_unitaire\") VALUES (?,?,?,?,?,?,?)";
	    java.sql.PreparedStatement pstmtInsert_tDBOutput_1 = conn_tDBOutput_1.prepareStatement(insert_tDBOutput_1);
	    resourceMap.put("pstmtInsert_tDBOutput_1", pstmtInsert_tDBOutput_1);
	    String update_tDBOutput_1 = "UPDATE \"" + tableName_tDBOutput_1 + "\" SET \"id_pilier\" = ?,\"produits\" = ?,\"pilier\" = ?,\"prix\" = ?,\"tva\" = ?,\"volume_unitaire\" = ? WHERE \"id_produit\" = ?";
	    java.sql.PreparedStatement pstmtUpdate_tDBOutput_1 = conn_tDBOutput_1.prepareStatement(update_tDBOutput_1);
	    resourceMap.put("pstmtUpdate_tDBOutput_1", pstmtUpdate_tDBOutput_1);
	    
        StringBuffer query_tDBOutput_1 = null;
       	
			update_tDBOutput_1 += " ";
			String[] updateSQLSplits_tDBOutput_1 = update_tDBOutput_1.split("\\?");
			String[] insertSQLSplits_tDBOutput_1 = insert_tDBOutput_1.split("\\?");

 



/**
 * [tDBOutput_1 begin ] stop
 */



	
	/**
	 * [tSortRow_2_SortIn begin ] start
	 */

	

	
		
		ok_Hash.put("tSortRow_2_SortIn", false);
		start_Hash.put("tSortRow_2_SortIn", System.currentTimeMillis());
		
	
		currentVirtualComponent = "tSortRow_2";
	
	currentComponent="tSortRow_2_SortIn";

	
		int tos_count_tSortRow_2_SortIn = 0;
		


Insert_New_DataStruct[] array_tSortRow_2_SortIn = (Insert_New_DataStruct[]) globalMap.remove("tSortRow_2");

int nb_line_tSortRow_2_SortIn = 0;

Insert_New_DataStruct current_tSortRow_2_SortIn = null;

for(int i_tSortRow_2_SortIn = 0; i_tSortRow_2_SortIn < array_tSortRow_2_SortIn.length; i_tSortRow_2_SortIn++){
	current_tSortRow_2_SortIn = array_tSortRow_2_SortIn[i_tSortRow_2_SortIn];
	row6.id_produit = current_tSortRow_2_SortIn.id_produit;
	row6.id_pilier = current_tSortRow_2_SortIn.id_pilier;
	row6.produits = current_tSortRow_2_SortIn.produits;
	row6.pilier = current_tSortRow_2_SortIn.pilier;
	row6.prix = current_tSortRow_2_SortIn.prix;
	row6.tva = current_tSortRow_2_SortIn.tva;
	row6.volume_unitaire = current_tSortRow_2_SortIn.volume_unitaire;
	// increase number of line sorted
	nb_line_tSortRow_2_SortIn++;

 



/**
 * [tSortRow_2_SortIn begin ] stop
 */
	
	/**
	 * [tSortRow_2_SortIn main ] start
	 */

	

	
	
		currentVirtualComponent = "tSortRow_2";
	
	currentComponent="tSortRow_2_SortIn";

	

 


	tos_count_tSortRow_2_SortIn++;

/**
 * [tSortRow_2_SortIn main ] stop
 */
	
	/**
	 * [tSortRow_2_SortIn process_data_begin ] start
	 */

	

	
	
		currentVirtualComponent = "tSortRow_2";
	
	currentComponent="tSortRow_2_SortIn";

	

 



/**
 * [tSortRow_2_SortIn process_data_begin ] stop
 */

	
	/**
	 * [tDBOutput_1 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row6"
						
						);
					}
					



		query_tDBOutput_1 = new StringBuffer("");
        whetherReject_tDBOutput_1 = false;
                    pstmt_tDBOutput_1.setLong(1, row6.id_produit);

            int checkCount_tDBOutput_1 = -1;
            try (java.sql.ResultSet rs_tDBOutput_1 = pstmt_tDBOutput_1.executeQuery()) {
                while(rs_tDBOutput_1.next()) {
                    checkCount_tDBOutput_1 = rs_tDBOutput_1.getInt(1);
                }
            }
            if(checkCount_tDBOutput_1 > 0) {
                        if(row6.id_pilier == null) {
pstmtUpdate_tDBOutput_1.setNull(1, java.sql.Types.INTEGER);
} else {pstmtUpdate_tDBOutput_1.setLong(1, row6.id_pilier);
}

                            query_tDBOutput_1 = query_tDBOutput_1.append(updateSQLSplits_tDBOutput_1[0]).append(row6.id_pilier== null ?  "null" :String.valueOf(row6.id_pilier)).append(updateSQLSplits_tDBOutput_1[1]);
                        if(row6.produits == null) {
pstmtUpdate_tDBOutput_1.setNull(2, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(2, row6.produits);
}

                            query_tDBOutput_1 = query_tDBOutput_1.append(row6.produits== null ?  "null" :"'" + row6.produits + "'").append(updateSQLSplits_tDBOutput_1[2]);
                        if(row6.pilier == null) {
pstmtUpdate_tDBOutput_1.setNull(3, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(3, row6.pilier);
}

                            query_tDBOutput_1 = query_tDBOutput_1.append(row6.pilier== null ?  "null" :"'" + row6.pilier + "'").append(updateSQLSplits_tDBOutput_1[3]);
                        if(row6.prix == null) {
pstmtUpdate_tDBOutput_1.setNull(4, java.sql.Types.INTEGER);
} else {pstmtUpdate_tDBOutput_1.setInt(4, row6.prix);
}

                            query_tDBOutput_1 = query_tDBOutput_1.append(row6.prix== null ?  "null" :String.valueOf(row6.prix)).append(updateSQLSplits_tDBOutput_1[4]);
                        if(row6.tva == null) {
pstmtUpdate_tDBOutput_1.setNull(5, java.sql.Types.DOUBLE);
} else {pstmtUpdate_tDBOutput_1.setDouble(5, row6.tva);
}

                            query_tDBOutput_1 = query_tDBOutput_1.append(row6.tva== null ?  "null" :String.valueOf(row6.tva)).append(updateSQLSplits_tDBOutput_1[5]);
                        if(row6.volume_unitaire == null) {
pstmtUpdate_tDBOutput_1.setNull(6, java.sql.Types.INTEGER);
} else {pstmtUpdate_tDBOutput_1.setInt(6, row6.volume_unitaire);
}

                            query_tDBOutput_1 = query_tDBOutput_1.append(row6.volume_unitaire== null ?  "null" :String.valueOf(row6.volume_unitaire)).append(updateSQLSplits_tDBOutput_1[6]);
                        pstmtUpdate_tDBOutput_1.setLong(7 + count_tDBOutput_1, row6.id_produit);

							query_tDBOutput_1 = query_tDBOutput_1.append(String.valueOf(row6.id_produit)).append(updateSQLSplits_tDBOutput_1[7]);
				    	
                    globalMap.put("tDBOutput_1_QUERY", query_tDBOutput_1.toString().trim());
                try {
					
                    int processedCount_tDBOutput_1 = pstmtUpdate_tDBOutput_1.executeUpdate();
                    updatedCount_tDBOutput_1 += processedCount_tDBOutput_1;
                    rowsToCommitCount_tDBOutput_1 += processedCount_tDBOutput_1;
                    nb_line_tDBOutput_1++;
					
                } catch(java.lang.Exception e) {
globalMap.put("tDBOutput_1_ERROR_MESSAGE",e.getMessage());
					
                    whetherReject_tDBOutput_1 = true;
                        throw(e);
                }
            } else {
                        pstmtInsert_tDBOutput_1.setLong(1, row6.id_produit);

                            query_tDBOutput_1 = query_tDBOutput_1.append(insertSQLSplits_tDBOutput_1[0]).append(String.valueOf(row6.id_produit)).append(insertSQLSplits_tDBOutput_1[1]);
                        if(row6.id_pilier == null) {
pstmtInsert_tDBOutput_1.setNull(2, java.sql.Types.INTEGER);
} else {pstmtInsert_tDBOutput_1.setLong(2, row6.id_pilier);
}

                            query_tDBOutput_1 = query_tDBOutput_1.append(row6.id_pilier== null ?  "null" :String.valueOf(row6.id_pilier)).append(insertSQLSplits_tDBOutput_1[2]);
                        if(row6.produits == null) {
pstmtInsert_tDBOutput_1.setNull(3, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(3, row6.produits);
}

                            query_tDBOutput_1 = query_tDBOutput_1.append(row6.produits== null ?  "null" :"'" + row6.produits + "'").append(insertSQLSplits_tDBOutput_1[3]);
                        if(row6.pilier == null) {
pstmtInsert_tDBOutput_1.setNull(4, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(4, row6.pilier);
}

                            query_tDBOutput_1 = query_tDBOutput_1.append(row6.pilier== null ?  "null" :"'" + row6.pilier + "'").append(insertSQLSplits_tDBOutput_1[4]);
                        if(row6.prix == null) {
pstmtInsert_tDBOutput_1.setNull(5, java.sql.Types.INTEGER);
} else {pstmtInsert_tDBOutput_1.setInt(5, row6.prix);
}

                            query_tDBOutput_1 = query_tDBOutput_1.append(row6.prix== null ?  "null" :String.valueOf(row6.prix)).append(insertSQLSplits_tDBOutput_1[5]);
                        if(row6.tva == null) {
pstmtInsert_tDBOutput_1.setNull(6, java.sql.Types.DOUBLE);
} else {pstmtInsert_tDBOutput_1.setDouble(6, row6.tva);
}

                            query_tDBOutput_1 = query_tDBOutput_1.append(row6.tva== null ?  "null" :String.valueOf(row6.tva)).append(insertSQLSplits_tDBOutput_1[6]);
                        if(row6.volume_unitaire == null) {
pstmtInsert_tDBOutput_1.setNull(7, java.sql.Types.INTEGER);
} else {pstmtInsert_tDBOutput_1.setInt(7, row6.volume_unitaire);
}

                            query_tDBOutput_1 = query_tDBOutput_1.append(row6.volume_unitaire== null ?  "null" :String.valueOf(row6.volume_unitaire)).append(insertSQLSplits_tDBOutput_1[7]);
                    globalMap.put("tDBOutput_1_QUERY", query_tDBOutput_1.toString().trim());
                try {
					
                    int processedCount_tDBOutput_1 = pstmtInsert_tDBOutput_1.executeUpdate();
                    insertedCount_tDBOutput_1 += processedCount_tDBOutput_1;
                    rowsToCommitCount_tDBOutput_1 += processedCount_tDBOutput_1;
                    nb_line_tDBOutput_1++;
					
                } catch(java.lang.Exception e) {
globalMap.put("tDBOutput_1_ERROR_MESSAGE",e.getMessage());
					
                    whetherReject_tDBOutput_1 = true;
                        throw(e);
                }
            }
    		    commitCounter_tDBOutput_1++;
                if(commitEvery_tDBOutput_1 <= commitCounter_tDBOutput_1) {
                    if(rowsToCommitCount_tDBOutput_1 != 0){
                    	
                    }
                    conn_tDBOutput_1.commit();
                    if(rowsToCommitCount_tDBOutput_1 != 0){
                    	
                    	rowsToCommitCount_tDBOutput_1 = 0;
                    }
                    commitCounter_tDBOutput_1=0;
                }

 


	tos_count_tDBOutput_1++;

/**
 * [tDBOutput_1 main ] stop
 */
	
	/**
	 * [tDBOutput_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";

	

 



/**
 * [tDBOutput_1 process_data_begin ] stop
 */
	
	/**
	 * [tDBOutput_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";

	

 



/**
 * [tDBOutput_1 process_data_end ] stop
 */



	
	/**
	 * [tSortRow_2_SortIn process_data_end ] start
	 */

	

	
	
		currentVirtualComponent = "tSortRow_2";
	
	currentComponent="tSortRow_2_SortIn";

	

 



/**
 * [tSortRow_2_SortIn process_data_end ] stop
 */
	
	/**
	 * [tSortRow_2_SortIn end ] start
	 */

	

	
	
		currentVirtualComponent = "tSortRow_2";
	
	currentComponent="tSortRow_2_SortIn";

	


}

globalMap.put("tSortRow_2_SortIn_NB_LINE",nb_line_tSortRow_2_SortIn);

 

ok_Hash.put("tSortRow_2_SortIn", true);
end_Hash.put("tSortRow_2_SortIn", System.currentTimeMillis());




/**
 * [tSortRow_2_SortIn end ] stop
 */

	
	/**
	 * [tDBOutput_1 end ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";

	



        if(pstmtUpdate_tDBOutput_1 != null){
            pstmtUpdate_tDBOutput_1.close();
            resourceMap.remove("pstmtUpdate_tDBOutput_1");
        }
        if(pstmtInsert_tDBOutput_1 != null){
            pstmtInsert_tDBOutput_1.close();
            resourceMap.remove("pstmtInsert_tDBOutput_1");
        }
        if(pstmt_tDBOutput_1 != null) {
            pstmt_tDBOutput_1.close();
            resourceMap.remove("pstmt_tDBOutput_1");
        }
    resourceMap.put("statementClosed_tDBOutput_1", true);
			if(rowsToCommitCount_tDBOutput_1 != 0){
				
			}
			conn_tDBOutput_1.commit();
			if(rowsToCommitCount_tDBOutput_1 != 0){
				
				rowsToCommitCount_tDBOutput_1 = 0;
			}
			commitCounter_tDBOutput_1 = 0;
		
    	conn_tDBOutput_1 .close();
    	
    	resourceMap.put("finish_tDBOutput_1", true);
    	

	nb_line_deleted_tDBOutput_1=nb_line_deleted_tDBOutput_1+ deletedCount_tDBOutput_1;
	nb_line_update_tDBOutput_1=nb_line_update_tDBOutput_1 + updatedCount_tDBOutput_1;
	nb_line_inserted_tDBOutput_1=nb_line_inserted_tDBOutput_1 + insertedCount_tDBOutput_1;
	nb_line_rejected_tDBOutput_1=nb_line_rejected_tDBOutput_1 + rejectedCount_tDBOutput_1;
	
        globalMap.put("tDBOutput_1_NB_LINE",nb_line_tDBOutput_1);
        globalMap.put("tDBOutput_1_NB_LINE_UPDATED",nb_line_update_tDBOutput_1);
        globalMap.put("tDBOutput_1_NB_LINE_INSERTED",nb_line_inserted_tDBOutput_1);
        globalMap.put("tDBOutput_1_NB_LINE_DELETED",nb_line_deleted_tDBOutput_1);
        globalMap.put("tDBOutput_1_NB_LINE_REJECTED", nb_line_rejected_tDBOutput_1);
    

	


				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row6");
			  	}
			  	
 

ok_Hash.put("tDBOutput_1", true);
end_Hash.put("tDBOutput_1", System.currentTimeMillis());




/**
 * [tDBOutput_1 end ] stop
 */










	
	/**
	 * [tMap_3 end ] start
	 */

	

	
	
	currentComponent="tMap_3";

	


// ###############################
// # Lookup hashes releasing
					if(tHash_Lookup_row5 != null) {
						tHash_Lookup_row5.endGet();
					}
					globalMap.remove( "tHash_Lookup_row5" );

					
					
				
// ###############################      





				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"Update_Data");
			  	}
			  	
 

ok_Hash.put("tMap_3", true);
end_Hash.put("tMap_3", System.currentTimeMillis());




/**
 * [tMap_3 end ] stop
 */

	
	/**
	 * [tDBOutput_3 end ] start
	 */

	

	
	
	currentComponent="tDBOutput_3";

	



	    try {
				int countSum_tDBOutput_3 = 0;
				if (pstmt_tDBOutput_3 != null && batchSizeCounter_tDBOutput_3 > 0) {
						
					for(int countEach_tDBOutput_3: pstmt_tDBOutput_3.executeBatch()) {
						countSum_tDBOutput_3 += (countEach_tDBOutput_3 < 0 ? 0 : countEach_tDBOutput_3);
					}
					rowsToCommitCount_tDBOutput_3 += countSum_tDBOutput_3;
						
				}
		    	
		    		updatedCount_tDBOutput_3 += countSum_tDBOutput_3;
		    	
	    }catch (java.sql.BatchUpdateException e_tDBOutput_3){
globalMap.put("tDBOutput_3_ERROR_MESSAGE",e_tDBOutput_3.getMessage());
	    	java.sql.SQLException ne_tDBOutput_3 = e_tDBOutput_3.getNextException(),sqle_tDBOutput_3=null;
	    	String errormessage_tDBOutput_3;
			if (ne_tDBOutput_3 != null) {
				// build new exception to provide the original cause
				sqle_tDBOutput_3 = new java.sql.SQLException(e_tDBOutput_3.getMessage() + "\ncaused by: " + ne_tDBOutput_3.getMessage(), ne_tDBOutput_3.getSQLState(), ne_tDBOutput_3.getErrorCode(), ne_tDBOutput_3);
				errormessage_tDBOutput_3 = sqle_tDBOutput_3.getMessage();
			}else{
				errormessage_tDBOutput_3 = e_tDBOutput_3.getMessage();
			}
	    	
	    		if (ne_tDBOutput_3 != null) {
	    			throw(sqle_tDBOutput_3);
	    		}else{
	            	throw(e_tDBOutput_3);
	            }
	    	
		}
	    
        if(pstmt_tDBOutput_3 != null) {
        		
            pstmt_tDBOutput_3.close();
            resourceMap.remove("pstmt_tDBOutput_3");
        }
    resourceMap.put("statementClosed_tDBOutput_3", true);
			if(rowsToCommitCount_tDBOutput_3 != 0){
				
			}
			conn_tDBOutput_3.commit();
			if(rowsToCommitCount_tDBOutput_3 != 0){
				
				rowsToCommitCount_tDBOutput_3 = 0;
			}
			commitCounter_tDBOutput_3 = 0;
		
    	conn_tDBOutput_3 .close();
    	
    	resourceMap.put("finish_tDBOutput_3", true);
    	

	nb_line_deleted_tDBOutput_3=nb_line_deleted_tDBOutput_3+ deletedCount_tDBOutput_3;
	nb_line_update_tDBOutput_3=nb_line_update_tDBOutput_3 + updatedCount_tDBOutput_3;
	nb_line_inserted_tDBOutput_3=nb_line_inserted_tDBOutput_3 + insertedCount_tDBOutput_3;
	nb_line_rejected_tDBOutput_3=nb_line_rejected_tDBOutput_3 + rejectedCount_tDBOutput_3;
	
        globalMap.put("tDBOutput_3_NB_LINE",nb_line_tDBOutput_3);
        globalMap.put("tDBOutput_3_NB_LINE_UPDATED",nb_line_update_tDBOutput_3);
        globalMap.put("tDBOutput_3_NB_LINE_INSERTED",nb_line_inserted_tDBOutput_3);
        globalMap.put("tDBOutput_3_NB_LINE_DELETED",nb_line_deleted_tDBOutput_3);
        globalMap.put("tDBOutput_3_NB_LINE_REJECTED", nb_line_rejected_tDBOutput_3);
    

	


				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"Update_Existing_Data");
			  	}
			  	
 

ok_Hash.put("tDBOutput_3", true);
end_Hash.put("tDBOutput_3", System.currentTimeMillis());




/**
 * [tDBOutput_3 end ] stop
 */


















				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
					te.setVirtualComponentName(currentVirtualComponent);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
					     			//free memory for "tMap_3"
					     			globalMap.remove("tHash_Lookup_row5"); 
				     			
							//free memory for "tSortRow_2_SortIn"
							globalMap.remove("tSortRow_2");
						
					     			//free memory for "tMap_2"
					     			globalMap.remove("tHash_Lookup_row3"); 
				     			
							//free memory for "tSortRow_1_SortIn"
							globalMap.remove("tSortRow_1");
						
					     			//free memory for "tMap_1"
					     			globalMap.remove("tHash_Lookup_row2"); 
				     			
				try{
					
	
	/**
	 * [tDBInput_1 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_1";

	

 



/**
 * [tDBInput_1 finally ] stop
 */

	
	/**
	 * [tMap_1 finally ] start
	 */

	

	
	
	currentComponent="tMap_1";

	

 



/**
 * [tMap_1 finally ] stop
 */

	
	/**
	 * [tSortRow_1_SortOut finally ] start
	 */

	

	
	
		currentVirtualComponent = "tSortRow_1";
	
	currentComponent="tSortRow_1_SortOut";

	

 



/**
 * [tSortRow_1_SortOut finally ] stop
 */

	
	/**
	 * [tSortRow_1_SortIn finally ] start
	 */

	

	
	
		currentVirtualComponent = "tSortRow_1";
	
	currentComponent="tSortRow_1_SortIn";

	

 



/**
 * [tSortRow_1_SortIn finally ] stop
 */

	
	/**
	 * [tMap_2 finally ] start
	 */

	

	
	
	currentComponent="tMap_2";

	

 



/**
 * [tMap_2 finally ] stop
 */

	
	/**
	 * [tSortRow_2_SortOut finally ] start
	 */

	

	
	
		currentVirtualComponent = "tSortRow_2";
	
	currentComponent="tSortRow_2_SortOut";

	

 



/**
 * [tSortRow_2_SortOut finally ] stop
 */

	
	/**
	 * [tSortRow_2_SortIn finally ] start
	 */

	

	
	
		currentVirtualComponent = "tSortRow_2";
	
	currentComponent="tSortRow_2_SortIn";

	

 



/**
 * [tSortRow_2_SortIn finally ] stop
 */

	
	/**
	 * [tDBOutput_1 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";

	



    try {
    if (resourceMap.get("statementClosed_tDBOutput_1") == null) {
                java.sql.PreparedStatement pstmtUpdateToClose_tDBOutput_1 = null;
                if ((pstmtUpdateToClose_tDBOutput_1 = (java.sql.PreparedStatement) resourceMap.remove("pstmtUpdate_tDBOutput_1")) != null) {
                    pstmtUpdateToClose_tDBOutput_1.close();
                }
                java.sql.PreparedStatement pstmtInsertToClose_tDBOutput_1 = null;
                if ((pstmtInsertToClose_tDBOutput_1 = (java.sql.PreparedStatement) resourceMap.remove("pstmtInsert_tDBOutput_1")) != null) {
                    pstmtInsertToClose_tDBOutput_1.close();
                }
                java.sql.PreparedStatement pstmtToClose_tDBOutput_1 = null;
                if ((pstmtToClose_tDBOutput_1 = (java.sql.PreparedStatement) resourceMap.remove("pstmt_tDBOutput_1")) != null) {
                    pstmtToClose_tDBOutput_1.close();
                }
    }
    } finally {
        if(resourceMap.get("finish_tDBOutput_1") == null){
            java.sql.Connection ctn_tDBOutput_1 = null;
            if((ctn_tDBOutput_1 = (java.sql.Connection)resourceMap.get("conn_tDBOutput_1")) != null){
                try {
                    ctn_tDBOutput_1.close();
                } catch (java.sql.SQLException sqlEx_tDBOutput_1) {
                    String errorMessage_tDBOutput_1 = "failed to close the connection in tDBOutput_1 :" + sqlEx_tDBOutput_1.getMessage();
                    System.err.println(errorMessage_tDBOutput_1);
                }
            }
        }
    }
 



/**
 * [tDBOutput_1 finally ] stop
 */










	
	/**
	 * [tMap_3 finally ] start
	 */

	

	
	
	currentComponent="tMap_3";

	

 



/**
 * [tMap_3 finally ] stop
 */

	
	/**
	 * [tDBOutput_3 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_3";

	



    try {
    if (resourceMap.get("statementClosed_tDBOutput_3") == null) {
                java.sql.PreparedStatement pstmtToClose_tDBOutput_3 = null;
                if ((pstmtToClose_tDBOutput_3 = (java.sql.PreparedStatement) resourceMap.remove("pstmt_tDBOutput_3")) != null) {
                    pstmtToClose_tDBOutput_3.close();
                }
    }
    } finally {
        if(resourceMap.get("finish_tDBOutput_3") == null){
            java.sql.Connection ctn_tDBOutput_3 = null;
            if((ctn_tDBOutput_3 = (java.sql.Connection)resourceMap.get("conn_tDBOutput_3")) != null){
                try {
                    ctn_tDBOutput_3.close();
                } catch (java.sql.SQLException sqlEx_tDBOutput_3) {
                    String errorMessage_tDBOutput_3 = "failed to close the connection in tDBOutput_3 :" + sqlEx_tDBOutput_3.getMessage();
                    System.err.println(errorMessage_tDBOutput_3);
                }
            }
        }
    }
 



/**
 * [tDBOutput_3 finally ] stop
 */


















				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBInput_1_SUBPROCESS_STATE", 1);
	}
	


public static class row2Struct implements routines.system.IPersistableComparableLookupRow<row2Struct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Produits = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_Dim_Produits = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public long id;

				public long getId () {
					return this.id;
				}
				
			    public String libelle;

				public String getLibelle () {
					return this.libelle;
				}
				
			    public java.util.Date created_at;

				public java.util.Date getCreated_at () {
					return this.created_at;
				}
				
			    public java.util.Date updated_at;

				public java.util.Date getUpdated_at () {
					return this.updated_at;
				}
				
			    public Boolean activate;

				public Boolean getActivate () {
					return this.activate;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
							result = prime * result + (int) this.id;
						
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final row2Struct other = (row2Struct) obj;
		
						if (this.id != other.id)
							return false;
					

		return true;
    }

	public void copyDataTo(row2Struct other) {

		other.id = this.id;
	            other.libelle = this.libelle;
	            other.created_at = this.created_at;
	            other.updated_at = this.updated_at;
	            other.activate = this.activate;
	            
	}

	public void copyKeysDataTo(row2Struct other) {

		other.id = this.id;
	            	
	}



	
	private String readString(DataInputStream dis, ObjectInputStream ois) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			byte[] byteArray = new byte[length];
			dis.read(byteArray);
			strReturn = new String(byteArray, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(DataInputStream dis, org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			byte[] byteArray = new byte[length];
			unmarshaller.read(byteArray);
			strReturn = new String(byteArray, utf8Charset);
		}
		return strReturn;
	}
	
	private void writeString(String str, DataOutputStream dos, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
	}

	private void writeString(String str, DataOutputStream dos, ObjectOutputStream oos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
	}

	private java.util.Date readDate(DataInputStream dis, ObjectInputStream ois) throws IOException{
		java.util.Date dateReturn = null;
		int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(DataInputStream dis, org.jboss.marshalling.Unmarshaller unmarshaller ) throws IOException{
		java.util.Date dateReturn = null;
		int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

	private void writeDate(java.util.Date date1, DataOutputStream dos, ObjectOutputStream oos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
	}
	
	private void writeDate(java.util.Date date1, DataOutputStream dos, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
	}

    public void readKeysData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Produits) {

        	try {

        		int length = 0;
		
			        this.id = dis.readLong();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Produits) {

        	try {

        		int length = 0;
		
			        this.id = dis.readLong();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }



    /**
     * Fill Values data by reading ObjectInputStream.
     */
    public void readValuesData(DataInputStream dis, ObjectInputStream ois) {
        try {

			int length = 0;
		
						this.libelle = readString(dis,ois);
					
						this.created_at = readDate(dis,ois);
					
						this.updated_at = readDate(dis,ois);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.activate = null;
           				} else {
           			    	this.activate = dis.readBoolean();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
						this.libelle = readString(dis,objectIn);
					
						this.created_at = readDate(dis,objectIn);
					
						this.updated_at = readDate(dis,objectIn);
					
			            length = objectIn.readByte();
           				if (length == -1) {
           	    			this.activate = null;
           				} else {
           			    	this.activate = objectIn.readBoolean();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
						writeString(this.libelle, dos, oos);
					
						writeDate(this.created_at, dos, oos);
					
						writeDate(this.updated_at, dos, oos);
					
						if(this.activate == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.activate);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
						writeString(this.libelle, dos, objectOut);
					
						writeDate(this.created_at, dos, objectOut);
					
						writeDate(this.updated_at, dos, objectOut);
					
						if(this.activate == null) {
							objectOut.writeByte(-1);
						} else {
							objectOut.writeByte(0);
							objectOut.writeBoolean(this.activate);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}
    }


    
    public boolean supportMarshaller(){
        return true;
    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id="+String.valueOf(id));
		sb.append(",libelle="+libelle);
		sb.append(",created_at="+String.valueOf(created_at));
		sb.append(",updated_at="+String.valueOf(updated_at));
		sb.append(",activate="+String.valueOf(activate));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row2Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.id, other.id);
						if(returnValue != 0) {
							return returnValue;
						}

					
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void tDBInput_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_2_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		row2Struct row2 = new row2Struct();




	
	/**
	 * [tAdvancedHash_row2 begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_row2", false);
		start_Hash.put("tAdvancedHash_row2", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_row2";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row2");
					}
				
		int tos_count_tAdvancedHash_row2 = 0;
		

			   		// connection name:row2
			   		// source node:tDBInput_2 - inputs:(after_tDBInput_1) outputs:(row2,row2) | target node:tAdvancedHash_row2 - inputs:(row2) outputs:()
			   		// linked node: tMap_1 - inputs:(row1,row2) outputs:(out1)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row2 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row2Struct> tHash_Lookup_row2 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row2Struct>getLookup(matchingModeEnum_row2);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row2", tHash_Lookup_row2);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row2 begin ] stop
 */



	
	/**
	 * [tDBInput_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_2", false);
		start_Hash.put("tDBInput_2", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_2";

	
		int tos_count_tDBInput_2 = 0;
		
	
    
	
		    int nb_line_tDBInput_2 = 0;
		    java.sql.Connection conn_tDBInput_2 = null;
				String driverClass_tDBInput_2 = "org.postgresql.Driver";
			    java.lang.Class jdbcclazz_tDBInput_2 = java.lang.Class.forName(driverClass_tDBInput_2);
				String dbUser_tDBInput_2 = "malick.diouf";
				
				 
	final String decryptedPassword_tDBInput_2 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:r9qlUAYmJTjevPnpNB110/y9uBWgb/yn/bAHSjqQiqR3FdJIGuqygfUa");
				
				String dbPwd_tDBInput_2 = decryptedPassword_tDBInput_2;
				
				String url_tDBInput_2 = "jdbc:postgresql://" + "leuk.laiterieduberger.sn" + ":" + "5432" + "/" + "leuk_webapp_production";
				
				conn_tDBInput_2 = java.sql.DriverManager.getConnection(url_tDBInput_2,dbUser_tDBInput_2,dbPwd_tDBInput_2);
		        
				conn_tDBInput_2.setAutoCommit(false);
			
		    
			java.sql.Statement stmt_tDBInput_2 = conn_tDBInput_2.createStatement();

		    String dbquery_tDBInput_2 = "SELECT \n  \"public\".\"categories\".\"id\", \n  \"public\".\"categories\".\"libelle\", \n  \"public\".\"categories\".\"cr"
+"eated_at\", \n  \"public\".\"categories\".\"updated_at\", \n  \"public\".\"categories\".\"activate\"\nFROM \"public\".\"cat"
+"egories\"\nwhere \"public\".\"categories\".\"libelle\"  not in ('GOUDOR','NEGOCE','Accessoires')";
		    

            	globalMap.put("tDBInput_2_QUERY",dbquery_tDBInput_2);
		    java.sql.ResultSet rs_tDBInput_2 = null;

		    try {
		    	rs_tDBInput_2 = stmt_tDBInput_2.executeQuery(dbquery_tDBInput_2);
		    	java.sql.ResultSetMetaData rsmd_tDBInput_2 = rs_tDBInput_2.getMetaData();
		    	int colQtyInRs_tDBInput_2 = rsmd_tDBInput_2.getColumnCount();

		    String tmpContent_tDBInput_2 = null;
		    
		    
		    while (rs_tDBInput_2.next()) {
		        nb_line_tDBInput_2++;
		        
							if(colQtyInRs_tDBInput_2 < 1) {
								row2.id = 0;
							} else {
		                          
            row2.id = rs_tDBInput_2.getLong(1);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 2) {
								row2.libelle = null;
							} else {
	                         		
        	row2.libelle = routines.system.JDBCUtil.getString(rs_tDBInput_2, 2, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 3) {
								row2.created_at = null;
							} else {
										
			row2.created_at = routines.system.JDBCUtil.getDate(rs_tDBInput_2, 3);
		                    }
							if(colQtyInRs_tDBInput_2 < 4) {
								row2.updated_at = null;
							} else {
										
			row2.updated_at = routines.system.JDBCUtil.getDate(rs_tDBInput_2, 4);
		                    }
							if(colQtyInRs_tDBInput_2 < 5) {
								row2.activate = null;
							} else {
	                         		
            row2.activate = rs_tDBInput_2.getBoolean(5);
            if(rs_tDBInput_2.wasNull()){
                    row2.activate = null;
            }
		                    }
					


 



/**
 * [tDBInput_2 begin ] stop
 */
	
	/**
	 * [tDBInput_2 main ] start
	 */

	

	
	
	currentComponent="tDBInput_2";

	

 


	tos_count_tDBInput_2++;

/**
 * [tDBInput_2 main ] stop
 */
	
	/**
	 * [tDBInput_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_2";

	

 



/**
 * [tDBInput_2 process_data_begin ] stop
 */

	
	/**
	 * [tAdvancedHash_row2 main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row2";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row2"
						
						);
					}
					


			   
			   

					row2Struct row2_HashRow = new row2Struct();
		   	   	   
				
				row2_HashRow.id = row2.id;
				
				row2_HashRow.libelle = row2.libelle;
				
				row2_HashRow.created_at = row2.created_at;
				
				row2_HashRow.updated_at = row2.updated_at;
				
				row2_HashRow.activate = row2.activate;
				
			tHash_Lookup_row2.put(row2_HashRow);
			
            




 


	tos_count_tAdvancedHash_row2++;

/**
 * [tAdvancedHash_row2 main ] stop
 */
	
	/**
	 * [tAdvancedHash_row2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row2";

	

 



/**
 * [tAdvancedHash_row2 process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_row2 process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row2";

	

 



/**
 * [tAdvancedHash_row2 process_data_end ] stop
 */



	
	/**
	 * [tDBInput_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_2";

	

 



/**
 * [tDBInput_2 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_2 end ] start
	 */

	

	
	
	currentComponent="tDBInput_2";

	

	}
}finally{
	if (rs_tDBInput_2 != null) {
		rs_tDBInput_2.close();
	}
	if (stmt_tDBInput_2 != null) {
		stmt_tDBInput_2.close();
	}
	if(conn_tDBInput_2 != null && !conn_tDBInput_2.isClosed()) {
		
			conn_tDBInput_2.commit();
			
		
			conn_tDBInput_2.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
			}
			
	}
	
}
globalMap.put("tDBInput_2_NB_LINE",nb_line_tDBInput_2);
 

ok_Hash.put("tDBInput_2", true);
end_Hash.put("tDBInput_2", System.currentTimeMillis());




/**
 * [tDBInput_2 end ] stop
 */

	
	/**
	 * [tAdvancedHash_row2 end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row2";

	

tHash_Lookup_row2.endPut();

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row2");
			  	}
			  	
 

ok_Hash.put("tAdvancedHash_row2", true);
end_Hash.put("tAdvancedHash_row2", System.currentTimeMillis());




/**
 * [tAdvancedHash_row2 end ] stop
 */



				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBInput_2 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_2";

	

 



/**
 * [tDBInput_2 finally ] stop
 */

	
	/**
	 * [tAdvancedHash_row2 finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row2";

	

 



/**
 * [tAdvancedHash_row2 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBInput_2_SUBPROCESS_STATE", 1);
	}
	


public static class row3Struct implements routines.system.IPersistableComparableLookupRow<row3Struct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Produits = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_Dim_Produits = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public long id_produit;

				public long getId_produit () {
					return this.id_produit;
				}
				
			    public Long id_pilier;

				public Long getId_pilier () {
					return this.id_pilier;
				}
				
			    public String produits;

				public String getProduits () {
					return this.produits;
				}
				
			    public String pilier;

				public String getPilier () {
					return this.pilier;
				}
				
			    public Integer prix;

				public Integer getPrix () {
					return this.prix;
				}
				
			    public Integer volume_unitaire;

				public Integer getVolume_unitaire () {
					return this.volume_unitaire;
				}
				
			    public Double tva;

				public Double getTva () {
					return this.tva;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
							result = prime * result + (int) this.id_produit;
						
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final row3Struct other = (row3Struct) obj;
		
						if (this.id_produit != other.id_produit)
							return false;
					

		return true;
    }

	public void copyDataTo(row3Struct other) {

		other.id_produit = this.id_produit;
	            other.id_pilier = this.id_pilier;
	            other.produits = this.produits;
	            other.pilier = this.pilier;
	            other.prix = this.prix;
	            other.volume_unitaire = this.volume_unitaire;
	            other.tva = this.tva;
	            
	}

	public void copyKeysDataTo(row3Struct other) {

		other.id_produit = this.id_produit;
	            	
	}



	
	private String readString(DataInputStream dis, ObjectInputStream ois) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			byte[] byteArray = new byte[length];
			dis.read(byteArray);
			strReturn = new String(byteArray, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(DataInputStream dis, org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			byte[] byteArray = new byte[length];
			unmarshaller.read(byteArray);
			strReturn = new String(byteArray, utf8Charset);
		}
		return strReturn;
	}
	
	private void writeString(String str, DataOutputStream dos, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
	}

	private void writeString(String str, DataOutputStream dos, ObjectOutputStream oos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
	}
	private Integer readInteger(DataInputStream dis, ObjectInputStream ois) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
			intReturn = dis.readInt();
		}
		return intReturn;
	}
	
	private Integer readInteger(DataInputStream dis, org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		Integer intReturn;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
			intReturn = unmarshaller.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, DataOutputStream dos, ObjectOutputStream oos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, DataOutputStream dos,org.jboss.marshalling.Marshaller marshaller ) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

    public void readKeysData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Produits) {

        	try {

        		int length = 0;
		
			        this.id_produit = dis.readLong();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Produits) {

        	try {

        		int length = 0;
		
			        this.id_produit = dis.readLong();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id_produit);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id_produit);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }



    /**
     * Fill Values data by reading ObjectInputStream.
     */
    public void readValuesData(DataInputStream dis, ObjectInputStream ois) {
        try {

			int length = 0;
		
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.id_pilier = null;
           				} else {
           			    	this.id_pilier = dis.readLong();
           				}
					
						this.produits = readString(dis,ois);
					
						this.pilier = readString(dis,ois);
					
						this.prix = readInteger(dis,ois);
					
						this.volume_unitaire = readInteger(dis,ois);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.tva = null;
           				} else {
           			    	this.tva = dis.readDouble();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
			            length = objectIn.readByte();
           				if (length == -1) {
           	    			this.id_pilier = null;
           				} else {
           			    	this.id_pilier = objectIn.readLong();
           				}
					
						this.produits = readString(dis,objectIn);
					
						this.pilier = readString(dis,objectIn);
					
						this.prix = readInteger(dis,objectIn);
					
						this.volume_unitaire = readInteger(dis,objectIn);
					
			            length = objectIn.readByte();
           				if (length == -1) {
           	    			this.tva = null;
           				} else {
           			    	this.tva = objectIn.readDouble();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
						if(this.id_pilier == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.id_pilier);
		            	}
					
						writeString(this.produits, dos, oos);
					
						writeString(this.pilier, dos, oos);
					
					writeInteger(this.prix, dos, oos);
					
					writeInteger(this.volume_unitaire, dos, oos);
					
						if(this.tva == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.tva);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
						if(this.id_pilier == null) {
							objectOut.writeByte(-1);
						} else {
							objectOut.writeByte(0);
							objectOut.writeLong(this.id_pilier);
		            	}
					
						writeString(this.produits, dos, objectOut);
					
						writeString(this.pilier, dos, objectOut);
					
					writeInteger(this.prix, dos, objectOut);
					
					writeInteger(this.volume_unitaire, dos, objectOut);
					
						if(this.tva == null) {
							objectOut.writeByte(-1);
						} else {
							objectOut.writeByte(0);
							objectOut.writeDouble(this.tva);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}
    }


    
    public boolean supportMarshaller(){
        return true;
    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id_produit="+String.valueOf(id_produit));
		sb.append(",id_pilier="+String.valueOf(id_pilier));
		sb.append(",produits="+produits);
		sb.append(",pilier="+pilier);
		sb.append(",prix="+String.valueOf(prix));
		sb.append(",volume_unitaire="+String.valueOf(volume_unitaire));
		sb.append(",tva="+String.valueOf(tva));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row3Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.id_produit, other.id_produit);
						if(returnValue != 0) {
							return returnValue;
						}

					
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void tDBInput_3Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_3_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		row3Struct row3 = new row3Struct();




	
	/**
	 * [tAdvancedHash_row3 begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_row3", false);
		start_Hash.put("tAdvancedHash_row3", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_row3";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row3");
					}
				
		int tos_count_tAdvancedHash_row3 = 0;
		

			   		// connection name:row3
			   		// source node:tDBInput_3 - inputs:(after_tDBInput_1) outputs:(row3,row3) | target node:tAdvancedHash_row3 - inputs:(row3) outputs:()
			   		// linked node: tMap_2 - inputs:(row4,row3) outputs:(Insert_New_Data,Update_Data)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row3 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row3Struct> tHash_Lookup_row3 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row3Struct>getLookup(matchingModeEnum_row3);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row3", tHash_Lookup_row3);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row3 begin ] stop
 */



	
	/**
	 * [tDBInput_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_3", false);
		start_Hash.put("tDBInput_3", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_3";

	
		int tos_count_tDBInput_3 = 0;
		
	
    
	
		    int nb_line_tDBInput_3 = 0;
		    java.sql.Connection conn_tDBInput_3 = null;
				String driverClass_tDBInput_3 = "org.postgresql.Driver";
			    java.lang.Class jdbcclazz_tDBInput_3 = java.lang.Class.forName(driverClass_tDBInput_3);
				String dbUser_tDBInput_3 = "malick.diouf";
				
				 
	final String decryptedPassword_tDBInput_3 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:PLc0p2VMGdIAsWjYf7L0yOYxyCB8Iqn+vauKc/QnY5oEQee/o3E=");
				
				String dbPwd_tDBInput_3 = decryptedPassword_tDBInput_3;
				
				String url_tDBInput_3 = "jdbc:postgresql://" + "163.172.166.119" + ":" + "5432" + "/" + "leuk_analytics";
				
				conn_tDBInput_3 = java.sql.DriverManager.getConnection(url_tDBInput_3,dbUser_tDBInput_3,dbPwd_tDBInput_3);
		        
				conn_tDBInput_3.setAutoCommit(false);
			
		    
			java.sql.Statement stmt_tDBInput_3 = conn_tDBInput_3.createStatement();

		    String dbquery_tDBInput_3 = "SELECT \n  \"public\".\"Dim_Produits\".\"id_produit\", \n  \"public\".\"Dim_Produits\".\"id_pilier\", \n  \"public\".\"Dim"
+"_Produits\".\"produits\", \n  \"public\".\"Dim_Produits\".\"pilier\", \n  \"public\".\"Dim_Produits\".\"prix\", \n  \"publi"
+"c\".\"Dim_Produits\".\"volume_unitaire\", \n  \"public\".\"Dim_Produits\".\"tva\"\nFROM \"public\".\"Dim_Produits\"";
		    

            	globalMap.put("tDBInput_3_QUERY",dbquery_tDBInput_3);
		    java.sql.ResultSet rs_tDBInput_3 = null;

		    try {
		    	rs_tDBInput_3 = stmt_tDBInput_3.executeQuery(dbquery_tDBInput_3);
		    	java.sql.ResultSetMetaData rsmd_tDBInput_3 = rs_tDBInput_3.getMetaData();
		    	int colQtyInRs_tDBInput_3 = rsmd_tDBInput_3.getColumnCount();

		    String tmpContent_tDBInput_3 = null;
		    
		    
		    while (rs_tDBInput_3.next()) {
		        nb_line_tDBInput_3++;
		        
							if(colQtyInRs_tDBInput_3 < 1) {
								row3.id_produit = 0;
							} else {
		                          
            row3.id_produit = rs_tDBInput_3.getLong(1);
            if(rs_tDBInput_3.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_3 < 2) {
								row3.id_pilier = null;
							} else {
		                          
            row3.id_pilier = rs_tDBInput_3.getLong(2);
            if(rs_tDBInput_3.wasNull()){
                    row3.id_pilier = null;
            }
		                    }
							if(colQtyInRs_tDBInput_3 < 3) {
								row3.produits = null;
							} else {
	                         		
        	row3.produits = routines.system.JDBCUtil.getString(rs_tDBInput_3, 3, false);
		                    }
							if(colQtyInRs_tDBInput_3 < 4) {
								row3.pilier = null;
							} else {
	                         		
        	row3.pilier = routines.system.JDBCUtil.getString(rs_tDBInput_3, 4, false);
		                    }
							if(colQtyInRs_tDBInput_3 < 5) {
								row3.prix = null;
							} else {
		                          
            row3.prix = rs_tDBInput_3.getInt(5);
            if(rs_tDBInput_3.wasNull()){
                    row3.prix = null;
            }
		                    }
							if(colQtyInRs_tDBInput_3 < 6) {
								row3.volume_unitaire = null;
							} else {
		                          
            row3.volume_unitaire = rs_tDBInput_3.getInt(6);
            if(rs_tDBInput_3.wasNull()){
                    row3.volume_unitaire = null;
            }
		                    }
							if(colQtyInRs_tDBInput_3 < 7) {
								row3.tva = null;
							} else {
	                         		
            row3.tva = rs_tDBInput_3.getDouble(7);
            if(rs_tDBInput_3.wasNull()){
                    row3.tva = null;
            }
		                    }
					


 



/**
 * [tDBInput_3 begin ] stop
 */
	
	/**
	 * [tDBInput_3 main ] start
	 */

	

	
	
	currentComponent="tDBInput_3";

	

 


	tos_count_tDBInput_3++;

/**
 * [tDBInput_3 main ] stop
 */
	
	/**
	 * [tDBInput_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_3";

	

 



/**
 * [tDBInput_3 process_data_begin ] stop
 */

	
	/**
	 * [tAdvancedHash_row3 main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row3";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row3"
						
						);
					}
					


			   
			   

					row3Struct row3_HashRow = new row3Struct();
		   	   	   
				
				row3_HashRow.id_produit = row3.id_produit;
				
				row3_HashRow.id_pilier = row3.id_pilier;
				
				row3_HashRow.produits = row3.produits;
				
				row3_HashRow.pilier = row3.pilier;
				
				row3_HashRow.prix = row3.prix;
				
				row3_HashRow.volume_unitaire = row3.volume_unitaire;
				
				row3_HashRow.tva = row3.tva;
				
			tHash_Lookup_row3.put(row3_HashRow);
			
            




 


	tos_count_tAdvancedHash_row3++;

/**
 * [tAdvancedHash_row3 main ] stop
 */
	
	/**
	 * [tAdvancedHash_row3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row3";

	

 



/**
 * [tAdvancedHash_row3 process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_row3 process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row3";

	

 



/**
 * [tAdvancedHash_row3 process_data_end ] stop
 */



	
	/**
	 * [tDBInput_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_3";

	

 



/**
 * [tDBInput_3 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_3 end ] start
	 */

	

	
	
	currentComponent="tDBInput_3";

	

	}
}finally{
	if (rs_tDBInput_3 != null) {
		rs_tDBInput_3.close();
	}
	if (stmt_tDBInput_3 != null) {
		stmt_tDBInput_3.close();
	}
	if(conn_tDBInput_3 != null && !conn_tDBInput_3.isClosed()) {
		
			conn_tDBInput_3.commit();
			
		
			conn_tDBInput_3.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
			}
			
	}
	
}
globalMap.put("tDBInput_3_NB_LINE",nb_line_tDBInput_3);
 

ok_Hash.put("tDBInput_3", true);
end_Hash.put("tDBInput_3", System.currentTimeMillis());




/**
 * [tDBInput_3 end ] stop
 */

	
	/**
	 * [tAdvancedHash_row3 end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row3";

	

tHash_Lookup_row3.endPut();

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row3");
			  	}
			  	
 

ok_Hash.put("tAdvancedHash_row3", true);
end_Hash.put("tAdvancedHash_row3", System.currentTimeMillis());




/**
 * [tAdvancedHash_row3 end ] stop
 */



				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBInput_3 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_3";

	

 



/**
 * [tDBInput_3 finally ] stop
 */

	
	/**
	 * [tAdvancedHash_row3 finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row3";

	

 



/**
 * [tAdvancedHash_row3 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBInput_3_SUBPROCESS_STATE", 1);
	}
	


public static class row5Struct implements routines.system.IPersistableComparableLookupRow<row5Struct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Produits = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_Dim_Produits = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public long id_produit;

				public long getId_produit () {
					return this.id_produit;
				}
				
			    public Long id_pilier;

				public Long getId_pilier () {
					return this.id_pilier;
				}
				
			    public String produits;

				public String getProduits () {
					return this.produits;
				}
				
			    public String pilier;

				public String getPilier () {
					return this.pilier;
				}
				
			    public Integer prix;

				public Integer getPrix () {
					return this.prix;
				}
				
			    public Integer volume_unitaire;

				public Integer getVolume_unitaire () {
					return this.volume_unitaire;
				}
				
			    public Double tva;

				public Double getTva () {
					return this.tva;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
							result = prime * result + (int) this.id_produit;
						
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final row5Struct other = (row5Struct) obj;
		
						if (this.id_produit != other.id_produit)
							return false;
					

		return true;
    }

	public void copyDataTo(row5Struct other) {

		other.id_produit = this.id_produit;
	            other.id_pilier = this.id_pilier;
	            other.produits = this.produits;
	            other.pilier = this.pilier;
	            other.prix = this.prix;
	            other.volume_unitaire = this.volume_unitaire;
	            other.tva = this.tva;
	            
	}

	public void copyKeysDataTo(row5Struct other) {

		other.id_produit = this.id_produit;
	            	
	}



	
	private String readString(DataInputStream dis, ObjectInputStream ois) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			byte[] byteArray = new byte[length];
			dis.read(byteArray);
			strReturn = new String(byteArray, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(DataInputStream dis, org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			byte[] byteArray = new byte[length];
			unmarshaller.read(byteArray);
			strReturn = new String(byteArray, utf8Charset);
		}
		return strReturn;
	}
	
	private void writeString(String str, DataOutputStream dos, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
	}

	private void writeString(String str, DataOutputStream dos, ObjectOutputStream oos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
	}
	private Integer readInteger(DataInputStream dis, ObjectInputStream ois) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
			intReturn = dis.readInt();
		}
		return intReturn;
	}
	
	private Integer readInteger(DataInputStream dis, org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		Integer intReturn;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
			intReturn = unmarshaller.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, DataOutputStream dos, ObjectOutputStream oos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, DataOutputStream dos,org.jboss.marshalling.Marshaller marshaller ) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

    public void readKeysData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Produits) {

        	try {

        		int length = 0;
		
			        this.id_produit = dis.readLong();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Produits) {

        	try {

        		int length = 0;
		
			        this.id_produit = dis.readLong();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id_produit);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id_produit);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }



    /**
     * Fill Values data by reading ObjectInputStream.
     */
    public void readValuesData(DataInputStream dis, ObjectInputStream ois) {
        try {

			int length = 0;
		
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.id_pilier = null;
           				} else {
           			    	this.id_pilier = dis.readLong();
           				}
					
						this.produits = readString(dis,ois);
					
						this.pilier = readString(dis,ois);
					
						this.prix = readInteger(dis,ois);
					
						this.volume_unitaire = readInteger(dis,ois);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.tva = null;
           				} else {
           			    	this.tva = dis.readDouble();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
			            length = objectIn.readByte();
           				if (length == -1) {
           	    			this.id_pilier = null;
           				} else {
           			    	this.id_pilier = objectIn.readLong();
           				}
					
						this.produits = readString(dis,objectIn);
					
						this.pilier = readString(dis,objectIn);
					
						this.prix = readInteger(dis,objectIn);
					
						this.volume_unitaire = readInteger(dis,objectIn);
					
			            length = objectIn.readByte();
           				if (length == -1) {
           	    			this.tva = null;
           				} else {
           			    	this.tva = objectIn.readDouble();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
						if(this.id_pilier == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.id_pilier);
		            	}
					
						writeString(this.produits, dos, oos);
					
						writeString(this.pilier, dos, oos);
					
					writeInteger(this.prix, dos, oos);
					
					writeInteger(this.volume_unitaire, dos, oos);
					
						if(this.tva == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.tva);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
						if(this.id_pilier == null) {
							objectOut.writeByte(-1);
						} else {
							objectOut.writeByte(0);
							objectOut.writeLong(this.id_pilier);
		            	}
					
						writeString(this.produits, dos, objectOut);
					
						writeString(this.pilier, dos, objectOut);
					
					writeInteger(this.prix, dos, objectOut);
					
					writeInteger(this.volume_unitaire, dos, objectOut);
					
						if(this.tva == null) {
							objectOut.writeByte(-1);
						} else {
							objectOut.writeByte(0);
							objectOut.writeDouble(this.tva);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}
    }


    
    public boolean supportMarshaller(){
        return true;
    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id_produit="+String.valueOf(id_produit));
		sb.append(",id_pilier="+String.valueOf(id_pilier));
		sb.append(",produits="+produits);
		sb.append(",pilier="+pilier);
		sb.append(",prix="+String.valueOf(prix));
		sb.append(",volume_unitaire="+String.valueOf(volume_unitaire));
		sb.append(",tva="+String.valueOf(tva));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row5Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.id_produit, other.id_produit);
						if(returnValue != 0) {
							return returnValue;
						}

					
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void tDBInput_4Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_4_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		row5Struct row5 = new row5Struct();




	
	/**
	 * [tAdvancedHash_row5 begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_row5", false);
		start_Hash.put("tAdvancedHash_row5", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_row5";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row5");
					}
				
		int tos_count_tAdvancedHash_row5 = 0;
		

			   		// connection name:row5
			   		// source node:tDBInput_4 - inputs:(after_tDBInput_1) outputs:(row5,row5) | target node:tAdvancedHash_row5 - inputs:(row5) outputs:()
			   		// linked node: tMap_3 - inputs:(Update_Data,row5) outputs:(Update_Existing_Data)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row5 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row5Struct> tHash_Lookup_row5 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row5Struct>getLookup(matchingModeEnum_row5);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row5", tHash_Lookup_row5);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row5 begin ] stop
 */



	
	/**
	 * [tDBInput_4 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_4", false);
		start_Hash.put("tDBInput_4", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_4";

	
		int tos_count_tDBInput_4 = 0;
		
	
    
	
		    int nb_line_tDBInput_4 = 0;
		    java.sql.Connection conn_tDBInput_4 = null;
				String driverClass_tDBInput_4 = "org.postgresql.Driver";
			    java.lang.Class jdbcclazz_tDBInput_4 = java.lang.Class.forName(driverClass_tDBInput_4);
				String dbUser_tDBInput_4 = "malick.diouf";
				
				 
	final String decryptedPassword_tDBInput_4 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:tAocS0ncJ5ws8Ftlf4hPxo78eJ7mkaurRky5zazDhmvIt2zc57w=");
				
				String dbPwd_tDBInput_4 = decryptedPassword_tDBInput_4;
				
				String url_tDBInput_4 = "jdbc:postgresql://" + "163.172.166.119" + ":" + "5432" + "/" + "leuk_analytics";
				
				conn_tDBInput_4 = java.sql.DriverManager.getConnection(url_tDBInput_4,dbUser_tDBInput_4,dbPwd_tDBInput_4);
		        
				conn_tDBInput_4.setAutoCommit(false);
			
		    
			java.sql.Statement stmt_tDBInput_4 = conn_tDBInput_4.createStatement();

		    String dbquery_tDBInput_4 = "SELECT \n  \"public\".\"Dim_Produits\".\"id_produit\", \n  \"public\".\"Dim_Produits\".\"id_pilier\", \n  \"public\".\"Dim"
+"_Produits\".\"produits\", \n  \"public\".\"Dim_Produits\".\"pilier\", \n  \"public\".\"Dim_Produits\".\"prix\", \n  \"publi"
+"c\".\"Dim_Produits\".\"volume_unitaire\", \n  \"public\".\"Dim_Produits\".\"tva\"\nFROM \"public\".\"Dim_Produits\"";
		    

            	globalMap.put("tDBInput_4_QUERY",dbquery_tDBInput_4);
		    java.sql.ResultSet rs_tDBInput_4 = null;

		    try {
		    	rs_tDBInput_4 = stmt_tDBInput_4.executeQuery(dbquery_tDBInput_4);
		    	java.sql.ResultSetMetaData rsmd_tDBInput_4 = rs_tDBInput_4.getMetaData();
		    	int colQtyInRs_tDBInput_4 = rsmd_tDBInput_4.getColumnCount();

		    String tmpContent_tDBInput_4 = null;
		    
		    
		    while (rs_tDBInput_4.next()) {
		        nb_line_tDBInput_4++;
		        
							if(colQtyInRs_tDBInput_4 < 1) {
								row5.id_produit = 0;
							} else {
		                          
            row5.id_produit = rs_tDBInput_4.getLong(1);
            if(rs_tDBInput_4.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_4 < 2) {
								row5.id_pilier = null;
							} else {
		                          
            row5.id_pilier = rs_tDBInput_4.getLong(2);
            if(rs_tDBInput_4.wasNull()){
                    row5.id_pilier = null;
            }
		                    }
							if(colQtyInRs_tDBInput_4 < 3) {
								row5.produits = null;
							} else {
	                         		
        	row5.produits = routines.system.JDBCUtil.getString(rs_tDBInput_4, 3, false);
		                    }
							if(colQtyInRs_tDBInput_4 < 4) {
								row5.pilier = null;
							} else {
	                         		
        	row5.pilier = routines.system.JDBCUtil.getString(rs_tDBInput_4, 4, false);
		                    }
							if(colQtyInRs_tDBInput_4 < 5) {
								row5.prix = null;
							} else {
		                          
            row5.prix = rs_tDBInput_4.getInt(5);
            if(rs_tDBInput_4.wasNull()){
                    row5.prix = null;
            }
		                    }
							if(colQtyInRs_tDBInput_4 < 6) {
								row5.volume_unitaire = null;
							} else {
		                          
            row5.volume_unitaire = rs_tDBInput_4.getInt(6);
            if(rs_tDBInput_4.wasNull()){
                    row5.volume_unitaire = null;
            }
		                    }
							if(colQtyInRs_tDBInput_4 < 7) {
								row5.tva = null;
							} else {
	                         		
            row5.tva = rs_tDBInput_4.getDouble(7);
            if(rs_tDBInput_4.wasNull()){
                    row5.tva = null;
            }
		                    }
					


 



/**
 * [tDBInput_4 begin ] stop
 */
	
	/**
	 * [tDBInput_4 main ] start
	 */

	

	
	
	currentComponent="tDBInput_4";

	

 


	tos_count_tDBInput_4++;

/**
 * [tDBInput_4 main ] stop
 */
	
	/**
	 * [tDBInput_4 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_4";

	

 



/**
 * [tDBInput_4 process_data_begin ] stop
 */

	
	/**
	 * [tAdvancedHash_row5 main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row5";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row5"
						
						);
					}
					


			   
			   

					row5Struct row5_HashRow = new row5Struct();
		   	   	   
				
				row5_HashRow.id_produit = row5.id_produit;
				
				row5_HashRow.id_pilier = row5.id_pilier;
				
				row5_HashRow.produits = row5.produits;
				
				row5_HashRow.pilier = row5.pilier;
				
				row5_HashRow.prix = row5.prix;
				
				row5_HashRow.volume_unitaire = row5.volume_unitaire;
				
				row5_HashRow.tva = row5.tva;
				
			tHash_Lookup_row5.put(row5_HashRow);
			
            




 


	tos_count_tAdvancedHash_row5++;

/**
 * [tAdvancedHash_row5 main ] stop
 */
	
	/**
	 * [tAdvancedHash_row5 process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row5";

	

 



/**
 * [tAdvancedHash_row5 process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_row5 process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row5";

	

 



/**
 * [tAdvancedHash_row5 process_data_end ] stop
 */



	
	/**
	 * [tDBInput_4 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_4";

	

 



/**
 * [tDBInput_4 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_4 end ] start
	 */

	

	
	
	currentComponent="tDBInput_4";

	

	}
}finally{
	if (rs_tDBInput_4 != null) {
		rs_tDBInput_4.close();
	}
	if (stmt_tDBInput_4 != null) {
		stmt_tDBInput_4.close();
	}
	if(conn_tDBInput_4 != null && !conn_tDBInput_4.isClosed()) {
		
			conn_tDBInput_4.commit();
			
		
			conn_tDBInput_4.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
			}
			
	}
	
}
globalMap.put("tDBInput_4_NB_LINE",nb_line_tDBInput_4);
 

ok_Hash.put("tDBInput_4", true);
end_Hash.put("tDBInput_4", System.currentTimeMillis());




/**
 * [tDBInput_4 end ] stop
 */

	
	/**
	 * [tAdvancedHash_row5 end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row5";

	

tHash_Lookup_row5.endPut();

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row5");
			  	}
			  	
 

ok_Hash.put("tAdvancedHash_row5", true);
end_Hash.put("tAdvancedHash_row5", System.currentTimeMillis());




/**
 * [tAdvancedHash_row5 end ] stop
 */



				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBInput_4 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_4";

	

 



/**
 * [tDBInput_4 finally ] stop
 */

	
	/**
	 * [tAdvancedHash_row5 finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row5";

	

 



/**
 * [tAdvancedHash_row5 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBInput_4_SUBPROCESS_STATE", 1);
	}
	

public void tPostjob_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tPostjob_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tPostjob_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tPostjob_1", false);
		start_Hash.put("tPostjob_1", System.currentTimeMillis());
		
	
	currentComponent="tPostjob_1";

	
		int tos_count_tPostjob_1 = 0;
		

 



/**
 * [tPostjob_1 begin ] stop
 */
	
	/**
	 * [tPostjob_1 main ] start
	 */

	

	
	
	currentComponent="tPostjob_1";

	

 


	tos_count_tPostjob_1++;

/**
 * [tPostjob_1 main ] stop
 */
	
	/**
	 * [tPostjob_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tPostjob_1";

	

 



/**
 * [tPostjob_1 process_data_begin ] stop
 */
	
	/**
	 * [tPostjob_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tPostjob_1";

	

 



/**
 * [tPostjob_1 process_data_end ] stop
 */
	
	/**
	 * [tPostjob_1 end ] start
	 */

	

	
	
	currentComponent="tPostjob_1";

	

 

ok_Hash.put("tPostjob_1", true);
end_Hash.put("tPostjob_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk4", 0, "ok");
				}
				tDBClose_1Process(globalMap);



/**
 * [tPostjob_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tPostjob_1 finally ] start
	 */

	

	
	
	currentComponent="tPostjob_1";

	

 



/**
 * [tPostjob_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tPostjob_1_SUBPROCESS_STATE", 1);
	}
	

public void tDBClose_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBClose_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tDBClose_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBClose_1", false);
		start_Hash.put("tDBClose_1", System.currentTimeMillis());
		
	
	currentComponent="tDBClose_1";

	
		int tos_count_tDBClose_1 = 0;
		

 



/**
 * [tDBClose_1 begin ] stop
 */
	
	/**
	 * [tDBClose_1 main ] start
	 */

	

	
	
	currentComponent="tDBClose_1";

	



	java.sql.Connection conn_tDBClose_1 = (java.sql.Connection)globalMap.get("conn_tDBConnection_2");
	if(conn_tDBClose_1 != null && !conn_tDBClose_1.isClosed())
	{
        conn_tDBClose_1.close();
	}

 


	tos_count_tDBClose_1++;

/**
 * [tDBClose_1 main ] stop
 */
	
	/**
	 * [tDBClose_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBClose_1";

	

 



/**
 * [tDBClose_1 process_data_begin ] stop
 */
	
	/**
	 * [tDBClose_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBClose_1";

	

 



/**
 * [tDBClose_1 process_data_end ] stop
 */
	
	/**
	 * [tDBClose_1 end ] start
	 */

	

	
	
	currentComponent="tDBClose_1";

	

 

ok_Hash.put("tDBClose_1", true);
end_Hash.put("tDBClose_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk5", 0, "ok");
				}
				tDBClose_2Process(globalMap);



/**
 * [tDBClose_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBClose_1 finally ] start
	 */

	

	
	
	currentComponent="tDBClose_1";

	

 



/**
 * [tDBClose_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBClose_1_SUBPROCESS_STATE", 1);
	}
	

public void tDBClose_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBClose_2_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tDBClose_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBClose_2", false);
		start_Hash.put("tDBClose_2", System.currentTimeMillis());
		
	
	currentComponent="tDBClose_2";

	
		int tos_count_tDBClose_2 = 0;
		

 



/**
 * [tDBClose_2 begin ] stop
 */
	
	/**
	 * [tDBClose_2 main ] start
	 */

	

	
	
	currentComponent="tDBClose_2";

	



	java.sql.Connection conn_tDBClose_2 = (java.sql.Connection)globalMap.get("conn_tDBConnection_1");
	if(conn_tDBClose_2 != null && !conn_tDBClose_2.isClosed())
	{
        conn_tDBClose_2.close();
	}

 


	tos_count_tDBClose_2++;

/**
 * [tDBClose_2 main ] stop
 */
	
	/**
	 * [tDBClose_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBClose_2";

	

 



/**
 * [tDBClose_2 process_data_begin ] stop
 */
	
	/**
	 * [tDBClose_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBClose_2";

	

 



/**
 * [tDBClose_2 process_data_end ] stop
 */
	
	/**
	 * [tDBClose_2 end ] start
	 */

	

	
	
	currentComponent="tDBClose_2";

	

 

ok_Hash.put("tDBClose_2", true);
end_Hash.put("tDBClose_2", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk6", 0, "ok");
				}
				tChronometerStop_1Process(globalMap);



/**
 * [tDBClose_2 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBClose_2 finally ] start
	 */

	

	
	
	currentComponent="tDBClose_2";

	

 



/**
 * [tDBClose_2 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBClose_2_SUBPROCESS_STATE", 1);
	}
	

public void tChronometerStop_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tChronometerStop_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tChronometerStop_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tChronometerStop_1", false);
		start_Hash.put("tChronometerStop_1", System.currentTimeMillis());
		
	
	currentComponent="tChronometerStop_1";

	
		int tos_count_tChronometerStop_1 = 0;
		
	
	long timetChronometerStop_1;
	
		timetChronometerStop_1 = System.currentTimeMillis() - startTime;
		
	   		System.out.print("[ tChronometerStop_1 ]  ");
		
	  	System.out.println("" + "  " + timetChronometerStop_1 + " milliseconds");
	  	 
	
	Long currentTimetChronometerStop_1 = System.currentTimeMillis();
	globalMap.put("tChronometerStop_1", currentTimetChronometerStop_1);
	
	globalMap.put("tChronometerStop_1_STOPTIME", currentTimetChronometerStop_1);
	globalMap.put("tChronometerStop_1_DURATION", timetChronometerStop_1);
 



/**
 * [tChronometerStop_1 begin ] stop
 */
	
	/**
	 * [tChronometerStop_1 main ] start
	 */

	

	
	
	currentComponent="tChronometerStop_1";

	

 


	tos_count_tChronometerStop_1++;

/**
 * [tChronometerStop_1 main ] stop
 */
	
	/**
	 * [tChronometerStop_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tChronometerStop_1";

	

 



/**
 * [tChronometerStop_1 process_data_begin ] stop
 */
	
	/**
	 * [tChronometerStop_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tChronometerStop_1";

	

 



/**
 * [tChronometerStop_1 process_data_end ] stop
 */
	
	/**
	 * [tChronometerStop_1 end ] start
	 */

	

	
	
	currentComponent="tChronometerStop_1";

	

 

ok_Hash.put("tChronometerStop_1", true);
end_Hash.put("tChronometerStop_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk7", 0, "ok");
				}
				tJava_1Process(globalMap);



/**
 * [tChronometerStop_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tChronometerStop_1 finally ] start
	 */

	

	
	
	currentComponent="tChronometerStop_1";

	

 



/**
 * [tChronometerStop_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tChronometerStop_1_SUBPROCESS_STATE", 1);
	}
	

public void tJava_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tJava_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tJava_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tJava_1", false);
		start_Hash.put("tJava_1", System.currentTimeMillis());
		
	
	currentComponent="tJava_1";

	
		int tos_count_tJava_1 = 0;
		


System.out.println("********************************************************************************************************************");

System.out.println("");

System.out.println("Début d'exécution du JOB : " + jobName + "      : " + TalendDate.formatDate("yyyy-MM-dd HH:mm:ss", new java.util.Date(((Long)globalMap.get("tChronometerStart_1_STARTTIME")))));

System.out.println();

System.out.println("Nbre de Ligne Extrait : " + ((Integer)globalMap.get("tDBInput_1_NB_LINE")));

System.out.println();

System.out.println("Nbre de Ligne Insérer : " + ((Integer)globalMap.get("tDBOutput_1_NB_LINE_INSERTED")));

System.out.println();

System.out.println("Nbre de Ligne mise à Jour : " + ((Integer)globalMap.get("tDBOutput_2_NB_LINE_UPDATED")));

System.out.println();

System.out.println("Nbre de Ligne Rejeter : " + ((Integer)globalMap.get("tDBOutput_1_NB_LINE_REJECTED")));

System.out.println();

System.out.println("********************************************************************************************************************");

 



/**
 * [tJava_1 begin ] stop
 */
	
	/**
	 * [tJava_1 main ] start
	 */

	

	
	
	currentComponent="tJava_1";

	

 


	tos_count_tJava_1++;

/**
 * [tJava_1 main ] stop
 */
	
	/**
	 * [tJava_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tJava_1";

	

 



/**
 * [tJava_1 process_data_begin ] stop
 */
	
	/**
	 * [tJava_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tJava_1";

	

 



/**
 * [tJava_1 process_data_end ] stop
 */
	
	/**
	 * [tJava_1 end ] start
	 */

	

	
	
	currentComponent="tJava_1";

	

 

ok_Hash.put("tJava_1", true);
end_Hash.put("tJava_1", System.currentTimeMillis());




/**
 * [tJava_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tJava_1 finally ] start
	 */

	

	
	
	currentComponent="tJava_1";

	

 



/**
 * [tJava_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tJava_1_SUBPROCESS_STATE", 1);
	}
	
    public String resuming_logs_dir_path = null;
    public String resuming_checkpoint_path = null;
    public String parent_part_launcher = null;
    private String resumeEntryMethodName = null;
    private boolean globalResumeTicket = false;

    public boolean watch = false;
    // portStats is null, it means don't execute the statistics
    public Integer portStats = null;
    public int portTraces = 4334;
    public String clientHost;
    public String defaultClientHost = "localhost";
    public String contextStr = "Default";
    public boolean isDefaultContext = true;
    public String pid = "0";
    public String rootPid = null;
    public String fatherPid = null;
    public String fatherNode = null;
    public long startTime = 0;
    public boolean isChildJob = false;
    public String log4jLevel = "";
    
    private boolean enableLogStash;

    private boolean execStat = true;

    private ThreadLocal<java.util.Map<String, String>> threadLocal = new ThreadLocal<java.util.Map<String, String>>() {
        protected java.util.Map<String, String> initialValue() {
            java.util.Map<String,String> threadRunResultMap = new java.util.HashMap<String, String>();
            threadRunResultMap.put("errorCode", null);
            threadRunResultMap.put("status", "");
            return threadRunResultMap;
        };
    };


    protected PropertiesWithType context_param = new PropertiesWithType();
    public java.util.Map<String, Object> parentContextMap = new java.util.HashMap<String, Object>();

    public String status= "";
    

    public static void main(String[] args){
        final Alimentation_Dim_Produits Alimentation_Dim_ProduitsClass = new Alimentation_Dim_Produits();

        int exitCode = Alimentation_Dim_ProduitsClass.runJobInTOS(args);

        System.exit(exitCode);
    }


    public String[][] runJob(String[] args) {

        int exitCode = runJobInTOS(args);
        String[][] bufferValue = new String[][] { { Integer.toString(exitCode) } };

        return bufferValue;
    }

    public boolean hastBufferOutputComponent() {
		boolean hastBufferOutput = false;
    	
        return hastBufferOutput;
    }

    public int runJobInTOS(String[] args) {
	   	// reset status
	   	status = "";
	   	
        String lastStr = "";
        for (String arg : args) {
            if (arg.equalsIgnoreCase("--context_param")) {
                lastStr = arg;
            } else if (lastStr.equals("")) {
                evalParam(arg);
            } else {
                evalParam(lastStr + " " + arg);
                lastStr = "";
            }
        }
        enableLogStash = "true".equalsIgnoreCase(System.getProperty("audit.enabled"));

    	
    	

        if(clientHost == null) {
            clientHost = defaultClientHost;
        }

        if(pid == null || "0".equals(pid)) {
            pid = TalendString.getAsciiRandomString(6);
        }

        if (rootPid==null) {
            rootPid = pid;
        }
        if (fatherPid==null) {
            fatherPid = pid;
        }else{
            isChildJob = true;
        }

        if (portStats != null) {
            // portStats = -1; //for testing
            if (portStats < 0 || portStats > 65535) {
                // issue:10869, the portStats is invalid, so this client socket can't open
                System.err.println("The statistics socket port " + portStats + " is invalid.");
                execStat = false;
            }
        } else {
            execStat = false;
        }
        boolean inOSGi = routines.system.BundleUtils.inOSGi();

        if (inOSGi) {
            java.util.Dictionary<String, Object> jobProperties = routines.system.BundleUtils.getJobProperties(jobName);

            if (jobProperties != null && jobProperties.get("context") != null) {
                contextStr = (String)jobProperties.get("context");
            }
        }

        try {
            //call job/subjob with an existing context, like: --context=production. if without this parameter, there will use the default context instead.
            java.io.InputStream inContext = Alimentation_Dim_Produits.class.getClassLoader().getResourceAsStream("warehouse/alimentation_dim_produits_0_1/contexts/" + contextStr + ".properties");
            if (inContext == null) {
                inContext = Alimentation_Dim_Produits.class.getClassLoader().getResourceAsStream("config/contexts/" + contextStr + ".properties");
            }
            if (inContext != null) {
                try {
                    //defaultProps is in order to keep the original context value
                    if(context != null && context.isEmpty()) {
	                defaultProps.load(inContext);
	                context = new ContextProperties(defaultProps);
                    }
                } finally {
                    inContext.close();
                }
            } else if (!isDefaultContext) {
                //print info and job continue to run, for case: context_param is not empty.
                System.err.println("Could not find the context " + contextStr);
            }

            if(!context_param.isEmpty()) {
                context.putAll(context_param);
				//set types for params from parentJobs
				for (Object key: context_param.keySet()){
					String context_key = key.toString();
					String context_type = context_param.getContextType(context_key);
					context.setContextType(context_key, context_type);

				}
            }
            class ContextProcessing {
                private void processContext_0() {
                } 
                public void processAllContext() {
                        processContext_0();
                }
            }

            new ContextProcessing().processAllContext();
        } catch (java.io.IOException ie) {
            System.err.println("Could not load context "+contextStr);
            ie.printStackTrace();
        }

        // get context value from parent directly
        if (parentContextMap != null && !parentContextMap.isEmpty()) {
        }

        //Resume: init the resumeUtil
        resumeEntryMethodName = ResumeUtil.getResumeEntryMethodName(resuming_checkpoint_path);
        resumeUtil = new ResumeUtil(resuming_logs_dir_path, isChildJob, rootPid);
        resumeUtil.initCommonInfo(pid, rootPid, fatherPid, projectName, jobName, contextStr, jobVersion);

		List<String> parametersToEncrypt = new java.util.ArrayList<String>();
        //Resume: jobStart
        resumeUtil.addLog("JOB_STARTED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "", "","","","",resumeUtil.convertToJsonText(context,parametersToEncrypt));

if(execStat) {
    try {
        runStat.openSocket(!isChildJob);
        runStat.setAllPID(rootPid, fatherPid, pid, jobName);
        runStat.startThreadStat(clientHost, portStats);
        runStat.updateStatOnJob(RunStat.JOBSTART, fatherNode);
    } catch (java.io.IOException ioException) {
        ioException.printStackTrace();
    }
}



	
	    java.util.concurrent.ConcurrentHashMap<Object, Object> concurrentHashMap = new java.util.concurrent.ConcurrentHashMap<Object, Object>();
	    globalMap.put("concurrentHashMap", concurrentHashMap);
	

    long startUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    long endUsedMemory = 0;
    long end = 0;

    startTime = System.currentTimeMillis();


this.globalResumeTicket = true;//to run tPreJob

try {
errorCode = null;tPrejob_1Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tPrejob_1) {
globalMap.put("tPrejob_1_SUBPROCESS_STATE", -1);

e_tPrejob_1.printStackTrace();

}




this.globalResumeTicket = false;//to run others jobs


this.globalResumeTicket = true;//to run tPostJob

try {
errorCode = null;tPostjob_1Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tPostjob_1) {
globalMap.put("tPostjob_1_SUBPROCESS_STATE", -1);

e_tPostjob_1.printStackTrace();

}



        end = System.currentTimeMillis();

        if (watch) {
            System.out.println((end-startTime)+" milliseconds");
        }

        endUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        if (false) {
            System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : Alimentation_Dim_Produits");
        }



if (execStat) {
    runStat.updateStatOnJob(RunStat.JOBEND, fatherNode);
    runStat.stopThreadStat();
}
    int returnCode = 0;


    if(errorCode == null) {
         returnCode = status != null && status.equals("failure") ? 1 : 0;
    } else {
         returnCode = errorCode.intValue();
    }
    resumeUtil.addLog("JOB_ENDED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "", "","" + returnCode,"","","");

    return returnCode;

  }

    // only for OSGi env
    public void destroy() {
    closeSqlDbConnections();


    }



    private void closeSqlDbConnections() {
        try {
            Object obj_conn;
            obj_conn = globalMap.remove("conn_tDBConnection_1");
            if (null != obj_conn) {
                ((java.sql.Connection) obj_conn).close();
            }
            obj_conn = globalMap.remove("conn_tDBConnection_2");
            if (null != obj_conn) {
                ((java.sql.Connection) obj_conn).close();
            }
        } catch (java.lang.Exception e) {
        }
    }











    private java.util.Map<String, Object> getSharedConnections4REST() {
        java.util.Map<String, Object> connections = new java.util.HashMap<String, Object>();
            connections.put("conn_tDBConnection_1", globalMap.get("conn_tDBConnection_1"));
            connections.put("conn_tDBConnection_2", globalMap.get("conn_tDBConnection_2"));






        return connections;
    }

    private void evalParam(String arg) {
        if (arg.startsWith("--resuming_logs_dir_path")) {
            resuming_logs_dir_path = arg.substring(25);
        } else if (arg.startsWith("--resuming_checkpoint_path")) {
            resuming_checkpoint_path = arg.substring(27);
        } else if (arg.startsWith("--parent_part_launcher")) {
            parent_part_launcher = arg.substring(23);
        } else if (arg.startsWith("--watch")) {
            watch = true;
        } else if (arg.startsWith("--stat_port=")) {
            String portStatsStr = arg.substring(12);
            if (portStatsStr != null && !portStatsStr.equals("null")) {
                portStats = Integer.parseInt(portStatsStr);
            }
        } else if (arg.startsWith("--trace_port=")) {
            portTraces = Integer.parseInt(arg.substring(13));
        } else if (arg.startsWith("--client_host=")) {
            clientHost = arg.substring(14);
        } else if (arg.startsWith("--context=")) {
            contextStr = arg.substring(10);
            isDefaultContext = false;
        } else if (arg.startsWith("--father_pid=")) {
            fatherPid = arg.substring(13);
        } else if (arg.startsWith("--root_pid=")) {
            rootPid = arg.substring(11);
        } else if (arg.startsWith("--father_node=")) {
            fatherNode = arg.substring(14);
        } else if (arg.startsWith("--pid=")) {
            pid = arg.substring(6);
        } else if (arg.startsWith("--context_type")) {
            String keyValue = arg.substring(15);
			int index = -1;
            if (keyValue != null && (index = keyValue.indexOf('=')) > -1) {
                if (fatherPid==null) {
                    context_param.setContextType(keyValue.substring(0, index), replaceEscapeChars(keyValue.substring(index + 1)));
                } else { // the subjob won't escape the especial chars
                    context_param.setContextType(keyValue.substring(0, index), keyValue.substring(index + 1) );
                }

            }

		} else if (arg.startsWith("--context_param")) {
            String keyValue = arg.substring(16);
            int index = -1;
            if (keyValue != null && (index = keyValue.indexOf('=')) > -1) {
                if (fatherPid==null) {
                    context_param.put(keyValue.substring(0, index), replaceEscapeChars(keyValue.substring(index + 1)));
                } else { // the subjob won't escape the especial chars
                    context_param.put(keyValue.substring(0, index), keyValue.substring(index + 1) );
                }
            }
        } else if (arg.startsWith("--log4jLevel=")) {
            log4jLevel = arg.substring(13);
		} else if (arg.startsWith("--audit.enabled") && arg.contains("=")) {//for trunjob call
		    final int equal = arg.indexOf('=');
			final String key = arg.substring("--".length(), equal);
			System.setProperty(key, arg.substring(equal + 1));
		}
    }
    
    private static final String NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY = "<TALEND_NULL>";

    private final String[][] escapeChars = {
        {"\\\\","\\"},{"\\n","\n"},{"\\'","\'"},{"\\r","\r"},
        {"\\f","\f"},{"\\b","\b"},{"\\t","\t"}
        };
    private String replaceEscapeChars (String keyValue) {

		if (keyValue == null || ("").equals(keyValue.trim())) {
			return keyValue;
		}

		StringBuilder result = new StringBuilder();
		int currIndex = 0;
		while (currIndex < keyValue.length()) {
			int index = -1;
			// judege if the left string includes escape chars
			for (String[] strArray : escapeChars) {
				index = keyValue.indexOf(strArray[0],currIndex);
				if (index>=0) {

					result.append(keyValue.substring(currIndex, index + strArray[0].length()).replace(strArray[0], strArray[1]));
					currIndex = index + strArray[0].length();
					break;
				}
			}
			// if the left string doesn't include escape chars, append the left into the result
			if (index < 0) {
				result.append(keyValue.substring(currIndex));
				currIndex = currIndex + keyValue.length();
			}
		}

		return result.toString();
    }

    public Integer getErrorCode() {
        return errorCode;
    }


    public String getStatus() {
        return status;
    }

    ResumeUtil resumeUtil = null;
}
/************************************************************************************************
 *     320906 characters generated by Talend Open Studio for Data Integration 
 *     on the 26 février 2025 à 14:58:46 UTC
 ************************************************************************************************/