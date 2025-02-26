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


package warehouse.alimentation_dim_geographie_0_1;

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
 * Job: Alimentation_Dim_Geographie Purpose: <br>
 * Description:  <br>
 * @author user@talend.com
 * @version 8.0.1.20211109_1610
 * @status PROD
 */
public class Alimentation_Dim_Geographie implements TalendJob {

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
	private final String jobName = "Alimentation_Dim_Geographie";
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
				Alimentation_Dim_Geographie.this.exception = e;
			}
		}
		if (!(e instanceof TalendException)) {
		try {
			for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
				if (m.getName().compareTo(currentComponent + "_error") == 0) {
					m.invoke(Alimentation_Dim_Geographie.this, new Object[] { e , currentComponent, globalMap});
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
			
			public void tMap_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
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
			
			public void tDBInput_5_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_6_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_7_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
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
			
			public void tAdvancedHash_row4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_row5_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_row7_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_row8_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
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
	
	
		 
	final String decryptedPassword_tDBConnection_1 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:DIinSRt7jBMClt8SbkDRreMfXoccSaxPfwjqkvOtZ6209YgVBIXw+i+o");
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
	
	
		 
	final String decryptedPassword_tDBConnection_2 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:Mjx4F1xxU7XteScYXeBH7/ojAF2nbh+ZpEORkXyfMGcDlDm1PR4=");
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
	


public static class Update_Line_ExistingStruct implements routines.system.IPersistableRow<Update_Line_ExistingStruct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Geographie = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public long id_secteur;

				public long getId_secteur () {
					return this.id_secteur;
				}
				
			    public String region_commercial;

				public String getRegion_commercial () {
					return this.region_commercial;
				}
				
			    public String zone_supervision;

				public String getZone_supervision () {
					return this.zone_supervision;
				}
				
			    public String secteur;

				public String getSecteur () {
					return this.secteur;
				}
				
			    public String hub;

				public String getHub () {
					return this.hub;
				}
				
			    public String pays;

				public String getPays () {
					return this.pays;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
							result = prime * result + (int) this.id_secteur;
						
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
		final Update_Line_ExistingStruct other = (Update_Line_ExistingStruct) obj;
		
						if (this.id_secteur != other.id_secteur)
							return false;
					

		return true;
    }

	public void copyDataTo(Update_Line_ExistingStruct other) {

		other.id_secteur = this.id_secteur;
	            other.region_commercial = this.region_commercial;
	            other.zone_supervision = this.zone_supervision;
	            other.secteur = this.secteur;
	            other.hub = this.hub;
	            other.pays = this.pays;
	            
	}

	public void copyKeysDataTo(Update_Line_ExistingStruct other) {

		other.id_secteur = this.id_secteur;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie, 0, length, utf8Charset);
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
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie, 0, length, utf8Charset);
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

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Geographie) {

        	try {

        		int length = 0;
		
			        this.id_secteur = dis.readLong();
					
					this.region_commercial = readString(dis);
					
					this.zone_supervision = readString(dis);
					
					this.secteur = readString(dis);
					
					this.hub = readString(dis);
					
					this.pays = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Geographie) {

        	try {

        		int length = 0;
		
			        this.id_secteur = dis.readLong();
					
					this.region_commercial = readString(dis);
					
					this.zone_supervision = readString(dis);
					
					this.secteur = readString(dis);
					
					this.hub = readString(dis);
					
					this.pays = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id_secteur);
					
					// String
				
						writeString(this.region_commercial,dos);
					
					// String
				
						writeString(this.zone_supervision,dos);
					
					// String
				
						writeString(this.secteur,dos);
					
					// String
				
						writeString(this.hub,dos);
					
					// String
				
						writeString(this.pays,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id_secteur);
					
					// String
				
						writeString(this.region_commercial,dos);
					
					// String
				
						writeString(this.zone_supervision,dos);
					
					// String
				
						writeString(this.secteur,dos);
					
					// String
				
						writeString(this.hub,dos);
					
					// String
				
						writeString(this.pays,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id_secteur="+String.valueOf(id_secteur));
		sb.append(",region_commercial="+region_commercial);
		sb.append(",zone_supervision="+zone_supervision);
		sb.append(",secteur="+secteur);
		sb.append(",hub="+hub);
		sb.append(",pays="+pays);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(Update_Line_ExistingStruct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.id_secteur, other.id_secteur);
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

public static class row9Struct implements routines.system.IPersistableRow<row9Struct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Geographie = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public long id_secteur;

				public long getId_secteur () {
					return this.id_secteur;
				}
				
			    public String region_commercial;

				public String getRegion_commercial () {
					return this.region_commercial;
				}
				
			    public String zone_supervision;

				public String getZone_supervision () {
					return this.zone_supervision;
				}
				
			    public String secteur;

				public String getSecteur () {
					return this.secteur;
				}
				
			    public String hub;

				public String getHub () {
					return this.hub;
				}
				
			    public String pays;

				public String getPays () {
					return this.pays;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
							result = prime * result + (int) this.id_secteur;
						
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
		final row9Struct other = (row9Struct) obj;
		
						if (this.id_secteur != other.id_secteur)
							return false;
					

		return true;
    }

	public void copyDataTo(row9Struct other) {

		other.id_secteur = this.id_secteur;
	            other.region_commercial = this.region_commercial;
	            other.zone_supervision = this.zone_supervision;
	            other.secteur = this.secteur;
	            other.hub = this.hub;
	            other.pays = this.pays;
	            
	}

	public void copyKeysDataTo(row9Struct other) {

		other.id_secteur = this.id_secteur;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie, 0, length, utf8Charset);
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
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie, 0, length, utf8Charset);
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

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Geographie) {

        	try {

        		int length = 0;
		
			        this.id_secteur = dis.readLong();
					
					this.region_commercial = readString(dis);
					
					this.zone_supervision = readString(dis);
					
					this.secteur = readString(dis);
					
					this.hub = readString(dis);
					
					this.pays = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Geographie) {

        	try {

        		int length = 0;
		
			        this.id_secteur = dis.readLong();
					
					this.region_commercial = readString(dis);
					
					this.zone_supervision = readString(dis);
					
					this.secteur = readString(dis);
					
					this.hub = readString(dis);
					
					this.pays = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id_secteur);
					
					// String
				
						writeString(this.region_commercial,dos);
					
					// String
				
						writeString(this.zone_supervision,dos);
					
					// String
				
						writeString(this.secteur,dos);
					
					// String
				
						writeString(this.hub,dos);
					
					// String
				
						writeString(this.pays,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id_secteur);
					
					// String
				
						writeString(this.region_commercial,dos);
					
					// String
				
						writeString(this.zone_supervision,dos);
					
					// String
				
						writeString(this.secteur,dos);
					
					// String
				
						writeString(this.hub,dos);
					
					// String
				
						writeString(this.pays,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id_secteur="+String.valueOf(id_secteur));
		sb.append(",region_commercial="+region_commercial);
		sb.append(",zone_supervision="+zone_supervision);
		sb.append(",secteur="+secteur);
		sb.append(",hub="+hub);
		sb.append(",pays="+pays);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row9Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.id_secteur, other.id_secteur);
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
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Geographie = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public long id_secteur;

				public long getId_secteur () {
					return this.id_secteur;
				}
				
			    public String region_commercial;

				public String getRegion_commercial () {
					return this.region_commercial;
				}
				
			    public String zone_supervision;

				public String getZone_supervision () {
					return this.zone_supervision;
				}
				
			    public String secteur;

				public String getSecteur () {
					return this.secteur;
				}
				
			    public String hub;

				public String getHub () {
					return this.hub;
				}
				
			    public String pays;

				public String getPays () {
					return this.pays;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
							result = prime * result + (int) this.id_secteur;
						
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
		
						if (this.id_secteur != other.id_secteur)
							return false;
					

		return true;
    }

	public void copyDataTo(OnRowsEndStructtSortRow_2 other) {

		other.id_secteur = this.id_secteur;
	            other.region_commercial = this.region_commercial;
	            other.zone_supervision = this.zone_supervision;
	            other.secteur = this.secteur;
	            other.hub = this.hub;
	            other.pays = this.pays;
	            
	}

	public void copyKeysDataTo(OnRowsEndStructtSortRow_2 other) {

		other.id_secteur = this.id_secteur;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie, 0, length, utf8Charset);
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
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie, 0, length, utf8Charset);
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

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Geographie) {

        	try {

        		int length = 0;
		
			        this.id_secteur = dis.readLong();
					
					this.region_commercial = readString(dis);
					
					this.zone_supervision = readString(dis);
					
					this.secteur = readString(dis);
					
					this.hub = readString(dis);
					
					this.pays = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Geographie) {

        	try {

        		int length = 0;
		
			        this.id_secteur = dis.readLong();
					
					this.region_commercial = readString(dis);
					
					this.zone_supervision = readString(dis);
					
					this.secteur = readString(dis);
					
					this.hub = readString(dis);
					
					this.pays = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id_secteur);
					
					// String
				
						writeString(this.region_commercial,dos);
					
					// String
				
						writeString(this.zone_supervision,dos);
					
					// String
				
						writeString(this.secteur,dos);
					
					// String
				
						writeString(this.hub,dos);
					
					// String
				
						writeString(this.pays,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id_secteur);
					
					// String
				
						writeString(this.region_commercial,dos);
					
					// String
				
						writeString(this.zone_supervision,dos);
					
					// String
				
						writeString(this.secteur,dos);
					
					// String
				
						writeString(this.hub,dos);
					
					// String
				
						writeString(this.pays,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id_secteur="+String.valueOf(id_secteur));
		sb.append(",region_commercial="+region_commercial);
		sb.append(",zone_supervision="+zone_supervision);
		sb.append(",secteur="+secteur);
		sb.append(",hub="+hub);
		sb.append(",pays="+pays);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(OnRowsEndStructtSortRow_2 other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.id_secteur, other.id_secteur);
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
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Geographie = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public long id_secteur;

				public long getId_secteur () {
					return this.id_secteur;
				}
				
			    public String region_commercial;

				public String getRegion_commercial () {
					return this.region_commercial;
				}
				
			    public String zone_supervision;

				public String getZone_supervision () {
					return this.zone_supervision;
				}
				
			    public String secteur;

				public String getSecteur () {
					return this.secteur;
				}
				
			    public String hub;

				public String getHub () {
					return this.hub;
				}
				
			    public String pays;

				public String getPays () {
					return this.pays;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
							result = prime * result + (int) this.id_secteur;
						
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
		
						if (this.id_secteur != other.id_secteur)
							return false;
					

		return true;
    }

	public void copyDataTo(Insert_New_DataStruct other) {

		other.id_secteur = this.id_secteur;
	            other.region_commercial = this.region_commercial;
	            other.zone_supervision = this.zone_supervision;
	            other.secteur = this.secteur;
	            other.hub = this.hub;
	            other.pays = this.pays;
	            
	}

	public void copyKeysDataTo(Insert_New_DataStruct other) {

		other.id_secteur = this.id_secteur;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie, 0, length, utf8Charset);
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
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie, 0, length, utf8Charset);
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

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Geographie) {

        	try {

        		int length = 0;
		
			        this.id_secteur = dis.readLong();
					
					this.region_commercial = readString(dis);
					
					this.zone_supervision = readString(dis);
					
					this.secteur = readString(dis);
					
					this.hub = readString(dis);
					
					this.pays = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Geographie) {

        	try {

        		int length = 0;
		
			        this.id_secteur = dis.readLong();
					
					this.region_commercial = readString(dis);
					
					this.zone_supervision = readString(dis);
					
					this.secteur = readString(dis);
					
					this.hub = readString(dis);
					
					this.pays = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id_secteur);
					
					// String
				
						writeString(this.region_commercial,dos);
					
					// String
				
						writeString(this.zone_supervision,dos);
					
					// String
				
						writeString(this.secteur,dos);
					
					// String
				
						writeString(this.hub,dos);
					
					// String
				
						writeString(this.pays,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id_secteur);
					
					// String
				
						writeString(this.region_commercial,dos);
					
					// String
				
						writeString(this.zone_supervision,dos);
					
					// String
				
						writeString(this.secteur,dos);
					
					// String
				
						writeString(this.hub,dos);
					
					// String
				
						writeString(this.pays,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id_secteur="+String.valueOf(id_secteur));
		sb.append(",region_commercial="+region_commercial);
		sb.append(",zone_supervision="+zone_supervision);
		sb.append(",secteur="+secteur);
		sb.append(",hub="+hub);
		sb.append(",pays="+pays);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(Insert_New_DataStruct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.id_secteur, other.id_secteur);
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
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Geographie = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[0];

	
			    public long id_secteur;

				public long getId_secteur () {
					return this.id_secteur;
				}
				
			    public String zone_supervision;

				public String getZone_supervision () {
					return this.zone_supervision;
				}
				
			    public String region_commercial;

				public String getRegion_commercial () {
					return this.region_commercial;
				}
				
			    public String Secteur;

				public String getSecteur () {
					return this.Secteur;
				}
				
			    public String pays;

				public String getPays () {
					return this.pays;
				}
				
			    public String hub;

				public String getHub () {
					return this.hub;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie, 0, length, utf8Charset);
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
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie, 0, length, utf8Charset);
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

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Geographie) {

        	try {

        		int length = 0;
		
			        this.id_secteur = dis.readLong();
					
					this.zone_supervision = readString(dis);
					
					this.region_commercial = readString(dis);
					
					this.Secteur = readString(dis);
					
					this.pays = readString(dis);
					
					this.hub = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Geographie) {

        	try {

        		int length = 0;
		
			        this.id_secteur = dis.readLong();
					
					this.zone_supervision = readString(dis);
					
					this.region_commercial = readString(dis);
					
					this.Secteur = readString(dis);
					
					this.pays = readString(dis);
					
					this.hub = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id_secteur);
					
					// String
				
						writeString(this.zone_supervision,dos);
					
					// String
				
						writeString(this.region_commercial,dos);
					
					// String
				
						writeString(this.Secteur,dos);
					
					// String
				
						writeString(this.pays,dos);
					
					// String
				
						writeString(this.hub,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id_secteur);
					
					// String
				
						writeString(this.zone_supervision,dos);
					
					// String
				
						writeString(this.region_commercial,dos);
					
					// String
				
						writeString(this.Secteur,dos);
					
					// String
				
						writeString(this.pays,dos);
					
					// String
				
						writeString(this.hub,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id_secteur="+String.valueOf(id_secteur));
		sb.append(",zone_supervision="+zone_supervision);
		sb.append(",region_commercial="+region_commercial);
		sb.append(",Secteur="+Secteur);
		sb.append(",pays="+pays);
		sb.append(",hub="+hub);
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

public static class row10Struct implements routines.system.IPersistableRow<row10Struct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Geographie = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[0];

	
			    public long id_secteur;

				public long getId_secteur () {
					return this.id_secteur;
				}
				
			    public String zone_supervision;

				public String getZone_supervision () {
					return this.zone_supervision;
				}
				
			    public String region_commercial;

				public String getRegion_commercial () {
					return this.region_commercial;
				}
				
			    public String Secteur;

				public String getSecteur () {
					return this.Secteur;
				}
				
			    public String pays;

				public String getPays () {
					return this.pays;
				}
				
			    public String hub;

				public String getHub () {
					return this.hub;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie, 0, length, utf8Charset);
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
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie, 0, length, utf8Charset);
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

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Geographie) {

        	try {

        		int length = 0;
		
			        this.id_secteur = dis.readLong();
					
					this.zone_supervision = readString(dis);
					
					this.region_commercial = readString(dis);
					
					this.Secteur = readString(dis);
					
					this.pays = readString(dis);
					
					this.hub = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Geographie) {

        	try {

        		int length = 0;
		
			        this.id_secteur = dis.readLong();
					
					this.zone_supervision = readString(dis);
					
					this.region_commercial = readString(dis);
					
					this.Secteur = readString(dis);
					
					this.pays = readString(dis);
					
					this.hub = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id_secteur);
					
					// String
				
						writeString(this.zone_supervision,dos);
					
					// String
				
						writeString(this.region_commercial,dos);
					
					// String
				
						writeString(this.Secteur,dos);
					
					// String
				
						writeString(this.pays,dos);
					
					// String
				
						writeString(this.hub,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id_secteur);
					
					// String
				
						writeString(this.zone_supervision,dos);
					
					// String
				
						writeString(this.region_commercial,dos);
					
					// String
				
						writeString(this.Secteur,dos);
					
					// String
				
						writeString(this.pays,dos);
					
					// String
				
						writeString(this.hub,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id_secteur="+String.valueOf(id_secteur));
		sb.append(",zone_supervision="+zone_supervision);
		sb.append(",region_commercial="+region_commercial);
		sb.append(",Secteur="+Secteur);
		sb.append(",pays="+pays);
		sb.append(",hub="+hub);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row10Struct other) {

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
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Geographie = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public long id_secteur;

				public long getId_secteur () {
					return this.id_secteur;
				}
				
			    public String zone_supervision;

				public String getZone_supervision () {
					return this.zone_supervision;
				}
				
			    public String region_commercial;

				public String getRegion_commercial () {
					return this.region_commercial;
				}
				
			    public String Secteur;

				public String getSecteur () {
					return this.Secteur;
				}
				
			    public String pays;

				public String getPays () {
					return this.pays;
				}
				
			    public String hub;

				public String getHub () {
					return this.hub;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
							result = prime * result + (int) this.id_secteur;
						
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
		final OnRowsEndStructtSortRow_1 other = (OnRowsEndStructtSortRow_1) obj;
		
						if (this.id_secteur != other.id_secteur)
							return false;
					

		return true;
    }

	public void copyDataTo(OnRowsEndStructtSortRow_1 other) {

		other.id_secteur = this.id_secteur;
	            other.zone_supervision = this.zone_supervision;
	            other.region_commercial = this.region_commercial;
	            other.Secteur = this.Secteur;
	            other.pays = this.pays;
	            other.hub = this.hub;
	            
	}

	public void copyKeysDataTo(OnRowsEndStructtSortRow_1 other) {

		other.id_secteur = this.id_secteur;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie, 0, length, utf8Charset);
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
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie, 0, length, utf8Charset);
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

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Geographie) {

        	try {

        		int length = 0;
		
			        this.id_secteur = dis.readLong();
					
					this.zone_supervision = readString(dis);
					
					this.region_commercial = readString(dis);
					
					this.Secteur = readString(dis);
					
					this.pays = readString(dis);
					
					this.hub = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Geographie) {

        	try {

        		int length = 0;
		
			        this.id_secteur = dis.readLong();
					
					this.zone_supervision = readString(dis);
					
					this.region_commercial = readString(dis);
					
					this.Secteur = readString(dis);
					
					this.pays = readString(dis);
					
					this.hub = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id_secteur);
					
					// String
				
						writeString(this.zone_supervision,dos);
					
					// String
				
						writeString(this.region_commercial,dos);
					
					// String
				
						writeString(this.Secteur,dos);
					
					// String
				
						writeString(this.pays,dos);
					
					// String
				
						writeString(this.hub,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id_secteur);
					
					// String
				
						writeString(this.zone_supervision,dos);
					
					// String
				
						writeString(this.region_commercial,dos);
					
					// String
				
						writeString(this.Secteur,dos);
					
					// String
				
						writeString(this.pays,dos);
					
					// String
				
						writeString(this.hub,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id_secteur="+String.valueOf(id_secteur));
		sb.append(",zone_supervision="+zone_supervision);
		sb.append(",region_commercial="+region_commercial);
		sb.append(",Secteur="+Secteur);
		sb.append(",pays="+pays);
		sb.append(",hub="+hub);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(OnRowsEndStructtSortRow_1 other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.id_secteur, other.id_secteur);
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

public static class out2Struct implements routines.system.IPersistableRow<out2Struct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Geographie = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[0];

	
			    public long id_secteur;

				public long getId_secteur () {
					return this.id_secteur;
				}
				
			    public String zone_supervision;

				public String getZone_supervision () {
					return this.zone_supervision;
				}
				
			    public String region_commercial;

				public String getRegion_commercial () {
					return this.region_commercial;
				}
				
			    public String Secteur;

				public String getSecteur () {
					return this.Secteur;
				}
				
			    public String pays;

				public String getPays () {
					return this.pays;
				}
				
			    public String hub;

				public String getHub () {
					return this.hub;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie, 0, length, utf8Charset);
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
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie, 0, length, utf8Charset);
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

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Geographie) {

        	try {

        		int length = 0;
		
			        this.id_secteur = dis.readLong();
					
					this.zone_supervision = readString(dis);
					
					this.region_commercial = readString(dis);
					
					this.Secteur = readString(dis);
					
					this.pays = readString(dis);
					
					this.hub = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Geographie) {

        	try {

        		int length = 0;
		
			        this.id_secteur = dis.readLong();
					
					this.zone_supervision = readString(dis);
					
					this.region_commercial = readString(dis);
					
					this.Secteur = readString(dis);
					
					this.pays = readString(dis);
					
					this.hub = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id_secteur);
					
					// String
				
						writeString(this.zone_supervision,dos);
					
					// String
				
						writeString(this.region_commercial,dos);
					
					// String
				
						writeString(this.Secteur,dos);
					
					// String
				
						writeString(this.pays,dos);
					
					// String
				
						writeString(this.hub,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id_secteur);
					
					// String
				
						writeString(this.zone_supervision,dos);
					
					// String
				
						writeString(this.region_commercial,dos);
					
					// String
				
						writeString(this.Secteur,dos);
					
					// String
				
						writeString(this.pays,dos);
					
					// String
				
						writeString(this.hub,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id_secteur="+String.valueOf(id_secteur));
		sb.append(",zone_supervision="+zone_supervision);
		sb.append(",region_commercial="+region_commercial);
		sb.append(",Secteur="+Secteur);
		sb.append(",pays="+pays);
		sb.append(",hub="+hub);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(out2Struct other) {

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
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Geographie = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[0];

	
			    public long id_secteur;

				public long getId_secteur () {
					return this.id_secteur;
				}
				
			    public String zone_supervision;

				public String getZone_supervision () {
					return this.zone_supervision;
				}
				
			    public String region_commercial;

				public String getRegion_commercial () {
					return this.region_commercial;
				}
				
			    public String Secteur;

				public String getSecteur () {
					return this.Secteur;
				}
				
			    public Long depot_id;

				public Long getDepot_id () {
					return this.depot_id;
				}
				
			    public Long country_id;

				public Long getCountry_id () {
					return this.country_id;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie, 0, length, utf8Charset);
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
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie, 0, length, utf8Charset);
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

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Geographie) {

        	try {

        		int length = 0;
		
			        this.id_secteur = dis.readLong();
					
					this.zone_supervision = readString(dis);
					
					this.region_commercial = readString(dis);
					
					this.Secteur = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.depot_id = null;
           				} else {
           			    	this.depot_id = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.country_id = null;
           				} else {
           			    	this.country_id = dis.readLong();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Geographie) {

        	try {

        		int length = 0;
		
			        this.id_secteur = dis.readLong();
					
					this.zone_supervision = readString(dis);
					
					this.region_commercial = readString(dis);
					
					this.Secteur = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.depot_id = null;
           				} else {
           			    	this.depot_id = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.country_id = null;
           				} else {
           			    	this.country_id = dis.readLong();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id_secteur);
					
					// String
				
						writeString(this.zone_supervision,dos);
					
					// String
				
						writeString(this.region_commercial,dos);
					
					// String
				
						writeString(this.Secteur,dos);
					
					// Long
				
						if(this.depot_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.depot_id);
		            	}
					
					// Long
				
						if(this.country_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.country_id);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id_secteur);
					
					// String
				
						writeString(this.zone_supervision,dos);
					
					// String
				
						writeString(this.region_commercial,dos);
					
					// String
				
						writeString(this.Secteur,dos);
					
					// Long
				
						if(this.depot_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.depot_id);
		            	}
					
					// Long
				
						if(this.country_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.country_id);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id_secteur="+String.valueOf(id_secteur));
		sb.append(",zone_supervision="+zone_supervision);
		sb.append(",region_commercial="+region_commercial);
		sb.append(",Secteur="+Secteur);
		sb.append(",depot_id="+String.valueOf(depot_id));
		sb.append(",country_id="+String.valueOf(country_id));
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
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Geographie = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[0];

	
			    public long id;

				public long getId () {
					return this.id;
				}
				
			    public String label;

				public String getLabel () {
					return this.label;
				}
				
			    public String currency;

				public String getCurrency () {
					return this.currency;
				}
				
			    public java.util.Date created_at;

				public java.util.Date getCreated_at () {
					return this.created_at;
				}
				
			    public java.util.Date updated_at;

				public java.util.Date getUpdated_at () {
					return this.updated_at;
				}
				
			    public String code_color;

				public String getCode_color () {
					return this.code_color;
				}
				
			    public Long zone_supervisor_id;

				public Long getZone_supervisor_id () {
					return this.zone_supervisor_id;
				}
				
			    public Boolean activate;

				public Boolean getActivate () {
					return this.activate;
				}
				
			    public String canal;

				public String getCanal () {
					return this.canal;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie, 0, length, utf8Charset);
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
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Geographie) {

        	try {

        		int length = 0;
		
			        this.id = dis.readLong();
					
					this.label = readString(dis);
					
					this.currency = readString(dis);
					
					this.created_at = readDate(dis);
					
					this.updated_at = readDate(dis);
					
					this.code_color = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.zone_supervisor_id = null;
           				} else {
           			    	this.zone_supervisor_id = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.activate = null;
           				} else {
           			    	this.activate = dis.readBoolean();
           				}
					
					this.canal = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Geographie) {

        	try {

        		int length = 0;
		
			        this.id = dis.readLong();
					
					this.label = readString(dis);
					
					this.currency = readString(dis);
					
					this.created_at = readDate(dis);
					
					this.updated_at = readDate(dis);
					
					this.code_color = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.zone_supervisor_id = null;
           				} else {
           			    	this.zone_supervisor_id = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.activate = null;
           				} else {
           			    	this.activate = dis.readBoolean();
           				}
					
					this.canal = readString(dis);
					
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
				
						writeString(this.label,dos);
					
					// String
				
						writeString(this.currency,dos);
					
					// java.util.Date
				
						writeDate(this.created_at,dos);
					
					// java.util.Date
				
						writeDate(this.updated_at,dos);
					
					// String
				
						writeString(this.code_color,dos);
					
					// Long
				
						if(this.zone_supervisor_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.zone_supervisor_id);
		            	}
					
					// Boolean
				
						if(this.activate == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.activate);
		            	}
					
					// String
				
						writeString(this.canal,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id);
					
					// String
				
						writeString(this.label,dos);
					
					// String
				
						writeString(this.currency,dos);
					
					// java.util.Date
				
						writeDate(this.created_at,dos);
					
					// java.util.Date
				
						writeDate(this.updated_at,dos);
					
					// String
				
						writeString(this.code_color,dos);
					
					// Long
				
						if(this.zone_supervisor_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.zone_supervisor_id);
		            	}
					
					// Boolean
				
						if(this.activate == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.activate);
		            	}
					
					// String
				
						writeString(this.canal,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id="+String.valueOf(id));
		sb.append(",label="+label);
		sb.append(",currency="+currency);
		sb.append(",created_at="+String.valueOf(created_at));
		sb.append(",updated_at="+String.valueOf(updated_at));
		sb.append(",code_color="+code_color);
		sb.append(",zone_supervisor_id="+String.valueOf(zone_supervisor_id));
		sb.append(",activate="+String.valueOf(activate));
		sb.append(",canal="+canal);
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
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Geographie = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[0];

	
			    public long id;

				public long getId () {
					return this.id;
				}
				
			    public String label;

				public String getLabel () {
					return this.label;
				}
				
			    public String currency;

				public String getCurrency () {
					return this.currency;
				}
				
			    public java.util.Date created_at;

				public java.util.Date getCreated_at () {
					return this.created_at;
				}
				
			    public java.util.Date updated_at;

				public java.util.Date getUpdated_at () {
					return this.updated_at;
				}
				
			    public String code_color;

				public String getCode_color () {
					return this.code_color;
				}
				
			    public Long zone_supervisor_id;

				public Long getZone_supervisor_id () {
					return this.zone_supervisor_id;
				}
				
			    public Boolean activate;

				public Boolean getActivate () {
					return this.activate;
				}
				
			    public String canal;

				public String getCanal () {
					return this.canal;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie, 0, length, utf8Charset);
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
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Geographie) {

        	try {

        		int length = 0;
		
			        this.id = dis.readLong();
					
					this.label = readString(dis);
					
					this.currency = readString(dis);
					
					this.created_at = readDate(dis);
					
					this.updated_at = readDate(dis);
					
					this.code_color = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.zone_supervisor_id = null;
           				} else {
           			    	this.zone_supervisor_id = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.activate = null;
           				} else {
           			    	this.activate = dis.readBoolean();
           				}
					
					this.canal = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Geographie) {

        	try {

        		int length = 0;
		
			        this.id = dis.readLong();
					
					this.label = readString(dis);
					
					this.currency = readString(dis);
					
					this.created_at = readDate(dis);
					
					this.updated_at = readDate(dis);
					
					this.code_color = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.zone_supervisor_id = null;
           				} else {
           			    	this.zone_supervisor_id = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.activate = null;
           				} else {
           			    	this.activate = dis.readBoolean();
           				}
					
					this.canal = readString(dis);
					
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
				
						writeString(this.label,dos);
					
					// String
				
						writeString(this.currency,dos);
					
					// java.util.Date
				
						writeDate(this.created_at,dos);
					
					// java.util.Date
				
						writeDate(this.updated_at,dos);
					
					// String
				
						writeString(this.code_color,dos);
					
					// Long
				
						if(this.zone_supervisor_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.zone_supervisor_id);
		            	}
					
					// Boolean
				
						if(this.activate == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.activate);
		            	}
					
					// String
				
						writeString(this.canal,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id);
					
					// String
				
						writeString(this.label,dos);
					
					// String
				
						writeString(this.currency,dos);
					
					// java.util.Date
				
						writeDate(this.created_at,dos);
					
					// java.util.Date
				
						writeDate(this.updated_at,dos);
					
					// String
				
						writeString(this.code_color,dos);
					
					// Long
				
						if(this.zone_supervisor_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.zone_supervisor_id);
		            	}
					
					// Boolean
				
						if(this.activate == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.activate);
		            	}
					
					// String
				
						writeString(this.canal,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id="+String.valueOf(id));
		sb.append(",label="+label);
		sb.append(",currency="+currency);
		sb.append(",created_at="+String.valueOf(created_at));
		sb.append(",updated_at="+String.valueOf(updated_at));
		sb.append(",code_color="+code_color);
		sb.append(",zone_supervisor_id="+String.valueOf(zone_supervisor_id));
		sb.append(",activate="+String.valueOf(activate));
		sb.append(",canal="+canal);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(after_tDBInput_1Struct other) {

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


		tDBInput_3Process(globalMap);
		tDBInput_4Process(globalMap);
		tDBInput_5Process(globalMap);
		tDBInput_6Process(globalMap);
		tDBInput_2Process(globalMap);
		tDBInput_7Process(globalMap);

		row1Struct row1 = new row1Struct();
out1Struct out1 = new out1Struct();
out2Struct out2 = new out2Struct();
row10Struct row10 = new row10Struct();
Insert_New_DataStruct Insert_New_Data = new Insert_New_DataStruct();
row9Struct row9 = new row9Struct();
Update_DataStruct Update_Data = new Update_DataStruct();
Update_Line_ExistingStruct Update_Line_Existing = new Update_Line_ExistingStruct();






	
	/**
	 * [tSortRow_1_SortOut begin ] start
	 */

	

	
		
		ok_Hash.put("tSortRow_1_SortOut", false);
		start_Hash.put("tSortRow_1_SortOut", System.currentTimeMillis());
		
	
		currentVirtualComponent = "tSortRow_1";
	
	currentComponent="tSortRow_1_SortOut";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"out2");
					}
				
		int tos_count_tSortRow_1_SortOut = 0;
		


class Comparableout2Struct extends out2Struct implements Comparable<Comparableout2Struct> {
	
	public int compareTo(Comparableout2Struct other) {

		if(this.zone_supervision == null && other.zone_supervision != null){
			return -1;
						
		}else if(this.zone_supervision != null && other.zone_supervision == null){
			return 1;
						
		}else if(this.zone_supervision != null && other.zone_supervision != null){
			if(!this.zone_supervision.equals(other.zone_supervision)){
				return this.zone_supervision.compareTo(other.zone_supervision);
			}
		}
		return 0;
	}
}

java.util.List<Comparableout2Struct> list_tSortRow_1_SortOut = new java.util.ArrayList<Comparableout2Struct>();


 



/**
 * [tSortRow_1_SortOut begin ] stop
 */



	
	/**
	 * [tMap_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_2", false);
		start_Hash.put("tMap_2", System.currentTimeMillis());
		
	
	currentComponent="tMap_2";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"out1");
					}
				
		int tos_count_tMap_2 = 0;
		




// ###############################
// # Lookup's keys initialization
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row4Struct> tHash_Lookup_row4 = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row4Struct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row4Struct>) 
					globalMap.get( "tHash_Lookup_row4" ))
					;					
					
	

row4Struct row4HashKey = new row4Struct();
row4Struct row4Default = new row4Struct();
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row5Struct> tHash_Lookup_row5 = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row5Struct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row5Struct>) 
					globalMap.get( "tHash_Lookup_row5" ))
					;					
					
	

row5Struct row5HashKey = new row5Struct();
row5Struct row5Default = new row5Struct();
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_2__Struct  {
}
Var__tMap_2__Struct Var__tMap_2 = new Var__tMap_2__Struct();
// ###############################

// ###############################
// # Outputs initialization
out2Struct out2_tmp = new out2Struct();
// ###############################

        
        



        









 



/**
 * [tMap_2 begin ] stop
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
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row3Struct> tHash_Lookup_row3 = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row3Struct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row3Struct>) 
					globalMap.get( "tHash_Lookup_row3" ))
					;					
					
	

row3Struct row3HashKey = new row3Struct();
row3Struct row3Default = new row3Struct();
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_1__Struct  {
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
				
				 
	final String decryptedPassword_tDBInput_1 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:LDClNPImszFdCsqbAMoo8rJSR36LTd4oqu7yz0IxHShgNpCw9Ux3DwZN");
				
				String dbPwd_tDBInput_1 = decryptedPassword_tDBInput_1;
				
				String url_tDBInput_1 = "jdbc:postgresql://" + "leuk.laiterieduberger.sn" + ":" + "5432" + "/" + "leuk_webapp_production";
				
				conn_tDBInput_1 = java.sql.DriverManager.getConnection(url_tDBInput_1,dbUser_tDBInput_1,dbPwd_tDBInput_1);
		        
				conn_tDBInput_1.setAutoCommit(false);
			
		    
			java.sql.Statement stmt_tDBInput_1 = conn_tDBInput_1.createStatement();

		    String dbquery_tDBInput_1 = "SELECT \n  \"public\".\"sectors\".\"id\", \n  \"public\".\"sectors\".\"label\", \n  \"public\".\"sectors\".\"currency\", \n"
+"  \"public\".\"sectors\".\"created_at\", \n  \"public\".\"sectors\".\"updated_at\", \n  \"public\".\"sectors\".\"code_colo"
+"r\", \n  \"public\".\"sectors\".\"zone_supervisor_id\", \n  \"public\".\"sectors\".\"activate\", \n  \"public\".\"sectors\""
+".\"canal\"\nFROM \"public\".\"sectors\"\n--where \"public\".\"sectors\".\"label\" not in ('Teste')";
		    

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
								row1.label = null;
							} else {
	                         		
        	row1.label = routines.system.JDBCUtil.getString(rs_tDBInput_1, 2, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 3) {
								row1.currency = null;
							} else {
	                         		
        	row1.currency = routines.system.JDBCUtil.getString(rs_tDBInput_1, 3, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 4) {
								row1.created_at = null;
							} else {
										
			row1.created_at = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 4);
		                    }
							if(colQtyInRs_tDBInput_1 < 5) {
								row1.updated_at = null;
							} else {
										
			row1.updated_at = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 5);
		                    }
							if(colQtyInRs_tDBInput_1 < 6) {
								row1.code_color = null;
							} else {
	                         		
        	row1.code_color = routines.system.JDBCUtil.getString(rs_tDBInput_1, 6, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 7) {
								row1.zone_supervisor_id = null;
							} else {
		                          
            row1.zone_supervisor_id = rs_tDBInput_1.getLong(7);
            if(rs_tDBInput_1.wasNull()){
                    row1.zone_supervisor_id = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 8) {
								row1.activate = null;
							} else {
	                         		
            row1.activate = rs_tDBInput_1.getBoolean(8);
            if(rs_tDBInput_1.wasNull()){
                    row1.activate = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 9) {
								row1.canal = null;
							} else {
	                         		
        	row1.canal = routines.system.JDBCUtil.getString(rs_tDBInput_1, 9, false);
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
								
	                        		    	Object exprKeyValue_row2__id = row1.zone_supervisor_id ;
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
							
							
							
			  							
								
	                    		  	
		                    
	            	
	           	
	            	
	            	
	            

				///////////////////////////////////////////////
				// Starting Lookup Table "row3" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLooprow3 = false;
       		  	    	
       		  	    	
 							row3Struct row3ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_1) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_1 = false;
								
	                        		    	Object exprKeyValue_row3__id = row2.region_commercial_id ;
	                        		    	if(exprKeyValue_row3__id == null) {
	                        		    		hasCasePrimitiveKeyWithNull_tMap_1 = true;
	                        		    	} else {
                        		    			row3HashKey.id = (long)(Long) exprKeyValue_row3__id;
                        		    		}
                        		    		

								
		                        	row3HashKey.hashCodeDirty = true;
                        		
	  					
	  							
	
		  							if(!hasCasePrimitiveKeyWithNull_tMap_1) { // G_TM_M_091
		  							
			  					
			  					
			  					
	  					
		  							tHash_Lookup_row3.lookup( row3HashKey );

	  							

	  							

			  						} // G_TM_M_091
			  						
			  					

 								
								  
								  if(hasCasePrimitiveKeyWithNull_tMap_1 || !tHash_Lookup_row3.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_1 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row3 != null && tHash_Lookup_row3.getCount(row3HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row3' and it contains more one result from keys :  row3.id = '" + row3HashKey.id + "'");
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
        
Var__tMap_1__Struct Var = Var__tMap_1;// ###############################
        // ###############################
        // # Output tables

out1 = null;

if(!rejectedInnerJoin_tMap_1 ) {

// # Output table : 'out1'
out1_tmp.id_secteur = row1.id;
out1_tmp.zone_supervision = row2.label ;
out1_tmp.region_commercial = row3.label ;
out1_tmp.Secteur = row1.label ;
out1_tmp.depot_id = row2.depot_id ;
out1_tmp.country_id = row3.country_id ;
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
	 * [tMap_2 main ] start
	 */

	

	
	
	currentComponent="tMap_2";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"out1"
						
						);
					}
					

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_2 = false;
		

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_2 = false;
		  boolean mainRowRejected_tMap_2 = false;
            				    								  
		

				///////////////////////////////////////////////
				// Starting Lookup Table "row4" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLooprow4 = false;
       		  	    	
       		  	    	
 							row4Struct row4ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_2) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_2 = false;
								
	                        		    	Object exprKeyValue_row4__id = out1.country_id ;
	                        		    	if(exprKeyValue_row4__id == null) {
	                        		    		hasCasePrimitiveKeyWithNull_tMap_2 = true;
	                        		    	} else {
                        		    			row4HashKey.id = (long)(Long) exprKeyValue_row4__id;
                        		    		}
                        		    		

								
		                        	row4HashKey.hashCodeDirty = true;
                        		
	  					
	  							
	
		  							if(!hasCasePrimitiveKeyWithNull_tMap_2) { // G_TM_M_091
		  							
			  					
			  					
			  					
	  					
		  							tHash_Lookup_row4.lookup( row4HashKey );

	  							

	  							

			  						} // G_TM_M_091
			  						
			  					

 								
								  
								  if(hasCasePrimitiveKeyWithNull_tMap_2 || !tHash_Lookup_row4.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_2 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row4 != null && tHash_Lookup_row4.getCount(row4HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row4' and it contains more one result from keys :  row4.id = '" + row4HashKey.id + "'");
								} // G 071
							

							row4Struct row4 = null;
                    		  	 
							   
                    		  	 
	       		  	    	row4Struct fromLookup_row4 = null;
							row4 = row4Default;
										 
							
								 
							
							
								if (tHash_Lookup_row4 !=null && tHash_Lookup_row4.hasNext()) { // G 099
								
							
								
								fromLookup_row4 = tHash_Lookup_row4.next();

							
							
								} // G 099
							
							

							if(fromLookup_row4 != null) {
								row4 = fromLookup_row4;
							}
							
							
							
			  							
								
	                    		  	
		                    
	            	
	           	
	            	
	            	
	            

				///////////////////////////////////////////////
				// Starting Lookup Table "row5" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLooprow5 = false;
       		  	    	
       		  	    	
 							row5Struct row5ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_2) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_2 = false;
								
	                        		    	Object exprKeyValue_row5__id = out1.depot_id ;
	                        		    	if(exprKeyValue_row5__id == null) {
	                        		    		hasCasePrimitiveKeyWithNull_tMap_2 = true;
	                        		    	} else {
                        		    			row5HashKey.id = (long)(Long) exprKeyValue_row5__id;
                        		    		}
                        		    		

								
		                        	row5HashKey.hashCodeDirty = true;
                        		
	  					
	  							
	
		  							if(!hasCasePrimitiveKeyWithNull_tMap_2) { // G_TM_M_091
		  							
			  					
			  					
			  					
	  					
		  							tHash_Lookup_row5.lookup( row5HashKey );

	  							

	  							

			  						} // G_TM_M_091
			  						
			  					

 								
								  
								  if(hasCasePrimitiveKeyWithNull_tMap_2 || !tHash_Lookup_row5.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_2 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row5 != null && tHash_Lookup_row5.getCount(row5HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row5' and it contains more one result from keys :  row5.id = '" + row5HashKey.id + "'");
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
        
Var__tMap_2__Struct Var = Var__tMap_2;// ###############################
        // ###############################
        // # Output tables

out2 = null;

if(!rejectedInnerJoin_tMap_2 ) {

// # Output table : 'out2'
out2_tmp.id_secteur = out1.id_secteur ;
out2_tmp.zone_supervision = StringHandling.UPCASE(out1.zone_supervision) ;
out2_tmp.region_commercial = StringHandling.UPCASE(out1.region_commercial) ;
out2_tmp.Secteur = out1.Secteur ;
out2_tmp.pays = StringHandling.UPCASE(row4.name) ;
out2_tmp.hub = StringHandling.UPCASE(row5.name) ;
out2 = out2_tmp;
}  // closing inner join bracket (2)
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
// Start of branch "out2"
if(out2 != null) { 



	
	/**
	 * [tSortRow_1_SortOut main ] start
	 */

	

	
	
		currentVirtualComponent = "tSortRow_1";
	
	currentComponent="tSortRow_1_SortOut";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"out2"
						
						);
					}
					



	Comparableout2Struct arrayRowtSortRow_1_SortOut = new Comparableout2Struct();

	arrayRowtSortRow_1_SortOut.id_secteur = out2.id_secteur;
	arrayRowtSortRow_1_SortOut.zone_supervision = out2.zone_supervision;
	arrayRowtSortRow_1_SortOut.region_commercial = out2.region_commercial;
	arrayRowtSortRow_1_SortOut.Secteur = out2.Secteur;
	arrayRowtSortRow_1_SortOut.pays = out2.pays;
	arrayRowtSortRow_1_SortOut.hub = out2.hub;	
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

} // End of branch "out2"




	
	/**
	 * [tMap_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_2";

	

 



/**
 * [tMap_2 process_data_end ] stop
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

					
					
				
					if(tHash_Lookup_row3 != null) {
						tHash_Lookup_row3.endGet();
					}
					globalMap.remove( "tHash_Lookup_row3" );

					
					
				
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
	 * [tMap_2 end ] start
	 */

	

	
	
	currentComponent="tMap_2";

	


// ###############################
// # Lookup hashes releasing
					if(tHash_Lookup_row4 != null) {
						tHash_Lookup_row4.endGet();
					}
					globalMap.remove( "tHash_Lookup_row4" );

					
					
				
					if(tHash_Lookup_row5 != null) {
						tHash_Lookup_row5.endGet();
					}
					globalMap.remove( "tHash_Lookup_row5" );

					
					
				
// ###############################      





				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"out1");
			  	}
			  	
 

ok_Hash.put("tMap_2", true);
end_Hash.put("tMap_2", System.currentTimeMillis());




/**
 * [tMap_2 end ] stop
 */

	
	/**
	 * [tSortRow_1_SortOut end ] start
	 */

	

	
	
		currentVirtualComponent = "tSortRow_1";
	
	currentComponent="tSortRow_1_SortOut";

	

out2Struct[] array_tSortRow_1_SortOut = list_tSortRow_1_SortOut.toArray(new Comparableout2Struct[0]);

java.util.Arrays.sort(array_tSortRow_1_SortOut);

globalMap.put("tSortRow_1",array_tSortRow_1_SortOut);


				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"out2");
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

		return 0;
	}
}

java.util.List<ComparableInsert_New_DataStruct> list_tSortRow_2_SortOut = new java.util.ArrayList<ComparableInsert_New_DataStruct>();


 



/**
 * [tSortRow_2_SortOut begin ] stop
 */





	
	/**
	 * [tDBOutput_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_2", false);
		start_Hash.put("tDBOutput_2", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_2";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"Update_Line_Existing");
					}
				
		int tos_count_tDBOutput_2 = 0;
		





String dbschema_tDBOutput_2 = null;
	dbschema_tDBOutput_2 = "public";
	

String tableName_tDBOutput_2 = null;
if(dbschema_tDBOutput_2 == null || dbschema_tDBOutput_2.trim().length() == 0) {
	tableName_tDBOutput_2 = ("Dim_Geographie");
} else {
	tableName_tDBOutput_2 = dbschema_tDBOutput_2 + "\".\"" + ("Dim_Geographie");
}

        int updateKeyCount_tDBOutput_2 = 1;
        if(updateKeyCount_tDBOutput_2 < 1) {
            throw new RuntimeException("For update, Schema must have a key");
        } else if (updateKeyCount_tDBOutput_2 == 6 && true) {        
                throw new RuntimeException("For update, every Schema column can not be a key");
        }

int nb_line_tDBOutput_2 = 0;
int nb_line_update_tDBOutput_2 = 0;
int nb_line_inserted_tDBOutput_2 = 0;
int nb_line_deleted_tDBOutput_2 = 0;
int nb_line_rejected_tDBOutput_2 = 0;

int deletedCount_tDBOutput_2=0;
int updatedCount_tDBOutput_2=0;
int insertedCount_tDBOutput_2=0;
int rowsToCommitCount_tDBOutput_2=0;
int rejectedCount_tDBOutput_2=0;

boolean whetherReject_tDBOutput_2 = false;

java.sql.Connection conn_tDBOutput_2 = null;
String dbUser_tDBOutput_2 = null;

	
    java.lang.Class.forName("org.postgresql.Driver");
    
        String url_tDBOutput_2 = "jdbc:postgresql://"+"163.172.166.119"+":"+"5432"+"/"+"leuk_analytics";
    dbUser_tDBOutput_2 = "malick.diouf";
 
	final String decryptedPassword_tDBOutput_2 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:jTisEqmZ8YFFoSCnu7dIbGI+vU/FcD0H1605k14tpX22gLwGWFw=");

    String dbPwd_tDBOutput_2 = decryptedPassword_tDBOutput_2;

    conn_tDBOutput_2 = java.sql.DriverManager.getConnection(url_tDBOutput_2,dbUser_tDBOutput_2,dbPwd_tDBOutput_2);
	
	resourceMap.put("conn_tDBOutput_2", conn_tDBOutput_2);
        conn_tDBOutput_2.setAutoCommit(false);
        int commitEvery_tDBOutput_2 = 10000;
        int commitCounter_tDBOutput_2 = 0;


   int batchSize_tDBOutput_2 = 10000;
   int batchSizeCounter_tDBOutput_2=0;

int count_tDBOutput_2=0;
	    String update_tDBOutput_2 = "UPDATE \"" + tableName_tDBOutput_2 + "\" SET \"region_commercial\" = ?,\"zone_supervision\" = ?,\"secteur\" = ?,\"hub\" = ?,\"pays\" = ? WHERE \"id_secteur\" = ?";
	    java.sql.PreparedStatement pstmt_tDBOutput_2 = conn_tDBOutput_2.prepareStatement(update_tDBOutput_2);
	    resourceMap.put("pstmt_tDBOutput_2", pstmt_tDBOutput_2);
	    

 



/**
 * [tDBOutput_2 begin ] stop
 */



	
	/**
	 * [tMap_4 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_4", false);
		start_Hash.put("tMap_4", System.currentTimeMillis());
		
	
	currentComponent="tMap_4";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"Update_Data");
					}
				
		int tos_count_tMap_4 = 0;
		




// ###############################
// # Lookup's keys initialization
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row8Struct> tHash_Lookup_row8 = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row8Struct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row8Struct>) 
					globalMap.get( "tHash_Lookup_row8" ))
					;					
					
	

row8Struct row8HashKey = new row8Struct();
row8Struct row8Default = new row8Struct();
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_4__Struct  {
}
Var__tMap_4__Struct Var__tMap_4 = new Var__tMap_4__Struct();
// ###############################

// ###############################
// # Outputs initialization
Update_Line_ExistingStruct Update_Line_Existing_tmp = new Update_Line_ExistingStruct();
// ###############################

        
        



        









 



/**
 * [tMap_4 begin ] stop
 */



	
	/**
	 * [tMap_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_3", false);
		start_Hash.put("tMap_3", System.currentTimeMillis());
		
	
	currentComponent="tMap_3";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row10");
					}
				
		int tos_count_tMap_3 = 0;
		




// ###############################
// # Lookup's keys initialization
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row7Struct> tHash_Lookup_row7 = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row7Struct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row7Struct>) 
					globalMap.get( "tHash_Lookup_row7" ))
					;					
					
	

row7Struct row7HashKey = new row7Struct();
row7Struct row7Default = new row7Struct();
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_3__Struct  {
}
Var__tMap_3__Struct Var__tMap_3 = new Var__tMap_3__Struct();
// ###############################

// ###############################
// # Outputs initialization
Insert_New_DataStruct Insert_New_Data_tmp = new Insert_New_DataStruct();
Update_DataStruct Update_Data_tmp = new Update_DataStruct();
// ###############################

        
        



        









 



/**
 * [tMap_3 begin ] stop
 */



	
	/**
	 * [tSortRow_1_SortIn begin ] start
	 */

	

	
		
		ok_Hash.put("tSortRow_1_SortIn", false);
		start_Hash.put("tSortRow_1_SortIn", System.currentTimeMillis());
		
	
		currentVirtualComponent = "tSortRow_1";
	
	currentComponent="tSortRow_1_SortIn";

	
		int tos_count_tSortRow_1_SortIn = 0;
		


out2Struct[] array_tSortRow_1_SortIn = (out2Struct[]) globalMap.remove("tSortRow_1");

int nb_line_tSortRow_1_SortIn = 0;

out2Struct current_tSortRow_1_SortIn = null;

for(int i_tSortRow_1_SortIn = 0; i_tSortRow_1_SortIn < array_tSortRow_1_SortIn.length; i_tSortRow_1_SortIn++){
	current_tSortRow_1_SortIn = array_tSortRow_1_SortIn[i_tSortRow_1_SortIn];
	row10.id_secteur = current_tSortRow_1_SortIn.id_secteur;
	row10.zone_supervision = current_tSortRow_1_SortIn.zone_supervision;
	row10.region_commercial = current_tSortRow_1_SortIn.region_commercial;
	row10.Secteur = current_tSortRow_1_SortIn.Secteur;
	row10.pays = current_tSortRow_1_SortIn.pays;
	row10.hub = current_tSortRow_1_SortIn.hub;
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
	 * [tMap_3 main ] start
	 */

	

	
	
	currentComponent="tMap_3";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row10"
						
						);
					}
					

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_3 = false;
		

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_3 = false;
		  boolean mainRowRejected_tMap_3 = false;
            				    								  
		

				///////////////////////////////////////////////
				// Starting Lookup Table "row7" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLooprow7 = false;
       		  	    	
       		  	    	
 							row7Struct row7ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_3) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_3 = false;
								
	                        		    	Object exprKeyValue_row7__id_secteur = row10.id_secteur ;
	                        		    	if(exprKeyValue_row7__id_secteur == null) {
	                        		    		hasCasePrimitiveKeyWithNull_tMap_3 = true;
	                        		    	} else {
                        		    			row7HashKey.id_secteur = (long)(Long) exprKeyValue_row7__id_secteur;
                        		    		}
                        		    		

								
		                        	row7HashKey.hashCodeDirty = true;
                        		
	  					
	  							
	
		  							if(!hasCasePrimitiveKeyWithNull_tMap_3) { // G_TM_M_091
		  							
			  					
			  					
			  					
	  					
		  							tHash_Lookup_row7.lookup( row7HashKey );

	  							

	  							

			  						} // G_TM_M_091
			  						
			  					

 								
								  
								  if(hasCasePrimitiveKeyWithNull_tMap_3 || !tHash_Lookup_row7.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_3 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row7 != null && tHash_Lookup_row7.getCount(row7HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row7' and it contains more one result from keys :  row7.id_secteur = '" + row7HashKey.id_secteur + "'");
								} // G 071
							

							row7Struct row7 = null;
                    		  	 
							   
                    		  	 
	       		  	    	row7Struct fromLookup_row7 = null;
							row7 = row7Default;
										 
							
								 
							
							
								if (tHash_Lookup_row7 !=null && tHash_Lookup_row7.hasNext()) { // G 099
								
							
								
								fromLookup_row7 = tHash_Lookup_row7.next();

							
							
								} // G 099
							
							

							if(fromLookup_row7 != null) {
								row7 = fromLookup_row7;
							}
							
							
							
			  							
								
	                    		  	
		                    
	            	
	            	
	            // ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_3__Struct Var = Var__tMap_3;// ###############################
        // ###############################
        // # Output tables

Update_Data = null;
Insert_New_Data = null;

if(!rejectedInnerJoin_tMap_3 ) {

// # Output table : 'Update_Data'
Update_Data_tmp.id_secteur = row10.id_secteur ;
Update_Data_tmp.zone_supervision = row10.zone_supervision ;
Update_Data_tmp.region_commercial = row10.region_commercial ;
Update_Data_tmp.Secteur = row10.Secteur ;
Update_Data_tmp.pays = row10.pays ;
Update_Data_tmp.hub = row10.hub ;
Update_Data = Update_Data_tmp;
} // closing inner join bracket (1)
// ###### START REJECTS ##### 

// # Output reject table : 'Insert_New_Data'
// # Filter conditions 
if( rejectedInnerJoin_tMap_3 ) {
Insert_New_Data_tmp.id_secteur = row10.id_secteur ;
Insert_New_Data_tmp.region_commercial = row10.region_commercial ;
Insert_New_Data_tmp.zone_supervision = row10.zone_supervision ;
Insert_New_Data_tmp.secteur = row10.Secteur ;
Insert_New_Data_tmp.hub = row10.hub ;
Insert_New_Data_tmp.pays = row10.pays ;
Insert_New_Data = Insert_New_Data_tmp;
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

	arrayRowtSortRow_2_SortOut.id_secteur = Insert_New_Data.id_secteur;
	arrayRowtSortRow_2_SortOut.region_commercial = Insert_New_Data.region_commercial;
	arrayRowtSortRow_2_SortOut.zone_supervision = Insert_New_Data.zone_supervision;
	arrayRowtSortRow_2_SortOut.secteur = Insert_New_Data.secteur;
	arrayRowtSortRow_2_SortOut.hub = Insert_New_Data.hub;
	arrayRowtSortRow_2_SortOut.pays = Insert_New_Data.pays;	
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
	 * [tMap_4 main ] start
	 */

	

	
	
	currentComponent="tMap_4";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"Update_Data"
						
						);
					}
					

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_4 = false;
		

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_4 = false;
		  boolean mainRowRejected_tMap_4 = false;
            				    								  
		

				///////////////////////////////////////////////
				// Starting Lookup Table "row8" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLooprow8 = false;
       		  	    	
       		  	    	
 							row8Struct row8ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_4) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_4 = false;
								
	                        		    	Object exprKeyValue_row8__id_secteur = Update_Data.id_secteur ;
	                        		    	if(exprKeyValue_row8__id_secteur == null) {
	                        		    		hasCasePrimitiveKeyWithNull_tMap_4 = true;
	                        		    	} else {
                        		    			row8HashKey.id_secteur = (long)(Long) exprKeyValue_row8__id_secteur;
                        		    		}
                        		    		
                        		    		    row8HashKey.region_commercial = Update_Data.region_commercial ;
                        		    		
                        		    		    row8HashKey.zone_supervision = Update_Data.zone_supervision ;
                        		    		
                        		    		    row8HashKey.secteur = Update_Data.Secteur ;
                        		    		
                        		    		    row8HashKey.hub = Update_Data.pays ;
                        		    		
                        		    		    row8HashKey.pays = Update_Data.hub ;
                        		    		

								
		                        	row8HashKey.hashCodeDirty = true;
                        		
	  					
	  							
	
		  							if(!hasCasePrimitiveKeyWithNull_tMap_4) { // G_TM_M_091
		  							
			  					
			  					
			  					
	  					
		  							tHash_Lookup_row8.lookup( row8HashKey );

	  							

	  							

			  						} // G_TM_M_091
			  						
			  					

 								
								  
								  if(hasCasePrimitiveKeyWithNull_tMap_4 || !tHash_Lookup_row8.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_4 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row8 != null && tHash_Lookup_row8.getCount(row8HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row8' and it contains more one result from keys :  row8.id_secteur = '" + row8HashKey.id_secteur + "', row8.region_commercial = '" + row8HashKey.region_commercial + "', row8.zone_supervision = '" + row8HashKey.zone_supervision + "', row8.secteur = '" + row8HashKey.secteur + "', row8.hub = '" + row8HashKey.hub + "', row8.pays = '" + row8HashKey.pays + "'");
								} // G 071
							

							row8Struct row8 = null;
                    		  	 
							   
                    		  	 
	       		  	    	row8Struct fromLookup_row8 = null;
							row8 = row8Default;
										 
							
								 
							
							
								if (tHash_Lookup_row8 !=null && tHash_Lookup_row8.hasNext()) { // G 099
								
							
								
								fromLookup_row8 = tHash_Lookup_row8.next();

							
							
								} // G 099
							
							

							if(fromLookup_row8 != null) {
								row8 = fromLookup_row8;
							}
							
							
							
			  							
								
	                    		  	
		                    
	            	
	            	
	            // ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_4__Struct Var = Var__tMap_4;// ###############################
        // ###############################
        // # Output tables

Update_Line_Existing = null;

if(!rejectedInnerJoin_tMap_4 ) {
} // closing inner join bracket (1)
// ###### START REJECTS ##### 

// # Output reject table : 'Update_Line_Existing'
// # Filter conditions 
if( rejectedInnerJoin_tMap_4 ) {
Update_Line_Existing_tmp.id_secteur = Update_Data.id_secteur ;
Update_Line_Existing_tmp.region_commercial = Update_Data.region_commercial ;
Update_Line_Existing_tmp.zone_supervision = Update_Data.zone_supervision ;
Update_Line_Existing_tmp.secteur = Update_Data.Secteur ;
Update_Line_Existing_tmp.hub = Update_Data.hub ;
Update_Line_Existing_tmp.pays = Update_Data.pays ;
Update_Line_Existing = Update_Line_Existing_tmp;
} // closing filter/reject
// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_4 = false;










 


	tos_count_tMap_4++;

/**
 * [tMap_4 main ] stop
 */
	
	/**
	 * [tMap_4 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMap_4";

	

 



/**
 * [tMap_4 process_data_begin ] stop
 */
// Start of branch "Update_Line_Existing"
if(Update_Line_Existing != null) { 



	
	/**
	 * [tDBOutput_2 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_2";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"Update_Line_Existing"
						
						);
					}
					



        whetherReject_tDBOutput_2 = false;
                    if(Update_Line_Existing.region_commercial == null) {
pstmt_tDBOutput_2.setNull(1, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(1, Update_Line_Existing.region_commercial);
}

                    if(Update_Line_Existing.zone_supervision == null) {
pstmt_tDBOutput_2.setNull(2, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(2, Update_Line_Existing.zone_supervision);
}

                    if(Update_Line_Existing.secteur == null) {
pstmt_tDBOutput_2.setNull(3, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(3, Update_Line_Existing.secteur);
}

                    if(Update_Line_Existing.hub == null) {
pstmt_tDBOutput_2.setNull(4, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(4, Update_Line_Existing.hub);
}

                    if(Update_Line_Existing.pays == null) {
pstmt_tDBOutput_2.setNull(5, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(5, Update_Line_Existing.pays);
}

                    pstmt_tDBOutput_2.setLong(6 + count_tDBOutput_2, Update_Line_Existing.id_secteur);


    		pstmt_tDBOutput_2.addBatch();
    		nb_line_tDBOutput_2++;
    		  
    		  
    		  batchSizeCounter_tDBOutput_2++;
    		  
    			if ((batchSize_tDBOutput_2 > 0) && (batchSize_tDBOutput_2 <= batchSizeCounter_tDBOutput_2)) {
                try {
						int countSum_tDBOutput_2 = 0;
						    
						for(int countEach_tDBOutput_2: pstmt_tDBOutput_2.executeBatch()) {
							countSum_tDBOutput_2 += (countEach_tDBOutput_2 < 0 ? 0 : countEach_tDBOutput_2);
						}
				    	rowsToCommitCount_tDBOutput_2 += countSum_tDBOutput_2;
				    	
				    		updatedCount_tDBOutput_2 += countSum_tDBOutput_2;
				    	
            	    	batchSizeCounter_tDBOutput_2 = 0;
                }catch (java.sql.BatchUpdateException e_tDBOutput_2){
globalMap.put("tDBOutput_2_ERROR_MESSAGE",e_tDBOutput_2.getMessage());
				    	java.sql.SQLException ne_tDBOutput_2 = e_tDBOutput_2.getNextException(),sqle_tDBOutput_2=null;
				    	String errormessage_tDBOutput_2;
						if (ne_tDBOutput_2 != null) {
							// build new exception to provide the original cause
							sqle_tDBOutput_2 = new java.sql.SQLException(e_tDBOutput_2.getMessage() + "\ncaused by: " + ne_tDBOutput_2.getMessage(), ne_tDBOutput_2.getSQLState(), ne_tDBOutput_2.getErrorCode(), ne_tDBOutput_2);
							errormessage_tDBOutput_2 = sqle_tDBOutput_2.getMessage();
						}else{
							errormessage_tDBOutput_2 = e_tDBOutput_2.getMessage();
						}
				    	
				    	int countSum_tDBOutput_2 = 0;
						for(int countEach_tDBOutput_2: e_tDBOutput_2.getUpdateCounts()) {
							countSum_tDBOutput_2 += (countEach_tDBOutput_2 < 0 ? 0 : countEach_tDBOutput_2);
						}
						rowsToCommitCount_tDBOutput_2 += countSum_tDBOutput_2;
						
				    		updatedCount_tDBOutput_2 += countSum_tDBOutput_2;
				    	
				    	System.err.println(errormessage_tDBOutput_2);
				    	
					}
    			}
    		
    		    commitCounter_tDBOutput_2++;
                if(commitEvery_tDBOutput_2 <= commitCounter_tDBOutput_2) {
                if ((batchSize_tDBOutput_2 > 0) && (batchSizeCounter_tDBOutput_2 > 0)) {
                try {
                		int countSum_tDBOutput_2 = 0;
                		    
						for(int countEach_tDBOutput_2: pstmt_tDBOutput_2.executeBatch()) {
							countSum_tDBOutput_2 += (countEach_tDBOutput_2 < 0 ? 0 : countEach_tDBOutput_2);
						}
            	    	rowsToCommitCount_tDBOutput_2 += countSum_tDBOutput_2;
            	    	
            	    		updatedCount_tDBOutput_2 += countSum_tDBOutput_2;
            	    	
                batchSizeCounter_tDBOutput_2 = 0;
               }catch (java.sql.BatchUpdateException e_tDBOutput_2){
globalMap.put("tDBOutput_2_ERROR_MESSAGE",e_tDBOutput_2.getMessage());
			    	java.sql.SQLException ne_tDBOutput_2 = e_tDBOutput_2.getNextException(),sqle_tDBOutput_2=null;
			    	String errormessage_tDBOutput_2;
					if (ne_tDBOutput_2 != null) {
						// build new exception to provide the original cause
						sqle_tDBOutput_2 = new java.sql.SQLException(e_tDBOutput_2.getMessage() + "\ncaused by: " + ne_tDBOutput_2.getMessage(), ne_tDBOutput_2.getSQLState(), ne_tDBOutput_2.getErrorCode(), ne_tDBOutput_2);
						errormessage_tDBOutput_2 = sqle_tDBOutput_2.getMessage();
					}else{
						errormessage_tDBOutput_2 = e_tDBOutput_2.getMessage();
					}
			    	
			    	int countSum_tDBOutput_2 = 0;
					for(int countEach_tDBOutput_2: e_tDBOutput_2.getUpdateCounts()) {
						countSum_tDBOutput_2 += (countEach_tDBOutput_2 < 0 ? 0 : countEach_tDBOutput_2);
					}
					rowsToCommitCount_tDBOutput_2 += countSum_tDBOutput_2;
					
			    		updatedCount_tDBOutput_2 += countSum_tDBOutput_2;
			    	
			    	System.err.println(errormessage_tDBOutput_2);
			    	
				}
            }
                    if(rowsToCommitCount_tDBOutput_2 != 0){
                    	
                    }
                    conn_tDBOutput_2.commit();
                    if(rowsToCommitCount_tDBOutput_2 != 0){
                    	
                    	rowsToCommitCount_tDBOutput_2 = 0;
                    }
                    commitCounter_tDBOutput_2=0;
                }

 


	tos_count_tDBOutput_2++;

/**
 * [tDBOutput_2 main ] stop
 */
	
	/**
	 * [tDBOutput_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBOutput_2";

	

 



/**
 * [tDBOutput_2 process_data_begin ] stop
 */
	
	/**
	 * [tDBOutput_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBOutput_2";

	

 



/**
 * [tDBOutput_2 process_data_end ] stop
 */

} // End of branch "Update_Line_Existing"




	
	/**
	 * [tMap_4 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_4";

	

 



/**
 * [tMap_4 process_data_end ] stop
 */

} // End of branch "Update_Data"




	
	/**
	 * [tMap_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_3";

	

 



/**
 * [tMap_3 process_data_end ] stop
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
	 * [tMap_3 end ] start
	 */

	

	
	
	currentComponent="tMap_3";

	


// ###############################
// # Lookup hashes releasing
					if(tHash_Lookup_row7 != null) {
						tHash_Lookup_row7.endGet();
					}
					globalMap.remove( "tHash_Lookup_row7" );

					
					
				
// ###############################      





				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row10");
			  	}
			  	
 

ok_Hash.put("tMap_3", true);
end_Hash.put("tMap_3", System.currentTimeMillis());




/**
 * [tMap_3 end ] stop
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
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row9");
					}
				
		int tos_count_tDBOutput_1 = 0;
		





String dbschema_tDBOutput_1 = null;
	dbschema_tDBOutput_1 = "public";
	

String tableName_tDBOutput_1 = null;
if(dbschema_tDBOutput_1 == null || dbschema_tDBOutput_1.trim().length() == 0) {
	tableName_tDBOutput_1 = ("Dim_Geographie");
} else {
	tableName_tDBOutput_1 = dbschema_tDBOutput_1 + "\".\"" + ("Dim_Geographie");
}

        int updateKeyCount_tDBOutput_1 = 1;
        if(updateKeyCount_tDBOutput_1 < 1) {
            throw new RuntimeException("For update, Schema must have a key");
        } else if (updateKeyCount_tDBOutput_1 == 6 && true) {
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
 
	final String decryptedPassword_tDBOutput_1 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:/chsRMrl/mou0TmuTfAPCO6QLjzluiJWI0ocNqHyKEgdEfDfd4c=");

    String dbPwd_tDBOutput_1 = decryptedPassword_tDBOutput_1;

    conn_tDBOutput_1 = java.sql.DriverManager.getConnection(url_tDBOutput_1,dbUser_tDBOutput_1,dbPwd_tDBOutput_1);
	
	resourceMap.put("conn_tDBOutput_1", conn_tDBOutput_1);
        conn_tDBOutput_1.setAutoCommit(false);
        int commitEvery_tDBOutput_1 = 1000;
        int commitCounter_tDBOutput_1 = 0;



int count_tDBOutput_1=0;
	    java.sql.PreparedStatement pstmt_tDBOutput_1 = conn_tDBOutput_1.prepareStatement("SELECT COUNT(1) FROM \"" + tableName_tDBOutput_1 + "\" WHERE \"id_secteur\" = ?");
	    resourceMap.put("pstmt_tDBOutput_1", pstmt_tDBOutput_1);
	    String insert_tDBOutput_1 = "INSERT INTO \"" + tableName_tDBOutput_1 + "\" (\"id_secteur\",\"region_commercial\",\"zone_supervision\",\"secteur\",\"hub\",\"pays\") VALUES (?,?,?,?,?,?)";
	    java.sql.PreparedStatement pstmtInsert_tDBOutput_1 = conn_tDBOutput_1.prepareStatement(insert_tDBOutput_1);
	    resourceMap.put("pstmtInsert_tDBOutput_1", pstmtInsert_tDBOutput_1);
	    String update_tDBOutput_1 = "UPDATE \"" + tableName_tDBOutput_1 + "\" SET \"region_commercial\" = ?,\"zone_supervision\" = ?,\"secteur\" = ?,\"hub\" = ?,\"pays\" = ? WHERE \"id_secteur\" = ?";
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
	row9.id_secteur = current_tSortRow_2_SortIn.id_secteur;
	row9.region_commercial = current_tSortRow_2_SortIn.region_commercial;
	row9.zone_supervision = current_tSortRow_2_SortIn.zone_supervision;
	row9.secteur = current_tSortRow_2_SortIn.secteur;
	row9.hub = current_tSortRow_2_SortIn.hub;
	row9.pays = current_tSortRow_2_SortIn.pays;
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
						
							,"row9"
						
						);
					}
					



		query_tDBOutput_1 = new StringBuffer("");
        whetherReject_tDBOutput_1 = false;
                    pstmt_tDBOutput_1.setLong(1, row9.id_secteur);

            int checkCount_tDBOutput_1 = -1;
            try (java.sql.ResultSet rs_tDBOutput_1 = pstmt_tDBOutput_1.executeQuery()) {
                while(rs_tDBOutput_1.next()) {
                    checkCount_tDBOutput_1 = rs_tDBOutput_1.getInt(1);
                }
            }
            if(checkCount_tDBOutput_1 > 0) {
                        if(row9.region_commercial == null) {
pstmtUpdate_tDBOutput_1.setNull(1, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(1, row9.region_commercial);
}

                            query_tDBOutput_1 = query_tDBOutput_1.append(updateSQLSplits_tDBOutput_1[0]).append(row9.region_commercial== null ?  "null" :"'" + row9.region_commercial + "'").append(updateSQLSplits_tDBOutput_1[1]);
                        if(row9.zone_supervision == null) {
pstmtUpdate_tDBOutput_1.setNull(2, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(2, row9.zone_supervision);
}

                            query_tDBOutput_1 = query_tDBOutput_1.append(row9.zone_supervision== null ?  "null" :"'" + row9.zone_supervision + "'").append(updateSQLSplits_tDBOutput_1[2]);
                        if(row9.secteur == null) {
pstmtUpdate_tDBOutput_1.setNull(3, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(3, row9.secteur);
}

                            query_tDBOutput_1 = query_tDBOutput_1.append(row9.secteur== null ?  "null" :"'" + row9.secteur + "'").append(updateSQLSplits_tDBOutput_1[3]);
                        if(row9.hub == null) {
pstmtUpdate_tDBOutput_1.setNull(4, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(4, row9.hub);
}

                            query_tDBOutput_1 = query_tDBOutput_1.append(row9.hub== null ?  "null" :"'" + row9.hub + "'").append(updateSQLSplits_tDBOutput_1[4]);
                        if(row9.pays == null) {
pstmtUpdate_tDBOutput_1.setNull(5, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(5, row9.pays);
}

                            query_tDBOutput_1 = query_tDBOutput_1.append(row9.pays== null ?  "null" :"'" + row9.pays + "'").append(updateSQLSplits_tDBOutput_1[5]);
                        pstmtUpdate_tDBOutput_1.setLong(6 + count_tDBOutput_1, row9.id_secteur);

							query_tDBOutput_1 = query_tDBOutput_1.append(String.valueOf(row9.id_secteur)).append(updateSQLSplits_tDBOutput_1[6]);
				    	
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
                        pstmtInsert_tDBOutput_1.setLong(1, row9.id_secteur);

                            query_tDBOutput_1 = query_tDBOutput_1.append(insertSQLSplits_tDBOutput_1[0]).append(String.valueOf(row9.id_secteur)).append(insertSQLSplits_tDBOutput_1[1]);
                        if(row9.region_commercial == null) {
pstmtInsert_tDBOutput_1.setNull(2, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(2, row9.region_commercial);
}

                            query_tDBOutput_1 = query_tDBOutput_1.append(row9.region_commercial== null ?  "null" :"'" + row9.region_commercial + "'").append(insertSQLSplits_tDBOutput_1[2]);
                        if(row9.zone_supervision == null) {
pstmtInsert_tDBOutput_1.setNull(3, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(3, row9.zone_supervision);
}

                            query_tDBOutput_1 = query_tDBOutput_1.append(row9.zone_supervision== null ?  "null" :"'" + row9.zone_supervision + "'").append(insertSQLSplits_tDBOutput_1[3]);
                        if(row9.secteur == null) {
pstmtInsert_tDBOutput_1.setNull(4, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(4, row9.secteur);
}

                            query_tDBOutput_1 = query_tDBOutput_1.append(row9.secteur== null ?  "null" :"'" + row9.secteur + "'").append(insertSQLSplits_tDBOutput_1[4]);
                        if(row9.hub == null) {
pstmtInsert_tDBOutput_1.setNull(5, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(5, row9.hub);
}

                            query_tDBOutput_1 = query_tDBOutput_1.append(row9.hub== null ?  "null" :"'" + row9.hub + "'").append(insertSQLSplits_tDBOutput_1[5]);
                        if(row9.pays == null) {
pstmtInsert_tDBOutput_1.setNull(6, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(6, row9.pays);
}

                            query_tDBOutput_1 = query_tDBOutput_1.append(row9.pays== null ?  "null" :"'" + row9.pays + "'").append(insertSQLSplits_tDBOutput_1[6]);
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
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row9");
			  	}
			  	
 

ok_Hash.put("tDBOutput_1", true);
end_Hash.put("tDBOutput_1", System.currentTimeMillis());




/**
 * [tDBOutput_1 end ] stop
 */










	
	/**
	 * [tMap_4 end ] start
	 */

	

	
	
	currentComponent="tMap_4";

	


// ###############################
// # Lookup hashes releasing
					if(tHash_Lookup_row8 != null) {
						tHash_Lookup_row8.endGet();
					}
					globalMap.remove( "tHash_Lookup_row8" );

					
					
				
// ###############################      





				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"Update_Data");
			  	}
			  	
 

ok_Hash.put("tMap_4", true);
end_Hash.put("tMap_4", System.currentTimeMillis());




/**
 * [tMap_4 end ] stop
 */

	
	/**
	 * [tDBOutput_2 end ] start
	 */

	

	
	
	currentComponent="tDBOutput_2";

	



	    try {
				int countSum_tDBOutput_2 = 0;
				if (pstmt_tDBOutput_2 != null && batchSizeCounter_tDBOutput_2 > 0) {
						
					for(int countEach_tDBOutput_2: pstmt_tDBOutput_2.executeBatch()) {
						countSum_tDBOutput_2 += (countEach_tDBOutput_2 < 0 ? 0 : countEach_tDBOutput_2);
					}
					rowsToCommitCount_tDBOutput_2 += countSum_tDBOutput_2;
						
				}
		    	
		    		updatedCount_tDBOutput_2 += countSum_tDBOutput_2;
		    	
	    }catch (java.sql.BatchUpdateException e_tDBOutput_2){
globalMap.put("tDBOutput_2_ERROR_MESSAGE",e_tDBOutput_2.getMessage());
	    	java.sql.SQLException ne_tDBOutput_2 = e_tDBOutput_2.getNextException(),sqle_tDBOutput_2=null;
	    	String errormessage_tDBOutput_2;
			if (ne_tDBOutput_2 != null) {
				// build new exception to provide the original cause
				sqle_tDBOutput_2 = new java.sql.SQLException(e_tDBOutput_2.getMessage() + "\ncaused by: " + ne_tDBOutput_2.getMessage(), ne_tDBOutput_2.getSQLState(), ne_tDBOutput_2.getErrorCode(), ne_tDBOutput_2);
				errormessage_tDBOutput_2 = sqle_tDBOutput_2.getMessage();
			}else{
				errormessage_tDBOutput_2 = e_tDBOutput_2.getMessage();
			}
	    	
	    	int countSum_tDBOutput_2 = 0;
			for(int countEach_tDBOutput_2: e_tDBOutput_2.getUpdateCounts()) {
				countSum_tDBOutput_2 += (countEach_tDBOutput_2 < 0 ? 0 : countEach_tDBOutput_2);
			}
			rowsToCommitCount_tDBOutput_2 += countSum_tDBOutput_2;
			
	    		updatedCount_tDBOutput_2 += countSum_tDBOutput_2;
	    	
	    	System.err.println(errormessage_tDBOutput_2);
	    	
		}
	    
        if(pstmt_tDBOutput_2 != null) {
        		
            pstmt_tDBOutput_2.close();
            resourceMap.remove("pstmt_tDBOutput_2");
        }
    resourceMap.put("statementClosed_tDBOutput_2", true);
			if(rowsToCommitCount_tDBOutput_2 != 0){
				
			}
			conn_tDBOutput_2.commit();
			if(rowsToCommitCount_tDBOutput_2 != 0){
				
				rowsToCommitCount_tDBOutput_2 = 0;
			}
			commitCounter_tDBOutput_2 = 0;
		
    	conn_tDBOutput_2 .close();
    	
    	resourceMap.put("finish_tDBOutput_2", true);
    	

	nb_line_deleted_tDBOutput_2=nb_line_deleted_tDBOutput_2+ deletedCount_tDBOutput_2;
	nb_line_update_tDBOutput_2=nb_line_update_tDBOutput_2 + updatedCount_tDBOutput_2;
	nb_line_inserted_tDBOutput_2=nb_line_inserted_tDBOutput_2 + insertedCount_tDBOutput_2;
	nb_line_rejected_tDBOutput_2=nb_line_rejected_tDBOutput_2 + rejectedCount_tDBOutput_2;
	
        globalMap.put("tDBOutput_2_NB_LINE",nb_line_tDBOutput_2);
        globalMap.put("tDBOutput_2_NB_LINE_UPDATED",nb_line_update_tDBOutput_2);
        globalMap.put("tDBOutput_2_NB_LINE_INSERTED",nb_line_inserted_tDBOutput_2);
        globalMap.put("tDBOutput_2_NB_LINE_DELETED",nb_line_deleted_tDBOutput_2);
        globalMap.put("tDBOutput_2_NB_LINE_REJECTED", nb_line_rejected_tDBOutput_2);
    

	


				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"Update_Line_Existing");
			  	}
			  	
 

ok_Hash.put("tDBOutput_2", true);
end_Hash.put("tDBOutput_2", System.currentTimeMillis());




/**
 * [tDBOutput_2 end ] stop
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
				
					     			//free memory for "tMap_4"
					     			globalMap.remove("tHash_Lookup_row8"); 
				     			
							//free memory for "tSortRow_2_SortIn"
							globalMap.remove("tSortRow_2");
						
					     			//free memory for "tMap_3"
					     			globalMap.remove("tHash_Lookup_row7"); 
				     			
							//free memory for "tSortRow_1_SortIn"
							globalMap.remove("tSortRow_1");
						
					     			//free memory for "tMap_2"
					     			globalMap.remove("tHash_Lookup_row4"); 
				     			
					     			//free memory for "tMap_2"
					     			globalMap.remove("tHash_Lookup_row5"); 
				     			
					     			//free memory for "tMap_1"
					     			globalMap.remove("tHash_Lookup_row2"); 
				     			
					     			//free memory for "tMap_1"
					     			globalMap.remove("tHash_Lookup_row3"); 
				     			
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
	 * [tMap_2 finally ] start
	 */

	

	
	
	currentComponent="tMap_2";

	

 



/**
 * [tMap_2 finally ] stop
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
	 * [tMap_3 finally ] start
	 */

	

	
	
	currentComponent="tMap_3";

	

 



/**
 * [tMap_3 finally ] stop
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
	 * [tMap_4 finally ] start
	 */

	

	
	
	currentComponent="tMap_4";

	

 



/**
 * [tMap_4 finally ] stop
 */

	
	/**
	 * [tDBOutput_2 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_2";

	



    try {
    if (resourceMap.get("statementClosed_tDBOutput_2") == null) {
                java.sql.PreparedStatement pstmtToClose_tDBOutput_2 = null;
                if ((pstmtToClose_tDBOutput_2 = (java.sql.PreparedStatement) resourceMap.remove("pstmt_tDBOutput_2")) != null) {
                    pstmtToClose_tDBOutput_2.close();
                }
    }
    } finally {
        if(resourceMap.get("finish_tDBOutput_2") == null){
            java.sql.Connection ctn_tDBOutput_2 = null;
            if((ctn_tDBOutput_2 = (java.sql.Connection)resourceMap.get("conn_tDBOutput_2")) != null){
                try {
                    ctn_tDBOutput_2.close();
                } catch (java.sql.SQLException sqlEx_tDBOutput_2) {
                    String errorMessage_tDBOutput_2 = "failed to close the connection in tDBOutput_2 :" + sqlEx_tDBOutput_2.getMessage();
                    System.err.println(errorMessage_tDBOutput_2);
                }
            }
        }
    }
 



/**
 * [tDBOutput_2 finally ] stop
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
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Geographie = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public long id;

				public long getId () {
					return this.id;
				}
				
			    public long region_commercial_id;

				public long getRegion_commercial_id () {
					return this.region_commercial_id;
				}
				
			    public String label;

				public String getLabel () {
					return this.label;
				}
				
			    public String color_code;

				public String getColor_code () {
					return this.color_code;
				}
				
			    public long user_id;

				public long getUser_id () {
					return this.user_id;
				}
				
			    public java.util.Date created_at;

				public java.util.Date getCreated_at () {
					return this.created_at;
				}
				
			    public java.util.Date updated_at;

				public java.util.Date getUpdated_at () {
					return this.updated_at;
				}
				
			    public Long depot_id;

				public Long getDepot_id () {
					return this.depot_id;
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
	            other.region_commercial_id = this.region_commercial_id;
	            other.label = this.label;
	            other.color_code = this.color_code;
	            other.user_id = this.user_id;
	            other.created_at = this.created_at;
	            other.updated_at = this.updated_at;
	            other.depot_id = this.depot_id;
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Geographie) {

        	try {

        		int length = 0;
		
			        this.id = dis.readLong();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Geographie) {

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
		
			            this.region_commercial_id = dis.readLong();
					
						this.label = readString(dis,ois);
					
						this.color_code = readString(dis,ois);
					
			            this.user_id = dis.readLong();
					
						this.created_at = readDate(dis,ois);
					
						this.updated_at = readDate(dis,ois);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.depot_id = null;
           				} else {
           			    	this.depot_id = dis.readLong();
           				}
					
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
		
			            this.region_commercial_id = objectIn.readLong();
					
						this.label = readString(dis,objectIn);
					
						this.color_code = readString(dis,objectIn);
					
			            this.user_id = objectIn.readLong();
					
						this.created_at = readDate(dis,objectIn);
					
						this.updated_at = readDate(dis,objectIn);
					
			            length = objectIn.readByte();
           				if (length == -1) {
           	    			this.depot_id = null;
           				} else {
           			    	this.depot_id = objectIn.readLong();
           				}
					
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

		
		            	dos.writeLong(this.region_commercial_id);
					
						writeString(this.label, dos, oos);
					
						writeString(this.color_code, dos, oos);
					
		            	dos.writeLong(this.user_id);
					
						writeDate(this.created_at, dos, oos);
					
						writeDate(this.updated_at, dos, oos);
					
						if(this.depot_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.depot_id);
		            	}
					
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

		
					objectOut.writeLong(this.region_commercial_id);
					
						writeString(this.label, dos, objectOut);
					
						writeString(this.color_code, dos, objectOut);
					
					objectOut.writeLong(this.user_id);
					
						writeDate(this.created_at, dos, objectOut);
					
						writeDate(this.updated_at, dos, objectOut);
					
						if(this.depot_id == null) {
							objectOut.writeByte(-1);
						} else {
							objectOut.writeByte(0);
							objectOut.writeLong(this.depot_id);
		            	}
					
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
		sb.append(",region_commercial_id="+String.valueOf(region_commercial_id));
		sb.append(",label="+label);
		sb.append(",color_code="+color_code);
		sb.append(",user_id="+String.valueOf(user_id));
		sb.append(",created_at="+String.valueOf(created_at));
		sb.append(",updated_at="+String.valueOf(updated_at));
		sb.append(",depot_id="+String.valueOf(depot_id));
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
			   		// source node:tDBInput_3 - inputs:(after_tDBInput_1) outputs:(row2,row2) | target node:tAdvancedHash_row2 - inputs:(row2) outputs:()
			   		// linked node: tMap_1 - inputs:(row1,row2,row3) outputs:(out1)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row2 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row2Struct> tHash_Lookup_row2 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row2Struct>getLookup(matchingModeEnum_row2);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row2", tHash_Lookup_row2);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row2 begin ] stop
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
				conn_tDBInput_3 = (java.sql.Connection)globalMap.get("conn_tDBConnection_1");
				
		    
			java.sql.Statement stmt_tDBInput_3 = conn_tDBInput_3.createStatement();

		    String dbquery_tDBInput_3 = "SELECT \n  \"public\".\"zone_supervisors\".\"id\", \n  \"public\".\"zone_supervisors\".\"region_commercial_id\", \n  \"pub"
+"lic\".\"zone_supervisors\".\"label\", \n  \"public\".\"zone_supervisors\".\"color_code\", \n  \"public\".\"zone_supervisor"
+"s\".\"user_id\", \n  \"public\".\"zone_supervisors\".\"created_at\", \n  \"public\".\"zone_supervisors\".\"updated_at\", \n"
+"  \"public\".\"zone_supervisors\".\"depot_id\", \n  \"public\".\"zone_supervisors\".\"activate\"\nFROM \"public\".\"zone_s"
+"upervisors\"";
		    

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
								row2.id = 0;
							} else {
		                          
            row2.id = rs_tDBInput_3.getLong(1);
            if(rs_tDBInput_3.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_3 < 2) {
								row2.region_commercial_id = 0;
							} else {
		                          
            row2.region_commercial_id = rs_tDBInput_3.getLong(2);
            if(rs_tDBInput_3.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_3 < 3) {
								row2.label = null;
							} else {
	                         		
        	row2.label = routines.system.JDBCUtil.getString(rs_tDBInput_3, 3, false);
		                    }
							if(colQtyInRs_tDBInput_3 < 4) {
								row2.color_code = null;
							} else {
	                         		
        	row2.color_code = routines.system.JDBCUtil.getString(rs_tDBInput_3, 4, false);
		                    }
							if(colQtyInRs_tDBInput_3 < 5) {
								row2.user_id = 0;
							} else {
		                          
            row2.user_id = rs_tDBInput_3.getLong(5);
            if(rs_tDBInput_3.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_3 < 6) {
								row2.created_at = null;
							} else {
										
			row2.created_at = routines.system.JDBCUtil.getDate(rs_tDBInput_3, 6);
		                    }
							if(colQtyInRs_tDBInput_3 < 7) {
								row2.updated_at = null;
							} else {
										
			row2.updated_at = routines.system.JDBCUtil.getDate(rs_tDBInput_3, 7);
		                    }
							if(colQtyInRs_tDBInput_3 < 8) {
								row2.depot_id = null;
							} else {
		                          
            row2.depot_id = rs_tDBInput_3.getLong(8);
            if(rs_tDBInput_3.wasNull()){
                    row2.depot_id = null;
            }
		                    }
							if(colQtyInRs_tDBInput_3 < 9) {
								row2.activate = null;
							} else {
	                         		
            row2.activate = rs_tDBInput_3.getBoolean(9);
            if(rs_tDBInput_3.wasNull()){
                    row2.activate = null;
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
				
				row2_HashRow.region_commercial_id = row2.region_commercial_id;
				
				row2_HashRow.label = row2.label;
				
				row2_HashRow.color_code = row2.color_code;
				
				row2_HashRow.user_id = row2.user_id;
				
				row2_HashRow.created_at = row2.created_at;
				
				row2_HashRow.updated_at = row2.updated_at;
				
				row2_HashRow.depot_id = row2.depot_id;
				
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
}
globalMap.put("tDBInput_3_NB_LINE",nb_line_tDBInput_3);
 

ok_Hash.put("tDBInput_3", true);
end_Hash.put("tDBInput_3", System.currentTimeMillis());




/**
 * [tDBInput_3 end ] stop
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
	 * [tDBInput_3 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_3";

	

 



/**
 * [tDBInput_3 finally ] stop
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
		

		globalMap.put("tDBInput_3_SUBPROCESS_STATE", 1);
	}
	


public static class row3Struct implements routines.system.IPersistableComparableLookupRow<row3Struct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Geographie = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public long id;

				public long getId () {
					return this.id;
				}
				
			    public String label;

				public String getLabel () {
					return this.label;
				}
				
			    public long user_id;

				public long getUser_id () {
					return this.user_id;
				}
				
			    public java.util.Date created_at;

				public java.util.Date getCreated_at () {
					return this.created_at;
				}
				
			    public java.util.Date updated_at;

				public java.util.Date getUpdated_at () {
					return this.updated_at;
				}
				
			    public String coordonnees;

				public String getCoordonnees () {
					return this.coordonnees;
				}
				
			    public String color_code;

				public String getColor_code () {
					return this.color_code;
				}
				
			    public Boolean activate;

				public Boolean getActivate () {
					return this.activate;
				}
				
			    public Long zones_id;

				public Long getZones_id () {
					return this.zones_id;
				}
				
			    public Long country_id;

				public Long getCountry_id () {
					return this.country_id;
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
		final row3Struct other = (row3Struct) obj;
		
						if (this.id != other.id)
							return false;
					

		return true;
    }

	public void copyDataTo(row3Struct other) {

		other.id = this.id;
	            other.label = this.label;
	            other.user_id = this.user_id;
	            other.created_at = this.created_at;
	            other.updated_at = this.updated_at;
	            other.coordonnees = this.coordonnees;
	            other.color_code = this.color_code;
	            other.activate = this.activate;
	            other.zones_id = this.zones_id;
	            other.country_id = this.country_id;
	            
	}

	public void copyKeysDataTo(row3Struct other) {

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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Geographie) {

        	try {

        		int length = 0;
		
			        this.id = dis.readLong();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Geographie) {

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
		
						this.label = readString(dis,ois);
					
			            this.user_id = dis.readLong();
					
						this.created_at = readDate(dis,ois);
					
						this.updated_at = readDate(dis,ois);
					
						this.coordonnees = readString(dis,ois);
					
						this.color_code = readString(dis,ois);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.activate = null;
           				} else {
           			    	this.activate = dis.readBoolean();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.zones_id = null;
           				} else {
           			    	this.zones_id = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.country_id = null;
           				} else {
           			    	this.country_id = dis.readLong();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
						this.label = readString(dis,objectIn);
					
			            this.user_id = objectIn.readLong();
					
						this.created_at = readDate(dis,objectIn);
					
						this.updated_at = readDate(dis,objectIn);
					
						this.coordonnees = readString(dis,objectIn);
					
						this.color_code = readString(dis,objectIn);
					
			            length = objectIn.readByte();
           				if (length == -1) {
           	    			this.activate = null;
           				} else {
           			    	this.activate = objectIn.readBoolean();
           				}
					
			            length = objectIn.readByte();
           				if (length == -1) {
           	    			this.zones_id = null;
           				} else {
           			    	this.zones_id = objectIn.readLong();
           				}
					
			            length = objectIn.readByte();
           				if (length == -1) {
           	    			this.country_id = null;
           				} else {
           			    	this.country_id = objectIn.readLong();
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

		
						writeString(this.label, dos, oos);
					
		            	dos.writeLong(this.user_id);
					
						writeDate(this.created_at, dos, oos);
					
						writeDate(this.updated_at, dos, oos);
					
						writeString(this.coordonnees, dos, oos);
					
						writeString(this.color_code, dos, oos);
					
						if(this.activate == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.activate);
		            	}
					
						if(this.zones_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.zones_id);
		            	}
					
						if(this.country_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.country_id);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
						writeString(this.label, dos, objectOut);
					
					objectOut.writeLong(this.user_id);
					
						writeDate(this.created_at, dos, objectOut);
					
						writeDate(this.updated_at, dos, objectOut);
					
						writeString(this.coordonnees, dos, objectOut);
					
						writeString(this.color_code, dos, objectOut);
					
						if(this.activate == null) {
							objectOut.writeByte(-1);
						} else {
							objectOut.writeByte(0);
							objectOut.writeBoolean(this.activate);
		            	}
					
						if(this.zones_id == null) {
							objectOut.writeByte(-1);
						} else {
							objectOut.writeByte(0);
							objectOut.writeLong(this.zones_id);
		            	}
					
						if(this.country_id == null) {
							objectOut.writeByte(-1);
						} else {
							objectOut.writeByte(0);
							objectOut.writeLong(this.country_id);
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
		sb.append(",label="+label);
		sb.append(",user_id="+String.valueOf(user_id));
		sb.append(",created_at="+String.valueOf(created_at));
		sb.append(",updated_at="+String.valueOf(updated_at));
		sb.append(",coordonnees="+coordonnees);
		sb.append(",color_code="+color_code);
		sb.append(",activate="+String.valueOf(activate));
		sb.append(",zones_id="+String.valueOf(zones_id));
		sb.append(",country_id="+String.valueOf(country_id));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row3Struct other) {

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
			   		// source node:tDBInput_4 - inputs:(after_tDBInput_1) outputs:(row3,row3) | target node:tAdvancedHash_row3 - inputs:(row3) outputs:()
			   		// linked node: tMap_1 - inputs:(row1,row2,row3) outputs:(out1)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row3 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row3Struct> tHash_Lookup_row3 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row3Struct>getLookup(matchingModeEnum_row3);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row3", tHash_Lookup_row3);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row3 begin ] stop
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
				conn_tDBInput_4 = (java.sql.Connection)globalMap.get("conn_tDBConnection_1");
				
		    
			java.sql.Statement stmt_tDBInput_4 = conn_tDBInput_4.createStatement();

		    String dbquery_tDBInput_4 = "SELECT \n  \"public\".\"region_commercials\".\"id\", \n  \"public\".\"region_commercials\".\"label\", \n  \"public\".\"reg"
+"ion_commercials\".\"user_id\", \n  \"public\".\"region_commercials\".\"created_at\", \n  \"public\".\"region_commercials\""
+".\"updated_at\", \n  \"public\".\"region_commercials\".\"coordonnees\", \n  \"public\".\"region_commercials\".\"color_code"
+"\", \n  \"public\".\"region_commercials\".\"activate\", \n  \"public\".\"region_commercials\".\"zones_id\", \n  \"public\"."
+"\"region_commercials\".\"country_id\"\nFROM \"public\".\"region_commercials\"\n--where \"public\".\"region_commercials\"."
+"\"label\" not in ('Région commerciale test NV','Negoce Food Service')";
		    

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
								row3.id = 0;
							} else {
		                          
            row3.id = rs_tDBInput_4.getLong(1);
            if(rs_tDBInput_4.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_4 < 2) {
								row3.label = null;
							} else {
	                         		
        	row3.label = routines.system.JDBCUtil.getString(rs_tDBInput_4, 2, false);
		                    }
							if(colQtyInRs_tDBInput_4 < 3) {
								row3.user_id = 0;
							} else {
		                          
            row3.user_id = rs_tDBInput_4.getLong(3);
            if(rs_tDBInput_4.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_4 < 4) {
								row3.created_at = null;
							} else {
										
			row3.created_at = routines.system.JDBCUtil.getDate(rs_tDBInput_4, 4);
		                    }
							if(colQtyInRs_tDBInput_4 < 5) {
								row3.updated_at = null;
							} else {
										
			row3.updated_at = routines.system.JDBCUtil.getDate(rs_tDBInput_4, 5);
		                    }
							if(colQtyInRs_tDBInput_4 < 6) {
								row3.coordonnees = null;
							} else {
	                         		
        	row3.coordonnees = routines.system.JDBCUtil.getString(rs_tDBInput_4, 6, false);
		                    }
							if(colQtyInRs_tDBInput_4 < 7) {
								row3.color_code = null;
							} else {
	                         		
        	row3.color_code = routines.system.JDBCUtil.getString(rs_tDBInput_4, 7, false);
		                    }
							if(colQtyInRs_tDBInput_4 < 8) {
								row3.activate = null;
							} else {
	                         		
            row3.activate = rs_tDBInput_4.getBoolean(8);
            if(rs_tDBInput_4.wasNull()){
                    row3.activate = null;
            }
		                    }
							if(colQtyInRs_tDBInput_4 < 9) {
								row3.zones_id = null;
							} else {
		                          
            row3.zones_id = rs_tDBInput_4.getLong(9);
            if(rs_tDBInput_4.wasNull()){
                    row3.zones_id = null;
            }
		                    }
							if(colQtyInRs_tDBInput_4 < 10) {
								row3.country_id = null;
							} else {
		                          
            row3.country_id = rs_tDBInput_4.getLong(10);
            if(rs_tDBInput_4.wasNull()){
                    row3.country_id = null;
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
	 * [tAdvancedHash_row3 main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row3";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row3"
						
						);
					}
					


			   
			   

					row3Struct row3_HashRow = new row3Struct();
		   	   	   
				
				row3_HashRow.id = row3.id;
				
				row3_HashRow.label = row3.label;
				
				row3_HashRow.user_id = row3.user_id;
				
				row3_HashRow.created_at = row3.created_at;
				
				row3_HashRow.updated_at = row3.updated_at;
				
				row3_HashRow.coordonnees = row3.coordonnees;
				
				row3_HashRow.color_code = row3.color_code;
				
				row3_HashRow.activate = row3.activate;
				
				row3_HashRow.zones_id = row3.zones_id;
				
				row3_HashRow.country_id = row3.country_id;
				
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
}
globalMap.put("tDBInput_4_NB_LINE",nb_line_tDBInput_4);
 

ok_Hash.put("tDBInput_4", true);
end_Hash.put("tDBInput_4", System.currentTimeMillis());




/**
 * [tDBInput_4 end ] stop
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
	 * [tDBInput_4 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_4";

	

 



/**
 * [tDBInput_4 finally ] stop
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
		

		globalMap.put("tDBInput_4_SUBPROCESS_STATE", 1);
	}
	


public static class row4Struct implements routines.system.IPersistableComparableLookupRow<row4Struct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Geographie = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public long id;

				public long getId () {
					return this.id;
				}
				
			    public String iso;

				public String getIso () {
					return this.iso;
				}
				
			    public String name;

				public String getName () {
					return this.name;
				}
				
			    public long currency_id;

				public long getCurrency_id () {
					return this.currency_id;
				}
				
			    public java.util.Date created_at;

				public java.util.Date getCreated_at () {
					return this.created_at;
				}
				
			    public java.util.Date updated_at;

				public java.util.Date getUpdated_at () {
					return this.updated_at;
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
		final row4Struct other = (row4Struct) obj;
		
						if (this.id != other.id)
							return false;
					

		return true;
    }

	public void copyDataTo(row4Struct other) {

		other.id = this.id;
	            other.iso = this.iso;
	            other.name = this.name;
	            other.currency_id = this.currency_id;
	            other.created_at = this.created_at;
	            other.updated_at = this.updated_at;
	            
	}

	public void copyKeysDataTo(row4Struct other) {

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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Geographie) {

        	try {

        		int length = 0;
		
			        this.id = dis.readLong();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Geographie) {

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
		
						this.iso = readString(dis,ois);
					
						this.name = readString(dis,ois);
					
			            this.currency_id = dis.readLong();
					
						this.created_at = readDate(dis,ois);
					
						this.updated_at = readDate(dis,ois);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
						this.iso = readString(dis,objectIn);
					
						this.name = readString(dis,objectIn);
					
			            this.currency_id = objectIn.readLong();
					
						this.created_at = readDate(dis,objectIn);
					
						this.updated_at = readDate(dis,objectIn);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
						writeString(this.iso, dos, oos);
					
						writeString(this.name, dos, oos);
					
		            	dos.writeLong(this.currency_id);
					
						writeDate(this.created_at, dos, oos);
					
						writeDate(this.updated_at, dos, oos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
						writeString(this.iso, dos, objectOut);
					
						writeString(this.name, dos, objectOut);
					
					objectOut.writeLong(this.currency_id);
					
						writeDate(this.created_at, dos, objectOut);
					
						writeDate(this.updated_at, dos, objectOut);
					
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
		sb.append(",iso="+iso);
		sb.append(",name="+name);
		sb.append(",currency_id="+String.valueOf(currency_id));
		sb.append(",created_at="+String.valueOf(created_at));
		sb.append(",updated_at="+String.valueOf(updated_at));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row4Struct other) {

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
public void tDBInput_5Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_5_SUBPROCESS_STATE", 0);

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



		row4Struct row4 = new row4Struct();




	
	/**
	 * [tAdvancedHash_row4 begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_row4", false);
		start_Hash.put("tAdvancedHash_row4", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_row4";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row4");
					}
				
		int tos_count_tAdvancedHash_row4 = 0;
		

			   		// connection name:row4
			   		// source node:tDBInput_5 - inputs:(after_tDBInput_1) outputs:(row4,row4) | target node:tAdvancedHash_row4 - inputs:(row4) outputs:()
			   		// linked node: tMap_2 - inputs:(out1,row4,row5) outputs:(out2)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row4 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row4Struct> tHash_Lookup_row4 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row4Struct>getLookup(matchingModeEnum_row4);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row4", tHash_Lookup_row4);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row4 begin ] stop
 */



	
	/**
	 * [tDBInput_5 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_5", false);
		start_Hash.put("tDBInput_5", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_5";

	
		int tos_count_tDBInput_5 = 0;
		
	
    
	
		    int nb_line_tDBInput_5 = 0;
		    java.sql.Connection conn_tDBInput_5 = null;
				conn_tDBInput_5 = (java.sql.Connection)globalMap.get("conn_tDBConnection_1");
				
		    
			java.sql.Statement stmt_tDBInput_5 = conn_tDBInput_5.createStatement();

		    String dbquery_tDBInput_5 = "SELECT \n  \"public\".\"countries\".\"id\", \n  \"public\".\"countries\".\"iso\", \n  \"public\".\"countries\".\"name\", \n"
+"  \"public\".\"countries\".\"currency_id\", \n  \"public\".\"countries\".\"created_at\", \n  \"public\".\"countries\".\"up"
+"dated_at\"\nFROM \"public\".\"countries\"";
		    

            	globalMap.put("tDBInput_5_QUERY",dbquery_tDBInput_5);
		    java.sql.ResultSet rs_tDBInput_5 = null;

		    try {
		    	rs_tDBInput_5 = stmt_tDBInput_5.executeQuery(dbquery_tDBInput_5);
		    	java.sql.ResultSetMetaData rsmd_tDBInput_5 = rs_tDBInput_5.getMetaData();
		    	int colQtyInRs_tDBInput_5 = rsmd_tDBInput_5.getColumnCount();

		    String tmpContent_tDBInput_5 = null;
		    
		    
		    while (rs_tDBInput_5.next()) {
		        nb_line_tDBInput_5++;
		        
							if(colQtyInRs_tDBInput_5 < 1) {
								row4.id = 0;
							} else {
		                          
            row4.id = rs_tDBInput_5.getLong(1);
            if(rs_tDBInput_5.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_5 < 2) {
								row4.iso = null;
							} else {
	                         		
        	row4.iso = routines.system.JDBCUtil.getString(rs_tDBInput_5, 2, false);
		                    }
							if(colQtyInRs_tDBInput_5 < 3) {
								row4.name = null;
							} else {
	                         		
        	row4.name = routines.system.JDBCUtil.getString(rs_tDBInput_5, 3, false);
		                    }
							if(colQtyInRs_tDBInput_5 < 4) {
								row4.currency_id = 0;
							} else {
		                          
            row4.currency_id = rs_tDBInput_5.getLong(4);
            if(rs_tDBInput_5.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_5 < 5) {
								row4.created_at = null;
							} else {
										
			row4.created_at = routines.system.JDBCUtil.getDate(rs_tDBInput_5, 5);
		                    }
							if(colQtyInRs_tDBInput_5 < 6) {
								row4.updated_at = null;
							} else {
										
			row4.updated_at = routines.system.JDBCUtil.getDate(rs_tDBInput_5, 6);
		                    }
					


 



/**
 * [tDBInput_5 begin ] stop
 */
	
	/**
	 * [tDBInput_5 main ] start
	 */

	

	
	
	currentComponent="tDBInput_5";

	

 


	tos_count_tDBInput_5++;

/**
 * [tDBInput_5 main ] stop
 */
	
	/**
	 * [tDBInput_5 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_5";

	

 



/**
 * [tDBInput_5 process_data_begin ] stop
 */

	
	/**
	 * [tAdvancedHash_row4 main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row4";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row4"
						
						);
					}
					


			   
			   

					row4Struct row4_HashRow = new row4Struct();
		   	   	   
				
				row4_HashRow.id = row4.id;
				
				row4_HashRow.iso = row4.iso;
				
				row4_HashRow.name = row4.name;
				
				row4_HashRow.currency_id = row4.currency_id;
				
				row4_HashRow.created_at = row4.created_at;
				
				row4_HashRow.updated_at = row4.updated_at;
				
			tHash_Lookup_row4.put(row4_HashRow);
			
            




 


	tos_count_tAdvancedHash_row4++;

/**
 * [tAdvancedHash_row4 main ] stop
 */
	
	/**
	 * [tAdvancedHash_row4 process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row4";

	

 



/**
 * [tAdvancedHash_row4 process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_row4 process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row4";

	

 



/**
 * [tAdvancedHash_row4 process_data_end ] stop
 */



	
	/**
	 * [tDBInput_5 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_5";

	

 



/**
 * [tDBInput_5 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_5 end ] start
	 */

	

	
	
	currentComponent="tDBInput_5";

	

	}
}finally{
	if (rs_tDBInput_5 != null) {
		rs_tDBInput_5.close();
	}
	if (stmt_tDBInput_5 != null) {
		stmt_tDBInput_5.close();
	}
}
globalMap.put("tDBInput_5_NB_LINE",nb_line_tDBInput_5);
 

ok_Hash.put("tDBInput_5", true);
end_Hash.put("tDBInput_5", System.currentTimeMillis());




/**
 * [tDBInput_5 end ] stop
 */

	
	/**
	 * [tAdvancedHash_row4 end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row4";

	

tHash_Lookup_row4.endPut();

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row4");
			  	}
			  	
 

ok_Hash.put("tAdvancedHash_row4", true);
end_Hash.put("tAdvancedHash_row4", System.currentTimeMillis());




/**
 * [tAdvancedHash_row4 end ] stop
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
	 * [tDBInput_5 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_5";

	

 



/**
 * [tDBInput_5 finally ] stop
 */

	
	/**
	 * [tAdvancedHash_row4 finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row4";

	

 



/**
 * [tAdvancedHash_row4 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBInput_5_SUBPROCESS_STATE", 1);
	}
	


public static class row5Struct implements routines.system.IPersistableComparableLookupRow<row5Struct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Geographie = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public long id;

				public long getId () {
					return this.id;
				}
				
			    public long user_id;

				public long getUser_id () {
					return this.user_id;
				}
				
			    public String name;

				public String getName () {
					return this.name;
				}
				
			    public String localisation;

				public String getLocalisation () {
					return this.localisation;
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
				
			    public String owner;

				public String getOwner () {
					return this.owner;
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
		final row5Struct other = (row5Struct) obj;
		
						if (this.id != other.id)
							return false;
					

		return true;
    }

	public void copyDataTo(row5Struct other) {

		other.id = this.id;
	            other.user_id = this.user_id;
	            other.name = this.name;
	            other.localisation = this.localisation;
	            other.created_at = this.created_at;
	            other.updated_at = this.updated_at;
	            other.activate = this.activate;
	            other.owner = this.owner;
	            
	}

	public void copyKeysDataTo(row5Struct other) {

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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Geographie) {

        	try {

        		int length = 0;
		
			        this.id = dis.readLong();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Geographie) {

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
		
			            this.user_id = dis.readLong();
					
						this.name = readString(dis,ois);
					
						this.localisation = readString(dis,ois);
					
						this.created_at = readDate(dis,ois);
					
						this.updated_at = readDate(dis,ois);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.activate = null;
           				} else {
           			    	this.activate = dis.readBoolean();
           				}
					
						this.owner = readString(dis,ois);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
			            this.user_id = objectIn.readLong();
					
						this.name = readString(dis,objectIn);
					
						this.localisation = readString(dis,objectIn);
					
						this.created_at = readDate(dis,objectIn);
					
						this.updated_at = readDate(dis,objectIn);
					
			            length = objectIn.readByte();
           				if (length == -1) {
           	    			this.activate = null;
           				} else {
           			    	this.activate = objectIn.readBoolean();
           				}
					
						this.owner = readString(dis,objectIn);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
		            	dos.writeLong(this.user_id);
					
						writeString(this.name, dos, oos);
					
						writeString(this.localisation, dos, oos);
					
						writeDate(this.created_at, dos, oos);
					
						writeDate(this.updated_at, dos, oos);
					
						if(this.activate == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.activate);
		            	}
					
						writeString(this.owner, dos, oos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
					objectOut.writeLong(this.user_id);
					
						writeString(this.name, dos, objectOut);
					
						writeString(this.localisation, dos, objectOut);
					
						writeDate(this.created_at, dos, objectOut);
					
						writeDate(this.updated_at, dos, objectOut);
					
						if(this.activate == null) {
							objectOut.writeByte(-1);
						} else {
							objectOut.writeByte(0);
							objectOut.writeBoolean(this.activate);
		            	}
					
						writeString(this.owner, dos, objectOut);
					
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
		sb.append(",user_id="+String.valueOf(user_id));
		sb.append(",name="+name);
		sb.append(",localisation="+localisation);
		sb.append(",created_at="+String.valueOf(created_at));
		sb.append(",updated_at="+String.valueOf(updated_at));
		sb.append(",activate="+String.valueOf(activate));
		sb.append(",owner="+owner);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row5Struct other) {

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
public void tDBInput_6Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_6_SUBPROCESS_STATE", 0);

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
			   		// source node:tDBInput_6 - inputs:(after_tDBInput_1) outputs:(row5,row5) | target node:tAdvancedHash_row5 - inputs:(row5) outputs:()
			   		// linked node: tMap_2 - inputs:(out1,row4,row5) outputs:(out2)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row5 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row5Struct> tHash_Lookup_row5 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row5Struct>getLookup(matchingModeEnum_row5);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row5", tHash_Lookup_row5);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row5 begin ] stop
 */



	
	/**
	 * [tDBInput_6 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_6", false);
		start_Hash.put("tDBInput_6", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_6";

	
		int tos_count_tDBInput_6 = 0;
		
	
    
	
		    int nb_line_tDBInput_6 = 0;
		    java.sql.Connection conn_tDBInput_6 = null;
				conn_tDBInput_6 = (java.sql.Connection)globalMap.get("conn_tDBConnection_1");
				
		    
			java.sql.Statement stmt_tDBInput_6 = conn_tDBInput_6.createStatement();

		    String dbquery_tDBInput_6 = "SELECT \n  \"public\".\"depots\".\"id\", \n  \"public\".\"depots\".\"user_id\", \n  \"public\".\"depots\".\"name\", \n  \"p"
+"ublic\".\"depots\".\"localisation\", \n  \"public\".\"depots\".\"created_at\", \n  \"public\".\"depots\".\"updated_at\", \n"
+"  \"public\".\"depots\".\"activate\", \n  \"public\".\"depots\".\"owner\"\nFROM \"public\".\"depots\"";
		    

            	globalMap.put("tDBInput_6_QUERY",dbquery_tDBInput_6);
		    java.sql.ResultSet rs_tDBInput_6 = null;

		    try {
		    	rs_tDBInput_6 = stmt_tDBInput_6.executeQuery(dbquery_tDBInput_6);
		    	java.sql.ResultSetMetaData rsmd_tDBInput_6 = rs_tDBInput_6.getMetaData();
		    	int colQtyInRs_tDBInput_6 = rsmd_tDBInput_6.getColumnCount();

		    String tmpContent_tDBInput_6 = null;
		    
		    
		    while (rs_tDBInput_6.next()) {
		        nb_line_tDBInput_6++;
		        
							if(colQtyInRs_tDBInput_6 < 1) {
								row5.id = 0;
							} else {
		                          
            row5.id = rs_tDBInput_6.getLong(1);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 2) {
								row5.user_id = 0;
							} else {
		                          
            row5.user_id = rs_tDBInput_6.getLong(2);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 3) {
								row5.name = null;
							} else {
	                         		
        	row5.name = routines.system.JDBCUtil.getString(rs_tDBInput_6, 3, false);
		                    }
							if(colQtyInRs_tDBInput_6 < 4) {
								row5.localisation = null;
							} else {
	                         		
        	row5.localisation = routines.system.JDBCUtil.getString(rs_tDBInput_6, 4, false);
		                    }
							if(colQtyInRs_tDBInput_6 < 5) {
								row5.created_at = null;
							} else {
										
			row5.created_at = routines.system.JDBCUtil.getDate(rs_tDBInput_6, 5);
		                    }
							if(colQtyInRs_tDBInput_6 < 6) {
								row5.updated_at = null;
							} else {
										
			row5.updated_at = routines.system.JDBCUtil.getDate(rs_tDBInput_6, 6);
		                    }
							if(colQtyInRs_tDBInput_6 < 7) {
								row5.activate = null;
							} else {
	                         		
            row5.activate = rs_tDBInput_6.getBoolean(7);
            if(rs_tDBInput_6.wasNull()){
                    row5.activate = null;
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 8) {
								row5.owner = null;
							} else {
	                         		
        	row5.owner = routines.system.JDBCUtil.getString(rs_tDBInput_6, 8, false);
		                    }
					


 



/**
 * [tDBInput_6 begin ] stop
 */
	
	/**
	 * [tDBInput_6 main ] start
	 */

	

	
	
	currentComponent="tDBInput_6";

	

 


	tos_count_tDBInput_6++;

/**
 * [tDBInput_6 main ] stop
 */
	
	/**
	 * [tDBInput_6 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_6";

	

 



/**
 * [tDBInput_6 process_data_begin ] stop
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
		   	   	   
				
				row5_HashRow.id = row5.id;
				
				row5_HashRow.user_id = row5.user_id;
				
				row5_HashRow.name = row5.name;
				
				row5_HashRow.localisation = row5.localisation;
				
				row5_HashRow.created_at = row5.created_at;
				
				row5_HashRow.updated_at = row5.updated_at;
				
				row5_HashRow.activate = row5.activate;
				
				row5_HashRow.owner = row5.owner;
				
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
	 * [tDBInput_6 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_6";

	

 



/**
 * [tDBInput_6 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_6 end ] start
	 */

	

	
	
	currentComponent="tDBInput_6";

	

	}
}finally{
	if (rs_tDBInput_6 != null) {
		rs_tDBInput_6.close();
	}
	if (stmt_tDBInput_6 != null) {
		stmt_tDBInput_6.close();
	}
}
globalMap.put("tDBInput_6_NB_LINE",nb_line_tDBInput_6);
 

ok_Hash.put("tDBInput_6", true);
end_Hash.put("tDBInput_6", System.currentTimeMillis());




/**
 * [tDBInput_6 end ] stop
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
	 * [tDBInput_6 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_6";

	

 



/**
 * [tDBInput_6 finally ] stop
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
		

		globalMap.put("tDBInput_6_SUBPROCESS_STATE", 1);
	}
	


public static class row7Struct implements routines.system.IPersistableComparableLookupRow<row7Struct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Geographie = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public long id_secteur;

				public long getId_secteur () {
					return this.id_secteur;
				}
				
			    public String region_commercial;

				public String getRegion_commercial () {
					return this.region_commercial;
				}
				
			    public String zone_supervision;

				public String getZone_supervision () {
					return this.zone_supervision;
				}
				
			    public String secteur;

				public String getSecteur () {
					return this.secteur;
				}
				
			    public String hub;

				public String getHub () {
					return this.hub;
				}
				
			    public String pays;

				public String getPays () {
					return this.pays;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
							result = prime * result + (int) this.id_secteur;
						
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
		final row7Struct other = (row7Struct) obj;
		
						if (this.id_secteur != other.id_secteur)
							return false;
					

		return true;
    }

	public void copyDataTo(row7Struct other) {

		other.id_secteur = this.id_secteur;
	            other.region_commercial = this.region_commercial;
	            other.zone_supervision = this.zone_supervision;
	            other.secteur = this.secteur;
	            other.hub = this.hub;
	            other.pays = this.pays;
	            
	}

	public void copyKeysDataTo(row7Struct other) {

		other.id_secteur = this.id_secteur;
	            	
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

    public void readKeysData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Geographie) {

        	try {

        		int length = 0;
		
			        this.id_secteur = dis.readLong();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Geographie) {

        	try {

        		int length = 0;
		
			        this.id_secteur = dis.readLong();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id_secteur);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id_secteur);
					
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
		
						this.region_commercial = readString(dis,ois);
					
						this.zone_supervision = readString(dis,ois);
					
						this.secteur = readString(dis,ois);
					
						this.hub = readString(dis,ois);
					
						this.pays = readString(dis,ois);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
						this.region_commercial = readString(dis,objectIn);
					
						this.zone_supervision = readString(dis,objectIn);
					
						this.secteur = readString(dis,objectIn);
					
						this.hub = readString(dis,objectIn);
					
						this.pays = readString(dis,objectIn);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
						writeString(this.region_commercial, dos, oos);
					
						writeString(this.zone_supervision, dos, oos);
					
						writeString(this.secteur, dos, oos);
					
						writeString(this.hub, dos, oos);
					
						writeString(this.pays, dos, oos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
						writeString(this.region_commercial, dos, objectOut);
					
						writeString(this.zone_supervision, dos, objectOut);
					
						writeString(this.secteur, dos, objectOut);
					
						writeString(this.hub, dos, objectOut);
					
						writeString(this.pays, dos, objectOut);
					
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
		sb.append("id_secteur="+String.valueOf(id_secteur));
		sb.append(",region_commercial="+region_commercial);
		sb.append(",zone_supervision="+zone_supervision);
		sb.append(",secteur="+secteur);
		sb.append(",hub="+hub);
		sb.append(",pays="+pays);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row7Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.id_secteur, other.id_secteur);
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



		row7Struct row7 = new row7Struct();




	
	/**
	 * [tAdvancedHash_row7 begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_row7", false);
		start_Hash.put("tAdvancedHash_row7", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_row7";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row7");
					}
				
		int tos_count_tAdvancedHash_row7 = 0;
		

			   		// connection name:row7
			   		// source node:tDBInput_2 - inputs:(after_tDBInput_1) outputs:(row7,row7) | target node:tAdvancedHash_row7 - inputs:(row7) outputs:()
			   		// linked node: tMap_3 - inputs:(row10,row7) outputs:(Insert_New_Data,Update_Data)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row7 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row7Struct> tHash_Lookup_row7 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row7Struct>getLookup(matchingModeEnum_row7);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row7", tHash_Lookup_row7);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row7 begin ] stop
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
				
				 
	final String decryptedPassword_tDBInput_2 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:DgIcxx+vJqizecNiiPQkJoZwrScjd00ZfJiyBT0qGxoy8PVrFRM=");
				
				String dbPwd_tDBInput_2 = decryptedPassword_tDBInput_2;
				
				String url_tDBInput_2 = "jdbc:postgresql://" + "163.172.166.119" + ":" + "5432" + "/" + "leuk_analytics";
				
				conn_tDBInput_2 = java.sql.DriverManager.getConnection(url_tDBInput_2,dbUser_tDBInput_2,dbPwd_tDBInput_2);
		        
				conn_tDBInput_2.setAutoCommit(false);
			
		    
			java.sql.Statement stmt_tDBInput_2 = conn_tDBInput_2.createStatement();

		    String dbquery_tDBInput_2 = "SELECT \n  \"public\".\"Dim_Geographie\".\"id_secteur\", \n  \"public\".\"Dim_Geographie\".\"region_commercial\", \n  \"pu"
+"blic\".\"Dim_Geographie\".\"zone_supervision\", \n  \"public\".\"Dim_Geographie\".\"secteur\", \n  \"public\".\"Dim_Geogra"
+"phie\".\"hub\", \n  \"public\".\"Dim_Geographie\".\"pays\"\nFROM \"public\".\"Dim_Geographie\"";
		    

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
								row7.id_secteur = 0;
							} else {
		                          
            row7.id_secteur = rs_tDBInput_2.getLong(1);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 2) {
								row7.region_commercial = null;
							} else {
	                         		
        	row7.region_commercial = routines.system.JDBCUtil.getString(rs_tDBInput_2, 2, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 3) {
								row7.zone_supervision = null;
							} else {
	                         		
        	row7.zone_supervision = routines.system.JDBCUtil.getString(rs_tDBInput_2, 3, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 4) {
								row7.secteur = null;
							} else {
	                         		
        	row7.secteur = routines.system.JDBCUtil.getString(rs_tDBInput_2, 4, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 5) {
								row7.hub = null;
							} else {
	                         		
        	row7.hub = routines.system.JDBCUtil.getString(rs_tDBInput_2, 5, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 6) {
								row7.pays = null;
							} else {
	                         		
        	row7.pays = routines.system.JDBCUtil.getString(rs_tDBInput_2, 6, false);
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
	 * [tAdvancedHash_row7 main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row7";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row7"
						
						);
					}
					


			   
			   

					row7Struct row7_HashRow = new row7Struct();
		   	   	   
				
				row7_HashRow.id_secteur = row7.id_secteur;
				
				row7_HashRow.region_commercial = row7.region_commercial;
				
				row7_HashRow.zone_supervision = row7.zone_supervision;
				
				row7_HashRow.secteur = row7.secteur;
				
				row7_HashRow.hub = row7.hub;
				
				row7_HashRow.pays = row7.pays;
				
			tHash_Lookup_row7.put(row7_HashRow);
			
            




 


	tos_count_tAdvancedHash_row7++;

/**
 * [tAdvancedHash_row7 main ] stop
 */
	
	/**
	 * [tAdvancedHash_row7 process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row7";

	

 



/**
 * [tAdvancedHash_row7 process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_row7 process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row7";

	

 



/**
 * [tAdvancedHash_row7 process_data_end ] stop
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
	 * [tAdvancedHash_row7 end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row7";

	

tHash_Lookup_row7.endPut();

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row7");
			  	}
			  	
 

ok_Hash.put("tAdvancedHash_row7", true);
end_Hash.put("tAdvancedHash_row7", System.currentTimeMillis());




/**
 * [tAdvancedHash_row7 end ] stop
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
	 * [tAdvancedHash_row7 finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row7";

	

 



/**
 * [tAdvancedHash_row7 finally ] stop
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
	


public static class row8Struct implements routines.system.IPersistableComparableLookupRow<row8Struct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Geographie = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public long id_secteur;

				public long getId_secteur () {
					return this.id_secteur;
				}
				
			    public String region_commercial;

				public String getRegion_commercial () {
					return this.region_commercial;
				}
				
			    public String zone_supervision;

				public String getZone_supervision () {
					return this.zone_supervision;
				}
				
			    public String secteur;

				public String getSecteur () {
					return this.secteur;
				}
				
			    public String hub;

				public String getHub () {
					return this.hub;
				}
				
			    public String pays;

				public String getPays () {
					return this.pays;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
							result = prime * result + (int) this.id_secteur;
						
						result = prime * result + ((this.region_commercial == null) ? 0 : this.region_commercial.hashCode());
					
						result = prime * result + ((this.zone_supervision == null) ? 0 : this.zone_supervision.hashCode());
					
						result = prime * result + ((this.secteur == null) ? 0 : this.secteur.hashCode());
					
						result = prime * result + ((this.hub == null) ? 0 : this.hub.hashCode());
					
						result = prime * result + ((this.pays == null) ? 0 : this.pays.hashCode());
					
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
		final row8Struct other = (row8Struct) obj;
		
						if (this.id_secteur != other.id_secteur)
							return false;
					
						if (this.region_commercial == null) {
							if (other.region_commercial != null)
								return false;
						
						} else if (!this.region_commercial.equals(other.region_commercial))
						
							return false;
					
						if (this.zone_supervision == null) {
							if (other.zone_supervision != null)
								return false;
						
						} else if (!this.zone_supervision.equals(other.zone_supervision))
						
							return false;
					
						if (this.secteur == null) {
							if (other.secteur != null)
								return false;
						
						} else if (!this.secteur.equals(other.secteur))
						
							return false;
					
						if (this.hub == null) {
							if (other.hub != null)
								return false;
						
						} else if (!this.hub.equals(other.hub))
						
							return false;
					
						if (this.pays == null) {
							if (other.pays != null)
								return false;
						
						} else if (!this.pays.equals(other.pays))
						
							return false;
					

		return true;
    }

	public void copyDataTo(row8Struct other) {

		other.id_secteur = this.id_secteur;
	            other.region_commercial = this.region_commercial;
	            other.zone_supervision = this.zone_supervision;
	            other.secteur = this.secteur;
	            other.hub = this.hub;
	            other.pays = this.pays;
	            
	}

	public void copyKeysDataTo(row8Struct other) {

		other.id_secteur = this.id_secteur;
	            	other.region_commercial = this.region_commercial;
	            	other.zone_supervision = this.zone_supervision;
	            	other.secteur = this.secteur;
	            	other.hub = this.hub;
	            	other.pays = this.pays;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie, 0, length, utf8Charset);
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
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Geographie, 0, length, utf8Charset);
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

    public void readKeysData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Geographie) {

        	try {

        		int length = 0;
		
			        this.id_secteur = dis.readLong();
					
					this.region_commercial = readString(dis);
					
					this.zone_supervision = readString(dis);
					
					this.secteur = readString(dis);
					
					this.hub = readString(dis);
					
					this.pays = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Geographie) {

        	try {

        		int length = 0;
		
			        this.id_secteur = dis.readLong();
					
					this.region_commercial = readString(dis);
					
					this.zone_supervision = readString(dis);
					
					this.secteur = readString(dis);
					
					this.hub = readString(dis);
					
					this.pays = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id_secteur);
					
					// String
				
						writeString(this.region_commercial,dos);
					
					// String
				
						writeString(this.zone_supervision,dos);
					
					// String
				
						writeString(this.secteur,dos);
					
					// String
				
						writeString(this.hub,dos);
					
					// String
				
						writeString(this.pays,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id_secteur);
					
					// String
				
						writeString(this.region_commercial,dos);
					
					// String
				
						writeString(this.zone_supervision,dos);
					
					// String
				
						writeString(this.secteur,dos);
					
					// String
				
						writeString(this.hub,dos);
					
					// String
				
						writeString(this.pays,dos);
					
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
		

		

        }

		
        	finally {}

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		

		

        }

		
        	finally {}

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
        	}
        	finally {}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
        	}
        	finally {}
    }


    
    public boolean supportMarshaller(){
        return true;
    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id_secteur="+String.valueOf(id_secteur));
		sb.append(",region_commercial="+region_commercial);
		sb.append(",zone_supervision="+zone_supervision);
		sb.append(",secteur="+secteur);
		sb.append(",hub="+hub);
		sb.append(",pays="+pays);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row8Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.id_secteur, other.id_secteur);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.region_commercial, other.region_commercial);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.zone_supervision, other.zone_supervision);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.secteur, other.secteur);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.hub, other.hub);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.pays, other.pays);
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
public void tDBInput_7Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_7_SUBPROCESS_STATE", 0);

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



		row8Struct row8 = new row8Struct();




	
	/**
	 * [tAdvancedHash_row8 begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_row8", false);
		start_Hash.put("tAdvancedHash_row8", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_row8";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row8");
					}
				
		int tos_count_tAdvancedHash_row8 = 0;
		

			   		// connection name:row8
			   		// source node:tDBInput_7 - inputs:(after_tDBInput_1) outputs:(row8,row8) | target node:tAdvancedHash_row8 - inputs:(row8) outputs:()
			   		// linked node: tMap_4 - inputs:(Update_Data,row8) outputs:(Update_Line_Existing)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row8 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row8Struct> tHash_Lookup_row8 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row8Struct>getLookup(matchingModeEnum_row8);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row8", tHash_Lookup_row8);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row8 begin ] stop
 */



	
	/**
	 * [tDBInput_7 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_7", false);
		start_Hash.put("tDBInput_7", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_7";

	
		int tos_count_tDBInput_7 = 0;
		
	
    
	
		    int nb_line_tDBInput_7 = 0;
		    java.sql.Connection conn_tDBInput_7 = null;
				String driverClass_tDBInput_7 = "org.postgresql.Driver";
			    java.lang.Class jdbcclazz_tDBInput_7 = java.lang.Class.forName(driverClass_tDBInput_7);
				String dbUser_tDBInput_7 = "malick.diouf";
				
				 
	final String decryptedPassword_tDBInput_7 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:FCmJsiN4KCoLJ8ta/hF5Ma9JpAp8Y2GU0jTR+3j+7Jga+8UYND0=");
				
				String dbPwd_tDBInput_7 = decryptedPassword_tDBInput_7;
				
				String url_tDBInput_7 = "jdbc:postgresql://" + "163.172.166.119" + ":" + "5432" + "/" + "leuk_analytics";
				
				conn_tDBInput_7 = java.sql.DriverManager.getConnection(url_tDBInput_7,dbUser_tDBInput_7,dbPwd_tDBInput_7);
		        
				conn_tDBInput_7.setAutoCommit(false);
			
		    
			java.sql.Statement stmt_tDBInput_7 = conn_tDBInput_7.createStatement();

		    String dbquery_tDBInput_7 = "SELECT \n  \"public\".\"Dim_Geographie\".\"id_secteur\", \n  \"public\".\"Dim_Geographie\".\"region_commercial\", \n  \"pu"
+"blic\".\"Dim_Geographie\".\"zone_supervision\", \n  \"public\".\"Dim_Geographie\".\"secteur\", \n  \"public\".\"Dim_Geogra"
+"phie\".\"hub\", \n  \"public\".\"Dim_Geographie\".\"pays\"\nFROM \"public\".\"Dim_Geographie\"";
		    

            	globalMap.put("tDBInput_7_QUERY",dbquery_tDBInput_7);
		    java.sql.ResultSet rs_tDBInput_7 = null;

		    try {
		    	rs_tDBInput_7 = stmt_tDBInput_7.executeQuery(dbquery_tDBInput_7);
		    	java.sql.ResultSetMetaData rsmd_tDBInput_7 = rs_tDBInput_7.getMetaData();
		    	int colQtyInRs_tDBInput_7 = rsmd_tDBInput_7.getColumnCount();

		    String tmpContent_tDBInput_7 = null;
		    
		    
		    while (rs_tDBInput_7.next()) {
		        nb_line_tDBInput_7++;
		        
							if(colQtyInRs_tDBInput_7 < 1) {
								row8.id_secteur = 0;
							} else {
		                          
            row8.id_secteur = rs_tDBInput_7.getLong(1);
            if(rs_tDBInput_7.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_7 < 2) {
								row8.region_commercial = null;
							} else {
	                         		
        	row8.region_commercial = routines.system.JDBCUtil.getString(rs_tDBInput_7, 2, false);
		                    }
							if(colQtyInRs_tDBInput_7 < 3) {
								row8.zone_supervision = null;
							} else {
	                         		
        	row8.zone_supervision = routines.system.JDBCUtil.getString(rs_tDBInput_7, 3, false);
		                    }
							if(colQtyInRs_tDBInput_7 < 4) {
								row8.secteur = null;
							} else {
	                         		
        	row8.secteur = routines.system.JDBCUtil.getString(rs_tDBInput_7, 4, false);
		                    }
							if(colQtyInRs_tDBInput_7 < 5) {
								row8.hub = null;
							} else {
	                         		
        	row8.hub = routines.system.JDBCUtil.getString(rs_tDBInput_7, 5, false);
		                    }
							if(colQtyInRs_tDBInput_7 < 6) {
								row8.pays = null;
							} else {
	                         		
        	row8.pays = routines.system.JDBCUtil.getString(rs_tDBInput_7, 6, false);
		                    }
					


 



/**
 * [tDBInput_7 begin ] stop
 */
	
	/**
	 * [tDBInput_7 main ] start
	 */

	

	
	
	currentComponent="tDBInput_7";

	

 


	tos_count_tDBInput_7++;

/**
 * [tDBInput_7 main ] stop
 */
	
	/**
	 * [tDBInput_7 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_7";

	

 



/**
 * [tDBInput_7 process_data_begin ] stop
 */

	
	/**
	 * [tAdvancedHash_row8 main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row8";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row8"
						
						);
					}
					


			   
			   

					row8Struct row8_HashRow = new row8Struct();
		   	   	   
				
				row8_HashRow.id_secteur = row8.id_secteur;
				
				row8_HashRow.region_commercial = row8.region_commercial;
				
				row8_HashRow.zone_supervision = row8.zone_supervision;
				
				row8_HashRow.secteur = row8.secteur;
				
				row8_HashRow.hub = row8.hub;
				
				row8_HashRow.pays = row8.pays;
				
			tHash_Lookup_row8.put(row8_HashRow);
			
            




 


	tos_count_tAdvancedHash_row8++;

/**
 * [tAdvancedHash_row8 main ] stop
 */
	
	/**
	 * [tAdvancedHash_row8 process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row8";

	

 



/**
 * [tAdvancedHash_row8 process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_row8 process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row8";

	

 



/**
 * [tAdvancedHash_row8 process_data_end ] stop
 */



	
	/**
	 * [tDBInput_7 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_7";

	

 



/**
 * [tDBInput_7 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_7 end ] start
	 */

	

	
	
	currentComponent="tDBInput_7";

	

	}
}finally{
	if (rs_tDBInput_7 != null) {
		rs_tDBInput_7.close();
	}
	if (stmt_tDBInput_7 != null) {
		stmt_tDBInput_7.close();
	}
	if(conn_tDBInput_7 != null && !conn_tDBInput_7.isClosed()) {
		
			conn_tDBInput_7.commit();
			
		
			conn_tDBInput_7.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
			}
			
	}
	
}
globalMap.put("tDBInput_7_NB_LINE",nb_line_tDBInput_7);
 

ok_Hash.put("tDBInput_7", true);
end_Hash.put("tDBInput_7", System.currentTimeMillis());




/**
 * [tDBInput_7 end ] stop
 */

	
	/**
	 * [tAdvancedHash_row8 end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row8";

	

tHash_Lookup_row8.endPut();

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row8");
			  	}
			  	
 

ok_Hash.put("tAdvancedHash_row8", true);
end_Hash.put("tAdvancedHash_row8", System.currentTimeMillis());




/**
 * [tAdvancedHash_row8 end ] stop
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
	 * [tDBInput_7 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_7";

	

 



/**
 * [tDBInput_7 finally ] stop
 */

	
	/**
	 * [tAdvancedHash_row8 finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row8";

	

 



/**
 * [tAdvancedHash_row8 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBInput_7_SUBPROCESS_STATE", 1);
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
   	 				runStat.updateStatOnConnection("OnComponentOk5", 0, "ok");
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
   	 				runStat.updateStatOnConnection("OnComponentOk6", 0, "ok");
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
   	 				runStat.updateStatOnConnection("OnComponentOk7", 0, "ok");
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
   	 				runStat.updateStatOnConnection("OnComponentOk8", 0, "ok");
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
        final Alimentation_Dim_Geographie Alimentation_Dim_GeographieClass = new Alimentation_Dim_Geographie();

        int exitCode = Alimentation_Dim_GeographieClass.runJobInTOS(args);

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
            java.io.InputStream inContext = Alimentation_Dim_Geographie.class.getClassLoader().getResourceAsStream("warehouse/alimentation_dim_geographie_0_1/contexts/" + contextStr + ".properties");
            if (inContext == null) {
                inContext = Alimentation_Dim_Geographie.class.getClassLoader().getResourceAsStream("config/contexts/" + contextStr + ".properties");
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
            System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : Alimentation_Dim_Geographie");
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
 *     374030 characters generated by Talend Open Studio for Data Integration 
 *     on the 26 février 2025 à 14:58:44 UTC
 ************************************************************************************************/