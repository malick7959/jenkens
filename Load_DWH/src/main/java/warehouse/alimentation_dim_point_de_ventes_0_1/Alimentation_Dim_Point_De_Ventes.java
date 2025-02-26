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


package warehouse.alimentation_dim_point_de_ventes_0_1;

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
 * Job: Alimentation_Dim_Point_De_Ventes Purpose: <br>
 * Description:  <br>
 * @author user@talend.com
 * @version 8.0.1.20211109_1610
 * @status PROD
 */
public class Alimentation_Dim_Point_De_Ventes implements TalendJob {

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
	private final String jobName = "Alimentation_Dim_Point_De_Ventes";
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
				Alimentation_Dim_Point_De_Ventes.this.exception = e;
			}
		}
		if (!(e instanceof TalendException)) {
		try {
			for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
				if (m.getName().compareTo(currentComponent + "_error") == 0) {
					m.invoke(Alimentation_Dim_Point_De_Ventes.this, new Object[] { e , currentComponent, globalMap});
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
			
			public void tMap_4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFilterRow_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_5_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tLogRow_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
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
			
			public void tSortRow_3_SortOut_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
							tSortRow_3_SortIn_error(exception, errorComponent, globalMap);
						
						}
					
			public void tSortRow_3_SortIn_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
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
	
	
		 
	final String decryptedPassword_tDBConnection_1 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:pIekrSta1rxYyE/h+398kkTDcqWxBA/3zeWZmrpA5YuPAwne0+O9WC4t");
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
	
	
		 
	final String decryptedPassword_tDBConnection_2 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:N4JQPoaUpY3D4VcOW+QwYi9jz9/jxX8TKapzEQJy+mAyRhlCgqk=");
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
	


public static class out3Struct implements routines.system.IPersistableRow<out3Struct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[0];

	
			    public String name;

				public String getName () {
					return this.name;
				}
				
			    public String qr_code;

				public String getQr_code () {
					return this.qr_code;
				}
				
			    public String phone;

				public String getPhone () {
					return this.phone;
				}
				
			    public String address;

				public String getAddress () {
					return this.address;
				}
				
			    public java.util.Date created_at;

				public java.util.Date getCreated_at () {
					return this.created_at;
				}
				
			    public String status;

				public String getStatus () {
					return this.status;
				}
				
			    public String Secteur;

				public String getSecteur () {
					return this.Secteur;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length, utf8Charset);
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
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes) {

        	try {

        		int length = 0;
		
					this.name = readString(dis);
					
					this.qr_code = readString(dis);
					
					this.phone = readString(dis);
					
					this.address = readString(dis);
					
					this.created_at = readDate(dis);
					
					this.status = readString(dis);
					
					this.Secteur = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes) {

        	try {

        		int length = 0;
		
					this.name = readString(dis);
					
					this.qr_code = readString(dis);
					
					this.phone = readString(dis);
					
					this.address = readString(dis);
					
					this.created_at = readDate(dis);
					
					this.status = readString(dis);
					
					this.Secteur = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.name,dos);
					
					// String
				
						writeString(this.qr_code,dos);
					
					// String
				
						writeString(this.phone,dos);
					
					// String
				
						writeString(this.address,dos);
					
					// java.util.Date
				
						writeDate(this.created_at,dos);
					
					// String
				
						writeString(this.status,dos);
					
					// String
				
						writeString(this.Secteur,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.name,dos);
					
					// String
				
						writeString(this.qr_code,dos);
					
					// String
				
						writeString(this.phone,dos);
					
					// String
				
						writeString(this.address,dos);
					
					// java.util.Date
				
						writeDate(this.created_at,dos);
					
					// String
				
						writeString(this.status,dos);
					
					// String
				
						writeString(this.Secteur,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("name="+name);
		sb.append(",qr_code="+qr_code);
		sb.append(",phone="+phone);
		sb.append(",address="+address);
		sb.append(",created_at="+String.valueOf(created_at));
		sb.append(",status="+status);
		sb.append(",Secteur="+Secteur);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(out3Struct other) {

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

public static class Update_PDVStruct implements routines.system.IPersistableRow<Update_PDVStruct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public long id_pdv;

				public long getId_pdv () {
					return this.id_pdv;
				}
				
			    public long id_secteur;

				public long getId_secteur () {
					return this.id_secteur;
				}
				
			    public String qr_code;

				public String getQr_code () {
					return this.qr_code;
				}
				
			    public String name;

				public String getName () {
					return this.name;
				}
				
			    public String phone;

				public String getPhone () {
					return this.phone;
				}
				
			    public String address;

				public String getAddress () {
					return this.address;
				}
				
			    public String latitude;

				public String getLatitude () {
					return this.latitude;
				}
				
			    public String longitude;

				public String getLongitude () {
					return this.longitude;
				}
				
			    public java.util.Date date_creation;

				public java.util.Date getDate_creation () {
					return this.date_creation;
				}
				
			    public java.util.Date date_update;

				public java.util.Date getDate_update () {
					return this.date_update;
				}
				
			    public String jourlivraison_1;

				public String getJourlivraison_1 () {
					return this.jourlivraison_1;
				}
				
			    public String jourlivraison_2;

				public String getJourlivraison_2 () {
					return this.jourlivraison_2;
				}
				
			    public String jourlivraison_3;

				public String getJourlivraison_3 () {
					return this.jourlivraison_3;
				}
				
			    public String cluster;

				public String getCluster () {
					return this.cluster;
				}
				
			    public Boolean gs;

				public Boolean getGs () {
					return this.gs;
				}
				
			    public String statu;

				public String getStatu () {
					return this.statu;
				}
				
			    public Boolean secours;

				public Boolean getSecours () {
					return this.secours;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
							result = prime * result + (int) this.id_pdv;
						
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
		final Update_PDVStruct other = (Update_PDVStruct) obj;
		
						if (this.id_pdv != other.id_pdv)
							return false;
					

		return true;
    }

	public void copyDataTo(Update_PDVStruct other) {

		other.id_pdv = this.id_pdv;
	            other.id_secteur = this.id_secteur;
	            other.qr_code = this.qr_code;
	            other.name = this.name;
	            other.phone = this.phone;
	            other.address = this.address;
	            other.latitude = this.latitude;
	            other.longitude = this.longitude;
	            other.date_creation = this.date_creation;
	            other.date_update = this.date_update;
	            other.jourlivraison_1 = this.jourlivraison_1;
	            other.jourlivraison_2 = this.jourlivraison_2;
	            other.jourlivraison_3 = this.jourlivraison_3;
	            other.cluster = this.cluster;
	            other.gs = this.gs;
	            other.statu = this.statu;
	            other.secours = this.secours;
	            
	}

	public void copyKeysDataTo(Update_PDVStruct other) {

		other.id_pdv = this.id_pdv;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length, utf8Charset);
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
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes) {

        	try {

        		int length = 0;
		
			        this.id_pdv = dis.readLong();
					
			        this.id_secteur = dis.readLong();
					
					this.qr_code = readString(dis);
					
					this.name = readString(dis);
					
					this.phone = readString(dis);
					
					this.address = readString(dis);
					
					this.latitude = readString(dis);
					
					this.longitude = readString(dis);
					
					this.date_creation = readDate(dis);
					
					this.date_update = readDate(dis);
					
					this.jourlivraison_1 = readString(dis);
					
					this.jourlivraison_2 = readString(dis);
					
					this.jourlivraison_3 = readString(dis);
					
					this.cluster = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.gs = null;
           				} else {
           			    	this.gs = dis.readBoolean();
           				}
					
					this.statu = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.secours = null;
           				} else {
           			    	this.secours = dis.readBoolean();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes) {

        	try {

        		int length = 0;
		
			        this.id_pdv = dis.readLong();
					
			        this.id_secteur = dis.readLong();
					
					this.qr_code = readString(dis);
					
					this.name = readString(dis);
					
					this.phone = readString(dis);
					
					this.address = readString(dis);
					
					this.latitude = readString(dis);
					
					this.longitude = readString(dis);
					
					this.date_creation = readDate(dis);
					
					this.date_update = readDate(dis);
					
					this.jourlivraison_1 = readString(dis);
					
					this.jourlivraison_2 = readString(dis);
					
					this.jourlivraison_3 = readString(dis);
					
					this.cluster = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.gs = null;
           				} else {
           			    	this.gs = dis.readBoolean();
           				}
					
					this.statu = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.secours = null;
           				} else {
           			    	this.secours = dis.readBoolean();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id_pdv);
					
					// long
				
		            	dos.writeLong(this.id_secteur);
					
					// String
				
						writeString(this.qr_code,dos);
					
					// String
				
						writeString(this.name,dos);
					
					// String
				
						writeString(this.phone,dos);
					
					// String
				
						writeString(this.address,dos);
					
					// String
				
						writeString(this.latitude,dos);
					
					// String
				
						writeString(this.longitude,dos);
					
					// java.util.Date
				
						writeDate(this.date_creation,dos);
					
					// java.util.Date
				
						writeDate(this.date_update,dos);
					
					// String
				
						writeString(this.jourlivraison_1,dos);
					
					// String
				
						writeString(this.jourlivraison_2,dos);
					
					// String
				
						writeString(this.jourlivraison_3,dos);
					
					// String
				
						writeString(this.cluster,dos);
					
					// Boolean
				
						if(this.gs == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.gs);
		            	}
					
					// String
				
						writeString(this.statu,dos);
					
					// Boolean
				
						if(this.secours == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.secours);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id_pdv);
					
					// long
				
		            	dos.writeLong(this.id_secteur);
					
					// String
				
						writeString(this.qr_code,dos);
					
					// String
				
						writeString(this.name,dos);
					
					// String
				
						writeString(this.phone,dos);
					
					// String
				
						writeString(this.address,dos);
					
					// String
				
						writeString(this.latitude,dos);
					
					// String
				
						writeString(this.longitude,dos);
					
					// java.util.Date
				
						writeDate(this.date_creation,dos);
					
					// java.util.Date
				
						writeDate(this.date_update,dos);
					
					// String
				
						writeString(this.jourlivraison_1,dos);
					
					// String
				
						writeString(this.jourlivraison_2,dos);
					
					// String
				
						writeString(this.jourlivraison_3,dos);
					
					// String
				
						writeString(this.cluster,dos);
					
					// Boolean
				
						if(this.gs == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.gs);
		            	}
					
					// String
				
						writeString(this.statu,dos);
					
					// Boolean
				
						if(this.secours == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.secours);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id_pdv="+String.valueOf(id_pdv));
		sb.append(",id_secteur="+String.valueOf(id_secteur));
		sb.append(",qr_code="+qr_code);
		sb.append(",name="+name);
		sb.append(",phone="+phone);
		sb.append(",address="+address);
		sb.append(",latitude="+latitude);
		sb.append(",longitude="+longitude);
		sb.append(",date_creation="+String.valueOf(date_creation));
		sb.append(",date_update="+String.valueOf(date_update));
		sb.append(",jourlivraison_1="+jourlivraison_1);
		sb.append(",jourlivraison_2="+jourlivraison_2);
		sb.append(",jourlivraison_3="+jourlivraison_3);
		sb.append(",cluster="+cluster);
		sb.append(",gs="+String.valueOf(gs));
		sb.append(",statu="+statu);
		sb.append(",secours="+String.valueOf(secours));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(Update_PDVStruct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.id_pdv, other.id_pdv);
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

public static class row10Struct implements routines.system.IPersistableRow<row10Struct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[0];

	
			    public long ID_PDV;

				public long getID_PDV () {
					return this.ID_PDV;
				}
				
			    public Long sector_id;

				public Long getSector_id () {
					return this.sector_id;
				}
				
			    public String name;

				public String getName () {
					return this.name;
				}
				
			    public String qr_code;

				public String getQr_code () {
					return this.qr_code;
				}
				
			    public String phone;

				public String getPhone () {
					return this.phone;
				}
				
			    public String address;

				public String getAddress () {
					return this.address;
				}
				
			    public String lat;

				public String getLat () {
					return this.lat;
				}
				
			    public String lng;

				public String getLng () {
					return this.lng;
				}
				
			    public Boolean secours;

				public Boolean getSecours () {
					return this.secours;
				}
				
			    public Boolean golden_shop;

				public Boolean getGolden_shop () {
					return this.golden_shop;
				}
				
			    public String status;

				public String getStatus () {
					return this.status;
				}
				
			    public java.util.Date Date_Creation;

				public java.util.Date getDate_Creation () {
					return this.Date_Creation;
				}
				
			    public java.util.Date Date_Update;

				public java.util.Date getDate_Update () {
					return this.Date_Update;
				}
				
			    public String cluster;

				public String getCluster () {
					return this.cluster;
				}
				
			    public String Jour_Livraison_1;

				public String getJour_Livraison_1 () {
					return this.Jour_Livraison_1;
				}
				
			    public String Jour_Livraison_2;

				public String getJour_Livraison_2 () {
					return this.Jour_Livraison_2;
				}
				
			    public String Jour_Livraison_3;

				public String getJour_Livraison_3 () {
					return this.Jour_Livraison_3;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length, utf8Charset);
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
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes) {

        	try {

        		int length = 0;
		
			        this.ID_PDV = dis.readLong();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.sector_id = null;
           				} else {
           			    	this.sector_id = dis.readLong();
           				}
					
					this.name = readString(dis);
					
					this.qr_code = readString(dis);
					
					this.phone = readString(dis);
					
					this.address = readString(dis);
					
					this.lat = readString(dis);
					
					this.lng = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.secours = null;
           				} else {
           			    	this.secours = dis.readBoolean();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.golden_shop = null;
           				} else {
           			    	this.golden_shop = dis.readBoolean();
           				}
					
					this.status = readString(dis);
					
					this.Date_Creation = readDate(dis);
					
					this.Date_Update = readDate(dis);
					
					this.cluster = readString(dis);
					
					this.Jour_Livraison_1 = readString(dis);
					
					this.Jour_Livraison_2 = readString(dis);
					
					this.Jour_Livraison_3 = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes) {

        	try {

        		int length = 0;
		
			        this.ID_PDV = dis.readLong();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.sector_id = null;
           				} else {
           			    	this.sector_id = dis.readLong();
           				}
					
					this.name = readString(dis);
					
					this.qr_code = readString(dis);
					
					this.phone = readString(dis);
					
					this.address = readString(dis);
					
					this.lat = readString(dis);
					
					this.lng = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.secours = null;
           				} else {
           			    	this.secours = dis.readBoolean();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.golden_shop = null;
           				} else {
           			    	this.golden_shop = dis.readBoolean();
           				}
					
					this.status = readString(dis);
					
					this.Date_Creation = readDate(dis);
					
					this.Date_Update = readDate(dis);
					
					this.cluster = readString(dis);
					
					this.Jour_Livraison_1 = readString(dis);
					
					this.Jour_Livraison_2 = readString(dis);
					
					this.Jour_Livraison_3 = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.ID_PDV);
					
					// Long
				
						if(this.sector_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.sector_id);
		            	}
					
					// String
				
						writeString(this.name,dos);
					
					// String
				
						writeString(this.qr_code,dos);
					
					// String
				
						writeString(this.phone,dos);
					
					// String
				
						writeString(this.address,dos);
					
					// String
				
						writeString(this.lat,dos);
					
					// String
				
						writeString(this.lng,dos);
					
					// Boolean
				
						if(this.secours == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.secours);
		            	}
					
					// Boolean
				
						if(this.golden_shop == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.golden_shop);
		            	}
					
					// String
				
						writeString(this.status,dos);
					
					// java.util.Date
				
						writeDate(this.Date_Creation,dos);
					
					// java.util.Date
				
						writeDate(this.Date_Update,dos);
					
					// String
				
						writeString(this.cluster,dos);
					
					// String
				
						writeString(this.Jour_Livraison_1,dos);
					
					// String
				
						writeString(this.Jour_Livraison_2,dos);
					
					// String
				
						writeString(this.Jour_Livraison_3,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.ID_PDV);
					
					// Long
				
						if(this.sector_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.sector_id);
		            	}
					
					// String
				
						writeString(this.name,dos);
					
					// String
				
						writeString(this.qr_code,dos);
					
					// String
				
						writeString(this.phone,dos);
					
					// String
				
						writeString(this.address,dos);
					
					// String
				
						writeString(this.lat,dos);
					
					// String
				
						writeString(this.lng,dos);
					
					// Boolean
				
						if(this.secours == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.secours);
		            	}
					
					// Boolean
				
						if(this.golden_shop == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.golden_shop);
		            	}
					
					// String
				
						writeString(this.status,dos);
					
					// java.util.Date
				
						writeDate(this.Date_Creation,dos);
					
					// java.util.Date
				
						writeDate(this.Date_Update,dos);
					
					// String
				
						writeString(this.cluster,dos);
					
					// String
				
						writeString(this.Jour_Livraison_1,dos);
					
					// String
				
						writeString(this.Jour_Livraison_2,dos);
					
					// String
				
						writeString(this.Jour_Livraison_3,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_PDV="+String.valueOf(ID_PDV));
		sb.append(",sector_id="+String.valueOf(sector_id));
		sb.append(",name="+name);
		sb.append(",qr_code="+qr_code);
		sb.append(",phone="+phone);
		sb.append(",address="+address);
		sb.append(",lat="+lat);
		sb.append(",lng="+lng);
		sb.append(",secours="+String.valueOf(secours));
		sb.append(",golden_shop="+String.valueOf(golden_shop));
		sb.append(",status="+status);
		sb.append(",Date_Creation="+String.valueOf(Date_Creation));
		sb.append(",Date_Update="+String.valueOf(Date_Update));
		sb.append(",cluster="+cluster);
		sb.append(",Jour_Livraison_1="+Jour_Livraison_1);
		sb.append(",Jour_Livraison_2="+Jour_Livraison_2);
		sb.append(",Jour_Livraison_3="+Jour_Livraison_3);
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

public static class OnRowsEndStructtSortRow_3 implements routines.system.IPersistableRow<OnRowsEndStructtSortRow_3> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[0];

	
			    public long ID_PDV;

				public long getID_PDV () {
					return this.ID_PDV;
				}
				
			    public Long sector_id;

				public Long getSector_id () {
					return this.sector_id;
				}
				
			    public String name;

				public String getName () {
					return this.name;
				}
				
			    public String qr_code;

				public String getQr_code () {
					return this.qr_code;
				}
				
			    public String phone;

				public String getPhone () {
					return this.phone;
				}
				
			    public String address;

				public String getAddress () {
					return this.address;
				}
				
			    public String lat;

				public String getLat () {
					return this.lat;
				}
				
			    public String lng;

				public String getLng () {
					return this.lng;
				}
				
			    public Boolean secours;

				public Boolean getSecours () {
					return this.secours;
				}
				
			    public Boolean golden_shop;

				public Boolean getGolden_shop () {
					return this.golden_shop;
				}
				
			    public String status;

				public String getStatus () {
					return this.status;
				}
				
			    public java.util.Date Date_Creation;

				public java.util.Date getDate_Creation () {
					return this.Date_Creation;
				}
				
			    public java.util.Date Date_Update;

				public java.util.Date getDate_Update () {
					return this.Date_Update;
				}
				
			    public String cluster;

				public String getCluster () {
					return this.cluster;
				}
				
			    public String Jour_Livraison_1;

				public String getJour_Livraison_1 () {
					return this.Jour_Livraison_1;
				}
				
			    public String Jour_Livraison_2;

				public String getJour_Livraison_2 () {
					return this.Jour_Livraison_2;
				}
				
			    public String Jour_Livraison_3;

				public String getJour_Livraison_3 () {
					return this.Jour_Livraison_3;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length, utf8Charset);
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
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes) {

        	try {

        		int length = 0;
		
			        this.ID_PDV = dis.readLong();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.sector_id = null;
           				} else {
           			    	this.sector_id = dis.readLong();
           				}
					
					this.name = readString(dis);
					
					this.qr_code = readString(dis);
					
					this.phone = readString(dis);
					
					this.address = readString(dis);
					
					this.lat = readString(dis);
					
					this.lng = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.secours = null;
           				} else {
           			    	this.secours = dis.readBoolean();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.golden_shop = null;
           				} else {
           			    	this.golden_shop = dis.readBoolean();
           				}
					
					this.status = readString(dis);
					
					this.Date_Creation = readDate(dis);
					
					this.Date_Update = readDate(dis);
					
					this.cluster = readString(dis);
					
					this.Jour_Livraison_1 = readString(dis);
					
					this.Jour_Livraison_2 = readString(dis);
					
					this.Jour_Livraison_3 = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes) {

        	try {

        		int length = 0;
		
			        this.ID_PDV = dis.readLong();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.sector_id = null;
           				} else {
           			    	this.sector_id = dis.readLong();
           				}
					
					this.name = readString(dis);
					
					this.qr_code = readString(dis);
					
					this.phone = readString(dis);
					
					this.address = readString(dis);
					
					this.lat = readString(dis);
					
					this.lng = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.secours = null;
           				} else {
           			    	this.secours = dis.readBoolean();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.golden_shop = null;
           				} else {
           			    	this.golden_shop = dis.readBoolean();
           				}
					
					this.status = readString(dis);
					
					this.Date_Creation = readDate(dis);
					
					this.Date_Update = readDate(dis);
					
					this.cluster = readString(dis);
					
					this.Jour_Livraison_1 = readString(dis);
					
					this.Jour_Livraison_2 = readString(dis);
					
					this.Jour_Livraison_3 = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.ID_PDV);
					
					// Long
				
						if(this.sector_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.sector_id);
		            	}
					
					// String
				
						writeString(this.name,dos);
					
					// String
				
						writeString(this.qr_code,dos);
					
					// String
				
						writeString(this.phone,dos);
					
					// String
				
						writeString(this.address,dos);
					
					// String
				
						writeString(this.lat,dos);
					
					// String
				
						writeString(this.lng,dos);
					
					// Boolean
				
						if(this.secours == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.secours);
		            	}
					
					// Boolean
				
						if(this.golden_shop == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.golden_shop);
		            	}
					
					// String
				
						writeString(this.status,dos);
					
					// java.util.Date
				
						writeDate(this.Date_Creation,dos);
					
					// java.util.Date
				
						writeDate(this.Date_Update,dos);
					
					// String
				
						writeString(this.cluster,dos);
					
					// String
				
						writeString(this.Jour_Livraison_1,dos);
					
					// String
				
						writeString(this.Jour_Livraison_2,dos);
					
					// String
				
						writeString(this.Jour_Livraison_3,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.ID_PDV);
					
					// Long
				
						if(this.sector_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.sector_id);
		            	}
					
					// String
				
						writeString(this.name,dos);
					
					// String
				
						writeString(this.qr_code,dos);
					
					// String
				
						writeString(this.phone,dos);
					
					// String
				
						writeString(this.address,dos);
					
					// String
				
						writeString(this.lat,dos);
					
					// String
				
						writeString(this.lng,dos);
					
					// Boolean
				
						if(this.secours == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.secours);
		            	}
					
					// Boolean
				
						if(this.golden_shop == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.golden_shop);
		            	}
					
					// String
				
						writeString(this.status,dos);
					
					// java.util.Date
				
						writeDate(this.Date_Creation,dos);
					
					// java.util.Date
				
						writeDate(this.Date_Update,dos);
					
					// String
				
						writeString(this.cluster,dos);
					
					// String
				
						writeString(this.Jour_Livraison_1,dos);
					
					// String
				
						writeString(this.Jour_Livraison_2,dos);
					
					// String
				
						writeString(this.Jour_Livraison_3,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_PDV="+String.valueOf(ID_PDV));
		sb.append(",sector_id="+String.valueOf(sector_id));
		sb.append(",name="+name);
		sb.append(",qr_code="+qr_code);
		sb.append(",phone="+phone);
		sb.append(",address="+address);
		sb.append(",lat="+lat);
		sb.append(",lng="+lng);
		sb.append(",secours="+String.valueOf(secours));
		sb.append(",golden_shop="+String.valueOf(golden_shop));
		sb.append(",status="+status);
		sb.append(",Date_Creation="+String.valueOf(Date_Creation));
		sb.append(",Date_Update="+String.valueOf(Date_Update));
		sb.append(",cluster="+cluster);
		sb.append(",Jour_Livraison_1="+Jour_Livraison_1);
		sb.append(",Jour_Livraison_2="+Jour_Livraison_2);
		sb.append(",Jour_Livraison_3="+Jour_Livraison_3);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(OnRowsEndStructtSortRow_3 other) {

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

public static class row9Struct implements routines.system.IPersistableRow<row9Struct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public long id_pdv;

				public long getId_pdv () {
					return this.id_pdv;
				}
				
			    public long id_secteur;

				public long getId_secteur () {
					return this.id_secteur;
				}
				
			    public String qr_code;

				public String getQr_code () {
					return this.qr_code;
				}
				
			    public String name;

				public String getName () {
					return this.name;
				}
				
			    public String phone;

				public String getPhone () {
					return this.phone;
				}
				
			    public String address;

				public String getAddress () {
					return this.address;
				}
				
			    public String latitude;

				public String getLatitude () {
					return this.latitude;
				}
				
			    public String longitude;

				public String getLongitude () {
					return this.longitude;
				}
				
			    public java.util.Date date_creation;

				public java.util.Date getDate_creation () {
					return this.date_creation;
				}
				
			    public java.util.Date date_update;

				public java.util.Date getDate_update () {
					return this.date_update;
				}
				
			    public String jourlivraison_1;

				public String getJourlivraison_1 () {
					return this.jourlivraison_1;
				}
				
			    public String jourlivraison_2;

				public String getJourlivraison_2 () {
					return this.jourlivraison_2;
				}
				
			    public String jourlivraison_3;

				public String getJourlivraison_3 () {
					return this.jourlivraison_3;
				}
				
			    public String cluster;

				public String getCluster () {
					return this.cluster;
				}
				
			    public Boolean gs;

				public Boolean getGs () {
					return this.gs;
				}
				
			    public String statu;

				public String getStatu () {
					return this.statu;
				}
				
			    public Boolean secours;

				public Boolean getSecours () {
					return this.secours;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
							result = prime * result + (int) this.id_pdv;
						
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
		
						if (this.id_pdv != other.id_pdv)
							return false;
					

		return true;
    }

	public void copyDataTo(row9Struct other) {

		other.id_pdv = this.id_pdv;
	            other.id_secteur = this.id_secteur;
	            other.qr_code = this.qr_code;
	            other.name = this.name;
	            other.phone = this.phone;
	            other.address = this.address;
	            other.latitude = this.latitude;
	            other.longitude = this.longitude;
	            other.date_creation = this.date_creation;
	            other.date_update = this.date_update;
	            other.jourlivraison_1 = this.jourlivraison_1;
	            other.jourlivraison_2 = this.jourlivraison_2;
	            other.jourlivraison_3 = this.jourlivraison_3;
	            other.cluster = this.cluster;
	            other.gs = this.gs;
	            other.statu = this.statu;
	            other.secours = this.secours;
	            
	}

	public void copyKeysDataTo(row9Struct other) {

		other.id_pdv = this.id_pdv;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length, utf8Charset);
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
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes) {

        	try {

        		int length = 0;
		
			        this.id_pdv = dis.readLong();
					
			        this.id_secteur = dis.readLong();
					
					this.qr_code = readString(dis);
					
					this.name = readString(dis);
					
					this.phone = readString(dis);
					
					this.address = readString(dis);
					
					this.latitude = readString(dis);
					
					this.longitude = readString(dis);
					
					this.date_creation = readDate(dis);
					
					this.date_update = readDate(dis);
					
					this.jourlivraison_1 = readString(dis);
					
					this.jourlivraison_2 = readString(dis);
					
					this.jourlivraison_3 = readString(dis);
					
					this.cluster = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.gs = null;
           				} else {
           			    	this.gs = dis.readBoolean();
           				}
					
					this.statu = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.secours = null;
           				} else {
           			    	this.secours = dis.readBoolean();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes) {

        	try {

        		int length = 0;
		
			        this.id_pdv = dis.readLong();
					
			        this.id_secteur = dis.readLong();
					
					this.qr_code = readString(dis);
					
					this.name = readString(dis);
					
					this.phone = readString(dis);
					
					this.address = readString(dis);
					
					this.latitude = readString(dis);
					
					this.longitude = readString(dis);
					
					this.date_creation = readDate(dis);
					
					this.date_update = readDate(dis);
					
					this.jourlivraison_1 = readString(dis);
					
					this.jourlivraison_2 = readString(dis);
					
					this.jourlivraison_3 = readString(dis);
					
					this.cluster = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.gs = null;
           				} else {
           			    	this.gs = dis.readBoolean();
           				}
					
					this.statu = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.secours = null;
           				} else {
           			    	this.secours = dis.readBoolean();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id_pdv);
					
					// long
				
		            	dos.writeLong(this.id_secteur);
					
					// String
				
						writeString(this.qr_code,dos);
					
					// String
				
						writeString(this.name,dos);
					
					// String
				
						writeString(this.phone,dos);
					
					// String
				
						writeString(this.address,dos);
					
					// String
				
						writeString(this.latitude,dos);
					
					// String
				
						writeString(this.longitude,dos);
					
					// java.util.Date
				
						writeDate(this.date_creation,dos);
					
					// java.util.Date
				
						writeDate(this.date_update,dos);
					
					// String
				
						writeString(this.jourlivraison_1,dos);
					
					// String
				
						writeString(this.jourlivraison_2,dos);
					
					// String
				
						writeString(this.jourlivraison_3,dos);
					
					// String
				
						writeString(this.cluster,dos);
					
					// Boolean
				
						if(this.gs == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.gs);
		            	}
					
					// String
				
						writeString(this.statu,dos);
					
					// Boolean
				
						if(this.secours == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.secours);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id_pdv);
					
					// long
				
		            	dos.writeLong(this.id_secteur);
					
					// String
				
						writeString(this.qr_code,dos);
					
					// String
				
						writeString(this.name,dos);
					
					// String
				
						writeString(this.phone,dos);
					
					// String
				
						writeString(this.address,dos);
					
					// String
				
						writeString(this.latitude,dos);
					
					// String
				
						writeString(this.longitude,dos);
					
					// java.util.Date
				
						writeDate(this.date_creation,dos);
					
					// java.util.Date
				
						writeDate(this.date_update,dos);
					
					// String
				
						writeString(this.jourlivraison_1,dos);
					
					// String
				
						writeString(this.jourlivraison_2,dos);
					
					// String
				
						writeString(this.jourlivraison_3,dos);
					
					// String
				
						writeString(this.cluster,dos);
					
					// Boolean
				
						if(this.gs == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.gs);
		            	}
					
					// String
				
						writeString(this.statu,dos);
					
					// Boolean
				
						if(this.secours == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.secours);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id_pdv="+String.valueOf(id_pdv));
		sb.append(",id_secteur="+String.valueOf(id_secteur));
		sb.append(",qr_code="+qr_code);
		sb.append(",name="+name);
		sb.append(",phone="+phone);
		sb.append(",address="+address);
		sb.append(",latitude="+latitude);
		sb.append(",longitude="+longitude);
		sb.append(",date_creation="+String.valueOf(date_creation));
		sb.append(",date_update="+String.valueOf(date_update));
		sb.append(",jourlivraison_1="+jourlivraison_1);
		sb.append(",jourlivraison_2="+jourlivraison_2);
		sb.append(",jourlivraison_3="+jourlivraison_3);
		sb.append(",cluster="+cluster);
		sb.append(",gs="+String.valueOf(gs));
		sb.append(",statu="+statu);
		sb.append(",secours="+String.valueOf(secours));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row9Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.id_pdv, other.id_pdv);
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
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public long id_pdv;

				public long getId_pdv () {
					return this.id_pdv;
				}
				
			    public long id_secteur;

				public long getId_secteur () {
					return this.id_secteur;
				}
				
			    public String qr_code;

				public String getQr_code () {
					return this.qr_code;
				}
				
			    public String name;

				public String getName () {
					return this.name;
				}
				
			    public String phone;

				public String getPhone () {
					return this.phone;
				}
				
			    public String address;

				public String getAddress () {
					return this.address;
				}
				
			    public String latitude;

				public String getLatitude () {
					return this.latitude;
				}
				
			    public String longitude;

				public String getLongitude () {
					return this.longitude;
				}
				
			    public java.util.Date date_creation;

				public java.util.Date getDate_creation () {
					return this.date_creation;
				}
				
			    public java.util.Date date_update;

				public java.util.Date getDate_update () {
					return this.date_update;
				}
				
			    public String jourlivraison_1;

				public String getJourlivraison_1 () {
					return this.jourlivraison_1;
				}
				
			    public String jourlivraison_2;

				public String getJourlivraison_2 () {
					return this.jourlivraison_2;
				}
				
			    public String jourlivraison_3;

				public String getJourlivraison_3 () {
					return this.jourlivraison_3;
				}
				
			    public String cluster;

				public String getCluster () {
					return this.cluster;
				}
				
			    public Boolean gs;

				public Boolean getGs () {
					return this.gs;
				}
				
			    public String statu;

				public String getStatu () {
					return this.statu;
				}
				
			    public Boolean secours;

				public Boolean getSecours () {
					return this.secours;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
							result = prime * result + (int) this.id_pdv;
						
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
		
						if (this.id_pdv != other.id_pdv)
							return false;
					

		return true;
    }

	public void copyDataTo(OnRowsEndStructtSortRow_2 other) {

		other.id_pdv = this.id_pdv;
	            other.id_secteur = this.id_secteur;
	            other.qr_code = this.qr_code;
	            other.name = this.name;
	            other.phone = this.phone;
	            other.address = this.address;
	            other.latitude = this.latitude;
	            other.longitude = this.longitude;
	            other.date_creation = this.date_creation;
	            other.date_update = this.date_update;
	            other.jourlivraison_1 = this.jourlivraison_1;
	            other.jourlivraison_2 = this.jourlivraison_2;
	            other.jourlivraison_3 = this.jourlivraison_3;
	            other.cluster = this.cluster;
	            other.gs = this.gs;
	            other.statu = this.statu;
	            other.secours = this.secours;
	            
	}

	public void copyKeysDataTo(OnRowsEndStructtSortRow_2 other) {

		other.id_pdv = this.id_pdv;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length, utf8Charset);
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
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes) {

        	try {

        		int length = 0;
		
			        this.id_pdv = dis.readLong();
					
			        this.id_secteur = dis.readLong();
					
					this.qr_code = readString(dis);
					
					this.name = readString(dis);
					
					this.phone = readString(dis);
					
					this.address = readString(dis);
					
					this.latitude = readString(dis);
					
					this.longitude = readString(dis);
					
					this.date_creation = readDate(dis);
					
					this.date_update = readDate(dis);
					
					this.jourlivraison_1 = readString(dis);
					
					this.jourlivraison_2 = readString(dis);
					
					this.jourlivraison_3 = readString(dis);
					
					this.cluster = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.gs = null;
           				} else {
           			    	this.gs = dis.readBoolean();
           				}
					
					this.statu = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.secours = null;
           				} else {
           			    	this.secours = dis.readBoolean();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes) {

        	try {

        		int length = 0;
		
			        this.id_pdv = dis.readLong();
					
			        this.id_secteur = dis.readLong();
					
					this.qr_code = readString(dis);
					
					this.name = readString(dis);
					
					this.phone = readString(dis);
					
					this.address = readString(dis);
					
					this.latitude = readString(dis);
					
					this.longitude = readString(dis);
					
					this.date_creation = readDate(dis);
					
					this.date_update = readDate(dis);
					
					this.jourlivraison_1 = readString(dis);
					
					this.jourlivraison_2 = readString(dis);
					
					this.jourlivraison_3 = readString(dis);
					
					this.cluster = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.gs = null;
           				} else {
           			    	this.gs = dis.readBoolean();
           				}
					
					this.statu = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.secours = null;
           				} else {
           			    	this.secours = dis.readBoolean();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id_pdv);
					
					// long
				
		            	dos.writeLong(this.id_secteur);
					
					// String
				
						writeString(this.qr_code,dos);
					
					// String
				
						writeString(this.name,dos);
					
					// String
				
						writeString(this.phone,dos);
					
					// String
				
						writeString(this.address,dos);
					
					// String
				
						writeString(this.latitude,dos);
					
					// String
				
						writeString(this.longitude,dos);
					
					// java.util.Date
				
						writeDate(this.date_creation,dos);
					
					// java.util.Date
				
						writeDate(this.date_update,dos);
					
					// String
				
						writeString(this.jourlivraison_1,dos);
					
					// String
				
						writeString(this.jourlivraison_2,dos);
					
					// String
				
						writeString(this.jourlivraison_3,dos);
					
					// String
				
						writeString(this.cluster,dos);
					
					// Boolean
				
						if(this.gs == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.gs);
		            	}
					
					// String
				
						writeString(this.statu,dos);
					
					// Boolean
				
						if(this.secours == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.secours);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id_pdv);
					
					// long
				
		            	dos.writeLong(this.id_secteur);
					
					// String
				
						writeString(this.qr_code,dos);
					
					// String
				
						writeString(this.name,dos);
					
					// String
				
						writeString(this.phone,dos);
					
					// String
				
						writeString(this.address,dos);
					
					// String
				
						writeString(this.latitude,dos);
					
					// String
				
						writeString(this.longitude,dos);
					
					// java.util.Date
				
						writeDate(this.date_creation,dos);
					
					// java.util.Date
				
						writeDate(this.date_update,dos);
					
					// String
				
						writeString(this.jourlivraison_1,dos);
					
					// String
				
						writeString(this.jourlivraison_2,dos);
					
					// String
				
						writeString(this.jourlivraison_3,dos);
					
					// String
				
						writeString(this.cluster,dos);
					
					// Boolean
				
						if(this.gs == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.gs);
		            	}
					
					// String
				
						writeString(this.statu,dos);
					
					// Boolean
				
						if(this.secours == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.secours);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id_pdv="+String.valueOf(id_pdv));
		sb.append(",id_secteur="+String.valueOf(id_secteur));
		sb.append(",qr_code="+qr_code);
		sb.append(",name="+name);
		sb.append(",phone="+phone);
		sb.append(",address="+address);
		sb.append(",latitude="+latitude);
		sb.append(",longitude="+longitude);
		sb.append(",date_creation="+String.valueOf(date_creation));
		sb.append(",date_update="+String.valueOf(date_update));
		sb.append(",jourlivraison_1="+jourlivraison_1);
		sb.append(",jourlivraison_2="+jourlivraison_2);
		sb.append(",jourlivraison_3="+jourlivraison_3);
		sb.append(",cluster="+cluster);
		sb.append(",gs="+String.valueOf(gs));
		sb.append(",statu="+statu);
		sb.append(",secours="+String.valueOf(secours));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(OnRowsEndStructtSortRow_2 other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.id_pdv, other.id_pdv);
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

public static class row11Struct implements routines.system.IPersistableRow<row11Struct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public long id_pdv;

				public long getId_pdv () {
					return this.id_pdv;
				}
				
			    public long id_secteur;

				public long getId_secteur () {
					return this.id_secteur;
				}
				
			    public String qr_code;

				public String getQr_code () {
					return this.qr_code;
				}
				
			    public String name;

				public String getName () {
					return this.name;
				}
				
			    public String phone;

				public String getPhone () {
					return this.phone;
				}
				
			    public String address;

				public String getAddress () {
					return this.address;
				}
				
			    public String latitude;

				public String getLatitude () {
					return this.latitude;
				}
				
			    public String longitude;

				public String getLongitude () {
					return this.longitude;
				}
				
			    public java.util.Date date_creation;

				public java.util.Date getDate_creation () {
					return this.date_creation;
				}
				
			    public java.util.Date date_update;

				public java.util.Date getDate_update () {
					return this.date_update;
				}
				
			    public String jourlivraison_1;

				public String getJourlivraison_1 () {
					return this.jourlivraison_1;
				}
				
			    public String jourlivraison_2;

				public String getJourlivraison_2 () {
					return this.jourlivraison_2;
				}
				
			    public String jourlivraison_3;

				public String getJourlivraison_3 () {
					return this.jourlivraison_3;
				}
				
			    public String cluster;

				public String getCluster () {
					return this.cluster;
				}
				
			    public Boolean gs;

				public Boolean getGs () {
					return this.gs;
				}
				
			    public String statu;

				public String getStatu () {
					return this.statu;
				}
				
			    public Boolean secours;

				public Boolean getSecours () {
					return this.secours;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
							result = prime * result + (int) this.id_pdv;
						
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
		final row11Struct other = (row11Struct) obj;
		
						if (this.id_pdv != other.id_pdv)
							return false;
					

		return true;
    }

	public void copyDataTo(row11Struct other) {

		other.id_pdv = this.id_pdv;
	            other.id_secteur = this.id_secteur;
	            other.qr_code = this.qr_code;
	            other.name = this.name;
	            other.phone = this.phone;
	            other.address = this.address;
	            other.latitude = this.latitude;
	            other.longitude = this.longitude;
	            other.date_creation = this.date_creation;
	            other.date_update = this.date_update;
	            other.jourlivraison_1 = this.jourlivraison_1;
	            other.jourlivraison_2 = this.jourlivraison_2;
	            other.jourlivraison_3 = this.jourlivraison_3;
	            other.cluster = this.cluster;
	            other.gs = this.gs;
	            other.statu = this.statu;
	            other.secours = this.secours;
	            
	}

	public void copyKeysDataTo(row11Struct other) {

		other.id_pdv = this.id_pdv;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length, utf8Charset);
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
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes) {

        	try {

        		int length = 0;
		
			        this.id_pdv = dis.readLong();
					
			        this.id_secteur = dis.readLong();
					
					this.qr_code = readString(dis);
					
					this.name = readString(dis);
					
					this.phone = readString(dis);
					
					this.address = readString(dis);
					
					this.latitude = readString(dis);
					
					this.longitude = readString(dis);
					
					this.date_creation = readDate(dis);
					
					this.date_update = readDate(dis);
					
					this.jourlivraison_1 = readString(dis);
					
					this.jourlivraison_2 = readString(dis);
					
					this.jourlivraison_3 = readString(dis);
					
					this.cluster = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.gs = null;
           				} else {
           			    	this.gs = dis.readBoolean();
           				}
					
					this.statu = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.secours = null;
           				} else {
           			    	this.secours = dis.readBoolean();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes) {

        	try {

        		int length = 0;
		
			        this.id_pdv = dis.readLong();
					
			        this.id_secteur = dis.readLong();
					
					this.qr_code = readString(dis);
					
					this.name = readString(dis);
					
					this.phone = readString(dis);
					
					this.address = readString(dis);
					
					this.latitude = readString(dis);
					
					this.longitude = readString(dis);
					
					this.date_creation = readDate(dis);
					
					this.date_update = readDate(dis);
					
					this.jourlivraison_1 = readString(dis);
					
					this.jourlivraison_2 = readString(dis);
					
					this.jourlivraison_3 = readString(dis);
					
					this.cluster = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.gs = null;
           				} else {
           			    	this.gs = dis.readBoolean();
           				}
					
					this.statu = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.secours = null;
           				} else {
           			    	this.secours = dis.readBoolean();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id_pdv);
					
					// long
				
		            	dos.writeLong(this.id_secteur);
					
					// String
				
						writeString(this.qr_code,dos);
					
					// String
				
						writeString(this.name,dos);
					
					// String
				
						writeString(this.phone,dos);
					
					// String
				
						writeString(this.address,dos);
					
					// String
				
						writeString(this.latitude,dos);
					
					// String
				
						writeString(this.longitude,dos);
					
					// java.util.Date
				
						writeDate(this.date_creation,dos);
					
					// java.util.Date
				
						writeDate(this.date_update,dos);
					
					// String
				
						writeString(this.jourlivraison_1,dos);
					
					// String
				
						writeString(this.jourlivraison_2,dos);
					
					// String
				
						writeString(this.jourlivraison_3,dos);
					
					// String
				
						writeString(this.cluster,dos);
					
					// Boolean
				
						if(this.gs == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.gs);
		            	}
					
					// String
				
						writeString(this.statu,dos);
					
					// Boolean
				
						if(this.secours == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.secours);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id_pdv);
					
					// long
				
		            	dos.writeLong(this.id_secteur);
					
					// String
				
						writeString(this.qr_code,dos);
					
					// String
				
						writeString(this.name,dos);
					
					// String
				
						writeString(this.phone,dos);
					
					// String
				
						writeString(this.address,dos);
					
					// String
				
						writeString(this.latitude,dos);
					
					// String
				
						writeString(this.longitude,dos);
					
					// java.util.Date
				
						writeDate(this.date_creation,dos);
					
					// java.util.Date
				
						writeDate(this.date_update,dos);
					
					// String
				
						writeString(this.jourlivraison_1,dos);
					
					// String
				
						writeString(this.jourlivraison_2,dos);
					
					// String
				
						writeString(this.jourlivraison_3,dos);
					
					// String
				
						writeString(this.cluster,dos);
					
					// Boolean
				
						if(this.gs == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.gs);
		            	}
					
					// String
				
						writeString(this.statu,dos);
					
					// Boolean
				
						if(this.secours == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.secours);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id_pdv="+String.valueOf(id_pdv));
		sb.append(",id_secteur="+String.valueOf(id_secteur));
		sb.append(",qr_code="+qr_code);
		sb.append(",name="+name);
		sb.append(",phone="+phone);
		sb.append(",address="+address);
		sb.append(",latitude="+latitude);
		sb.append(",longitude="+longitude);
		sb.append(",date_creation="+String.valueOf(date_creation));
		sb.append(",date_update="+String.valueOf(date_update));
		sb.append(",jourlivraison_1="+jourlivraison_1);
		sb.append(",jourlivraison_2="+jourlivraison_2);
		sb.append(",jourlivraison_3="+jourlivraison_3);
		sb.append(",cluster="+cluster);
		sb.append(",gs="+String.valueOf(gs));
		sb.append(",statu="+statu);
		sb.append(",secours="+String.valueOf(secours));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row11Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.id_pdv, other.id_pdv);
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

public static class Inserte_New_PDVStruct implements routines.system.IPersistableRow<Inserte_New_PDVStruct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public long id_pdv;

				public long getId_pdv () {
					return this.id_pdv;
				}
				
			    public long id_secteur;

				public long getId_secteur () {
					return this.id_secteur;
				}
				
			    public String qr_code;

				public String getQr_code () {
					return this.qr_code;
				}
				
			    public String name;

				public String getName () {
					return this.name;
				}
				
			    public String phone;

				public String getPhone () {
					return this.phone;
				}
				
			    public String address;

				public String getAddress () {
					return this.address;
				}
				
			    public String latitude;

				public String getLatitude () {
					return this.latitude;
				}
				
			    public String longitude;

				public String getLongitude () {
					return this.longitude;
				}
				
			    public java.util.Date date_creation;

				public java.util.Date getDate_creation () {
					return this.date_creation;
				}
				
			    public java.util.Date date_update;

				public java.util.Date getDate_update () {
					return this.date_update;
				}
				
			    public String jourlivraison_1;

				public String getJourlivraison_1 () {
					return this.jourlivraison_1;
				}
				
			    public String jourlivraison_2;

				public String getJourlivraison_2 () {
					return this.jourlivraison_2;
				}
				
			    public String jourlivraison_3;

				public String getJourlivraison_3 () {
					return this.jourlivraison_3;
				}
				
			    public String cluster;

				public String getCluster () {
					return this.cluster;
				}
				
			    public Boolean gs;

				public Boolean getGs () {
					return this.gs;
				}
				
			    public String statu;

				public String getStatu () {
					return this.statu;
				}
				
			    public Boolean secours;

				public Boolean getSecours () {
					return this.secours;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
							result = prime * result + (int) this.id_pdv;
						
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
		final Inserte_New_PDVStruct other = (Inserte_New_PDVStruct) obj;
		
						if (this.id_pdv != other.id_pdv)
							return false;
					

		return true;
    }

	public void copyDataTo(Inserte_New_PDVStruct other) {

		other.id_pdv = this.id_pdv;
	            other.id_secteur = this.id_secteur;
	            other.qr_code = this.qr_code;
	            other.name = this.name;
	            other.phone = this.phone;
	            other.address = this.address;
	            other.latitude = this.latitude;
	            other.longitude = this.longitude;
	            other.date_creation = this.date_creation;
	            other.date_update = this.date_update;
	            other.jourlivraison_1 = this.jourlivraison_1;
	            other.jourlivraison_2 = this.jourlivraison_2;
	            other.jourlivraison_3 = this.jourlivraison_3;
	            other.cluster = this.cluster;
	            other.gs = this.gs;
	            other.statu = this.statu;
	            other.secours = this.secours;
	            
	}

	public void copyKeysDataTo(Inserte_New_PDVStruct other) {

		other.id_pdv = this.id_pdv;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length, utf8Charset);
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
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes) {

        	try {

        		int length = 0;
		
			        this.id_pdv = dis.readLong();
					
			        this.id_secteur = dis.readLong();
					
					this.qr_code = readString(dis);
					
					this.name = readString(dis);
					
					this.phone = readString(dis);
					
					this.address = readString(dis);
					
					this.latitude = readString(dis);
					
					this.longitude = readString(dis);
					
					this.date_creation = readDate(dis);
					
					this.date_update = readDate(dis);
					
					this.jourlivraison_1 = readString(dis);
					
					this.jourlivraison_2 = readString(dis);
					
					this.jourlivraison_3 = readString(dis);
					
					this.cluster = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.gs = null;
           				} else {
           			    	this.gs = dis.readBoolean();
           				}
					
					this.statu = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.secours = null;
           				} else {
           			    	this.secours = dis.readBoolean();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes) {

        	try {

        		int length = 0;
		
			        this.id_pdv = dis.readLong();
					
			        this.id_secteur = dis.readLong();
					
					this.qr_code = readString(dis);
					
					this.name = readString(dis);
					
					this.phone = readString(dis);
					
					this.address = readString(dis);
					
					this.latitude = readString(dis);
					
					this.longitude = readString(dis);
					
					this.date_creation = readDate(dis);
					
					this.date_update = readDate(dis);
					
					this.jourlivraison_1 = readString(dis);
					
					this.jourlivraison_2 = readString(dis);
					
					this.jourlivraison_3 = readString(dis);
					
					this.cluster = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.gs = null;
           				} else {
           			    	this.gs = dis.readBoolean();
           				}
					
					this.statu = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.secours = null;
           				} else {
           			    	this.secours = dis.readBoolean();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id_pdv);
					
					// long
				
		            	dos.writeLong(this.id_secteur);
					
					// String
				
						writeString(this.qr_code,dos);
					
					// String
				
						writeString(this.name,dos);
					
					// String
				
						writeString(this.phone,dos);
					
					// String
				
						writeString(this.address,dos);
					
					// String
				
						writeString(this.latitude,dos);
					
					// String
				
						writeString(this.longitude,dos);
					
					// java.util.Date
				
						writeDate(this.date_creation,dos);
					
					// java.util.Date
				
						writeDate(this.date_update,dos);
					
					// String
				
						writeString(this.jourlivraison_1,dos);
					
					// String
				
						writeString(this.jourlivraison_2,dos);
					
					// String
				
						writeString(this.jourlivraison_3,dos);
					
					// String
				
						writeString(this.cluster,dos);
					
					// Boolean
				
						if(this.gs == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.gs);
		            	}
					
					// String
				
						writeString(this.statu,dos);
					
					// Boolean
				
						if(this.secours == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.secours);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id_pdv);
					
					// long
				
		            	dos.writeLong(this.id_secteur);
					
					// String
				
						writeString(this.qr_code,dos);
					
					// String
				
						writeString(this.name,dos);
					
					// String
				
						writeString(this.phone,dos);
					
					// String
				
						writeString(this.address,dos);
					
					// String
				
						writeString(this.latitude,dos);
					
					// String
				
						writeString(this.longitude,dos);
					
					// java.util.Date
				
						writeDate(this.date_creation,dos);
					
					// java.util.Date
				
						writeDate(this.date_update,dos);
					
					// String
				
						writeString(this.jourlivraison_1,dos);
					
					// String
				
						writeString(this.jourlivraison_2,dos);
					
					// String
				
						writeString(this.jourlivraison_3,dos);
					
					// String
				
						writeString(this.cluster,dos);
					
					// Boolean
				
						if(this.gs == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.gs);
		            	}
					
					// String
				
						writeString(this.statu,dos);
					
					// Boolean
				
						if(this.secours == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.secours);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id_pdv="+String.valueOf(id_pdv));
		sb.append(",id_secteur="+String.valueOf(id_secteur));
		sb.append(",qr_code="+qr_code);
		sb.append(",name="+name);
		sb.append(",phone="+phone);
		sb.append(",address="+address);
		sb.append(",latitude="+latitude);
		sb.append(",longitude="+longitude);
		sb.append(",date_creation="+String.valueOf(date_creation));
		sb.append(",date_update="+String.valueOf(date_update));
		sb.append(",jourlivraison_1="+jourlivraison_1);
		sb.append(",jourlivraison_2="+jourlivraison_2);
		sb.append(",jourlivraison_3="+jourlivraison_3);
		sb.append(",cluster="+cluster);
		sb.append(",gs="+String.valueOf(gs));
		sb.append(",statu="+statu);
		sb.append(",secours="+String.valueOf(secours));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(Inserte_New_PDVStruct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.id_pdv, other.id_pdv);
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

public static class UpdatesStruct implements routines.system.IPersistableRow<UpdatesStruct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[0];

	
			    public long ID_PDV;

				public long getID_PDV () {
					return this.ID_PDV;
				}
				
			    public Long sector_id;

				public Long getSector_id () {
					return this.sector_id;
				}
				
			    public String name;

				public String getName () {
					return this.name;
				}
				
			    public String qr_code;

				public String getQr_code () {
					return this.qr_code;
				}
				
			    public String phone;

				public String getPhone () {
					return this.phone;
				}
				
			    public String address;

				public String getAddress () {
					return this.address;
				}
				
			    public String lat;

				public String getLat () {
					return this.lat;
				}
				
			    public String lng;

				public String getLng () {
					return this.lng;
				}
				
			    public Boolean secours;

				public Boolean getSecours () {
					return this.secours;
				}
				
			    public Boolean golden_shop;

				public Boolean getGolden_shop () {
					return this.golden_shop;
				}
				
			    public String status;

				public String getStatus () {
					return this.status;
				}
				
			    public java.util.Date Date_Creation;

				public java.util.Date getDate_Creation () {
					return this.Date_Creation;
				}
				
			    public java.util.Date Date_Update;

				public java.util.Date getDate_Update () {
					return this.Date_Update;
				}
				
			    public String cluster;

				public String getCluster () {
					return this.cluster;
				}
				
			    public String Jour_Livraison_1;

				public String getJour_Livraison_1 () {
					return this.Jour_Livraison_1;
				}
				
			    public String Jour_Livraison_2;

				public String getJour_Livraison_2 () {
					return this.Jour_Livraison_2;
				}
				
			    public String Jour_Livraison_3;

				public String getJour_Livraison_3 () {
					return this.Jour_Livraison_3;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length, utf8Charset);
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
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes) {

        	try {

        		int length = 0;
		
			        this.ID_PDV = dis.readLong();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.sector_id = null;
           				} else {
           			    	this.sector_id = dis.readLong();
           				}
					
					this.name = readString(dis);
					
					this.qr_code = readString(dis);
					
					this.phone = readString(dis);
					
					this.address = readString(dis);
					
					this.lat = readString(dis);
					
					this.lng = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.secours = null;
           				} else {
           			    	this.secours = dis.readBoolean();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.golden_shop = null;
           				} else {
           			    	this.golden_shop = dis.readBoolean();
           				}
					
					this.status = readString(dis);
					
					this.Date_Creation = readDate(dis);
					
					this.Date_Update = readDate(dis);
					
					this.cluster = readString(dis);
					
					this.Jour_Livraison_1 = readString(dis);
					
					this.Jour_Livraison_2 = readString(dis);
					
					this.Jour_Livraison_3 = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes) {

        	try {

        		int length = 0;
		
			        this.ID_PDV = dis.readLong();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.sector_id = null;
           				} else {
           			    	this.sector_id = dis.readLong();
           				}
					
					this.name = readString(dis);
					
					this.qr_code = readString(dis);
					
					this.phone = readString(dis);
					
					this.address = readString(dis);
					
					this.lat = readString(dis);
					
					this.lng = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.secours = null;
           				} else {
           			    	this.secours = dis.readBoolean();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.golden_shop = null;
           				} else {
           			    	this.golden_shop = dis.readBoolean();
           				}
					
					this.status = readString(dis);
					
					this.Date_Creation = readDate(dis);
					
					this.Date_Update = readDate(dis);
					
					this.cluster = readString(dis);
					
					this.Jour_Livraison_1 = readString(dis);
					
					this.Jour_Livraison_2 = readString(dis);
					
					this.Jour_Livraison_3 = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.ID_PDV);
					
					// Long
				
						if(this.sector_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.sector_id);
		            	}
					
					// String
				
						writeString(this.name,dos);
					
					// String
				
						writeString(this.qr_code,dos);
					
					// String
				
						writeString(this.phone,dos);
					
					// String
				
						writeString(this.address,dos);
					
					// String
				
						writeString(this.lat,dos);
					
					// String
				
						writeString(this.lng,dos);
					
					// Boolean
				
						if(this.secours == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.secours);
		            	}
					
					// Boolean
				
						if(this.golden_shop == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.golden_shop);
		            	}
					
					// String
				
						writeString(this.status,dos);
					
					// java.util.Date
				
						writeDate(this.Date_Creation,dos);
					
					// java.util.Date
				
						writeDate(this.Date_Update,dos);
					
					// String
				
						writeString(this.cluster,dos);
					
					// String
				
						writeString(this.Jour_Livraison_1,dos);
					
					// String
				
						writeString(this.Jour_Livraison_2,dos);
					
					// String
				
						writeString(this.Jour_Livraison_3,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.ID_PDV);
					
					// Long
				
						if(this.sector_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.sector_id);
		            	}
					
					// String
				
						writeString(this.name,dos);
					
					// String
				
						writeString(this.qr_code,dos);
					
					// String
				
						writeString(this.phone,dos);
					
					// String
				
						writeString(this.address,dos);
					
					// String
				
						writeString(this.lat,dos);
					
					// String
				
						writeString(this.lng,dos);
					
					// Boolean
				
						if(this.secours == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.secours);
		            	}
					
					// Boolean
				
						if(this.golden_shop == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.golden_shop);
		            	}
					
					// String
				
						writeString(this.status,dos);
					
					// java.util.Date
				
						writeDate(this.Date_Creation,dos);
					
					// java.util.Date
				
						writeDate(this.Date_Update,dos);
					
					// String
				
						writeString(this.cluster,dos);
					
					// String
				
						writeString(this.Jour_Livraison_1,dos);
					
					// String
				
						writeString(this.Jour_Livraison_2,dos);
					
					// String
				
						writeString(this.Jour_Livraison_3,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_PDV="+String.valueOf(ID_PDV));
		sb.append(",sector_id="+String.valueOf(sector_id));
		sb.append(",name="+name);
		sb.append(",qr_code="+qr_code);
		sb.append(",phone="+phone);
		sb.append(",address="+address);
		sb.append(",lat="+lat);
		sb.append(",lng="+lng);
		sb.append(",secours="+String.valueOf(secours));
		sb.append(",golden_shop="+String.valueOf(golden_shop));
		sb.append(",status="+status);
		sb.append(",Date_Creation="+String.valueOf(Date_Creation));
		sb.append(",Date_Update="+String.valueOf(Date_Update));
		sb.append(",cluster="+cluster);
		sb.append(",Jour_Livraison_1="+Jour_Livraison_1);
		sb.append(",Jour_Livraison_2="+Jour_Livraison_2);
		sb.append(",Jour_Livraison_3="+Jour_Livraison_3);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(UpdatesStruct other) {

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

public static class row6Struct implements routines.system.IPersistableRow<row6Struct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[0];

	
			    public long ID_PDV;

				public long getID_PDV () {
					return this.ID_PDV;
				}
				
			    public Long sector_id;

				public Long getSector_id () {
					return this.sector_id;
				}
				
			    public String name;

				public String getName () {
					return this.name;
				}
				
			    public String qr_code;

				public String getQr_code () {
					return this.qr_code;
				}
				
			    public String phone;

				public String getPhone () {
					return this.phone;
				}
				
			    public String address;

				public String getAddress () {
					return this.address;
				}
				
			    public String lat;

				public String getLat () {
					return this.lat;
				}
				
			    public String lng;

				public String getLng () {
					return this.lng;
				}
				
			    public Boolean secours;

				public Boolean getSecours () {
					return this.secours;
				}
				
			    public Boolean golden_shop;

				public Boolean getGolden_shop () {
					return this.golden_shop;
				}
				
			    public String status;

				public String getStatus () {
					return this.status;
				}
				
			    public java.util.Date Date_Creation;

				public java.util.Date getDate_Creation () {
					return this.Date_Creation;
				}
				
			    public java.util.Date Date_Update;

				public java.util.Date getDate_Update () {
					return this.Date_Update;
				}
				
			    public String cluster;

				public String getCluster () {
					return this.cluster;
				}
				
			    public String Jour_Livraison_1;

				public String getJour_Livraison_1 () {
					return this.Jour_Livraison_1;
				}
				
			    public String Jour_Livraison_2;

				public String getJour_Livraison_2 () {
					return this.Jour_Livraison_2;
				}
				
			    public String Jour_Livraison_3;

				public String getJour_Livraison_3 () {
					return this.Jour_Livraison_3;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length, utf8Charset);
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
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes) {

        	try {

        		int length = 0;
		
			        this.ID_PDV = dis.readLong();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.sector_id = null;
           				} else {
           			    	this.sector_id = dis.readLong();
           				}
					
					this.name = readString(dis);
					
					this.qr_code = readString(dis);
					
					this.phone = readString(dis);
					
					this.address = readString(dis);
					
					this.lat = readString(dis);
					
					this.lng = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.secours = null;
           				} else {
           			    	this.secours = dis.readBoolean();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.golden_shop = null;
           				} else {
           			    	this.golden_shop = dis.readBoolean();
           				}
					
					this.status = readString(dis);
					
					this.Date_Creation = readDate(dis);
					
					this.Date_Update = readDate(dis);
					
					this.cluster = readString(dis);
					
					this.Jour_Livraison_1 = readString(dis);
					
					this.Jour_Livraison_2 = readString(dis);
					
					this.Jour_Livraison_3 = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes) {

        	try {

        		int length = 0;
		
			        this.ID_PDV = dis.readLong();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.sector_id = null;
           				} else {
           			    	this.sector_id = dis.readLong();
           				}
					
					this.name = readString(dis);
					
					this.qr_code = readString(dis);
					
					this.phone = readString(dis);
					
					this.address = readString(dis);
					
					this.lat = readString(dis);
					
					this.lng = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.secours = null;
           				} else {
           			    	this.secours = dis.readBoolean();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.golden_shop = null;
           				} else {
           			    	this.golden_shop = dis.readBoolean();
           				}
					
					this.status = readString(dis);
					
					this.Date_Creation = readDate(dis);
					
					this.Date_Update = readDate(dis);
					
					this.cluster = readString(dis);
					
					this.Jour_Livraison_1 = readString(dis);
					
					this.Jour_Livraison_2 = readString(dis);
					
					this.Jour_Livraison_3 = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.ID_PDV);
					
					// Long
				
						if(this.sector_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.sector_id);
		            	}
					
					// String
				
						writeString(this.name,dos);
					
					// String
				
						writeString(this.qr_code,dos);
					
					// String
				
						writeString(this.phone,dos);
					
					// String
				
						writeString(this.address,dos);
					
					// String
				
						writeString(this.lat,dos);
					
					// String
				
						writeString(this.lng,dos);
					
					// Boolean
				
						if(this.secours == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.secours);
		            	}
					
					// Boolean
				
						if(this.golden_shop == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.golden_shop);
		            	}
					
					// String
				
						writeString(this.status,dos);
					
					// java.util.Date
				
						writeDate(this.Date_Creation,dos);
					
					// java.util.Date
				
						writeDate(this.Date_Update,dos);
					
					// String
				
						writeString(this.cluster,dos);
					
					// String
				
						writeString(this.Jour_Livraison_1,dos);
					
					// String
				
						writeString(this.Jour_Livraison_2,dos);
					
					// String
				
						writeString(this.Jour_Livraison_3,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.ID_PDV);
					
					// Long
				
						if(this.sector_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.sector_id);
		            	}
					
					// String
				
						writeString(this.name,dos);
					
					// String
				
						writeString(this.qr_code,dos);
					
					// String
				
						writeString(this.phone,dos);
					
					// String
				
						writeString(this.address,dos);
					
					// String
				
						writeString(this.lat,dos);
					
					// String
				
						writeString(this.lng,dos);
					
					// Boolean
				
						if(this.secours == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.secours);
		            	}
					
					// Boolean
				
						if(this.golden_shop == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.golden_shop);
		            	}
					
					// String
				
						writeString(this.status,dos);
					
					// java.util.Date
				
						writeDate(this.Date_Creation,dos);
					
					// java.util.Date
				
						writeDate(this.Date_Update,dos);
					
					// String
				
						writeString(this.cluster,dos);
					
					// String
				
						writeString(this.Jour_Livraison_1,dos);
					
					// String
				
						writeString(this.Jour_Livraison_2,dos);
					
					// String
				
						writeString(this.Jour_Livraison_3,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_PDV="+String.valueOf(ID_PDV));
		sb.append(",sector_id="+String.valueOf(sector_id));
		sb.append(",name="+name);
		sb.append(",qr_code="+qr_code);
		sb.append(",phone="+phone);
		sb.append(",address="+address);
		sb.append(",lat="+lat);
		sb.append(",lng="+lng);
		sb.append(",secours="+String.valueOf(secours));
		sb.append(",golden_shop="+String.valueOf(golden_shop));
		sb.append(",status="+status);
		sb.append(",Date_Creation="+String.valueOf(Date_Creation));
		sb.append(",Date_Update="+String.valueOf(Date_Update));
		sb.append(",cluster="+cluster);
		sb.append(",Jour_Livraison_1="+Jour_Livraison_1);
		sb.append(",Jour_Livraison_2="+Jour_Livraison_2);
		sb.append(",Jour_Livraison_3="+Jour_Livraison_3);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row6Struct other) {

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
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[0];

	
			    public long ID_PDV;

				public long getID_PDV () {
					return this.ID_PDV;
				}
				
			    public Long sector_id;

				public Long getSector_id () {
					return this.sector_id;
				}
				
			    public String name;

				public String getName () {
					return this.name;
				}
				
			    public String qr_code;

				public String getQr_code () {
					return this.qr_code;
				}
				
			    public String phone;

				public String getPhone () {
					return this.phone;
				}
				
			    public String address;

				public String getAddress () {
					return this.address;
				}
				
			    public String lat;

				public String getLat () {
					return this.lat;
				}
				
			    public String lng;

				public String getLng () {
					return this.lng;
				}
				
			    public Boolean secours;

				public Boolean getSecours () {
					return this.secours;
				}
				
			    public Boolean golden_shop;

				public Boolean getGolden_shop () {
					return this.golden_shop;
				}
				
			    public String status;

				public String getStatus () {
					return this.status;
				}
				
			    public java.util.Date Date_Creation;

				public java.util.Date getDate_Creation () {
					return this.Date_Creation;
				}
				
			    public java.util.Date Date_Update;

				public java.util.Date getDate_Update () {
					return this.Date_Update;
				}
				
			    public String cluster;

				public String getCluster () {
					return this.cluster;
				}
				
			    public String Jour_Livraison_1;

				public String getJour_Livraison_1 () {
					return this.Jour_Livraison_1;
				}
				
			    public String Jour_Livraison_2;

				public String getJour_Livraison_2 () {
					return this.Jour_Livraison_2;
				}
				
			    public String Jour_Livraison_3;

				public String getJour_Livraison_3 () {
					return this.Jour_Livraison_3;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length, utf8Charset);
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
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes) {

        	try {

        		int length = 0;
		
			        this.ID_PDV = dis.readLong();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.sector_id = null;
           				} else {
           			    	this.sector_id = dis.readLong();
           				}
					
					this.name = readString(dis);
					
					this.qr_code = readString(dis);
					
					this.phone = readString(dis);
					
					this.address = readString(dis);
					
					this.lat = readString(dis);
					
					this.lng = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.secours = null;
           				} else {
           			    	this.secours = dis.readBoolean();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.golden_shop = null;
           				} else {
           			    	this.golden_shop = dis.readBoolean();
           				}
					
					this.status = readString(dis);
					
					this.Date_Creation = readDate(dis);
					
					this.Date_Update = readDate(dis);
					
					this.cluster = readString(dis);
					
					this.Jour_Livraison_1 = readString(dis);
					
					this.Jour_Livraison_2 = readString(dis);
					
					this.Jour_Livraison_3 = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes) {

        	try {

        		int length = 0;
		
			        this.ID_PDV = dis.readLong();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.sector_id = null;
           				} else {
           			    	this.sector_id = dis.readLong();
           				}
					
					this.name = readString(dis);
					
					this.qr_code = readString(dis);
					
					this.phone = readString(dis);
					
					this.address = readString(dis);
					
					this.lat = readString(dis);
					
					this.lng = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.secours = null;
           				} else {
           			    	this.secours = dis.readBoolean();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.golden_shop = null;
           				} else {
           			    	this.golden_shop = dis.readBoolean();
           				}
					
					this.status = readString(dis);
					
					this.Date_Creation = readDate(dis);
					
					this.Date_Update = readDate(dis);
					
					this.cluster = readString(dis);
					
					this.Jour_Livraison_1 = readString(dis);
					
					this.Jour_Livraison_2 = readString(dis);
					
					this.Jour_Livraison_3 = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.ID_PDV);
					
					// Long
				
						if(this.sector_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.sector_id);
		            	}
					
					// String
				
						writeString(this.name,dos);
					
					// String
				
						writeString(this.qr_code,dos);
					
					// String
				
						writeString(this.phone,dos);
					
					// String
				
						writeString(this.address,dos);
					
					// String
				
						writeString(this.lat,dos);
					
					// String
				
						writeString(this.lng,dos);
					
					// Boolean
				
						if(this.secours == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.secours);
		            	}
					
					// Boolean
				
						if(this.golden_shop == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.golden_shop);
		            	}
					
					// String
				
						writeString(this.status,dos);
					
					// java.util.Date
				
						writeDate(this.Date_Creation,dos);
					
					// java.util.Date
				
						writeDate(this.Date_Update,dos);
					
					// String
				
						writeString(this.cluster,dos);
					
					// String
				
						writeString(this.Jour_Livraison_1,dos);
					
					// String
				
						writeString(this.Jour_Livraison_2,dos);
					
					// String
				
						writeString(this.Jour_Livraison_3,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.ID_PDV);
					
					// Long
				
						if(this.sector_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.sector_id);
		            	}
					
					// String
				
						writeString(this.name,dos);
					
					// String
				
						writeString(this.qr_code,dos);
					
					// String
				
						writeString(this.phone,dos);
					
					// String
				
						writeString(this.address,dos);
					
					// String
				
						writeString(this.lat,dos);
					
					// String
				
						writeString(this.lng,dos);
					
					// Boolean
				
						if(this.secours == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.secours);
		            	}
					
					// Boolean
				
						if(this.golden_shop == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.golden_shop);
		            	}
					
					// String
				
						writeString(this.status,dos);
					
					// java.util.Date
				
						writeDate(this.Date_Creation,dos);
					
					// java.util.Date
				
						writeDate(this.Date_Update,dos);
					
					// String
				
						writeString(this.cluster,dos);
					
					// String
				
						writeString(this.Jour_Livraison_1,dos);
					
					// String
				
						writeString(this.Jour_Livraison_2,dos);
					
					// String
				
						writeString(this.Jour_Livraison_3,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_PDV="+String.valueOf(ID_PDV));
		sb.append(",sector_id="+String.valueOf(sector_id));
		sb.append(",name="+name);
		sb.append(",qr_code="+qr_code);
		sb.append(",phone="+phone);
		sb.append(",address="+address);
		sb.append(",lat="+lat);
		sb.append(",lng="+lng);
		sb.append(",secours="+String.valueOf(secours));
		sb.append(",golden_shop="+String.valueOf(golden_shop));
		sb.append(",status="+status);
		sb.append(",Date_Creation="+String.valueOf(Date_Creation));
		sb.append(",Date_Update="+String.valueOf(Date_Update));
		sb.append(",cluster="+cluster);
		sb.append(",Jour_Livraison_1="+Jour_Livraison_1);
		sb.append(",Jour_Livraison_2="+Jour_Livraison_2);
		sb.append(",Jour_Livraison_3="+Jour_Livraison_3);
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

public static class out2Struct implements routines.system.IPersistableRow<out2Struct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[0];

	
			    public long ID_PDV;

				public long getID_PDV () {
					return this.ID_PDV;
				}
				
			    public Long sector_id;

				public Long getSector_id () {
					return this.sector_id;
				}
				
			    public String name;

				public String getName () {
					return this.name;
				}
				
			    public String qr_code;

				public String getQr_code () {
					return this.qr_code;
				}
				
			    public String phone;

				public String getPhone () {
					return this.phone;
				}
				
			    public String address;

				public String getAddress () {
					return this.address;
				}
				
			    public String lat;

				public String getLat () {
					return this.lat;
				}
				
			    public String lng;

				public String getLng () {
					return this.lng;
				}
				
			    public Boolean secours;

				public Boolean getSecours () {
					return this.secours;
				}
				
			    public Boolean golden_shop;

				public Boolean getGolden_shop () {
					return this.golden_shop;
				}
				
			    public String status;

				public String getStatus () {
					return this.status;
				}
				
			    public java.util.Date Date_Creation;

				public java.util.Date getDate_Creation () {
					return this.Date_Creation;
				}
				
			    public java.util.Date Date_Update;

				public java.util.Date getDate_Update () {
					return this.Date_Update;
				}
				
			    public String cluster;

				public String getCluster () {
					return this.cluster;
				}
				
			    public String Jour_Livraison_1;

				public String getJour_Livraison_1 () {
					return this.Jour_Livraison_1;
				}
				
			    public String Jour_Livraison_2;

				public String getJour_Livraison_2 () {
					return this.Jour_Livraison_2;
				}
				
			    public String Jour_Livraison_3;

				public String getJour_Livraison_3 () {
					return this.Jour_Livraison_3;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length, utf8Charset);
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
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes) {

        	try {

        		int length = 0;
		
			        this.ID_PDV = dis.readLong();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.sector_id = null;
           				} else {
           			    	this.sector_id = dis.readLong();
           				}
					
					this.name = readString(dis);
					
					this.qr_code = readString(dis);
					
					this.phone = readString(dis);
					
					this.address = readString(dis);
					
					this.lat = readString(dis);
					
					this.lng = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.secours = null;
           				} else {
           			    	this.secours = dis.readBoolean();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.golden_shop = null;
           				} else {
           			    	this.golden_shop = dis.readBoolean();
           				}
					
					this.status = readString(dis);
					
					this.Date_Creation = readDate(dis);
					
					this.Date_Update = readDate(dis);
					
					this.cluster = readString(dis);
					
					this.Jour_Livraison_1 = readString(dis);
					
					this.Jour_Livraison_2 = readString(dis);
					
					this.Jour_Livraison_3 = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes) {

        	try {

        		int length = 0;
		
			        this.ID_PDV = dis.readLong();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.sector_id = null;
           				} else {
           			    	this.sector_id = dis.readLong();
           				}
					
					this.name = readString(dis);
					
					this.qr_code = readString(dis);
					
					this.phone = readString(dis);
					
					this.address = readString(dis);
					
					this.lat = readString(dis);
					
					this.lng = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.secours = null;
           				} else {
           			    	this.secours = dis.readBoolean();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.golden_shop = null;
           				} else {
           			    	this.golden_shop = dis.readBoolean();
           				}
					
					this.status = readString(dis);
					
					this.Date_Creation = readDate(dis);
					
					this.Date_Update = readDate(dis);
					
					this.cluster = readString(dis);
					
					this.Jour_Livraison_1 = readString(dis);
					
					this.Jour_Livraison_2 = readString(dis);
					
					this.Jour_Livraison_3 = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.ID_PDV);
					
					// Long
				
						if(this.sector_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.sector_id);
		            	}
					
					// String
				
						writeString(this.name,dos);
					
					// String
				
						writeString(this.qr_code,dos);
					
					// String
				
						writeString(this.phone,dos);
					
					// String
				
						writeString(this.address,dos);
					
					// String
				
						writeString(this.lat,dos);
					
					// String
				
						writeString(this.lng,dos);
					
					// Boolean
				
						if(this.secours == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.secours);
		            	}
					
					// Boolean
				
						if(this.golden_shop == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.golden_shop);
		            	}
					
					// String
				
						writeString(this.status,dos);
					
					// java.util.Date
				
						writeDate(this.Date_Creation,dos);
					
					// java.util.Date
				
						writeDate(this.Date_Update,dos);
					
					// String
				
						writeString(this.cluster,dos);
					
					// String
				
						writeString(this.Jour_Livraison_1,dos);
					
					// String
				
						writeString(this.Jour_Livraison_2,dos);
					
					// String
				
						writeString(this.Jour_Livraison_3,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.ID_PDV);
					
					// Long
				
						if(this.sector_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.sector_id);
		            	}
					
					// String
				
						writeString(this.name,dos);
					
					// String
				
						writeString(this.qr_code,dos);
					
					// String
				
						writeString(this.phone,dos);
					
					// String
				
						writeString(this.address,dos);
					
					// String
				
						writeString(this.lat,dos);
					
					// String
				
						writeString(this.lng,dos);
					
					// Boolean
				
						if(this.secours == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.secours);
		            	}
					
					// Boolean
				
						if(this.golden_shop == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.golden_shop);
		            	}
					
					// String
				
						writeString(this.status,dos);
					
					// java.util.Date
				
						writeDate(this.Date_Creation,dos);
					
					// java.util.Date
				
						writeDate(this.Date_Update,dos);
					
					// String
				
						writeString(this.cluster,dos);
					
					// String
				
						writeString(this.Jour_Livraison_1,dos);
					
					// String
				
						writeString(this.Jour_Livraison_2,dos);
					
					// String
				
						writeString(this.Jour_Livraison_3,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_PDV="+String.valueOf(ID_PDV));
		sb.append(",sector_id="+String.valueOf(sector_id));
		sb.append(",name="+name);
		sb.append(",qr_code="+qr_code);
		sb.append(",phone="+phone);
		sb.append(",address="+address);
		sb.append(",lat="+lat);
		sb.append(",lng="+lng);
		sb.append(",secours="+String.valueOf(secours));
		sb.append(",golden_shop="+String.valueOf(golden_shop));
		sb.append(",status="+status);
		sb.append(",Date_Creation="+String.valueOf(Date_Creation));
		sb.append(",Date_Update="+String.valueOf(Date_Update));
		sb.append(",cluster="+cluster);
		sb.append(",Jour_Livraison_1="+Jour_Livraison_1);
		sb.append(",Jour_Livraison_2="+Jour_Livraison_2);
		sb.append(",Jour_Livraison_3="+Jour_Livraison_3);
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
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[0];

	
			    public long ID_PDV;

				public long getID_PDV () {
					return this.ID_PDV;
				}
				
			    public Long sector_id;

				public Long getSector_id () {
					return this.sector_id;
				}
				
			    public String name;

				public String getName () {
					return this.name;
				}
				
			    public String qr_code;

				public String getQr_code () {
					return this.qr_code;
				}
				
			    public String phone;

				public String getPhone () {
					return this.phone;
				}
				
			    public String address;

				public String getAddress () {
					return this.address;
				}
				
			    public String lat;

				public String getLat () {
					return this.lat;
				}
				
			    public String lng;

				public String getLng () {
					return this.lng;
				}
				
			    public Boolean secours;

				public Boolean getSecours () {
					return this.secours;
				}
				
			    public Boolean golden_shop;

				public Boolean getGolden_shop () {
					return this.golden_shop;
				}
				
			    public String status;

				public String getStatus () {
					return this.status;
				}
				
			    public java.util.Date created_at;

				public java.util.Date getCreated_at () {
					return this.created_at;
				}
				
			    public java.util.Date updated_at;

				public java.util.Date getUpdated_at () {
					return this.updated_at;
				}
				
			    public String cluster;

				public String getCluster () {
					return this.cluster;
				}
				
			    public Long zone_id;

				public Long getZone_id () {
					return this.zone_id;
				}
				
			    public String second_deliveryday;

				public String getSecond_deliveryday () {
					return this.second_deliveryday;
				}
				
			    public String three_deliveryday;

				public String getThree_deliveryday () {
					return this.three_deliveryday;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length, utf8Charset);
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
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes) {

        	try {

        		int length = 0;
		
			        this.ID_PDV = dis.readLong();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.sector_id = null;
           				} else {
           			    	this.sector_id = dis.readLong();
           				}
					
					this.name = readString(dis);
					
					this.qr_code = readString(dis);
					
					this.phone = readString(dis);
					
					this.address = readString(dis);
					
					this.lat = readString(dis);
					
					this.lng = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.secours = null;
           				} else {
           			    	this.secours = dis.readBoolean();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.golden_shop = null;
           				} else {
           			    	this.golden_shop = dis.readBoolean();
           				}
					
					this.status = readString(dis);
					
					this.created_at = readDate(dis);
					
					this.updated_at = readDate(dis);
					
					this.cluster = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.zone_id = null;
           				} else {
           			    	this.zone_id = dis.readLong();
           				}
					
					this.second_deliveryday = readString(dis);
					
					this.three_deliveryday = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes) {

        	try {

        		int length = 0;
		
			        this.ID_PDV = dis.readLong();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.sector_id = null;
           				} else {
           			    	this.sector_id = dis.readLong();
           				}
					
					this.name = readString(dis);
					
					this.qr_code = readString(dis);
					
					this.phone = readString(dis);
					
					this.address = readString(dis);
					
					this.lat = readString(dis);
					
					this.lng = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.secours = null;
           				} else {
           			    	this.secours = dis.readBoolean();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.golden_shop = null;
           				} else {
           			    	this.golden_shop = dis.readBoolean();
           				}
					
					this.status = readString(dis);
					
					this.created_at = readDate(dis);
					
					this.updated_at = readDate(dis);
					
					this.cluster = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.zone_id = null;
           				} else {
           			    	this.zone_id = dis.readLong();
           				}
					
					this.second_deliveryday = readString(dis);
					
					this.three_deliveryday = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.ID_PDV);
					
					// Long
				
						if(this.sector_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.sector_id);
		            	}
					
					// String
				
						writeString(this.name,dos);
					
					// String
				
						writeString(this.qr_code,dos);
					
					// String
				
						writeString(this.phone,dos);
					
					// String
				
						writeString(this.address,dos);
					
					// String
				
						writeString(this.lat,dos);
					
					// String
				
						writeString(this.lng,dos);
					
					// Boolean
				
						if(this.secours == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.secours);
		            	}
					
					// Boolean
				
						if(this.golden_shop == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.golden_shop);
		            	}
					
					// String
				
						writeString(this.status,dos);
					
					// java.util.Date
				
						writeDate(this.created_at,dos);
					
					// java.util.Date
				
						writeDate(this.updated_at,dos);
					
					// String
				
						writeString(this.cluster,dos);
					
					// Long
				
						if(this.zone_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.zone_id);
		            	}
					
					// String
				
						writeString(this.second_deliveryday,dos);
					
					// String
				
						writeString(this.three_deliveryday,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.ID_PDV);
					
					// Long
				
						if(this.sector_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.sector_id);
		            	}
					
					// String
				
						writeString(this.name,dos);
					
					// String
				
						writeString(this.qr_code,dos);
					
					// String
				
						writeString(this.phone,dos);
					
					// String
				
						writeString(this.address,dos);
					
					// String
				
						writeString(this.lat,dos);
					
					// String
				
						writeString(this.lng,dos);
					
					// Boolean
				
						if(this.secours == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.secours);
		            	}
					
					// Boolean
				
						if(this.golden_shop == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.golden_shop);
		            	}
					
					// String
				
						writeString(this.status,dos);
					
					// java.util.Date
				
						writeDate(this.created_at,dos);
					
					// java.util.Date
				
						writeDate(this.updated_at,dos);
					
					// String
				
						writeString(this.cluster,dos);
					
					// Long
				
						if(this.zone_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.zone_id);
		            	}
					
					// String
				
						writeString(this.second_deliveryday,dos);
					
					// String
				
						writeString(this.three_deliveryday,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_PDV="+String.valueOf(ID_PDV));
		sb.append(",sector_id="+String.valueOf(sector_id));
		sb.append(",name="+name);
		sb.append(",qr_code="+qr_code);
		sb.append(",phone="+phone);
		sb.append(",address="+address);
		sb.append(",lat="+lat);
		sb.append(",lng="+lng);
		sb.append(",secours="+String.valueOf(secours));
		sb.append(",golden_shop="+String.valueOf(golden_shop));
		sb.append(",status="+status);
		sb.append(",created_at="+String.valueOf(created_at));
		sb.append(",updated_at="+String.valueOf(updated_at));
		sb.append(",cluster="+cluster);
		sb.append(",zone_id="+String.valueOf(zone_id));
		sb.append(",second_deliveryday="+second_deliveryday);
		sb.append(",three_deliveryday="+three_deliveryday);
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

public static class qrCode_ABSANTStruct implements routines.system.IPersistableRow<qrCode_ABSANTStruct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[0];

	
			    public String name;

				public String getName () {
					return this.name;
				}
				
			    public String qr_code;

				public String getQr_code () {
					return this.qr_code;
				}
				
			    public String phone;

				public String getPhone () {
					return this.phone;
				}
				
			    public String address;

				public String getAddress () {
					return this.address;
				}
				
			    public java.util.Date created_at;

				public java.util.Date getCreated_at () {
					return this.created_at;
				}
				
			    public String status;

				public String getStatus () {
					return this.status;
				}
				
			    public Long sector_id;

				public Long getSector_id () {
					return this.sector_id;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length, utf8Charset);
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
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes) {

        	try {

        		int length = 0;
		
					this.name = readString(dis);
					
					this.qr_code = readString(dis);
					
					this.phone = readString(dis);
					
					this.address = readString(dis);
					
					this.created_at = readDate(dis);
					
					this.status = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.sector_id = null;
           				} else {
           			    	this.sector_id = dis.readLong();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes) {

        	try {

        		int length = 0;
		
					this.name = readString(dis);
					
					this.qr_code = readString(dis);
					
					this.phone = readString(dis);
					
					this.address = readString(dis);
					
					this.created_at = readDate(dis);
					
					this.status = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.sector_id = null;
           				} else {
           			    	this.sector_id = dis.readLong();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.name,dos);
					
					// String
				
						writeString(this.qr_code,dos);
					
					// String
				
						writeString(this.phone,dos);
					
					// String
				
						writeString(this.address,dos);
					
					// java.util.Date
				
						writeDate(this.created_at,dos);
					
					// String
				
						writeString(this.status,dos);
					
					// Long
				
						if(this.sector_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.sector_id);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.name,dos);
					
					// String
				
						writeString(this.qr_code,dos);
					
					// String
				
						writeString(this.phone,dos);
					
					// String
				
						writeString(this.address,dos);
					
					// java.util.Date
				
						writeDate(this.created_at,dos);
					
					// String
				
						writeString(this.status,dos);
					
					// Long
				
						if(this.sector_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.sector_id);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("name="+name);
		sb.append(",qr_code="+qr_code);
		sb.append(",phone="+phone);
		sb.append(",address="+address);
		sb.append(",created_at="+String.valueOf(created_at));
		sb.append(",status="+status);
		sb.append(",sector_id="+String.valueOf(sector_id));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(qrCode_ABSANTStruct other) {

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
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[0];

	
			    public long id;

				public long getId () {
					return this.id;
				}
				
			    public String name;

				public String getName () {
					return this.name;
				}
				
			    public String qr_code;

				public String getQr_code () {
					return this.qr_code;
				}
				
			    public String phone;

				public String getPhone () {
					return this.phone;
				}
				
			    public String address;

				public String getAddress () {
					return this.address;
				}
				
			    public String lat;

				public String getLat () {
					return this.lat;
				}
				
			    public String lng;

				public String getLng () {
					return this.lng;
				}
				
			    public java.util.Date created_at;

				public java.util.Date getCreated_at () {
					return this.created_at;
				}
				
			    public java.util.Date updated_at;

				public java.util.Date getUpdated_at () {
					return this.updated_at;
				}
				
			    public String status;

				public String getStatus () {
					return this.status;
				}
				
			    public Long zone_id;

				public Long getZone_id () {
					return this.zone_id;
				}
				
			    public Long cluster_id;

				public Long getCluster_id () {
					return this.cluster_id;
				}
				
			    public Long paiementmode_id;

				public Long getPaiementmode_id () {
					return this.paiementmode_id;
				}
				
			    public String second_deliveryday;

				public String getSecond_deliveryday () {
					return this.second_deliveryday;
				}
				
			    public String three_deliveryday;

				public String getThree_deliveryday () {
					return this.three_deliveryday;
				}
				
			    public Boolean golden_shop;

				public Boolean getGolden_shop () {
					return this.golden_shop;
				}
				
			    public Boolean secours;

				public Boolean getSecours () {
					return this.secours;
				}
				
			    public Long user_id;

				public Long getUser_id () {
					return this.user_id;
				}
				
			    public Long sector_id;

				public Long getSector_id () {
					return this.sector_id;
				}
				
			    public Long catalog_id;

				public Long getCatalog_id () {
					return this.catalog_id;
				}
				
			    public Long catalog_promo_id;

				public Long getCatalog_promo_id () {
					return this.catalog_promo_id;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length, utf8Charset);
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
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes) {

        	try {

        		int length = 0;
		
			        this.id = dis.readLong();
					
					this.name = readString(dis);
					
					this.qr_code = readString(dis);
					
					this.phone = readString(dis);
					
					this.address = readString(dis);
					
					this.lat = readString(dis);
					
					this.lng = readString(dis);
					
					this.created_at = readDate(dis);
					
					this.updated_at = readDate(dis);
					
					this.status = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.zone_id = null;
           				} else {
           			    	this.zone_id = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.cluster_id = null;
           				} else {
           			    	this.cluster_id = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.paiementmode_id = null;
           				} else {
           			    	this.paiementmode_id = dis.readLong();
           				}
					
					this.second_deliveryday = readString(dis);
					
					this.three_deliveryday = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.golden_shop = null;
           				} else {
           			    	this.golden_shop = dis.readBoolean();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.secours = null;
           				} else {
           			    	this.secours = dis.readBoolean();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.user_id = null;
           				} else {
           			    	this.user_id = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.sector_id = null;
           				} else {
           			    	this.sector_id = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.catalog_id = null;
           				} else {
           			    	this.catalog_id = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.catalog_promo_id = null;
           				} else {
           			    	this.catalog_promo_id = dis.readLong();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes) {

        	try {

        		int length = 0;
		
			        this.id = dis.readLong();
					
					this.name = readString(dis);
					
					this.qr_code = readString(dis);
					
					this.phone = readString(dis);
					
					this.address = readString(dis);
					
					this.lat = readString(dis);
					
					this.lng = readString(dis);
					
					this.created_at = readDate(dis);
					
					this.updated_at = readDate(dis);
					
					this.status = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.zone_id = null;
           				} else {
           			    	this.zone_id = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.cluster_id = null;
           				} else {
           			    	this.cluster_id = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.paiementmode_id = null;
           				} else {
           			    	this.paiementmode_id = dis.readLong();
           				}
					
					this.second_deliveryday = readString(dis);
					
					this.three_deliveryday = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.golden_shop = null;
           				} else {
           			    	this.golden_shop = dis.readBoolean();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.secours = null;
           				} else {
           			    	this.secours = dis.readBoolean();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.user_id = null;
           				} else {
           			    	this.user_id = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.sector_id = null;
           				} else {
           			    	this.sector_id = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.catalog_id = null;
           				} else {
           			    	this.catalog_id = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.catalog_promo_id = null;
           				} else {
           			    	this.catalog_promo_id = dis.readLong();
           				}
					
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
				
						writeString(this.name,dos);
					
					// String
				
						writeString(this.qr_code,dos);
					
					// String
				
						writeString(this.phone,dos);
					
					// String
				
						writeString(this.address,dos);
					
					// String
				
						writeString(this.lat,dos);
					
					// String
				
						writeString(this.lng,dos);
					
					// java.util.Date
				
						writeDate(this.created_at,dos);
					
					// java.util.Date
				
						writeDate(this.updated_at,dos);
					
					// String
				
						writeString(this.status,dos);
					
					// Long
				
						if(this.zone_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.zone_id);
		            	}
					
					// Long
				
						if(this.cluster_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.cluster_id);
		            	}
					
					// Long
				
						if(this.paiementmode_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.paiementmode_id);
		            	}
					
					// String
				
						writeString(this.second_deliveryday,dos);
					
					// String
				
						writeString(this.three_deliveryday,dos);
					
					// Boolean
				
						if(this.golden_shop == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.golden_shop);
		            	}
					
					// Boolean
				
						if(this.secours == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.secours);
		            	}
					
					// Long
				
						if(this.user_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.user_id);
		            	}
					
					// Long
				
						if(this.sector_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.sector_id);
		            	}
					
					// Long
				
						if(this.catalog_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.catalog_id);
		            	}
					
					// Long
				
						if(this.catalog_promo_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.catalog_promo_id);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id);
					
					// String
				
						writeString(this.name,dos);
					
					// String
				
						writeString(this.qr_code,dos);
					
					// String
				
						writeString(this.phone,dos);
					
					// String
				
						writeString(this.address,dos);
					
					// String
				
						writeString(this.lat,dos);
					
					// String
				
						writeString(this.lng,dos);
					
					// java.util.Date
				
						writeDate(this.created_at,dos);
					
					// java.util.Date
				
						writeDate(this.updated_at,dos);
					
					// String
				
						writeString(this.status,dos);
					
					// Long
				
						if(this.zone_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.zone_id);
		            	}
					
					// Long
				
						if(this.cluster_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.cluster_id);
		            	}
					
					// Long
				
						if(this.paiementmode_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.paiementmode_id);
		            	}
					
					// String
				
						writeString(this.second_deliveryday,dos);
					
					// String
				
						writeString(this.three_deliveryday,dos);
					
					// Boolean
				
						if(this.golden_shop == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.golden_shop);
		            	}
					
					// Boolean
				
						if(this.secours == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.secours);
		            	}
					
					// Long
				
						if(this.user_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.user_id);
		            	}
					
					// Long
				
						if(this.sector_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.sector_id);
		            	}
					
					// Long
				
						if(this.catalog_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.catalog_id);
		            	}
					
					// Long
				
						if(this.catalog_promo_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.catalog_promo_id);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id="+String.valueOf(id));
		sb.append(",name="+name);
		sb.append(",qr_code="+qr_code);
		sb.append(",phone="+phone);
		sb.append(",address="+address);
		sb.append(",lat="+lat);
		sb.append(",lng="+lng);
		sb.append(",created_at="+String.valueOf(created_at));
		sb.append(",updated_at="+String.valueOf(updated_at));
		sb.append(",status="+status);
		sb.append(",zone_id="+String.valueOf(zone_id));
		sb.append(",cluster_id="+String.valueOf(cluster_id));
		sb.append(",paiementmode_id="+String.valueOf(paiementmode_id));
		sb.append(",second_deliveryday="+second_deliveryday);
		sb.append(",three_deliveryday="+three_deliveryday);
		sb.append(",golden_shop="+String.valueOf(golden_shop));
		sb.append(",secours="+String.valueOf(secours));
		sb.append(",user_id="+String.valueOf(user_id));
		sb.append(",sector_id="+String.valueOf(sector_id));
		sb.append(",catalog_id="+String.valueOf(catalog_id));
		sb.append(",catalog_promo_id="+String.valueOf(catalog_promo_id));
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
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[0];

	
			    public long id;

				public long getId () {
					return this.id;
				}
				
			    public String name;

				public String getName () {
					return this.name;
				}
				
			    public String qr_code;

				public String getQr_code () {
					return this.qr_code;
				}
				
			    public String phone;

				public String getPhone () {
					return this.phone;
				}
				
			    public String address;

				public String getAddress () {
					return this.address;
				}
				
			    public String lat;

				public String getLat () {
					return this.lat;
				}
				
			    public String lng;

				public String getLng () {
					return this.lng;
				}
				
			    public java.util.Date created_at;

				public java.util.Date getCreated_at () {
					return this.created_at;
				}
				
			    public java.util.Date updated_at;

				public java.util.Date getUpdated_at () {
					return this.updated_at;
				}
				
			    public String status;

				public String getStatus () {
					return this.status;
				}
				
			    public Long zone_id;

				public Long getZone_id () {
					return this.zone_id;
				}
				
			    public Long cluster_id;

				public Long getCluster_id () {
					return this.cluster_id;
				}
				
			    public Long paiementmode_id;

				public Long getPaiementmode_id () {
					return this.paiementmode_id;
				}
				
			    public String second_deliveryday;

				public String getSecond_deliveryday () {
					return this.second_deliveryday;
				}
				
			    public String three_deliveryday;

				public String getThree_deliveryday () {
					return this.three_deliveryday;
				}
				
			    public Boolean golden_shop;

				public Boolean getGolden_shop () {
					return this.golden_shop;
				}
				
			    public Boolean secours;

				public Boolean getSecours () {
					return this.secours;
				}
				
			    public Long user_id;

				public Long getUser_id () {
					return this.user_id;
				}
				
			    public Long sector_id;

				public Long getSector_id () {
					return this.sector_id;
				}
				
			    public Long catalog_id;

				public Long getCatalog_id () {
					return this.catalog_id;
				}
				
			    public Long catalog_promo_id;

				public Long getCatalog_promo_id () {
					return this.catalog_promo_id;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length, utf8Charset);
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
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes) {

        	try {

        		int length = 0;
		
			        this.id = dis.readLong();
					
					this.name = readString(dis);
					
					this.qr_code = readString(dis);
					
					this.phone = readString(dis);
					
					this.address = readString(dis);
					
					this.lat = readString(dis);
					
					this.lng = readString(dis);
					
					this.created_at = readDate(dis);
					
					this.updated_at = readDate(dis);
					
					this.status = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.zone_id = null;
           				} else {
           			    	this.zone_id = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.cluster_id = null;
           				} else {
           			    	this.cluster_id = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.paiementmode_id = null;
           				} else {
           			    	this.paiementmode_id = dis.readLong();
           				}
					
					this.second_deliveryday = readString(dis);
					
					this.three_deliveryday = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.golden_shop = null;
           				} else {
           			    	this.golden_shop = dis.readBoolean();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.secours = null;
           				} else {
           			    	this.secours = dis.readBoolean();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.user_id = null;
           				} else {
           			    	this.user_id = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.sector_id = null;
           				} else {
           			    	this.sector_id = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.catalog_id = null;
           				} else {
           			    	this.catalog_id = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.catalog_promo_id = null;
           				} else {
           			    	this.catalog_promo_id = dis.readLong();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes) {

        	try {

        		int length = 0;
		
			        this.id = dis.readLong();
					
					this.name = readString(dis);
					
					this.qr_code = readString(dis);
					
					this.phone = readString(dis);
					
					this.address = readString(dis);
					
					this.lat = readString(dis);
					
					this.lng = readString(dis);
					
					this.created_at = readDate(dis);
					
					this.updated_at = readDate(dis);
					
					this.status = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.zone_id = null;
           				} else {
           			    	this.zone_id = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.cluster_id = null;
           				} else {
           			    	this.cluster_id = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.paiementmode_id = null;
           				} else {
           			    	this.paiementmode_id = dis.readLong();
           				}
					
					this.second_deliveryday = readString(dis);
					
					this.three_deliveryday = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.golden_shop = null;
           				} else {
           			    	this.golden_shop = dis.readBoolean();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.secours = null;
           				} else {
           			    	this.secours = dis.readBoolean();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.user_id = null;
           				} else {
           			    	this.user_id = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.sector_id = null;
           				} else {
           			    	this.sector_id = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.catalog_id = null;
           				} else {
           			    	this.catalog_id = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.catalog_promo_id = null;
           				} else {
           			    	this.catalog_promo_id = dis.readLong();
           				}
					
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
				
						writeString(this.name,dos);
					
					// String
				
						writeString(this.qr_code,dos);
					
					// String
				
						writeString(this.phone,dos);
					
					// String
				
						writeString(this.address,dos);
					
					// String
				
						writeString(this.lat,dos);
					
					// String
				
						writeString(this.lng,dos);
					
					// java.util.Date
				
						writeDate(this.created_at,dos);
					
					// java.util.Date
				
						writeDate(this.updated_at,dos);
					
					// String
				
						writeString(this.status,dos);
					
					// Long
				
						if(this.zone_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.zone_id);
		            	}
					
					// Long
				
						if(this.cluster_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.cluster_id);
		            	}
					
					// Long
				
						if(this.paiementmode_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.paiementmode_id);
		            	}
					
					// String
				
						writeString(this.second_deliveryday,dos);
					
					// String
				
						writeString(this.three_deliveryday,dos);
					
					// Boolean
				
						if(this.golden_shop == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.golden_shop);
		            	}
					
					// Boolean
				
						if(this.secours == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.secours);
		            	}
					
					// Long
				
						if(this.user_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.user_id);
		            	}
					
					// Long
				
						if(this.sector_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.sector_id);
		            	}
					
					// Long
				
						if(this.catalog_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.catalog_id);
		            	}
					
					// Long
				
						if(this.catalog_promo_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.catalog_promo_id);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id);
					
					// String
				
						writeString(this.name,dos);
					
					// String
				
						writeString(this.qr_code,dos);
					
					// String
				
						writeString(this.phone,dos);
					
					// String
				
						writeString(this.address,dos);
					
					// String
				
						writeString(this.lat,dos);
					
					// String
				
						writeString(this.lng,dos);
					
					// java.util.Date
				
						writeDate(this.created_at,dos);
					
					// java.util.Date
				
						writeDate(this.updated_at,dos);
					
					// String
				
						writeString(this.status,dos);
					
					// Long
				
						if(this.zone_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.zone_id);
		            	}
					
					// Long
				
						if(this.cluster_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.cluster_id);
		            	}
					
					// Long
				
						if(this.paiementmode_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.paiementmode_id);
		            	}
					
					// String
				
						writeString(this.second_deliveryday,dos);
					
					// String
				
						writeString(this.three_deliveryday,dos);
					
					// Boolean
				
						if(this.golden_shop == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.golden_shop);
		            	}
					
					// Boolean
				
						if(this.secours == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.secours);
		            	}
					
					// Long
				
						if(this.user_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.user_id);
		            	}
					
					// Long
				
						if(this.sector_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.sector_id);
		            	}
					
					// Long
				
						if(this.catalog_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.catalog_id);
		            	}
					
					// Long
				
						if(this.catalog_promo_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.catalog_promo_id);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id="+String.valueOf(id));
		sb.append(",name="+name);
		sb.append(",qr_code="+qr_code);
		sb.append(",phone="+phone);
		sb.append(",address="+address);
		sb.append(",lat="+lat);
		sb.append(",lng="+lng);
		sb.append(",created_at="+String.valueOf(created_at));
		sb.append(",updated_at="+String.valueOf(updated_at));
		sb.append(",status="+status);
		sb.append(",zone_id="+String.valueOf(zone_id));
		sb.append(",cluster_id="+String.valueOf(cluster_id));
		sb.append(",paiementmode_id="+String.valueOf(paiementmode_id));
		sb.append(",second_deliveryday="+second_deliveryday);
		sb.append(",three_deliveryday="+three_deliveryday);
		sb.append(",golden_shop="+String.valueOf(golden_shop));
		sb.append(",secours="+String.valueOf(secours));
		sb.append(",user_id="+String.valueOf(user_id));
		sb.append(",sector_id="+String.valueOf(sector_id));
		sb.append(",catalog_id="+String.valueOf(catalog_id));
		sb.append(",catalog_promo_id="+String.valueOf(catalog_promo_id));
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


		tDBInput_2Process(globalMap);
		tDBInput_4Process(globalMap);
		tDBInput_3Process(globalMap);
		tDBInput_5Process(globalMap);
		tDBInput_6Process(globalMap);
		tDBInput_7Process(globalMap);

		row1Struct row1 = new row1Struct();
out1Struct out1 = new out1Struct();
out2Struct out2 = new out2Struct();
row6Struct row6 = new row6Struct();
Inserte_New_PDVStruct Inserte_New_PDV = new Inserte_New_PDVStruct();
row11Struct row11 = new row11Struct();
row9Struct row9 = new row9Struct();
UpdatesStruct Updates = new UpdatesStruct();
row10Struct row10 = new row10Struct();
Update_PDVStruct Update_PDV = new Update_PDVStruct();
qrCode_ABSANTStruct qrCode_ABSANT = new qrCode_ABSANTStruct();
out3Struct out3 = new out3Struct();






	
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

		if(this.ID_PDV != other.ID_PDV){
						
				return this.ID_PDV > other.ID_PDV ? 1 : -1;
							
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
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row3Struct> tHash_Lookup_row3 = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row3Struct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row3Struct>) 
					globalMap.get( "tHash_Lookup_row3" ))
					;					
					
	

row3Struct row3HashKey = new row3Struct();
row3Struct row3Default = new row3Struct();
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row4Struct> tHash_Lookup_row4 = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row4Struct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row4Struct>) 
					globalMap.get( "tHash_Lookup_row4" ))
					;					
					
	

row4Struct row4HashKey = new row4Struct();
row4Struct row4Default = new row4Struct();
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
	 * [tLogRow_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tLogRow_1", false);
		start_Hash.put("tLogRow_1", System.currentTimeMillis());
		
	
	currentComponent="tLogRow_1";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"out3");
					}
				
		int tos_count_tLogRow_1 = 0;
		

	///////////////////////
	
         class Util_tLogRow_1 {

        String[] des_top = { ".", ".", "-", "+" };

        String[] des_head = { "|=", "=|", "-", "+" };

        String[] des_bottom = { "'", "'", "-", "+" };

        String name="";

        java.util.List<String[]> list = new java.util.ArrayList<String[]>();

        int[] colLengths = new int[7];

        public void addRow(String[] row) {

            for (int i = 0; i < 7; i++) {
                if (row[i]!=null) {
                  colLengths[i] = Math.max(colLengths[i], row[i].length());
                }
            }
            list.add(row);
        }

        public void setTableName(String name) {

            this.name = name;
        }

            public StringBuilder format() {
            
                StringBuilder sb = new StringBuilder();
  
            
                    sb.append(print(des_top));
    
                    int totals = 0;
                    for (int i = 0; i < colLengths.length; i++) {
                        totals = totals + colLengths[i];
                    }
    
                    // name
                    sb.append("|");
                    int k = 0;
                    for (k = 0; k < (totals + 6 - name.length()) / 2; k++) {
                        sb.append(' ');
                    }
                    sb.append(name);
                    for (int i = 0; i < totals + 6 - name.length() - k; i++) {
                        sb.append(' ');
                    }
                    sb.append("|\n");

                    // head and rows
                    sb.append(print(des_head));
                    for (int i = 0; i < list.size(); i++) {
    
                        String[] row = list.get(i);
    
                        java.util.Formatter formatter = new java.util.Formatter(new StringBuilder());
                        
                        StringBuilder sbformat = new StringBuilder();                                             
        			        sbformat.append("|%1$-");
        			        sbformat.append(colLengths[0]);
        			        sbformat.append("s");
        			              
        			        sbformat.append("|%2$-");
        			        sbformat.append(colLengths[1]);
        			        sbformat.append("s");
        			              
        			        sbformat.append("|%3$-");
        			        sbformat.append(colLengths[2]);
        			        sbformat.append("s");
        			              
        			        sbformat.append("|%4$-");
        			        sbformat.append(colLengths[3]);
        			        sbformat.append("s");
        			              
        			        sbformat.append("|%5$-");
        			        sbformat.append(colLengths[4]);
        			        sbformat.append("s");
        			              
        			        sbformat.append("|%6$-");
        			        sbformat.append(colLengths[5]);
        			        sbformat.append("s");
        			              
        			        sbformat.append("|%7$-");
        			        sbformat.append(colLengths[6]);
        			        sbformat.append("s");
        			                      
                        sbformat.append("|\n");                    
       
                        formatter.format(sbformat.toString(), (Object[])row);	
                                
                        sb.append(formatter.toString());
                        if (i == 0)
                            sb.append(print(des_head)); // print the head
                    }
    
                    // end
                    sb.append(print(des_bottom));
                    return sb;
                }
            

            private StringBuilder print(String[] fillChars) {
                StringBuilder sb = new StringBuilder();
                //first column
                sb.append(fillChars[0]);                
                    for (int i = 0; i < colLengths[0] - fillChars[0].length() + 1; i++) {
                        sb.append(fillChars[2]);
                    }
                    sb.append(fillChars[3]);	                

                    for (int i = 0; i < colLengths[1] - fillChars[3].length() + 1; i++) {
                        sb.append(fillChars[2]);
                    }
                    sb.append(fillChars[3]);
                    for (int i = 0; i < colLengths[2] - fillChars[3].length() + 1; i++) {
                        sb.append(fillChars[2]);
                    }
                    sb.append(fillChars[3]);
                    for (int i = 0; i < colLengths[3] - fillChars[3].length() + 1; i++) {
                        sb.append(fillChars[2]);
                    }
                    sb.append(fillChars[3]);
                    for (int i = 0; i < colLengths[4] - fillChars[3].length() + 1; i++) {
                        sb.append(fillChars[2]);
                    }
                    sb.append(fillChars[3]);
                    for (int i = 0; i < colLengths[5] - fillChars[3].length() + 1; i++) {
                        sb.append(fillChars[2]);
                    }
                    sb.append(fillChars[3]);
                
                    //last column
                    for (int i = 0; i < colLengths[6] - fillChars[1].length() + 1; i++) {
                        sb.append(fillChars[2]);
                    }         
                sb.append(fillChars[1]);
                sb.append("\n");               
                return sb;
            }
            
            public boolean isTableEmpty(){
            	if (list.size() > 1)
            		return false;
            	return true;
            }
        }
        Util_tLogRow_1 util_tLogRow_1 = new Util_tLogRow_1();
        util_tLogRow_1.setTableName("QR Code au mauvais Format");
        util_tLogRow_1.addRow(new String[]{"name","qr_code","phone","address","created_at","status","Secteur",});        
 		StringBuilder strBuffer_tLogRow_1 = null;
		int nb_line_tLogRow_1 = 0;
///////////////////////    			



 



/**
 * [tLogRow_1 begin ] stop
 */



	
	/**
	 * [tMap_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_3", false);
		start_Hash.put("tMap_3", System.currentTimeMillis());
		
	
	currentComponent="tMap_3";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"qrCode_ABSANT");
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
out3Struct out3_tmp = new out3Struct();
// ###############################

        
        



        









 



/**
 * [tMap_3 begin ] stop
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
}
Var__tMap_1__Struct Var__tMap_1 = new Var__tMap_1__Struct();
// ###############################

// ###############################
// # Outputs initialization
out1Struct out1_tmp = new out1Struct();
qrCode_ABSANTStruct qrCode_ABSANT_tmp = new qrCode_ABSANTStruct();
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
				
				 
	final String decryptedPassword_tDBInput_1 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:Wpv4SpumKNCw8OtMvL1+Fnbojtd2UhNmTez7nFQW9o385yH8EGwWa3rq");
				
				String dbPwd_tDBInput_1 = decryptedPassword_tDBInput_1;
				
				String url_tDBInput_1 = "jdbc:postgresql://" + "leuk.laiterieduberger.sn" + ":" + "5432" + "/" + "leuk_webapp_production";
				
				conn_tDBInput_1 = java.sql.DriverManager.getConnection(url_tDBInput_1,dbUser_tDBInput_1,dbPwd_tDBInput_1);
		        
				conn_tDBInput_1.setAutoCommit(false);
			
		    
			java.sql.Statement stmt_tDBInput_1 = conn_tDBInput_1.createStatement();

		    String dbquery_tDBInput_1 = "SELECT \n  \"public\".\"point_of_sales\".\"id\", \n  \"public\".\"point_of_sales\".\"name\", \n  \"public\".\"point_of_sal"
+"es\".\"qr_code\", \n  \"public\".\"point_of_sales\".\"phone\", \n  \"public\".\"point_of_sales\".\"address\", \n  \"public"
+"\".\"point_of_sales\".\"lat\", \n  \"public\".\"point_of_sales\".\"lng\", \n  \"public\".\"point_of_sales\".\"created_at\""
+", \n  \"public\".\"point_of_sales\".\"updated_at\", \n  \"public\".\"point_of_sales\".\"status\", \n  \"public\".\"point_of"
+"_sales\".\"zone_id\", \n  \"public\".\"point_of_sales\".\"cluster_id\", \n  \"public\".\"point_of_sales\".\"paiementmode_i"
+"d\", \n  \"public\".\"point_of_sales\".\"second_deliveryday\", \n  \"public\".\"point_of_sales\".\"three_deliveryday\", \n "
+" \"public\".\"point_of_sales\".\"golden_shop\", \n  \"public\".\"point_of_sales\".\"secours\", \n  \"public\".\"point_of_s"
+"ales\".\"user_id\", \n  \"public\".\"point_of_sales\".\"sector_id\", \n  \"public\".\"point_of_sales\".\"catalog_id\", \n  "
+"\"public\".\"point_of_sales\".\"catalog_promo_id\"\nFROM \"public\".\"point_of_sales\"";
		    

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
								row1.name = null;
							} else {
	                         		
        	row1.name = routines.system.JDBCUtil.getString(rs_tDBInput_1, 2, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 3) {
								row1.qr_code = null;
							} else {
	                         		
        	row1.qr_code = routines.system.JDBCUtil.getString(rs_tDBInput_1, 3, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 4) {
								row1.phone = null;
							} else {
	                         		
        	row1.phone = routines.system.JDBCUtil.getString(rs_tDBInput_1, 4, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 5) {
								row1.address = null;
							} else {
	                         		
        	row1.address = routines.system.JDBCUtil.getString(rs_tDBInput_1, 5, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 6) {
								row1.lat = null;
							} else {
	                         		
        	row1.lat = routines.system.JDBCUtil.getString(rs_tDBInput_1, 6, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 7) {
								row1.lng = null;
							} else {
	                         		
        	row1.lng = routines.system.JDBCUtil.getString(rs_tDBInput_1, 7, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 8) {
								row1.created_at = null;
							} else {
										
			row1.created_at = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 8);
		                    }
							if(colQtyInRs_tDBInput_1 < 9) {
								row1.updated_at = null;
							} else {
										
			row1.updated_at = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 9);
		                    }
							if(colQtyInRs_tDBInput_1 < 10) {
								row1.status = null;
							} else {
	                         		
        	row1.status = routines.system.JDBCUtil.getString(rs_tDBInput_1, 10, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 11) {
								row1.zone_id = null;
							} else {
		                          
            row1.zone_id = rs_tDBInput_1.getLong(11);
            if(rs_tDBInput_1.wasNull()){
                    row1.zone_id = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 12) {
								row1.cluster_id = null;
							} else {
		                          
            row1.cluster_id = rs_tDBInput_1.getLong(12);
            if(rs_tDBInput_1.wasNull()){
                    row1.cluster_id = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 13) {
								row1.paiementmode_id = null;
							} else {
		                          
            row1.paiementmode_id = rs_tDBInput_1.getLong(13);
            if(rs_tDBInput_1.wasNull()){
                    row1.paiementmode_id = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 14) {
								row1.second_deliveryday = null;
							} else {
	                         		
        	row1.second_deliveryday = routines.system.JDBCUtil.getString(rs_tDBInput_1, 14, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 15) {
								row1.three_deliveryday = null;
							} else {
	                         		
        	row1.three_deliveryday = routines.system.JDBCUtil.getString(rs_tDBInput_1, 15, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 16) {
								row1.golden_shop = null;
							} else {
	                         		
            row1.golden_shop = rs_tDBInput_1.getBoolean(16);
            if(rs_tDBInput_1.wasNull()){
                    row1.golden_shop = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 17) {
								row1.secours = null;
							} else {
	                         		
            row1.secours = rs_tDBInput_1.getBoolean(17);
            if(rs_tDBInput_1.wasNull()){
                    row1.secours = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 18) {
								row1.user_id = null;
							} else {
		                          
            row1.user_id = rs_tDBInput_1.getLong(18);
            if(rs_tDBInput_1.wasNull()){
                    row1.user_id = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 19) {
								row1.sector_id = null;
							} else {
		                          
            row1.sector_id = rs_tDBInput_1.getLong(19);
            if(rs_tDBInput_1.wasNull()){
                    row1.sector_id = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 20) {
								row1.catalog_id = null;
							} else {
		                          
            row1.catalog_id = rs_tDBInput_1.getLong(20);
            if(rs_tDBInput_1.wasNull()){
                    row1.catalog_id = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 21) {
								row1.catalog_promo_id = null;
							} else {
		                          
            row1.catalog_promo_id = rs_tDBInput_1.getLong(21);
            if(rs_tDBInput_1.wasNull()){
                    row1.catalog_promo_id = null;
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
            				    								  
		
		              
			   	  		  if(
 				  		  			
 				  		  			(
 				  		  			
 				  		  			row1.qr_code != null
 				  		  			
 				  		  			)
  				  		  			
	  	  		  				) { // G_TM_M_280

							 // CALL close main tMap filter for table 'row1'
							

				///////////////////////////////////////////////
				// Starting Lookup Table "row2" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLooprow2 = false;
       		  	    	
       		  	    	
 							row2Struct row2ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_1) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_1 = false;
								
	                        		    	Object exprKeyValue_row2__id = row1.cluster_id ;
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
        
Var__tMap_1__Struct Var = Var__tMap_1;// ###############################
        // ###############################
        // # Output tables

out1 = null;
qrCode_ABSANT = null;

boolean rejected_tMap_1 = true;
if(!rejectedInnerJoin_tMap_1 ) {

// # Output table : 'out1'
// # Filter conditions 
if( 

row1.qr_code.startsWith ("pdv") || row1.qr_code.startsWith ("mt")

 ) {
rejected_tMap_1 = false;
out1_tmp.ID_PDV = row1.id ;
out1_tmp.sector_id = row1.sector_id ;
out1_tmp.name = StringHandling.UPCASE(row1.name) ;
out1_tmp.qr_code = row1.qr_code ;
out1_tmp.phone = row1.phone ;
out1_tmp.address = row1.address ;
out1_tmp.lat = row1.lat ;
out1_tmp.lng = row1.lng ;
out1_tmp.secours = row1.secours ;
out1_tmp.golden_shop = row1.golden_shop ;
out1_tmp.status = row1.status ;
out1_tmp.created_at = row1.created_at ;
out1_tmp.updated_at = row1.updated_at ;
out1_tmp.cluster = row2.cluster ;
out1_tmp.zone_id = row1.zone_id ;
out1_tmp.second_deliveryday = row1.second_deliveryday ;
out1_tmp.three_deliveryday = row1.three_deliveryday ;
out1 = out1_tmp;
} // closing filter/reject
} // closing inner join bracket (1)
 else {
rejected_tMap_1 = false;
} // closing else inner join bracket (1)
// ###### START REJECTS ##### 

// # Output reject table : 'qrCode_ABSANT'
// # Filter conditions 
if( rejected_tMap_1 && (

row1.status.equals("Activate")

) ) {
qrCode_ABSANT_tmp.name = row1.name ;
qrCode_ABSANT_tmp.qr_code = row1.qr_code ;
qrCode_ABSANT_tmp.phone = row1.phone ;
qrCode_ABSANT_tmp.address = row1.address ;
qrCode_ABSANT_tmp.created_at = row1.created_at ;
qrCode_ABSANT_tmp.status = row1.status ;
qrCode_ABSANT_tmp.sector_id = row1.sector_id ;
qrCode_ABSANT = qrCode_ABSANT_tmp;
} // closing filter/reject
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
				// Starting Lookup Table "row3" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLooprow3 = false;
       		  	    	
       		  	    	
 							row3Struct row3ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_2) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_2 = false;
								
	                        		    	Object exprKeyValue_row3__id = out1.zone_id ;
	                        		    	if(exprKeyValue_row3__id == null) {
	                        		    		hasCasePrimitiveKeyWithNull_tMap_2 = true;
	                        		    	} else {
                        		    			row3HashKey.id = (long)(Long) exprKeyValue_row3__id;
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
							
							
							
			  							
								
	                    		  	
		                    
	            	
	           	
	            	
	            	
	            

				///////////////////////////////////////////////
				// Starting Lookup Table "row4" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLooprow4 = false;
       		  	    	
       		  	    	
 							row4Struct row4ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_2) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_2 = false;
								
	                        		    	Object exprKeyValue_row4__id = row3.deliveryday_id ;
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
out2_tmp.ID_PDV = out1.ID_PDV ;
out2_tmp.sector_id = out1.sector_id ;
out2_tmp.name = out1.name ;
out2_tmp.qr_code = out1.qr_code ;
out2_tmp.phone = out1.phone ;
out2_tmp.address = out1.address ;
out2_tmp.lat = out1.lat ;
out2_tmp.lng = out1.lng ;
out2_tmp.secours = out1.secours ;
out2_tmp.golden_shop = out1.golden_shop ;
out2_tmp.status = out1.status ;
out2_tmp.Date_Creation = out1.created_at ;
out2_tmp.Date_Update = out1.updated_at ;
out2_tmp.cluster = out1.cluster ;
out2_tmp.Jour_Livraison_1 = row4.day ;
out2_tmp.Jour_Livraison_2 = out1.second_deliveryday ;
out2_tmp.Jour_Livraison_3 = out1.three_deliveryday ;
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

	arrayRowtSortRow_1_SortOut.ID_PDV = out2.ID_PDV;
	arrayRowtSortRow_1_SortOut.sector_id = out2.sector_id;
	arrayRowtSortRow_1_SortOut.name = out2.name;
	arrayRowtSortRow_1_SortOut.qr_code = out2.qr_code;
	arrayRowtSortRow_1_SortOut.phone = out2.phone;
	arrayRowtSortRow_1_SortOut.address = out2.address;
	arrayRowtSortRow_1_SortOut.lat = out2.lat;
	arrayRowtSortRow_1_SortOut.lng = out2.lng;
	arrayRowtSortRow_1_SortOut.secours = out2.secours;
	arrayRowtSortRow_1_SortOut.golden_shop = out2.golden_shop;
	arrayRowtSortRow_1_SortOut.status = out2.status;
	arrayRowtSortRow_1_SortOut.Date_Creation = out2.Date_Creation;
	arrayRowtSortRow_1_SortOut.Date_Update = out2.Date_Update;
	arrayRowtSortRow_1_SortOut.cluster = out2.cluster;
	arrayRowtSortRow_1_SortOut.Jour_Livraison_1 = out2.Jour_Livraison_1;
	arrayRowtSortRow_1_SortOut.Jour_Livraison_2 = out2.Jour_Livraison_2;
	arrayRowtSortRow_1_SortOut.Jour_Livraison_3 = out2.Jour_Livraison_3;	
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




// Start of branch "qrCode_ABSANT"
if(qrCode_ABSANT != null) { 



	
	/**
	 * [tMap_3 main ] start
	 */

	

	
	
	currentComponent="tMap_3";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"qrCode_ABSANT"
						
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
								
	                        		    	Object exprKeyValue_row5__id = qrCode_ABSANT.sector_id ;
	                        		    	if(exprKeyValue_row5__id == null) {
	                        		    		hasCasePrimitiveKeyWithNull_tMap_3 = true;
	                        		    	} else {
                        		    			row5HashKey.id = (long)(Long) exprKeyValue_row5__id;
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
        
Var__tMap_3__Struct Var = Var__tMap_3;// ###############################
        // ###############################
        // # Output tables

out3 = null;

if(!rejectedInnerJoin_tMap_3 ) {

// # Output table : 'out3'
out3_tmp.name = qrCode_ABSANT.name ;
out3_tmp.qr_code = qrCode_ABSANT.qr_code ;
out3_tmp.phone = qrCode_ABSANT.phone ;
out3_tmp.address = qrCode_ABSANT.address ;
out3_tmp.created_at = qrCode_ABSANT.created_at ;
out3_tmp.status = qrCode_ABSANT.status ;
out3_tmp.Secteur = row5.label ;
out3 = out3_tmp;
}  // closing inner join bracket (2)
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
// Start of branch "out3"
if(out3 != null) { 



	
	/**
	 * [tLogRow_1 main ] start
	 */

	

	
	
	currentComponent="tLogRow_1";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"out3"
						
						);
					}
					
///////////////////////		
						

				
				String[] row_tLogRow_1 = new String[7];
   				
	    		if(out3.name != null) { //              
                 row_tLogRow_1[0]=    						    
				                String.valueOf(out3.name)			
					          ;	
							
	    		} //			
    			   				
	    		if(out3.qr_code != null) { //              
                 row_tLogRow_1[1]=    						    
				                String.valueOf(out3.qr_code)			
					          ;	
							
	    		} //			
    			   				
	    		if(out3.phone != null) { //              
                 row_tLogRow_1[2]=    						    
				                String.valueOf(out3.phone)			
					          ;	
							
	    		} //			
    			   				
	    		if(out3.address != null) { //              
                 row_tLogRow_1[3]=    						    
				                String.valueOf(out3.address)			
					          ;	
							
	    		} //			
    			   				
	    		if(out3.created_at != null) { //              
                 row_tLogRow_1[4]=    						
								FormatterUtils.format_Date(out3.created_at, "dd-MM-yyyy")
					          ;	
							
	    		} //			
    			   				
	    		if(out3.status != null) { //              
                 row_tLogRow_1[5]=    						    
				                String.valueOf(out3.status)			
					          ;	
							
	    		} //			
    			   				
	    		if(out3.Secteur != null) { //              
                 row_tLogRow_1[6]=    						    
				                String.valueOf(out3.Secteur)			
					          ;	
							
	    		} //			
    			 

				util_tLogRow_1.addRow(row_tLogRow_1);	
				nb_line_tLogRow_1++;
//////

//////                    
                    
///////////////////////    			

 


	tos_count_tLogRow_1++;

/**
 * [tLogRow_1 main ] stop
 */
	
	/**
	 * [tLogRow_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tLogRow_1";

	

 



/**
 * [tLogRow_1 process_data_begin ] stop
 */
	
	/**
	 * [tLogRow_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tLogRow_1";

	

 



/**
 * [tLogRow_1 process_data_end ] stop
 */

} // End of branch "out3"




	
	/**
	 * [tMap_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_3";

	

 



/**
 * [tMap_3 process_data_end ] stop
 */

} // End of branch "qrCode_ABSANT"



	
		} // G_TM_M_280 close main tMap filter for table 'row1'
	
	
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
	 * [tMap_2 end ] start
	 */

	

	
	
	currentComponent="tMap_2";

	


// ###############################
// # Lookup hashes releasing
					if(tHash_Lookup_row3 != null) {
						tHash_Lookup_row3.endGet();
					}
					globalMap.remove( "tHash_Lookup_row3" );

					
					
				
					if(tHash_Lookup_row4 != null) {
						tHash_Lookup_row4.endGet();
					}
					globalMap.remove( "tHash_Lookup_row4" );

					
					
				
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
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row11");
					}
				
		int tos_count_tSortRow_2_SortOut = 0;
		


class Comparablerow11Struct extends row11Struct implements Comparable<Comparablerow11Struct> {
	
	public int compareTo(Comparablerow11Struct other) {

		if(this.date_creation == null && other.date_creation != null){
			return 1;
						
		}else if(this.date_creation != null && other.date_creation == null){
			return -1;
						
		}else if(this.date_creation != null && other.date_creation != null){
			if(!this.date_creation.equals(other.date_creation)){
				return other.date_creation.compareTo(this.date_creation);
			}
		}
		return 0;
	}
}

java.util.List<Comparablerow11Struct> list_tSortRow_2_SortOut = new java.util.ArrayList<Comparablerow11Struct>();


 



/**
 * [tSortRow_2_SortOut begin ] stop
 */



	
	/**
	 * [tFilterRow_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tFilterRow_1", false);
		start_Hash.put("tFilterRow_1", System.currentTimeMillis());
		
	
	currentComponent="tFilterRow_1";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"Inserte_New_PDV");
					}
				
		int tos_count_tFilterRow_1 = 0;
		
    int nb_line_tFilterRow_1 = 0;
    int nb_line_ok_tFilterRow_1 = 0;
    int nb_line_reject_tFilterRow_1 = 0;

    class Operator_tFilterRow_1 {
      private String sErrorMsg = "";
      private boolean bMatchFlag = true;
      private String sUnionFlag = "&&";

      public Operator_tFilterRow_1(String unionFlag){
        sUnionFlag = unionFlag;
        bMatchFlag =  "||".equals(unionFlag) ? false : true;
      }

      public String getErrorMsg() {
        if (sErrorMsg != null && sErrorMsg.length() > 1)
          return sErrorMsg.substring(1);
        else 
          return null;
      }

      public boolean getMatchFlag() {
        return bMatchFlag;
      }

      public void matches(boolean partMatched, String reason) {
        // no need to care about the next judgement
        if ("||".equals(sUnionFlag) && bMatchFlag){
          return;
        }

        if (!partMatched) {
          sErrorMsg += "|" + reason;
        }

        if ("||".equals(sUnionFlag))
          bMatchFlag = bMatchFlag || partMatched;
        else
          bMatchFlag = bMatchFlag && partMatched;
      }
    }

 



/**
 * [tFilterRow_1 begin ] stop
 */




	
	/**
	 * [tSortRow_3_SortOut begin ] start
	 */

	

	
		
		ok_Hash.put("tSortRow_3_SortOut", false);
		start_Hash.put("tSortRow_3_SortOut", System.currentTimeMillis());
		
	
		currentVirtualComponent = "tSortRow_3";
	
	currentComponent="tSortRow_3_SortOut";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"Updates");
					}
				
		int tos_count_tSortRow_3_SortOut = 0;
		


class ComparableUpdatesStruct extends UpdatesStruct implements Comparable<ComparableUpdatesStruct> {
	
	public int compareTo(ComparableUpdatesStruct other) {

			String thisSDate_Creation = this.Date_Creation == null ? "null" : FormatterUtils.format_Date(this.Date_Creation, "dd-MM-yyyy");
			String otherSDate_Creation = other.Date_Creation == null ? "null" : FormatterUtils.format_Date(other.Date_Creation, "dd-MM-yyyy");
			if(!thisSDate_Creation.equals(otherSDate_Creation)){
				return otherSDate_Creation.compareTo(thisSDate_Creation);
							
			}
		return 0;
	}
}

java.util.List<ComparableUpdatesStruct> list_tSortRow_3_SortOut = new java.util.ArrayList<ComparableUpdatesStruct>();


 



/**
 * [tSortRow_3_SortOut begin ] stop
 */



	
	/**
	 * [tMap_4 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_4", false);
		start_Hash.put("tMap_4", System.currentTimeMillis());
		
	
	currentComponent="tMap_4";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row6");
					}
				
		int tos_count_tMap_4 = 0;
		




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
class  Var__tMap_4__Struct  {
}
Var__tMap_4__Struct Var__tMap_4 = new Var__tMap_4__Struct();
// ###############################

// ###############################
// # Outputs initialization
Inserte_New_PDVStruct Inserte_New_PDV_tmp = new Inserte_New_PDVStruct();
UpdatesStruct Updates_tmp = new UpdatesStruct();
// ###############################

        
        



        









 



/**
 * [tMap_4 begin ] stop
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
	row6.ID_PDV = current_tSortRow_1_SortIn.ID_PDV;
	row6.sector_id = current_tSortRow_1_SortIn.sector_id;
	row6.name = current_tSortRow_1_SortIn.name;
	row6.qr_code = current_tSortRow_1_SortIn.qr_code;
	row6.phone = current_tSortRow_1_SortIn.phone;
	row6.address = current_tSortRow_1_SortIn.address;
	row6.lat = current_tSortRow_1_SortIn.lat;
	row6.lng = current_tSortRow_1_SortIn.lng;
	row6.secours = current_tSortRow_1_SortIn.secours;
	row6.golden_shop = current_tSortRow_1_SortIn.golden_shop;
	row6.status = current_tSortRow_1_SortIn.status;
	row6.Date_Creation = current_tSortRow_1_SortIn.Date_Creation;
	row6.Date_Update = current_tSortRow_1_SortIn.Date_Update;
	row6.cluster = current_tSortRow_1_SortIn.cluster;
	row6.Jour_Livraison_1 = current_tSortRow_1_SortIn.Jour_Livraison_1;
	row6.Jour_Livraison_2 = current_tSortRow_1_SortIn.Jour_Livraison_2;
	row6.Jour_Livraison_3 = current_tSortRow_1_SortIn.Jour_Livraison_3;
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
	 * [tMap_4 main ] start
	 */

	

	
	
	currentComponent="tMap_4";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row6"
						
						);
					}
					

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_4 = false;
		

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_4 = false;
		  boolean mainRowRejected_tMap_4 = false;
            				    								  
		
		              
			   	  		  if(
 				  		  			
 				  		  			(
 				  		  			
 				  		  			row6.sector_id !=null
 				  		  			
 				  		  			)
  				  		  			
	  	  		  				) { // G_TM_M_280

							 // CALL close main tMap filter for table 'row6'
							

				///////////////////////////////////////////////
				// Starting Lookup Table "row7" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLooprow7 = false;
       		  	    	
       		  	    	
 							row7Struct row7ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_4) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_4 = false;
								
	                        		    	Object exprKeyValue_row7__id_pdv = row6.ID_PDV ;
	                        		    	if(exprKeyValue_row7__id_pdv == null) {
	                        		    		hasCasePrimitiveKeyWithNull_tMap_4 = true;
	                        		    	} else {
                        		    			row7HashKey.id_pdv = (long)(Long) exprKeyValue_row7__id_pdv;
                        		    		}
                        		    		

								
		                        	row7HashKey.hashCodeDirty = true;
                        		
	  					
	  							
	
		  							if(!hasCasePrimitiveKeyWithNull_tMap_4) { // G_TM_M_091
		  							
			  					
			  					
			  					
	  					
		  							tHash_Lookup_row7.lookup( row7HashKey );

	  							

	  							

			  						} // G_TM_M_091
			  						
			  					

 								
								  
								  if(hasCasePrimitiveKeyWithNull_tMap_4 || !tHash_Lookup_row7.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_4 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row7 != null && tHash_Lookup_row7.getCount(row7HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row7' and it contains more one result from keys :  row7.id_pdv = '" + row7HashKey.id_pdv + "'");
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
        
Var__tMap_4__Struct Var = Var__tMap_4;// ###############################
        // ###############################
        // # Output tables

Updates = null;
Inserte_New_PDV = null;

if(!rejectedInnerJoin_tMap_4 ) {

// # Output table : 'Updates'
Updates_tmp.ID_PDV = row6.ID_PDV ;
Updates_tmp.sector_id = row6.sector_id ;
Updates_tmp.name = row6.name ;
Updates_tmp.qr_code = row6.qr_code ;
Updates_tmp.phone = row6.phone ;
Updates_tmp.address = row6.address ;
Updates_tmp.lat = row6.lat ;
Updates_tmp.lng = row6.lng ;
Updates_tmp.secours = row6.secours ;
Updates_tmp.golden_shop = row6.golden_shop ;
Updates_tmp.status = row6.status ;
Updates_tmp.Date_Creation = row6.Date_Creation ;
Updates_tmp.Date_Update = row6.Date_Update ;
Updates_tmp.cluster = row6.cluster ;
Updates_tmp.Jour_Livraison_1 = row6.Jour_Livraison_1 ;
Updates_tmp.Jour_Livraison_2 = row6.Jour_Livraison_2 ;
Updates_tmp.Jour_Livraison_3 = row6.Jour_Livraison_3 ;
Updates = Updates_tmp;
} // closing inner join bracket (1)
// ###### START REJECTS ##### 

// # Output reject table : 'Inserte_New_PDV'
// # Filter conditions 
if( rejectedInnerJoin_tMap_4 ) {
Inserte_New_PDV_tmp.id_pdv = row6.ID_PDV ;
Inserte_New_PDV_tmp.id_secteur = row6.sector_id ;
Inserte_New_PDV_tmp.qr_code = row6.qr_code ;
Inserte_New_PDV_tmp.name = row6.name ;
Inserte_New_PDV_tmp.phone = row6.phone ;
Inserte_New_PDV_tmp.address = row6.address ;
Inserte_New_PDV_tmp.latitude = row6.lat ;
Inserte_New_PDV_tmp.longitude = row6.lng ;
Inserte_New_PDV_tmp.date_creation = row6.Date_Creation ;
Inserte_New_PDV_tmp.date_update = row6.Date_Update ;
Inserte_New_PDV_tmp.jourlivraison_1 = row6.Jour_Livraison_1 ;
Inserte_New_PDV_tmp.jourlivraison_2 = row6.Jour_Livraison_2 ;
Inserte_New_PDV_tmp.jourlivraison_3 = row6.Jour_Livraison_3 ;
Inserte_New_PDV_tmp.cluster = row6.cluster ;
Inserte_New_PDV_tmp.gs = row6.golden_shop ;
Inserte_New_PDV_tmp.statu = row6.status ;
Inserte_New_PDV_tmp.secours = row6.secours ;
Inserte_New_PDV = Inserte_New_PDV_tmp;
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
// Start of branch "Inserte_New_PDV"
if(Inserte_New_PDV != null) { 



	
	/**
	 * [tFilterRow_1 main ] start
	 */

	

	
	
	currentComponent="tFilterRow_1";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"Inserte_New_PDV"
						
						);
					}
					

          row11 = null;
    Operator_tFilterRow_1 ope_tFilterRow_1 = new Operator_tFilterRow_1("&&");  
          ope_tFilterRow_1.matches((Inserte_New_PDV.id_secteur != 12)
                         , "id_secteur!=12 failed");  
          ope_tFilterRow_1.matches((Inserte_New_PDV.id_secteur != 154)
                         , "id_secteur!=154 failed");
    
    if (ope_tFilterRow_1.getMatchFlag()) {
              if(row11 == null){ 
                row11 = new row11Struct();
              }
               row11.id_pdv = Inserte_New_PDV.id_pdv;
               row11.id_secteur = Inserte_New_PDV.id_secteur;
               row11.qr_code = Inserte_New_PDV.qr_code;
               row11.name = Inserte_New_PDV.name;
               row11.phone = Inserte_New_PDV.phone;
               row11.address = Inserte_New_PDV.address;
               row11.latitude = Inserte_New_PDV.latitude;
               row11.longitude = Inserte_New_PDV.longitude;
               row11.date_creation = Inserte_New_PDV.date_creation;
               row11.date_update = Inserte_New_PDV.date_update;
               row11.jourlivraison_1 = Inserte_New_PDV.jourlivraison_1;
               row11.jourlivraison_2 = Inserte_New_PDV.jourlivraison_2;
               row11.jourlivraison_3 = Inserte_New_PDV.jourlivraison_3;
               row11.cluster = Inserte_New_PDV.cluster;
               row11.gs = Inserte_New_PDV.gs;
               row11.statu = Inserte_New_PDV.statu;
               row11.secours = Inserte_New_PDV.secours;    
      nb_line_ok_tFilterRow_1++;
    } else {
      nb_line_reject_tFilterRow_1++;
    }

nb_line_tFilterRow_1++;

 


	tos_count_tFilterRow_1++;

/**
 * [tFilterRow_1 main ] stop
 */
	
	/**
	 * [tFilterRow_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFilterRow_1";

	

 



/**
 * [tFilterRow_1 process_data_begin ] stop
 */
// Start of branch "row11"
if(row11 != null) { 



	
	/**
	 * [tSortRow_2_SortOut main ] start
	 */

	

	
	
		currentVirtualComponent = "tSortRow_2";
	
	currentComponent="tSortRow_2_SortOut";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row11"
						
						);
					}
					



	Comparablerow11Struct arrayRowtSortRow_2_SortOut = new Comparablerow11Struct();

	arrayRowtSortRow_2_SortOut.id_pdv = row11.id_pdv;
	arrayRowtSortRow_2_SortOut.id_secteur = row11.id_secteur;
	arrayRowtSortRow_2_SortOut.qr_code = row11.qr_code;
	arrayRowtSortRow_2_SortOut.name = row11.name;
	arrayRowtSortRow_2_SortOut.phone = row11.phone;
	arrayRowtSortRow_2_SortOut.address = row11.address;
	arrayRowtSortRow_2_SortOut.latitude = row11.latitude;
	arrayRowtSortRow_2_SortOut.longitude = row11.longitude;
	arrayRowtSortRow_2_SortOut.date_creation = row11.date_creation;
	arrayRowtSortRow_2_SortOut.date_update = row11.date_update;
	arrayRowtSortRow_2_SortOut.jourlivraison_1 = row11.jourlivraison_1;
	arrayRowtSortRow_2_SortOut.jourlivraison_2 = row11.jourlivraison_2;
	arrayRowtSortRow_2_SortOut.jourlivraison_3 = row11.jourlivraison_3;
	arrayRowtSortRow_2_SortOut.cluster = row11.cluster;
	arrayRowtSortRow_2_SortOut.gs = row11.gs;
	arrayRowtSortRow_2_SortOut.statu = row11.statu;
	arrayRowtSortRow_2_SortOut.secours = row11.secours;	
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

} // End of branch "row11"




	
	/**
	 * [tFilterRow_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tFilterRow_1";

	

 



/**
 * [tFilterRow_1 process_data_end ] stop
 */

} // End of branch "Inserte_New_PDV"




// Start of branch "Updates"
if(Updates != null) { 



	
	/**
	 * [tSortRow_3_SortOut main ] start
	 */

	

	
	
		currentVirtualComponent = "tSortRow_3";
	
	currentComponent="tSortRow_3_SortOut";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"Updates"
						
						);
					}
					



	ComparableUpdatesStruct arrayRowtSortRow_3_SortOut = new ComparableUpdatesStruct();

	arrayRowtSortRow_3_SortOut.ID_PDV = Updates.ID_PDV;
	arrayRowtSortRow_3_SortOut.sector_id = Updates.sector_id;
	arrayRowtSortRow_3_SortOut.name = Updates.name;
	arrayRowtSortRow_3_SortOut.qr_code = Updates.qr_code;
	arrayRowtSortRow_3_SortOut.phone = Updates.phone;
	arrayRowtSortRow_3_SortOut.address = Updates.address;
	arrayRowtSortRow_3_SortOut.lat = Updates.lat;
	arrayRowtSortRow_3_SortOut.lng = Updates.lng;
	arrayRowtSortRow_3_SortOut.secours = Updates.secours;
	arrayRowtSortRow_3_SortOut.golden_shop = Updates.golden_shop;
	arrayRowtSortRow_3_SortOut.status = Updates.status;
	arrayRowtSortRow_3_SortOut.Date_Creation = Updates.Date_Creation;
	arrayRowtSortRow_3_SortOut.Date_Update = Updates.Date_Update;
	arrayRowtSortRow_3_SortOut.cluster = Updates.cluster;
	arrayRowtSortRow_3_SortOut.Jour_Livraison_1 = Updates.Jour_Livraison_1;
	arrayRowtSortRow_3_SortOut.Jour_Livraison_2 = Updates.Jour_Livraison_2;
	arrayRowtSortRow_3_SortOut.Jour_Livraison_3 = Updates.Jour_Livraison_3;	
	list_tSortRow_3_SortOut.add(arrayRowtSortRow_3_SortOut);

 


	tos_count_tSortRow_3_SortOut++;

/**
 * [tSortRow_3_SortOut main ] stop
 */
	
	/**
	 * [tSortRow_3_SortOut process_data_begin ] start
	 */

	

	
	
		currentVirtualComponent = "tSortRow_3";
	
	currentComponent="tSortRow_3_SortOut";

	

 



/**
 * [tSortRow_3_SortOut process_data_begin ] stop
 */
	
	/**
	 * [tSortRow_3_SortOut process_data_end ] start
	 */

	

	
	
		currentVirtualComponent = "tSortRow_3";
	
	currentComponent="tSortRow_3_SortOut";

	

 



/**
 * [tSortRow_3_SortOut process_data_end ] stop
 */

} // End of branch "Updates"



	
		} // G_TM_M_280 close main tMap filter for table 'row6'
	
	
	/**
	 * [tMap_4 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_4";

	

 



/**
 * [tMap_4 process_data_end ] stop
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
	 * [tMap_4 end ] start
	 */

	

	
	
	currentComponent="tMap_4";

	


// ###############################
// # Lookup hashes releasing
					if(tHash_Lookup_row7 != null) {
						tHash_Lookup_row7.endGet();
					}
					globalMap.remove( "tHash_Lookup_row7" );

					
					
				
// ###############################      





				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row6");
			  	}
			  	
 

ok_Hash.put("tMap_4", true);
end_Hash.put("tMap_4", System.currentTimeMillis());




/**
 * [tMap_4 end ] stop
 */

	
	/**
	 * [tFilterRow_1 end ] start
	 */

	

	
	
	currentComponent="tFilterRow_1";

	
    globalMap.put("tFilterRow_1_NB_LINE", nb_line_tFilterRow_1);
    globalMap.put("tFilterRow_1_NB_LINE_OK", nb_line_ok_tFilterRow_1);
    globalMap.put("tFilterRow_1_NB_LINE_REJECT", nb_line_reject_tFilterRow_1);
    

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"Inserte_New_PDV");
			  	}
			  	
 

ok_Hash.put("tFilterRow_1", true);
end_Hash.put("tFilterRow_1", System.currentTimeMillis());




/**
 * [tFilterRow_1 end ] stop
 */

	
	/**
	 * [tSortRow_2_SortOut end ] start
	 */

	

	
	
		currentVirtualComponent = "tSortRow_2";
	
	currentComponent="tSortRow_2_SortOut";

	

row11Struct[] array_tSortRow_2_SortOut = list_tSortRow_2_SortOut.toArray(new Comparablerow11Struct[0]);

java.util.Arrays.sort(array_tSortRow_2_SortOut);

globalMap.put("tSortRow_2",array_tSortRow_2_SortOut);


				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row11");
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
	tableName_tDBOutput_1 = ("Dim_PointDeVentes");
} else {
	tableName_tDBOutput_1 = dbschema_tDBOutput_1 + "\".\"" + ("Dim_PointDeVentes");
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
 
	final String decryptedPassword_tDBOutput_1 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:UjXO0ZR5uJZuWz0MHVpa4tsZsmdPrAUGwwZlLLnDfjABNrPSmBU=");

    String dbPwd_tDBOutput_1 = decryptedPassword_tDBOutput_1;

    conn_tDBOutput_1 = java.sql.DriverManager.getConnection(url_tDBOutput_1,dbUser_tDBOutput_1,dbPwd_tDBOutput_1);
	
	resourceMap.put("conn_tDBOutput_1", conn_tDBOutput_1);
        conn_tDBOutput_1.setAutoCommit(false);
        int commitEvery_tDBOutput_1 = 1000;
        int commitCounter_tDBOutput_1 = 0;


   int batchSize_tDBOutput_1 = 1000;
   int batchSizeCounter_tDBOutput_1=0;

int count_tDBOutput_1=0;
	    String insert_tDBOutput_1 = "INSERT INTO \"" + tableName_tDBOutput_1 + "\" (\"id_pdv\",\"id_secteur\",\"qr_code\",\"name\",\"phone\",\"address\",\"latitude\",\"longitude\",\"date_creation\",\"date_update\",\"jourlivraison_1\",\"jourlivraison_2\",\"jourlivraison_3\",\"cluster\",\"gs\",\"statu\",\"secours\") VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	    
	    java.sql.PreparedStatement pstmt_tDBOutput_1 = conn_tDBOutput_1.prepareStatement(insert_tDBOutput_1);
	    resourceMap.put("pstmt_tDBOutput_1", pstmt_tDBOutput_1);
	    
        StringBuffer query_tDBOutput_1 = null;
       	
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
		


row11Struct[] array_tSortRow_2_SortIn = (row11Struct[]) globalMap.remove("tSortRow_2");

int nb_line_tSortRow_2_SortIn = 0;

row11Struct current_tSortRow_2_SortIn = null;

for(int i_tSortRow_2_SortIn = 0; i_tSortRow_2_SortIn < array_tSortRow_2_SortIn.length; i_tSortRow_2_SortIn++){
	current_tSortRow_2_SortIn = array_tSortRow_2_SortIn[i_tSortRow_2_SortIn];
	row9.id_pdv = current_tSortRow_2_SortIn.id_pdv;
	row9.id_secteur = current_tSortRow_2_SortIn.id_secteur;
	row9.qr_code = current_tSortRow_2_SortIn.qr_code;
	row9.name = current_tSortRow_2_SortIn.name;
	row9.phone = current_tSortRow_2_SortIn.phone;
	row9.address = current_tSortRow_2_SortIn.address;
	row9.latitude = current_tSortRow_2_SortIn.latitude;
	row9.longitude = current_tSortRow_2_SortIn.longitude;
	row9.date_creation = current_tSortRow_2_SortIn.date_creation;
	row9.date_update = current_tSortRow_2_SortIn.date_update;
	row9.jourlivraison_1 = current_tSortRow_2_SortIn.jourlivraison_1;
	row9.jourlivraison_2 = current_tSortRow_2_SortIn.jourlivraison_2;
	row9.jourlivraison_3 = current_tSortRow_2_SortIn.jourlivraison_3;
	row9.cluster = current_tSortRow_2_SortIn.cluster;
	row9.gs = current_tSortRow_2_SortIn.gs;
	row9.statu = current_tSortRow_2_SortIn.statu;
	row9.secours = current_tSortRow_2_SortIn.secours;
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
                    pstmt_tDBOutput_1.setLong(1, row9.id_pdv);

                        query_tDBOutput_1 = query_tDBOutput_1.append(insertSQLSplits_tDBOutput_1[0]).append(String.valueOf(row9.id_pdv)).append(insertSQLSplits_tDBOutput_1[1]);
                    pstmt_tDBOutput_1.setLong(2, row9.id_secteur);

                        query_tDBOutput_1 = query_tDBOutput_1.append(String.valueOf(row9.id_secteur)).append(insertSQLSplits_tDBOutput_1[2]);
                    if(row9.qr_code == null) {
pstmt_tDBOutput_1.setNull(3, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(3, row9.qr_code);
}

                        query_tDBOutput_1 = query_tDBOutput_1.append(row9.qr_code== null ?  "null" :"'" + row9.qr_code + "'").append(insertSQLSplits_tDBOutput_1[3]);
                    if(row9.name == null) {
pstmt_tDBOutput_1.setNull(4, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(4, row9.name);
}

                        query_tDBOutput_1 = query_tDBOutput_1.append(row9.name== null ?  "null" :"'" + row9.name + "'").append(insertSQLSplits_tDBOutput_1[4]);
                    if(row9.phone == null) {
pstmt_tDBOutput_1.setNull(5, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(5, row9.phone);
}

                        query_tDBOutput_1 = query_tDBOutput_1.append(row9.phone== null ?  "null" :"'" + row9.phone + "'").append(insertSQLSplits_tDBOutput_1[5]);
                    if(row9.address == null) {
pstmt_tDBOutput_1.setNull(6, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(6, row9.address);
}

                        query_tDBOutput_1 = query_tDBOutput_1.append(row9.address== null ?  "null" :"'" + row9.address + "'").append(insertSQLSplits_tDBOutput_1[6]);
                    if(row9.latitude == null) {
pstmt_tDBOutput_1.setNull(7, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(7, row9.latitude);
}

                        query_tDBOutput_1 = query_tDBOutput_1.append(row9.latitude== null ?  "null" :"'" + row9.latitude + "'").append(insertSQLSplits_tDBOutput_1[7]);
                    if(row9.longitude == null) {
pstmt_tDBOutput_1.setNull(8, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(8, row9.longitude);
}

                        query_tDBOutput_1 = query_tDBOutput_1.append(row9.longitude== null ?  "null" :"'" + row9.longitude + "'").append(insertSQLSplits_tDBOutput_1[8]);
                    if(row9.date_creation != null) {
pstmt_tDBOutput_1.setTimestamp(9, new java.sql.Timestamp(row9.date_creation.getTime()));
} else {
pstmt_tDBOutput_1.setNull(9, java.sql.Types.TIMESTAMP);
}

                        query_tDBOutput_1 = query_tDBOutput_1.append(row9.date_creation== null ?  "null" :"'" + new java.text.SimpleDateFormat("dd-MM-yyyy").format(row9.date_creation) + "'").append(insertSQLSplits_tDBOutput_1[9]);
                    if(row9.date_update != null) {
pstmt_tDBOutput_1.setTimestamp(10, new java.sql.Timestamp(row9.date_update.getTime()));
} else {
pstmt_tDBOutput_1.setNull(10, java.sql.Types.TIMESTAMP);
}

                        query_tDBOutput_1 = query_tDBOutput_1.append(row9.date_update== null ?  "null" :"'" + new java.text.SimpleDateFormat("dd-MM-yyyy").format(row9.date_update) + "'").append(insertSQLSplits_tDBOutput_1[10]);
                    if(row9.jourlivraison_1 == null) {
pstmt_tDBOutput_1.setNull(11, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(11, row9.jourlivraison_1);
}

                        query_tDBOutput_1 = query_tDBOutput_1.append(row9.jourlivraison_1== null ?  "null" :"'" + row9.jourlivraison_1 + "'").append(insertSQLSplits_tDBOutput_1[11]);
                    if(row9.jourlivraison_2 == null) {
pstmt_tDBOutput_1.setNull(12, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(12, row9.jourlivraison_2);
}

                        query_tDBOutput_1 = query_tDBOutput_1.append(row9.jourlivraison_2== null ?  "null" :"'" + row9.jourlivraison_2 + "'").append(insertSQLSplits_tDBOutput_1[12]);
                    if(row9.jourlivraison_3 == null) {
pstmt_tDBOutput_1.setNull(13, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(13, row9.jourlivraison_3);
}

                        query_tDBOutput_1 = query_tDBOutput_1.append(row9.jourlivraison_3== null ?  "null" :"'" + row9.jourlivraison_3 + "'").append(insertSQLSplits_tDBOutput_1[13]);
                    if(row9.cluster == null) {
pstmt_tDBOutput_1.setNull(14, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(14, row9.cluster);
}

                        query_tDBOutput_1 = query_tDBOutput_1.append(row9.cluster== null ?  "null" :"'" + row9.cluster + "'").append(insertSQLSplits_tDBOutput_1[14]);
                    if(row9.gs == null) {
pstmt_tDBOutput_1.setNull(15, java.sql.Types.BOOLEAN);
} else {pstmt_tDBOutput_1.setBoolean(15, row9.gs);
}

                        query_tDBOutput_1 = query_tDBOutput_1.append(row9.gs== null ?  "null" :String.valueOf(row9.gs)).append(insertSQLSplits_tDBOutput_1[15]);
                    if(row9.statu == null) {
pstmt_tDBOutput_1.setNull(16, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(16, row9.statu);
}

                        query_tDBOutput_1 = query_tDBOutput_1.append(row9.statu== null ?  "null" :"'" + row9.statu + "'").append(insertSQLSplits_tDBOutput_1[16]);
                    if(row9.secours == null) {
pstmt_tDBOutput_1.setNull(17, java.sql.Types.BOOLEAN);
} else {pstmt_tDBOutput_1.setBoolean(17, row9.secours);
}

                        query_tDBOutput_1 = query_tDBOutput_1.append(row9.secours== null ?  "null" :String.valueOf(row9.secours)).append(insertSQLSplits_tDBOutput_1[17]);
                globalMap.put("tDBOutput_1_QUERY", query_tDBOutput_1.toString().trim());
			
    		pstmt_tDBOutput_1.addBatch();
    		nb_line_tDBOutput_1++;
    		  
    		  
    		  batchSizeCounter_tDBOutput_1++;
    		  
    			if ((batchSize_tDBOutput_1 > 0) && (batchSize_tDBOutput_1 <= batchSizeCounter_tDBOutput_1)) {
                try {
						int countSum_tDBOutput_1 = 0;
						    
						for(int countEach_tDBOutput_1: pstmt_tDBOutput_1.executeBatch()) {
							countSum_tDBOutput_1 += (countEach_tDBOutput_1 < 0 ? 0 : countEach_tDBOutput_1);
						}
				    	rowsToCommitCount_tDBOutput_1 += countSum_tDBOutput_1;
				    	
				    		insertedCount_tDBOutput_1 += countSum_tDBOutput_1;
				    	
            	    	batchSizeCounter_tDBOutput_1 = 0;
                }catch (java.sql.BatchUpdateException e_tDBOutput_1){
globalMap.put("tDBOutput_1_ERROR_MESSAGE",e_tDBOutput_1.getMessage());
				    	java.sql.SQLException ne_tDBOutput_1 = e_tDBOutput_1.getNextException(),sqle_tDBOutput_1=null;
				    	String errormessage_tDBOutput_1;
						if (ne_tDBOutput_1 != null) {
							// build new exception to provide the original cause
							sqle_tDBOutput_1 = new java.sql.SQLException(e_tDBOutput_1.getMessage() + "\ncaused by: " + ne_tDBOutput_1.getMessage(), ne_tDBOutput_1.getSQLState(), ne_tDBOutput_1.getErrorCode(), ne_tDBOutput_1);
							errormessage_tDBOutput_1 = sqle_tDBOutput_1.getMessage();
						}else{
							errormessage_tDBOutput_1 = e_tDBOutput_1.getMessage();
						}
				    	
				    		if (ne_tDBOutput_1 != null) {
				    			throw(sqle_tDBOutput_1);
				    		}else{
				            	throw(e_tDBOutput_1);
				            }
				    	
					}
    			}
    		
    		    commitCounter_tDBOutput_1++;
                if(commitEvery_tDBOutput_1 <= commitCounter_tDBOutput_1) {
                if ((batchSize_tDBOutput_1 > 0) && (batchSizeCounter_tDBOutput_1 > 0)) {
                try {
                		int countSum_tDBOutput_1 = 0;
                		    
						for(int countEach_tDBOutput_1: pstmt_tDBOutput_1.executeBatch()) {
							countSum_tDBOutput_1 += (countEach_tDBOutput_1 < 0 ? 0 : countEach_tDBOutput_1);
						}
            	    	rowsToCommitCount_tDBOutput_1 += countSum_tDBOutput_1;
            	    	
            	    		insertedCount_tDBOutput_1 += countSum_tDBOutput_1;
            	    	
                batchSizeCounter_tDBOutput_1 = 0;
               }catch (java.sql.BatchUpdateException e_tDBOutput_1){
globalMap.put("tDBOutput_1_ERROR_MESSAGE",e_tDBOutput_1.getMessage());
			    	java.sql.SQLException ne_tDBOutput_1 = e_tDBOutput_1.getNextException(),sqle_tDBOutput_1=null;
			    	String errormessage_tDBOutput_1;
					if (ne_tDBOutput_1 != null) {
						// build new exception to provide the original cause
						sqle_tDBOutput_1 = new java.sql.SQLException(e_tDBOutput_1.getMessage() + "\ncaused by: " + ne_tDBOutput_1.getMessage(), ne_tDBOutput_1.getSQLState(), ne_tDBOutput_1.getErrorCode(), ne_tDBOutput_1);
						errormessage_tDBOutput_1 = sqle_tDBOutput_1.getMessage();
					}else{
						errormessage_tDBOutput_1 = e_tDBOutput_1.getMessage();
					}
			    	
			    		if (ne_tDBOutput_1 != null) {
			    			throw(sqle_tDBOutput_1);
			    		}else{
			            	throw(e_tDBOutput_1);
			            }
			    	
				}
            }
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

	



	    try {
				int countSum_tDBOutput_1 = 0;
				if (pstmt_tDBOutput_1 != null && batchSizeCounter_tDBOutput_1 > 0) {
						
					for(int countEach_tDBOutput_1: pstmt_tDBOutput_1.executeBatch()) {
						countSum_tDBOutput_1 += (countEach_tDBOutput_1 < 0 ? 0 : countEach_tDBOutput_1);
					}
					rowsToCommitCount_tDBOutput_1 += countSum_tDBOutput_1;
						
				}
		    	
		    		insertedCount_tDBOutput_1 += countSum_tDBOutput_1;
		    	
	    }catch (java.sql.BatchUpdateException e_tDBOutput_1){
globalMap.put("tDBOutput_1_ERROR_MESSAGE",e_tDBOutput_1.getMessage());
	    	java.sql.SQLException ne_tDBOutput_1 = e_tDBOutput_1.getNextException(),sqle_tDBOutput_1=null;
	    	String errormessage_tDBOutput_1;
			if (ne_tDBOutput_1 != null) {
				// build new exception to provide the original cause
				sqle_tDBOutput_1 = new java.sql.SQLException(e_tDBOutput_1.getMessage() + "\ncaused by: " + ne_tDBOutput_1.getMessage(), ne_tDBOutput_1.getSQLState(), ne_tDBOutput_1.getErrorCode(), ne_tDBOutput_1);
				errormessage_tDBOutput_1 = sqle_tDBOutput_1.getMessage();
			}else{
				errormessage_tDBOutput_1 = e_tDBOutput_1.getMessage();
			}
	    	
	    		if (ne_tDBOutput_1 != null) {
	    			throw(sqle_tDBOutput_1);
	    		}else{
	            	throw(e_tDBOutput_1);
	            }
	    	
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
	 * [tSortRow_3_SortOut end ] start
	 */

	

	
	
		currentVirtualComponent = "tSortRow_3";
	
	currentComponent="tSortRow_3_SortOut";

	

UpdatesStruct[] array_tSortRow_3_SortOut = list_tSortRow_3_SortOut.toArray(new ComparableUpdatesStruct[0]);

java.util.Arrays.sort(array_tSortRow_3_SortOut);

globalMap.put("tSortRow_3",array_tSortRow_3_SortOut);


				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"Updates");
			  	}
			  	
 

ok_Hash.put("tSortRow_3_SortOut", true);
end_Hash.put("tSortRow_3_SortOut", System.currentTimeMillis());




/**
 * [tSortRow_3_SortOut end ] stop
 */



	
	/**
	 * [tDBOutput_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_2", false);
		start_Hash.put("tDBOutput_2", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_2";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"Update_PDV");
					}
				
		int tos_count_tDBOutput_2 = 0;
		





String dbschema_tDBOutput_2 = null;
	dbschema_tDBOutput_2 = "public";
	

String tableName_tDBOutput_2 = null;
if(dbschema_tDBOutput_2 == null || dbschema_tDBOutput_2.trim().length() == 0) {
	tableName_tDBOutput_2 = ("Dim_PointDeVentes");
} else {
	tableName_tDBOutput_2 = dbschema_tDBOutput_2 + "\".\"" + ("Dim_PointDeVentes");
}

        int updateKeyCount_tDBOutput_2 = 1;
        if(updateKeyCount_tDBOutput_2 < 1) {
            throw new RuntimeException("For update, Schema must have a key");
        } else if (updateKeyCount_tDBOutput_2 == 17 && true) {        
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
 
	final String decryptedPassword_tDBOutput_2 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:tHhS0+u+1vcSBxImINBajtSdEeUAIiA8cb0cv9EMkv5jzRA+hPQ=");

    String dbPwd_tDBOutput_2 = decryptedPassword_tDBOutput_2;

    conn_tDBOutput_2 = java.sql.DriverManager.getConnection(url_tDBOutput_2,dbUser_tDBOutput_2,dbPwd_tDBOutput_2);
	
	resourceMap.put("conn_tDBOutput_2", conn_tDBOutput_2);
        conn_tDBOutput_2.setAutoCommit(false);
        int commitEvery_tDBOutput_2 = 1000;
        int commitCounter_tDBOutput_2 = 0;


   int batchSize_tDBOutput_2 = 1000;
   int batchSizeCounter_tDBOutput_2=0;

int count_tDBOutput_2=0;
	    String update_tDBOutput_2 = "UPDATE \"" + tableName_tDBOutput_2 + "\" SET \"id_secteur\" = ?,\"qr_code\" = ?,\"name\" = ?,\"phone\" = ?,\"address\" = ?,\"latitude\" = ?,\"longitude\" = ?,\"date_creation\" = ?,\"date_update\" = ?,\"jourlivraison_1\" = ?,\"jourlivraison_2\" = ?,\"jourlivraison_3\" = ?,\"cluster\" = ?,\"gs\" = ?,\"statu\" = ?,\"secours\" = ? WHERE \"id_pdv\" = ?";
	    java.sql.PreparedStatement pstmt_tDBOutput_2 = conn_tDBOutput_2.prepareStatement(update_tDBOutput_2);
	    resourceMap.put("pstmt_tDBOutput_2", pstmt_tDBOutput_2);
	    
        StringBuffer query_tDBOutput_2 = null;
       	
			update_tDBOutput_2 += " ";
	    	String[] updateSQLSplits_tDBOutput_2 = update_tDBOutput_2.split("\\?");

 



/**
 * [tDBOutput_2 begin ] stop
 */



	
	/**
	 * [tMap_5 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_5", false);
		start_Hash.put("tMap_5", System.currentTimeMillis());
		
	
	currentComponent="tMap_5";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row10");
					}
				
		int tos_count_tMap_5 = 0;
		




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
class  Var__tMap_5__Struct  {
}
Var__tMap_5__Struct Var__tMap_5 = new Var__tMap_5__Struct();
// ###############################

// ###############################
// # Outputs initialization
Update_PDVStruct Update_PDV_tmp = new Update_PDVStruct();
// ###############################

        
        



        









 



/**
 * [tMap_5 begin ] stop
 */



	
	/**
	 * [tSortRow_3_SortIn begin ] start
	 */

	

	
		
		ok_Hash.put("tSortRow_3_SortIn", false);
		start_Hash.put("tSortRow_3_SortIn", System.currentTimeMillis());
		
	
		currentVirtualComponent = "tSortRow_3";
	
	currentComponent="tSortRow_3_SortIn";

	
		int tos_count_tSortRow_3_SortIn = 0;
		


UpdatesStruct[] array_tSortRow_3_SortIn = (UpdatesStruct[]) globalMap.remove("tSortRow_3");

int nb_line_tSortRow_3_SortIn = 0;

UpdatesStruct current_tSortRow_3_SortIn = null;

for(int i_tSortRow_3_SortIn = 0; i_tSortRow_3_SortIn < array_tSortRow_3_SortIn.length; i_tSortRow_3_SortIn++){
	current_tSortRow_3_SortIn = array_tSortRow_3_SortIn[i_tSortRow_3_SortIn];
	row10.ID_PDV = current_tSortRow_3_SortIn.ID_PDV;
	row10.sector_id = current_tSortRow_3_SortIn.sector_id;
	row10.name = current_tSortRow_3_SortIn.name;
	row10.qr_code = current_tSortRow_3_SortIn.qr_code;
	row10.phone = current_tSortRow_3_SortIn.phone;
	row10.address = current_tSortRow_3_SortIn.address;
	row10.lat = current_tSortRow_3_SortIn.lat;
	row10.lng = current_tSortRow_3_SortIn.lng;
	row10.secours = current_tSortRow_3_SortIn.secours;
	row10.golden_shop = current_tSortRow_3_SortIn.golden_shop;
	row10.status = current_tSortRow_3_SortIn.status;
	row10.Date_Creation = current_tSortRow_3_SortIn.Date_Creation;
	row10.Date_Update = current_tSortRow_3_SortIn.Date_Update;
	row10.cluster = current_tSortRow_3_SortIn.cluster;
	row10.Jour_Livraison_1 = current_tSortRow_3_SortIn.Jour_Livraison_1;
	row10.Jour_Livraison_2 = current_tSortRow_3_SortIn.Jour_Livraison_2;
	row10.Jour_Livraison_3 = current_tSortRow_3_SortIn.Jour_Livraison_3;
	// increase number of line sorted
	nb_line_tSortRow_3_SortIn++;

 



/**
 * [tSortRow_3_SortIn begin ] stop
 */
	
	/**
	 * [tSortRow_3_SortIn main ] start
	 */

	

	
	
		currentVirtualComponent = "tSortRow_3";
	
	currentComponent="tSortRow_3_SortIn";

	

 


	tos_count_tSortRow_3_SortIn++;

/**
 * [tSortRow_3_SortIn main ] stop
 */
	
	/**
	 * [tSortRow_3_SortIn process_data_begin ] start
	 */

	

	
	
		currentVirtualComponent = "tSortRow_3";
	
	currentComponent="tSortRow_3_SortIn";

	

 



/**
 * [tSortRow_3_SortIn process_data_begin ] stop
 */

	
	/**
	 * [tMap_5 main ] start
	 */

	

	
	
	currentComponent="tMap_5";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row10"
						
						);
					}
					

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_5 = false;
		

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_5 = false;
		  boolean mainRowRejected_tMap_5 = false;
            				    								  
		

				///////////////////////////////////////////////
				// Starting Lookup Table "row8" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLooprow8 = false;
       		  	    	
       		  	    	
 							row8Struct row8ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_5) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_5 = false;
								
	                        		    	Object exprKeyValue_row8__id_pdv = row10.ID_PDV ;
	                        		    	if(exprKeyValue_row8__id_pdv == null) {
	                        		    		hasCasePrimitiveKeyWithNull_tMap_5 = true;
	                        		    	} else {
                        		    			row8HashKey.id_pdv = (long)(Long) exprKeyValue_row8__id_pdv;
                        		    		}
                        		    		
	                        		    	Object exprKeyValue_row8__id_secteur = row10.sector_id ;
	                        		    	if(exprKeyValue_row8__id_secteur == null) {
	                        		    		hasCasePrimitiveKeyWithNull_tMap_5 = true;
	                        		    	} else {
                        		    			row8HashKey.id_secteur = (long)(Long) exprKeyValue_row8__id_secteur;
                        		    		}
                        		    		
                        		    		    row8HashKey.qr_code = row10.qr_code ;
                        		    		
                        		    		    row8HashKey.name = row10.name ;
                        		    		
                        		    		    row8HashKey.phone = row10.phone ;
                        		    		
                        		    		    row8HashKey.address = row10.address ;
                        		    		
                        		    		    row8HashKey.latitude = row10.lat ;
                        		    		
                        		    		    row8HashKey.longitude = row10.lng ;
                        		    		
                        		    		    row8HashKey.date_creation = row10.Date_Creation  == null ? null : new java.util.Date(row10.Date_Creation .getTime());
                        		    		
                        		    		    row8HashKey.date_update = row10.Date_Update  == null ? null : new java.util.Date(row10.Date_Update .getTime());
                        		    		
                        		    		    row8HashKey.jourlivraison_1 = row10.Jour_Livraison_1 ;
                        		    		
                        		    		    row8HashKey.jourlivraison_2 = row10.Jour_Livraison_2 ;
                        		    		
                        		    		    row8HashKey.jourlivraison_3 = row10.Jour_Livraison_3 ;
                        		    		
                        		    		    row8HashKey.cluster = row10.cluster ;
                        		    		
                        		    		    row8HashKey.gs = row10.golden_shop ;
                        		    		
                        		    		    row8HashKey.statu = row10.status ;
                        		    		
                        		    		    row8HashKey.secours = row10.secours ;
                        		    		

								
		                        	row8HashKey.hashCodeDirty = true;
                        		
	  					
	  							
	
		  							if(!hasCasePrimitiveKeyWithNull_tMap_5) { // G_TM_M_091
		  							
			  					
			  					
			  					
	  					
		  							tHash_Lookup_row8.lookup( row8HashKey );

	  							

	  							

			  						} // G_TM_M_091
			  						
			  					

 								
								  
								  if(hasCasePrimitiveKeyWithNull_tMap_5 || !tHash_Lookup_row8.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_5 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row8 != null && tHash_Lookup_row8.getCount(row8HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row8' and it contains more one result from keys :  row8.id_pdv = '" + row8HashKey.id_pdv + "', row8.id_secteur = '" + row8HashKey.id_secteur + "', row8.qr_code = '" + row8HashKey.qr_code + "', row8.name = '" + row8HashKey.name + "', row8.phone = '" + row8HashKey.phone + "', row8.address = '" + row8HashKey.address + "', row8.latitude = '" + row8HashKey.latitude + "', row8.longitude = '" + row8HashKey.longitude + "', row8.date_creation = '" + row8HashKey.date_creation + "', row8.date_update = '" + row8HashKey.date_update + "', row8.jourlivraison_1 = '" + row8HashKey.jourlivraison_1 + "', row8.jourlivraison_2 = '" + row8HashKey.jourlivraison_2 + "', row8.jourlivraison_3 = '" + row8HashKey.jourlivraison_3 + "', row8.cluster = '" + row8HashKey.cluster + "', row8.gs = '" + row8HashKey.gs + "', row8.statu = '" + row8HashKey.statu + "', row8.secours = '" + row8HashKey.secours + "'");
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
        
Var__tMap_5__Struct Var = Var__tMap_5;// ###############################
        // ###############################
        // # Output tables

Update_PDV = null;

if(!rejectedInnerJoin_tMap_5 ) {
} // closing inner join bracket (1)
// ###### START REJECTS ##### 

// # Output reject table : 'Update_PDV'
// # Filter conditions 
if( rejectedInnerJoin_tMap_5 ) {
Update_PDV_tmp.id_pdv = row10.ID_PDV ;
Update_PDV_tmp.id_secteur = row10.sector_id ;
Update_PDV_tmp.qr_code = row10.qr_code ;
Update_PDV_tmp.name = row10.name ;
Update_PDV_tmp.phone = row10.phone ;
Update_PDV_tmp.address = row10.address ;
Update_PDV_tmp.latitude = row10.lat ;
Update_PDV_tmp.longitude = row10.lng ;
Update_PDV_tmp.date_creation = row10.Date_Creation ;
Update_PDV_tmp.date_update = row10.Date_Update ;
Update_PDV_tmp.jourlivraison_1 = row10.Jour_Livraison_1 ;
Update_PDV_tmp.jourlivraison_2 = row10.Jour_Livraison_2 ;
Update_PDV_tmp.jourlivraison_3 = row10.Jour_Livraison_3 ;
Update_PDV_tmp.cluster = row10.cluster ;
Update_PDV_tmp.gs = row10.golden_shop ;
Update_PDV_tmp.statu = row10.status ;
Update_PDV_tmp.secours = row10.secours ;
Update_PDV = Update_PDV_tmp;
} // closing filter/reject
// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_5 = false;










 


	tos_count_tMap_5++;

/**
 * [tMap_5 main ] stop
 */
	
	/**
	 * [tMap_5 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMap_5";

	

 



/**
 * [tMap_5 process_data_begin ] stop
 */
// Start of branch "Update_PDV"
if(Update_PDV != null) { 



	
	/**
	 * [tDBOutput_2 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_2";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"Update_PDV"
						
						);
					}
					



		query_tDBOutput_2 = new StringBuffer("");
        whetherReject_tDBOutput_2 = false;
                    pstmt_tDBOutput_2.setLong(1, Update_PDV.id_secteur);

                        query_tDBOutput_2 = query_tDBOutput_2.append(updateSQLSplits_tDBOutput_2[0]).append(String.valueOf(Update_PDV.id_secteur)).append(updateSQLSplits_tDBOutput_2[1]);
                    if(Update_PDV.qr_code == null) {
pstmt_tDBOutput_2.setNull(2, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(2, Update_PDV.qr_code);
}

                        query_tDBOutput_2 = query_tDBOutput_2.append(Update_PDV.qr_code== null ?  "null" :"'" + Update_PDV.qr_code + "'").append(updateSQLSplits_tDBOutput_2[2]);
                    if(Update_PDV.name == null) {
pstmt_tDBOutput_2.setNull(3, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(3, Update_PDV.name);
}

                        query_tDBOutput_2 = query_tDBOutput_2.append(Update_PDV.name== null ?  "null" :"'" + Update_PDV.name + "'").append(updateSQLSplits_tDBOutput_2[3]);
                    if(Update_PDV.phone == null) {
pstmt_tDBOutput_2.setNull(4, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(4, Update_PDV.phone);
}

                        query_tDBOutput_2 = query_tDBOutput_2.append(Update_PDV.phone== null ?  "null" :"'" + Update_PDV.phone + "'").append(updateSQLSplits_tDBOutput_2[4]);
                    if(Update_PDV.address == null) {
pstmt_tDBOutput_2.setNull(5, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(5, Update_PDV.address);
}

                        query_tDBOutput_2 = query_tDBOutput_2.append(Update_PDV.address== null ?  "null" :"'" + Update_PDV.address + "'").append(updateSQLSplits_tDBOutput_2[5]);
                    if(Update_PDV.latitude == null) {
pstmt_tDBOutput_2.setNull(6, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(6, Update_PDV.latitude);
}

                        query_tDBOutput_2 = query_tDBOutput_2.append(Update_PDV.latitude== null ?  "null" :"'" + Update_PDV.latitude + "'").append(updateSQLSplits_tDBOutput_2[6]);
                    if(Update_PDV.longitude == null) {
pstmt_tDBOutput_2.setNull(7, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(7, Update_PDV.longitude);
}

                        query_tDBOutput_2 = query_tDBOutput_2.append(Update_PDV.longitude== null ?  "null" :"'" + Update_PDV.longitude + "'").append(updateSQLSplits_tDBOutput_2[7]);
                    if(Update_PDV.date_creation != null) {
pstmt_tDBOutput_2.setTimestamp(8, new java.sql.Timestamp(Update_PDV.date_creation.getTime()));
} else {
pstmt_tDBOutput_2.setNull(8, java.sql.Types.TIMESTAMP);
}

                        query_tDBOutput_2 = query_tDBOutput_2.append(Update_PDV.date_creation== null ?  "null" :"'" + new java.text.SimpleDateFormat("dd-MM-yyyy").format(Update_PDV.date_creation) + "'").append(updateSQLSplits_tDBOutput_2[8]);
                    if(Update_PDV.date_update != null) {
pstmt_tDBOutput_2.setTimestamp(9, new java.sql.Timestamp(Update_PDV.date_update.getTime()));
} else {
pstmt_tDBOutput_2.setNull(9, java.sql.Types.TIMESTAMP);
}

                        query_tDBOutput_2 = query_tDBOutput_2.append(Update_PDV.date_update== null ?  "null" :"'" + new java.text.SimpleDateFormat("dd-MM-yyyy").format(Update_PDV.date_update) + "'").append(updateSQLSplits_tDBOutput_2[9]);
                    if(Update_PDV.jourlivraison_1 == null) {
pstmt_tDBOutput_2.setNull(10, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(10, Update_PDV.jourlivraison_1);
}

                        query_tDBOutput_2 = query_tDBOutput_2.append(Update_PDV.jourlivraison_1== null ?  "null" :"'" + Update_PDV.jourlivraison_1 + "'").append(updateSQLSplits_tDBOutput_2[10]);
                    if(Update_PDV.jourlivraison_2 == null) {
pstmt_tDBOutput_2.setNull(11, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(11, Update_PDV.jourlivraison_2);
}

                        query_tDBOutput_2 = query_tDBOutput_2.append(Update_PDV.jourlivraison_2== null ?  "null" :"'" + Update_PDV.jourlivraison_2 + "'").append(updateSQLSplits_tDBOutput_2[11]);
                    if(Update_PDV.jourlivraison_3 == null) {
pstmt_tDBOutput_2.setNull(12, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(12, Update_PDV.jourlivraison_3);
}

                        query_tDBOutput_2 = query_tDBOutput_2.append(Update_PDV.jourlivraison_3== null ?  "null" :"'" + Update_PDV.jourlivraison_3 + "'").append(updateSQLSplits_tDBOutput_2[12]);
                    if(Update_PDV.cluster == null) {
pstmt_tDBOutput_2.setNull(13, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(13, Update_PDV.cluster);
}

                        query_tDBOutput_2 = query_tDBOutput_2.append(Update_PDV.cluster== null ?  "null" :"'" + Update_PDV.cluster + "'").append(updateSQLSplits_tDBOutput_2[13]);
                    if(Update_PDV.gs == null) {
pstmt_tDBOutput_2.setNull(14, java.sql.Types.BOOLEAN);
} else {pstmt_tDBOutput_2.setBoolean(14, Update_PDV.gs);
}

                        query_tDBOutput_2 = query_tDBOutput_2.append(Update_PDV.gs== null ?  "null" :String.valueOf(Update_PDV.gs)).append(updateSQLSplits_tDBOutput_2[14]);
                    if(Update_PDV.statu == null) {
pstmt_tDBOutput_2.setNull(15, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(15, Update_PDV.statu);
}

                        query_tDBOutput_2 = query_tDBOutput_2.append(Update_PDV.statu== null ?  "null" :"'" + Update_PDV.statu + "'").append(updateSQLSplits_tDBOutput_2[15]);
                    if(Update_PDV.secours == null) {
pstmt_tDBOutput_2.setNull(16, java.sql.Types.BOOLEAN);
} else {pstmt_tDBOutput_2.setBoolean(16, Update_PDV.secours);
}

                        query_tDBOutput_2 = query_tDBOutput_2.append(Update_PDV.secours== null ?  "null" :String.valueOf(Update_PDV.secours)).append(updateSQLSplits_tDBOutput_2[16]);
                    pstmt_tDBOutput_2.setLong(17 + count_tDBOutput_2, Update_PDV.id_pdv);


				   query_tDBOutput_2 = query_tDBOutput_2.append(String.valueOf(Update_PDV.id_pdv)).append(updateSQLSplits_tDBOutput_2[17]);
			    
                globalMap.put("tDBOutput_2_QUERY", query_tDBOutput_2.toString().trim());
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
				    	
				    		if (ne_tDBOutput_2 != null) {
				    			throw(sqle_tDBOutput_2);
				    		}else{
				            	throw(e_tDBOutput_2);
				            }
				    	
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
			    	
			    		if (ne_tDBOutput_2 != null) {
			    			throw(sqle_tDBOutput_2);
			    		}else{
			            	throw(e_tDBOutput_2);
			            }
			    	
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

} // End of branch "Update_PDV"




	
	/**
	 * [tMap_5 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_5";

	

 



/**
 * [tMap_5 process_data_end ] stop
 */



	
	/**
	 * [tSortRow_3_SortIn process_data_end ] start
	 */

	

	
	
		currentVirtualComponent = "tSortRow_3";
	
	currentComponent="tSortRow_3_SortIn";

	

 



/**
 * [tSortRow_3_SortIn process_data_end ] stop
 */
	
	/**
	 * [tSortRow_3_SortIn end ] start
	 */

	

	
	
		currentVirtualComponent = "tSortRow_3";
	
	currentComponent="tSortRow_3_SortIn";

	


}

globalMap.put("tSortRow_3_SortIn_NB_LINE",nb_line_tSortRow_3_SortIn);

 

ok_Hash.put("tSortRow_3_SortIn", true);
end_Hash.put("tSortRow_3_SortIn", System.currentTimeMillis());




/**
 * [tSortRow_3_SortIn end ] stop
 */

	
	/**
	 * [tMap_5 end ] start
	 */

	

	
	
	currentComponent="tMap_5";

	


// ###############################
// # Lookup hashes releasing
					if(tHash_Lookup_row8 != null) {
						tHash_Lookup_row8.endGet();
					}
					globalMap.remove( "tHash_Lookup_row8" );

					
					
				
// ###############################      





				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row10");
			  	}
			  	
 

ok_Hash.put("tMap_5", true);
end_Hash.put("tMap_5", System.currentTimeMillis());




/**
 * [tMap_5 end ] stop
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
	    	
	    		if (ne_tDBOutput_2 != null) {
	    			throw(sqle_tDBOutput_2);
	    		}else{
	            	throw(e_tDBOutput_2);
	            }
	    	
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
			  		runStat.updateStat(resourceMap,iterateId,2,0,"Update_PDV");
			  	}
			  	
 

ok_Hash.put("tDBOutput_2", true);
end_Hash.put("tDBOutput_2", System.currentTimeMillis());




/**
 * [tDBOutput_2 end ] stop
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
			  		runStat.updateStat(resourceMap,iterateId,2,0,"qrCode_ABSANT");
			  	}
			  	
 

ok_Hash.put("tMap_3", true);
end_Hash.put("tMap_3", System.currentTimeMillis());




/**
 * [tMap_3 end ] stop
 */

	
	/**
	 * [tLogRow_1 end ] start
	 */

	

	
	
	currentComponent="tLogRow_1";

	


//////

                    
                    java.io.PrintStream consoleOut_tLogRow_1 = null;
                    if (globalMap.get("tLogRow_CONSOLE")!=null)
                    {
                    	consoleOut_tLogRow_1 = (java.io.PrintStream) globalMap.get("tLogRow_CONSOLE");
                    }
                    else
                    {
                    	consoleOut_tLogRow_1 = new java.io.PrintStream(new java.io.BufferedOutputStream(System.out));
                    	globalMap.put("tLogRow_CONSOLE",consoleOut_tLogRow_1);
                    }
                    
                    consoleOut_tLogRow_1.println(util_tLogRow_1.format().toString());
                    consoleOut_tLogRow_1.flush();
//////
globalMap.put("tLogRow_1_NB_LINE",nb_line_tLogRow_1);

///////////////////////    			

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"out3");
			  	}
			  	
 

ok_Hash.put("tLogRow_1", true);
end_Hash.put("tLogRow_1", System.currentTimeMillis());




/**
 * [tLogRow_1 end ] stop
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
				     			
					     			//free memory for "tMap_5"
					     			globalMap.remove("tHash_Lookup_row8"); 
				     			
							//free memory for "tSortRow_3_SortIn"
							globalMap.remove("tSortRow_3");
						
							//free memory for "tSortRow_2_SortIn"
							globalMap.remove("tSortRow_2");
						
					     			//free memory for "tMap_4"
					     			globalMap.remove("tHash_Lookup_row7"); 
				     			
							//free memory for "tSortRow_1_SortIn"
							globalMap.remove("tSortRow_1");
						
					     			//free memory for "tMap_2"
					     			globalMap.remove("tHash_Lookup_row3"); 
				     			
					     			//free memory for "tMap_2"
					     			globalMap.remove("tHash_Lookup_row4"); 
				     			
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
	 * [tMap_4 finally ] start
	 */

	

	
	
	currentComponent="tMap_4";

	

 



/**
 * [tMap_4 finally ] stop
 */

	
	/**
	 * [tFilterRow_1 finally ] start
	 */

	

	
	
	currentComponent="tFilterRow_1";

	

 



/**
 * [tFilterRow_1 finally ] stop
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
	 * [tSortRow_3_SortOut finally ] start
	 */

	

	
	
		currentVirtualComponent = "tSortRow_3";
	
	currentComponent="tSortRow_3_SortOut";

	

 



/**
 * [tSortRow_3_SortOut finally ] stop
 */

	
	/**
	 * [tSortRow_3_SortIn finally ] start
	 */

	

	
	
		currentVirtualComponent = "tSortRow_3";
	
	currentComponent="tSortRow_3_SortIn";

	

 



/**
 * [tSortRow_3_SortIn finally ] stop
 */

	
	/**
	 * [tMap_5 finally ] start
	 */

	

	
	
	currentComponent="tMap_5";

	

 



/**
 * [tMap_5 finally ] stop
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

























	
	/**
	 * [tMap_3 finally ] start
	 */

	

	
	
	currentComponent="tMap_3";

	

 



/**
 * [tMap_3 finally ] stop
 */

	
	/**
	 * [tLogRow_1 finally ] start
	 */

	

	
	
	currentComponent="tLogRow_1";

	

 



/**
 * [tLogRow_1 finally ] stop
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
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public long id;

				public long getId () {
					return this.id;
				}
				
			    public String cluster;

				public String getCluster () {
					return this.cluster;
				}
				
			    public java.util.Date created_at;

				public java.util.Date getCreated_at () {
					return this.created_at;
				}
				
			    public java.util.Date updated_at;

				public java.util.Date getUpdated_at () {
					return this.updated_at;
				}
				
			    public Integer passage;

				public Integer getPassage () {
					return this.passage;
				}
				
			    public Boolean activate;

				public Boolean getActivate () {
					return this.activate;
				}
				
			    public String cluster_en;

				public String getCluster_en () {
					return this.cluster_en;
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
		final row2Struct other = (row2Struct) obj;
		
						if (this.id != other.id)
							return false;
					

		return true;
    }

	public void copyDataTo(row2Struct other) {

		other.id = this.id;
	            other.cluster = this.cluster;
	            other.created_at = this.created_at;
	            other.updated_at = this.updated_at;
	            other.passage = this.passage;
	            other.activate = this.activate;
	            other.cluster_en = this.cluster_en;
	            other.country_id = this.country_id;
	            
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes) {

        	try {

        		int length = 0;
		
			        this.id = dis.readLong();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes) {

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
		
						this.cluster = readString(dis,ois);
					
						this.created_at = readDate(dis,ois);
					
						this.updated_at = readDate(dis,ois);
					
						this.passage = readInteger(dis,ois);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.activate = null;
           				} else {
           			    	this.activate = dis.readBoolean();
           				}
					
						this.cluster_en = readString(dis,ois);
					
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
		
						this.cluster = readString(dis,objectIn);
					
						this.created_at = readDate(dis,objectIn);
					
						this.updated_at = readDate(dis,objectIn);
					
						this.passage = readInteger(dis,objectIn);
					
			            length = objectIn.readByte();
           				if (length == -1) {
           	    			this.activate = null;
           				} else {
           			    	this.activate = objectIn.readBoolean();
           				}
					
						this.cluster_en = readString(dis,objectIn);
					
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

		
						writeString(this.cluster, dos, oos);
					
						writeDate(this.created_at, dos, oos);
					
						writeDate(this.updated_at, dos, oos);
					
					writeInteger(this.passage, dos, oos);
					
						if(this.activate == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.activate);
		            	}
					
						writeString(this.cluster_en, dos, oos);
					
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

		
						writeString(this.cluster, dos, objectOut);
					
						writeDate(this.created_at, dos, objectOut);
					
						writeDate(this.updated_at, dos, objectOut);
					
					writeInteger(this.passage, dos, objectOut);
					
						if(this.activate == null) {
							objectOut.writeByte(-1);
						} else {
							objectOut.writeByte(0);
							objectOut.writeBoolean(this.activate);
		            	}
					
						writeString(this.cluster_en, dos, objectOut);
					
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
		sb.append(",cluster="+cluster);
		sb.append(",created_at="+String.valueOf(created_at));
		sb.append(",updated_at="+String.valueOf(updated_at));
		sb.append(",passage="+String.valueOf(passage));
		sb.append(",activate="+String.valueOf(activate));
		sb.append(",cluster_en="+cluster_en);
		sb.append(",country_id="+String.valueOf(country_id));
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
			   		// linked node: tMap_1 - inputs:(row1,row2) outputs:(out1,qrCode_ABSANT)
			   
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
				
				 
	final String decryptedPassword_tDBInput_2 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:ZseppIZIyCdgCzRFY7q1rYKnLqj9lTbKgTcHZB6UfxJth6PSjPX6Tk8/");
				
				String dbPwd_tDBInput_2 = decryptedPassword_tDBInput_2;
				
				String url_tDBInput_2 = "jdbc:postgresql://" + "leuk.laiterieduberger.sn" + ":" + "5432" + "/" + "leuk_webapp_production";
				
				conn_tDBInput_2 = java.sql.DriverManager.getConnection(url_tDBInput_2,dbUser_tDBInput_2,dbPwd_tDBInput_2);
		        
				conn_tDBInput_2.setAutoCommit(false);
			
		    
			java.sql.Statement stmt_tDBInput_2 = conn_tDBInput_2.createStatement();

		    String dbquery_tDBInput_2 = "SELECT \n  \"public\".\"clusters\".\"id\", \n  \"public\".\"clusters\".\"cluster\", \n  \"public\".\"clusters\".\"created_"
+"at\", \n  \"public\".\"clusters\".\"updated_at\", \n  \"public\".\"clusters\".\"passage\", \n  \"public\".\"clusters\".\"ac"
+"tivate\", \n  \"public\".\"clusters\".\"cluster_en\", \n  \"public\".\"clusters\".\"country_id\"\nFROM \"public\".\"cluster"
+"s\"";
		    

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
								row2.cluster = null;
							} else {
	                         		
        	row2.cluster = routines.system.JDBCUtil.getString(rs_tDBInput_2, 2, false);
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
								row2.passage = null;
							} else {
		                          
            row2.passage = rs_tDBInput_2.getInt(5);
            if(rs_tDBInput_2.wasNull()){
                    row2.passage = null;
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 6) {
								row2.activate = null;
							} else {
	                         		
            row2.activate = rs_tDBInput_2.getBoolean(6);
            if(rs_tDBInput_2.wasNull()){
                    row2.activate = null;
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 7) {
								row2.cluster_en = null;
							} else {
	                         		
        	row2.cluster_en = routines.system.JDBCUtil.getString(rs_tDBInput_2, 7, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 8) {
								row2.country_id = null;
							} else {
		                          
            row2.country_id = rs_tDBInput_2.getLong(8);
            if(rs_tDBInput_2.wasNull()){
                    row2.country_id = null;
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
				
				row2_HashRow.cluster = row2.cluster;
				
				row2_HashRow.created_at = row2.created_at;
				
				row2_HashRow.updated_at = row2.updated_at;
				
				row2_HashRow.passage = row2.passage;
				
				row2_HashRow.activate = row2.activate;
				
				row2_HashRow.cluster_en = row2.cluster_en;
				
				row2_HashRow.country_id = row2.country_id;
				
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
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[0];
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
				
			    public long sector_id;

				public long getSector_id () {
					return this.sector_id;
				}
				
			    public Long deliveryday_id;

				public Long getDeliveryday_id () {
					return this.deliveryday_id;
				}
				
			    public String code_color;

				public String getCode_color () {
					return this.code_color;
				}
				
			    public Boolean activate;

				public Boolean getActivate () {
					return this.activate;
				}
				
			    public Boolean default_zone;

				public Boolean getDefault_zone () {
					return this.default_zone;
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
	            other.libelle = this.libelle;
	            other.created_at = this.created_at;
	            other.updated_at = this.updated_at;
	            other.sector_id = this.sector_id;
	            other.deliveryday_id = this.deliveryday_id;
	            other.code_color = this.code_color;
	            other.activate = this.activate;
	            other.default_zone = this.default_zone;
	            
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes) {

        	try {

        		int length = 0;
		
			        this.id = dis.readLong();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes) {

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
					
			            this.sector_id = dis.readLong();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.deliveryday_id = null;
           				} else {
           			    	this.deliveryday_id = dis.readLong();
           				}
					
						this.code_color = readString(dis,ois);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.activate = null;
           				} else {
           			    	this.activate = dis.readBoolean();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.default_zone = null;
           				} else {
           			    	this.default_zone = dis.readBoolean();
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
					
			            this.sector_id = objectIn.readLong();
					
			            length = objectIn.readByte();
           				if (length == -1) {
           	    			this.deliveryday_id = null;
           				} else {
           			    	this.deliveryday_id = objectIn.readLong();
           				}
					
						this.code_color = readString(dis,objectIn);
					
			            length = objectIn.readByte();
           				if (length == -1) {
           	    			this.activate = null;
           				} else {
           			    	this.activate = objectIn.readBoolean();
           				}
					
			            length = objectIn.readByte();
           				if (length == -1) {
           	    			this.default_zone = null;
           				} else {
           			    	this.default_zone = objectIn.readBoolean();
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
					
		            	dos.writeLong(this.sector_id);
					
						if(this.deliveryday_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.deliveryday_id);
		            	}
					
						writeString(this.code_color, dos, oos);
					
						if(this.activate == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.activate);
		            	}
					
						if(this.default_zone == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.default_zone);
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
					
					objectOut.writeLong(this.sector_id);
					
						if(this.deliveryday_id == null) {
							objectOut.writeByte(-1);
						} else {
							objectOut.writeByte(0);
							objectOut.writeLong(this.deliveryday_id);
		            	}
					
						writeString(this.code_color, dos, objectOut);
					
						if(this.activate == null) {
							objectOut.writeByte(-1);
						} else {
							objectOut.writeByte(0);
							objectOut.writeBoolean(this.activate);
		            	}
					
						if(this.default_zone == null) {
							objectOut.writeByte(-1);
						} else {
							objectOut.writeByte(0);
							objectOut.writeBoolean(this.default_zone);
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
		sb.append(",sector_id="+String.valueOf(sector_id));
		sb.append(",deliveryday_id="+String.valueOf(deliveryday_id));
		sb.append(",code_color="+code_color);
		sb.append(",activate="+String.valueOf(activate));
		sb.append(",default_zone="+String.valueOf(default_zone));
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
			   		// linked node: tMap_2 - inputs:(out1,row3,row4) outputs:(out2)
			   
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
				String driverClass_tDBInput_4 = "org.postgresql.Driver";
			    java.lang.Class jdbcclazz_tDBInput_4 = java.lang.Class.forName(driverClass_tDBInput_4);
				String dbUser_tDBInput_4 = "malick.diouf";
				
				 
	final String decryptedPassword_tDBInput_4 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:raD26OYxdKRKMvjGGtu90Lelnd/glIp5A5jpbLkf/HQqUgSdRCf3TL/6");
				
				String dbPwd_tDBInput_4 = decryptedPassword_tDBInput_4;
				
				String url_tDBInput_4 = "jdbc:postgresql://" + "leuk.laiterieduberger.sn" + ":" + "5432" + "/" + "leuk_webapp_production";
				
				conn_tDBInput_4 = java.sql.DriverManager.getConnection(url_tDBInput_4,dbUser_tDBInput_4,dbPwd_tDBInput_4);
		        
				conn_tDBInput_4.setAutoCommit(false);
			
		    
			java.sql.Statement stmt_tDBInput_4 = conn_tDBInput_4.createStatement();

		    String dbquery_tDBInput_4 = "SELECT \n  \"public\".\"zones\".\"id\", \n  \"public\".\"zones\".\"libelle\", \n  \"public\".\"zones\".\"created_at\", \n  "
+"\"public\".\"zones\".\"updated_at\", \n  \"public\".\"zones\".\"sector_id\", \n  \"public\".\"zones\".\"deliveryday_id\", "
+"\n  \"public\".\"zones\".\"code_color\", \n  \"public\".\"zones\".\"activate\", \n  \"public\".\"zones\".\"default_zone\"\nF"
+"ROM \"public\".\"zones\"";
		    

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
								row3.libelle = null;
							} else {
	                         		
        	row3.libelle = routines.system.JDBCUtil.getString(rs_tDBInput_4, 2, false);
		                    }
							if(colQtyInRs_tDBInput_4 < 3) {
								row3.created_at = null;
							} else {
										
			row3.created_at = routines.system.JDBCUtil.getDate(rs_tDBInput_4, 3);
		                    }
							if(colQtyInRs_tDBInput_4 < 4) {
								row3.updated_at = null;
							} else {
										
			row3.updated_at = routines.system.JDBCUtil.getDate(rs_tDBInput_4, 4);
		                    }
							if(colQtyInRs_tDBInput_4 < 5) {
								row3.sector_id = 0;
							} else {
		                          
            row3.sector_id = rs_tDBInput_4.getLong(5);
            if(rs_tDBInput_4.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_4 < 6) {
								row3.deliveryday_id = null;
							} else {
		                          
            row3.deliveryday_id = rs_tDBInput_4.getLong(6);
            if(rs_tDBInput_4.wasNull()){
                    row3.deliveryday_id = null;
            }
		                    }
							if(colQtyInRs_tDBInput_4 < 7) {
								row3.code_color = null;
							} else {
	                         		
        	row3.code_color = routines.system.JDBCUtil.getString(rs_tDBInput_4, 7, false);
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
								row3.default_zone = null;
							} else {
	                         		
            row3.default_zone = rs_tDBInput_4.getBoolean(9);
            if(rs_tDBInput_4.wasNull()){
                    row3.default_zone = null;
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
				
				row3_HashRow.libelle = row3.libelle;
				
				row3_HashRow.created_at = row3.created_at;
				
				row3_HashRow.updated_at = row3.updated_at;
				
				row3_HashRow.sector_id = row3.sector_id;
				
				row3_HashRow.deliveryday_id = row3.deliveryday_id;
				
				row3_HashRow.code_color = row3.code_color;
				
				row3_HashRow.activate = row3.activate;
				
				row3_HashRow.default_zone = row3.default_zone;
				
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
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public long id;

				public long getId () {
					return this.id;
				}
				
			    public String day;

				public String getDay () {
					return this.day;
				}
				
			    public java.util.Date created_at;

				public java.util.Date getCreated_at () {
					return this.created_at;
				}
				
			    public java.util.Date updated_at;

				public java.util.Date getUpdated_at () {
					return this.updated_at;
				}
				
			    public Integer day_of_week;

				public Integer getDay_of_week () {
					return this.day_of_week;
				}
				
			    public String day_en;

				public String getDay_en () {
					return this.day_en;
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
	            other.day = this.day;
	            other.created_at = this.created_at;
	            other.updated_at = this.updated_at;
	            other.day_of_week = this.day_of_week;
	            other.day_en = this.day_en;
	            
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes) {

        	try {

        		int length = 0;
		
			        this.id = dis.readLong();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes) {

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
		
						this.day = readString(dis,ois);
					
						this.created_at = readDate(dis,ois);
					
						this.updated_at = readDate(dis,ois);
					
						this.day_of_week = readInteger(dis,ois);
					
						this.day_en = readString(dis,ois);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
						this.day = readString(dis,objectIn);
					
						this.created_at = readDate(dis,objectIn);
					
						this.updated_at = readDate(dis,objectIn);
					
						this.day_of_week = readInteger(dis,objectIn);
					
						this.day_en = readString(dis,objectIn);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
						writeString(this.day, dos, oos);
					
						writeDate(this.created_at, dos, oos);
					
						writeDate(this.updated_at, dos, oos);
					
					writeInteger(this.day_of_week, dos, oos);
					
						writeString(this.day_en, dos, oos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
						writeString(this.day, dos, objectOut);
					
						writeDate(this.created_at, dos, objectOut);
					
						writeDate(this.updated_at, dos, objectOut);
					
					writeInteger(this.day_of_week, dos, objectOut);
					
						writeString(this.day_en, dos, objectOut);
					
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
		sb.append(",day="+day);
		sb.append(",created_at="+String.valueOf(created_at));
		sb.append(",updated_at="+String.valueOf(updated_at));
		sb.append(",day_of_week="+String.valueOf(day_of_week));
		sb.append(",day_en="+day_en);
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
			   		// source node:tDBInput_3 - inputs:(after_tDBInput_1) outputs:(row4,row4) | target node:tAdvancedHash_row4 - inputs:(row4) outputs:()
			   		// linked node: tMap_2 - inputs:(out1,row3,row4) outputs:(out2)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row4 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row4Struct> tHash_Lookup_row4 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row4Struct>getLookup(matchingModeEnum_row4);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row4", tHash_Lookup_row4);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row4 begin ] stop
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
				
				 
	final String decryptedPassword_tDBInput_3 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:rgDGFAF85yps+RPUWgk1bwr2wtMaNGqboUIqKcVsgOCIdb3LJXIdW/78");
				
				String dbPwd_tDBInput_3 = decryptedPassword_tDBInput_3;
				
				String url_tDBInput_3 = "jdbc:postgresql://" + "leuk.laiterieduberger.sn" + ":" + "5432" + "/" + "leuk_webapp_production";
				
				conn_tDBInput_3 = java.sql.DriverManager.getConnection(url_tDBInput_3,dbUser_tDBInput_3,dbPwd_tDBInput_3);
		        
				conn_tDBInput_3.setAutoCommit(false);
			
		    
			java.sql.Statement stmt_tDBInput_3 = conn_tDBInput_3.createStatement();

		    String dbquery_tDBInput_3 = "SELECT \n  \"public\".\"deliverydays\".\"id\", \n  \"public\".\"deliverydays\".\"day\", \n  \"public\".\"deliverydays\".\""
+"created_at\", \n  \"public\".\"deliverydays\".\"updated_at\", \n  \"public\".\"deliverydays\".\"day_of_week\", \n  \"public"
+"\".\"deliverydays\".\"day_en\"\nFROM \"public\".\"deliverydays\"";
		    

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
								row4.id = 0;
							} else {
		                          
            row4.id = rs_tDBInput_3.getLong(1);
            if(rs_tDBInput_3.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_3 < 2) {
								row4.day = null;
							} else {
	                         		
        	row4.day = routines.system.JDBCUtil.getString(rs_tDBInput_3, 2, false);
		                    }
							if(colQtyInRs_tDBInput_3 < 3) {
								row4.created_at = null;
							} else {
										
			row4.created_at = routines.system.JDBCUtil.getDate(rs_tDBInput_3, 3);
		                    }
							if(colQtyInRs_tDBInput_3 < 4) {
								row4.updated_at = null;
							} else {
										
			row4.updated_at = routines.system.JDBCUtil.getDate(rs_tDBInput_3, 4);
		                    }
							if(colQtyInRs_tDBInput_3 < 5) {
								row4.day_of_week = null;
							} else {
		                          
            row4.day_of_week = rs_tDBInput_3.getInt(5);
            if(rs_tDBInput_3.wasNull()){
                    row4.day_of_week = null;
            }
		                    }
							if(colQtyInRs_tDBInput_3 < 6) {
								row4.day_en = null;
							} else {
	                         		
        	row4.day_en = routines.system.JDBCUtil.getString(rs_tDBInput_3, 6, false);
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
				
				row4_HashRow.day = row4.day;
				
				row4_HashRow.created_at = row4.created_at;
				
				row4_HashRow.updated_at = row4.updated_at;
				
				row4_HashRow.day_of_week = row4.day_of_week;
				
				row4_HashRow.day_en = row4.day_en;
				
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
	 * [tDBInput_3 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_3";

	

 



/**
 * [tDBInput_3 finally ] stop
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
		

		globalMap.put("tDBInput_3_SUBPROCESS_STATE", 1);
	}
	


public static class row5Struct implements routines.system.IPersistableComparableLookupRow<row5Struct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[0];
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
	            other.label = this.label;
	            other.currency = this.currency;
	            other.created_at = this.created_at;
	            other.updated_at = this.updated_at;
	            other.code_color = this.code_color;
	            other.zone_supervisor_id = this.zone_supervisor_id;
	            other.activate = this.activate;
	            other.canal = this.canal;
	            
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes) {

        	try {

        		int length = 0;
		
			        this.id = dis.readLong();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes) {

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
					
						this.currency = readString(dis,ois);
					
						this.created_at = readDate(dis,ois);
					
						this.updated_at = readDate(dis,ois);
					
						this.code_color = readString(dis,ois);
					
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
					
						this.canal = readString(dis,ois);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
						this.label = readString(dis,objectIn);
					
						this.currency = readString(dis,objectIn);
					
						this.created_at = readDate(dis,objectIn);
					
						this.updated_at = readDate(dis,objectIn);
					
						this.code_color = readString(dis,objectIn);
					
			            length = objectIn.readByte();
           				if (length == -1) {
           	    			this.zone_supervisor_id = null;
           				} else {
           			    	this.zone_supervisor_id = objectIn.readLong();
           				}
					
			            length = objectIn.readByte();
           				if (length == -1) {
           	    			this.activate = null;
           				} else {
           			    	this.activate = objectIn.readBoolean();
           				}
					
						this.canal = readString(dis,objectIn);
					
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
					
						writeString(this.currency, dos, oos);
					
						writeDate(this.created_at, dos, oos);
					
						writeDate(this.updated_at, dos, oos);
					
						writeString(this.code_color, dos, oos);
					
						if(this.zone_supervisor_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.zone_supervisor_id);
		            	}
					
						if(this.activate == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.activate);
		            	}
					
						writeString(this.canal, dos, oos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
						writeString(this.label, dos, objectOut);
					
						writeString(this.currency, dos, objectOut);
					
						writeDate(this.created_at, dos, objectOut);
					
						writeDate(this.updated_at, dos, objectOut);
					
						writeString(this.code_color, dos, objectOut);
					
						if(this.zone_supervisor_id == null) {
							objectOut.writeByte(-1);
						} else {
							objectOut.writeByte(0);
							objectOut.writeLong(this.zone_supervisor_id);
		            	}
					
						if(this.activate == null) {
							objectOut.writeByte(-1);
						} else {
							objectOut.writeByte(0);
							objectOut.writeBoolean(this.activate);
		            	}
					
						writeString(this.canal, dos, objectOut);
					
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
			   		// source node:tDBInput_5 - inputs:(after_tDBInput_1) outputs:(row5,row5) | target node:tAdvancedHash_row5 - inputs:(row5) outputs:()
			   		// linked node: tMap_3 - inputs:(qrCode_ABSANT,row5) outputs:(out3)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row5 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row5Struct> tHash_Lookup_row5 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row5Struct>getLookup(matchingModeEnum_row5);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row5", tHash_Lookup_row5);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row5 begin ] stop
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
				String driverClass_tDBInput_5 = "org.postgresql.Driver";
			    java.lang.Class jdbcclazz_tDBInput_5 = java.lang.Class.forName(driverClass_tDBInput_5);
				String dbUser_tDBInput_5 = "malick.diouf";
				
				 
	final String decryptedPassword_tDBInput_5 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:vY1EwKK6y5dW3tocpydItyfvqBkzD4X1SVlWG/l+ghEmBDMDgR4qcpsL");
				
				String dbPwd_tDBInput_5 = decryptedPassword_tDBInput_5;
				
				String url_tDBInput_5 = "jdbc:postgresql://" + "leuk.laiterieduberger.sn" + ":" + "5432" + "/" + "leuk_webapp_production";
				
				conn_tDBInput_5 = java.sql.DriverManager.getConnection(url_tDBInput_5,dbUser_tDBInput_5,dbPwd_tDBInput_5);
		        
				conn_tDBInput_5.setAutoCommit(false);
			
		    
			java.sql.Statement stmt_tDBInput_5 = conn_tDBInput_5.createStatement();

		    String dbquery_tDBInput_5 = "SELECT \n  \"public\".\"sectors\".\"id\", \n  \"public\".\"sectors\".\"label\", \n  \"public\".\"sectors\".\"currency\", \n"
+"  \"public\".\"sectors\".\"created_at\", \n  \"public\".\"sectors\".\"updated_at\", \n  \"public\".\"sectors\".\"code_colo"
+"r\", \n  \"public\".\"sectors\".\"zone_supervisor_id\", \n  \"public\".\"sectors\".\"activate\", \n  \"public\".\"sectors\""
+".\"canal\"\nFROM \"public\".\"sectors\"";
		    

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
								row5.id = 0;
							} else {
		                          
            row5.id = rs_tDBInput_5.getLong(1);
            if(rs_tDBInput_5.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_5 < 2) {
								row5.label = null;
							} else {
	                         		
        	row5.label = routines.system.JDBCUtil.getString(rs_tDBInput_5, 2, false);
		                    }
							if(colQtyInRs_tDBInput_5 < 3) {
								row5.currency = null;
							} else {
	                         		
        	row5.currency = routines.system.JDBCUtil.getString(rs_tDBInput_5, 3, false);
		                    }
							if(colQtyInRs_tDBInput_5 < 4) {
								row5.created_at = null;
							} else {
										
			row5.created_at = routines.system.JDBCUtil.getDate(rs_tDBInput_5, 4);
		                    }
							if(colQtyInRs_tDBInput_5 < 5) {
								row5.updated_at = null;
							} else {
										
			row5.updated_at = routines.system.JDBCUtil.getDate(rs_tDBInput_5, 5);
		                    }
							if(colQtyInRs_tDBInput_5 < 6) {
								row5.code_color = null;
							} else {
	                         		
        	row5.code_color = routines.system.JDBCUtil.getString(rs_tDBInput_5, 6, false);
		                    }
							if(colQtyInRs_tDBInput_5 < 7) {
								row5.zone_supervisor_id = null;
							} else {
		                          
            row5.zone_supervisor_id = rs_tDBInput_5.getLong(7);
            if(rs_tDBInput_5.wasNull()){
                    row5.zone_supervisor_id = null;
            }
		                    }
							if(colQtyInRs_tDBInput_5 < 8) {
								row5.activate = null;
							} else {
	                         		
            row5.activate = rs_tDBInput_5.getBoolean(8);
            if(rs_tDBInput_5.wasNull()){
                    row5.activate = null;
            }
		                    }
							if(colQtyInRs_tDBInput_5 < 9) {
								row5.canal = null;
							} else {
	                         		
        	row5.canal = routines.system.JDBCUtil.getString(rs_tDBInput_5, 9, false);
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
				
				row5_HashRow.label = row5.label;
				
				row5_HashRow.currency = row5.currency;
				
				row5_HashRow.created_at = row5.created_at;
				
				row5_HashRow.updated_at = row5.updated_at;
				
				row5_HashRow.code_color = row5.code_color;
				
				row5_HashRow.zone_supervisor_id = row5.zone_supervisor_id;
				
				row5_HashRow.activate = row5.activate;
				
				row5_HashRow.canal = row5.canal;
				
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
	if(conn_tDBInput_5 != null && !conn_tDBInput_5.isClosed()) {
		
			conn_tDBInput_5.commit();
			
		
			conn_tDBInput_5.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
			}
			
	}
	
}
globalMap.put("tDBInput_5_NB_LINE",nb_line_tDBInput_5);
 

ok_Hash.put("tDBInput_5", true);
end_Hash.put("tDBInput_5", System.currentTimeMillis());




/**
 * [tDBInput_5 end ] stop
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
	 * [tDBInput_5 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_5";

	

 



/**
 * [tDBInput_5 finally ] stop
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
		

		globalMap.put("tDBInput_5_SUBPROCESS_STATE", 1);
	}
	


public static class row7Struct implements routines.system.IPersistableComparableLookupRow<row7Struct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public long id_pdv;

				public long getId_pdv () {
					return this.id_pdv;
				}
				
			    public long id_secteur;

				public long getId_secteur () {
					return this.id_secteur;
				}
				
			    public String qr_code;

				public String getQr_code () {
					return this.qr_code;
				}
				
			    public String name;

				public String getName () {
					return this.name;
				}
				
			    public String phone;

				public String getPhone () {
					return this.phone;
				}
				
			    public String address;

				public String getAddress () {
					return this.address;
				}
				
			    public String latitude;

				public String getLatitude () {
					return this.latitude;
				}
				
			    public String longitude;

				public String getLongitude () {
					return this.longitude;
				}
				
			    public java.util.Date date_creation;

				public java.util.Date getDate_creation () {
					return this.date_creation;
				}
				
			    public java.util.Date date_update;

				public java.util.Date getDate_update () {
					return this.date_update;
				}
				
			    public String jourlivraison_1;

				public String getJourlivraison_1 () {
					return this.jourlivraison_1;
				}
				
			    public String jourlivraison_2;

				public String getJourlivraison_2 () {
					return this.jourlivraison_2;
				}
				
			    public String jourlivraison_3;

				public String getJourlivraison_3 () {
					return this.jourlivraison_3;
				}
				
			    public String cluster;

				public String getCluster () {
					return this.cluster;
				}
				
			    public Boolean gs;

				public Boolean getGs () {
					return this.gs;
				}
				
			    public String statu;

				public String getStatu () {
					return this.statu;
				}
				
			    public Boolean secours;

				public Boolean getSecours () {
					return this.secours;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
							result = prime * result + (int) this.id_pdv;
						
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
		
						if (this.id_pdv != other.id_pdv)
							return false;
					

		return true;
    }

	public void copyDataTo(row7Struct other) {

		other.id_pdv = this.id_pdv;
	            other.id_secteur = this.id_secteur;
	            other.qr_code = this.qr_code;
	            other.name = this.name;
	            other.phone = this.phone;
	            other.address = this.address;
	            other.latitude = this.latitude;
	            other.longitude = this.longitude;
	            other.date_creation = this.date_creation;
	            other.date_update = this.date_update;
	            other.jourlivraison_1 = this.jourlivraison_1;
	            other.jourlivraison_2 = this.jourlivraison_2;
	            other.jourlivraison_3 = this.jourlivraison_3;
	            other.cluster = this.cluster;
	            other.gs = this.gs;
	            other.statu = this.statu;
	            other.secours = this.secours;
	            
	}

	public void copyKeysDataTo(row7Struct other) {

		other.id_pdv = this.id_pdv;
	            	
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes) {

        	try {

        		int length = 0;
		
			        this.id_pdv = dis.readLong();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes) {

        	try {

        		int length = 0;
		
			        this.id_pdv = dis.readLong();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id_pdv);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id_pdv);
					
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
		
			            this.id_secteur = dis.readLong();
					
						this.qr_code = readString(dis,ois);
					
						this.name = readString(dis,ois);
					
						this.phone = readString(dis,ois);
					
						this.address = readString(dis,ois);
					
						this.latitude = readString(dis,ois);
					
						this.longitude = readString(dis,ois);
					
						this.date_creation = readDate(dis,ois);
					
						this.date_update = readDate(dis,ois);
					
						this.jourlivraison_1 = readString(dis,ois);
					
						this.jourlivraison_2 = readString(dis,ois);
					
						this.jourlivraison_3 = readString(dis,ois);
					
						this.cluster = readString(dis,ois);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.gs = null;
           				} else {
           			    	this.gs = dis.readBoolean();
           				}
					
						this.statu = readString(dis,ois);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.secours = null;
           				} else {
           			    	this.secours = dis.readBoolean();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
			            this.id_secteur = objectIn.readLong();
					
						this.qr_code = readString(dis,objectIn);
					
						this.name = readString(dis,objectIn);
					
						this.phone = readString(dis,objectIn);
					
						this.address = readString(dis,objectIn);
					
						this.latitude = readString(dis,objectIn);
					
						this.longitude = readString(dis,objectIn);
					
						this.date_creation = readDate(dis,objectIn);
					
						this.date_update = readDate(dis,objectIn);
					
						this.jourlivraison_1 = readString(dis,objectIn);
					
						this.jourlivraison_2 = readString(dis,objectIn);
					
						this.jourlivraison_3 = readString(dis,objectIn);
					
						this.cluster = readString(dis,objectIn);
					
			            length = objectIn.readByte();
           				if (length == -1) {
           	    			this.gs = null;
           				} else {
           			    	this.gs = objectIn.readBoolean();
           				}
					
						this.statu = readString(dis,objectIn);
					
			            length = objectIn.readByte();
           				if (length == -1) {
           	    			this.secours = null;
           				} else {
           			    	this.secours = objectIn.readBoolean();
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

		
		            	dos.writeLong(this.id_secteur);
					
						writeString(this.qr_code, dos, oos);
					
						writeString(this.name, dos, oos);
					
						writeString(this.phone, dos, oos);
					
						writeString(this.address, dos, oos);
					
						writeString(this.latitude, dos, oos);
					
						writeString(this.longitude, dos, oos);
					
						writeDate(this.date_creation, dos, oos);
					
						writeDate(this.date_update, dos, oos);
					
						writeString(this.jourlivraison_1, dos, oos);
					
						writeString(this.jourlivraison_2, dos, oos);
					
						writeString(this.jourlivraison_3, dos, oos);
					
						writeString(this.cluster, dos, oos);
					
						if(this.gs == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.gs);
		            	}
					
						writeString(this.statu, dos, oos);
					
						if(this.secours == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.secours);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
					objectOut.writeLong(this.id_secteur);
					
						writeString(this.qr_code, dos, objectOut);
					
						writeString(this.name, dos, objectOut);
					
						writeString(this.phone, dos, objectOut);
					
						writeString(this.address, dos, objectOut);
					
						writeString(this.latitude, dos, objectOut);
					
						writeString(this.longitude, dos, objectOut);
					
						writeDate(this.date_creation, dos, objectOut);
					
						writeDate(this.date_update, dos, objectOut);
					
						writeString(this.jourlivraison_1, dos, objectOut);
					
						writeString(this.jourlivraison_2, dos, objectOut);
					
						writeString(this.jourlivraison_3, dos, objectOut);
					
						writeString(this.cluster, dos, objectOut);
					
						if(this.gs == null) {
							objectOut.writeByte(-1);
						} else {
							objectOut.writeByte(0);
							objectOut.writeBoolean(this.gs);
		            	}
					
						writeString(this.statu, dos, objectOut);
					
						if(this.secours == null) {
							objectOut.writeByte(-1);
						} else {
							objectOut.writeByte(0);
							objectOut.writeBoolean(this.secours);
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
		sb.append("id_pdv="+String.valueOf(id_pdv));
		sb.append(",id_secteur="+String.valueOf(id_secteur));
		sb.append(",qr_code="+qr_code);
		sb.append(",name="+name);
		sb.append(",phone="+phone);
		sb.append(",address="+address);
		sb.append(",latitude="+latitude);
		sb.append(",longitude="+longitude);
		sb.append(",date_creation="+String.valueOf(date_creation));
		sb.append(",date_update="+String.valueOf(date_update));
		sb.append(",jourlivraison_1="+jourlivraison_1);
		sb.append(",jourlivraison_2="+jourlivraison_2);
		sb.append(",jourlivraison_3="+jourlivraison_3);
		sb.append(",cluster="+cluster);
		sb.append(",gs="+String.valueOf(gs));
		sb.append(",statu="+statu);
		sb.append(",secours="+String.valueOf(secours));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row7Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.id_pdv, other.id_pdv);
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
			   		// source node:tDBInput_6 - inputs:(after_tDBInput_1) outputs:(row7,row7) | target node:tAdvancedHash_row7 - inputs:(row7) outputs:()
			   		// linked node: tMap_4 - inputs:(row6,row7) outputs:(Inserte_New_PDV,Updates)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row7 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row7Struct> tHash_Lookup_row7 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row7Struct>getLookup(matchingModeEnum_row7);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row7", tHash_Lookup_row7);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row7 begin ] stop
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
				String driverClass_tDBInput_6 = "org.postgresql.Driver";
			    java.lang.Class jdbcclazz_tDBInput_6 = java.lang.Class.forName(driverClass_tDBInput_6);
				String dbUser_tDBInput_6 = "malick.diouf";
				
				 
	final String decryptedPassword_tDBInput_6 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:U4klWyZf/lOpMJuXX7V6l0EwjTbsf08SXizZSN3Xj5NkcA6H6OQ=");
				
				String dbPwd_tDBInput_6 = decryptedPassword_tDBInput_6;
				
				String url_tDBInput_6 = "jdbc:postgresql://" + "163.172.166.119" + ":" + "5432" + "/" + "leuk_analytics";
				
				conn_tDBInput_6 = java.sql.DriverManager.getConnection(url_tDBInput_6,dbUser_tDBInput_6,dbPwd_tDBInput_6);
		        
				conn_tDBInput_6.setAutoCommit(false);
			
		    
			java.sql.Statement stmt_tDBInput_6 = conn_tDBInput_6.createStatement();

		    String dbquery_tDBInput_6 = "SELECT \n  \"public\".\"Dim_PointDeVentes\".\"id_pdv\", \n  \"public\".\"Dim_PointDeVentes\".\"id_secteur\", \n  \"public"
+"\".\"Dim_PointDeVentes\".\"qr_code\", \n  \"public\".\"Dim_PointDeVentes\".\"name\", \n  \"public\".\"Dim_PointDeVentes\"."
+"\"phone\", \n  \"public\".\"Dim_PointDeVentes\".\"address\", \n  \"public\".\"Dim_PointDeVentes\".\"latitude\", \n  \"publi"
+"c\".\"Dim_PointDeVentes\".\"longitude\", \n  \"public\".\"Dim_PointDeVentes\".\"date_creation\", \n  \"public\".\"Dim_Poin"
+"tDeVentes\".\"date_update\", \n  \"public\".\"Dim_PointDeVentes\".\"jourlivraison_1\", \n  \"public\".\"Dim_PointDeVentes"
+"\".\"jourlivraison_2\", \n  \"public\".\"Dim_PointDeVentes\".\"jourlivraison_3\", \n  \"public\".\"Dim_PointDeVentes\".\"c"
+"luster\", \n  \"public\".\"Dim_PointDeVentes\".\"gs\", \n  \"public\".\"Dim_PointDeVentes\".\"statu\", \n  \"public\".\"Dim"
+"_PointDeVentes\".\"secours\"\nFROM \"public\".\"Dim_PointDeVentes\"";
		    

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
								row7.id_pdv = 0;
							} else {
		                          
            row7.id_pdv = rs_tDBInput_6.getLong(1);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 2) {
								row7.id_secteur = 0;
							} else {
		                          
            row7.id_secteur = rs_tDBInput_6.getLong(2);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 3) {
								row7.qr_code = null;
							} else {
	                         		
        	row7.qr_code = routines.system.JDBCUtil.getString(rs_tDBInput_6, 3, false);
		                    }
							if(colQtyInRs_tDBInput_6 < 4) {
								row7.name = null;
							} else {
	                         		
        	row7.name = routines.system.JDBCUtil.getString(rs_tDBInput_6, 4, false);
		                    }
							if(colQtyInRs_tDBInput_6 < 5) {
								row7.phone = null;
							} else {
	                         		
        	row7.phone = routines.system.JDBCUtil.getString(rs_tDBInput_6, 5, false);
		                    }
							if(colQtyInRs_tDBInput_6 < 6) {
								row7.address = null;
							} else {
	                         		
        	row7.address = routines.system.JDBCUtil.getString(rs_tDBInput_6, 6, false);
		                    }
							if(colQtyInRs_tDBInput_6 < 7) {
								row7.latitude = null;
							} else {
	                         		
        	row7.latitude = routines.system.JDBCUtil.getString(rs_tDBInput_6, 7, false);
		                    }
							if(colQtyInRs_tDBInput_6 < 8) {
								row7.longitude = null;
							} else {
	                         		
        	row7.longitude = routines.system.JDBCUtil.getString(rs_tDBInput_6, 8, false);
		                    }
							if(colQtyInRs_tDBInput_6 < 9) {
								row7.date_creation = null;
							} else {
										
			row7.date_creation = routines.system.JDBCUtil.getDate(rs_tDBInput_6, 9);
		                    }
							if(colQtyInRs_tDBInput_6 < 10) {
								row7.date_update = null;
							} else {
										
			row7.date_update = routines.system.JDBCUtil.getDate(rs_tDBInput_6, 10);
		                    }
							if(colQtyInRs_tDBInput_6 < 11) {
								row7.jourlivraison_1 = null;
							} else {
	                         		
        	row7.jourlivraison_1 = routines.system.JDBCUtil.getString(rs_tDBInput_6, 11, false);
		                    }
							if(colQtyInRs_tDBInput_6 < 12) {
								row7.jourlivraison_2 = null;
							} else {
	                         		
        	row7.jourlivraison_2 = routines.system.JDBCUtil.getString(rs_tDBInput_6, 12, false);
		                    }
							if(colQtyInRs_tDBInput_6 < 13) {
								row7.jourlivraison_3 = null;
							} else {
	                         		
        	row7.jourlivraison_3 = routines.system.JDBCUtil.getString(rs_tDBInput_6, 13, false);
		                    }
							if(colQtyInRs_tDBInput_6 < 14) {
								row7.cluster = null;
							} else {
	                         		
        	row7.cluster = routines.system.JDBCUtil.getString(rs_tDBInput_6, 14, false);
		                    }
							if(colQtyInRs_tDBInput_6 < 15) {
								row7.gs = null;
							} else {
	                         		
            row7.gs = rs_tDBInput_6.getBoolean(15);
            if(rs_tDBInput_6.wasNull()){
                    row7.gs = null;
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 16) {
								row7.statu = null;
							} else {
	                         		
        	row7.statu = routines.system.JDBCUtil.getString(rs_tDBInput_6, 16, false);
		                    }
							if(colQtyInRs_tDBInput_6 < 17) {
								row7.secours = null;
							} else {
	                         		
            row7.secours = rs_tDBInput_6.getBoolean(17);
            if(rs_tDBInput_6.wasNull()){
                    row7.secours = null;
            }
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
	 * [tAdvancedHash_row7 main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row7";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row7"
						
						);
					}
					


			   
			   

					row7Struct row7_HashRow = new row7Struct();
		   	   	   
				
				row7_HashRow.id_pdv = row7.id_pdv;
				
				row7_HashRow.id_secteur = row7.id_secteur;
				
				row7_HashRow.qr_code = row7.qr_code;
				
				row7_HashRow.name = row7.name;
				
				row7_HashRow.phone = row7.phone;
				
				row7_HashRow.address = row7.address;
				
				row7_HashRow.latitude = row7.latitude;
				
				row7_HashRow.longitude = row7.longitude;
				
				row7_HashRow.date_creation = row7.date_creation;
				
				row7_HashRow.date_update = row7.date_update;
				
				row7_HashRow.jourlivraison_1 = row7.jourlivraison_1;
				
				row7_HashRow.jourlivraison_2 = row7.jourlivraison_2;
				
				row7_HashRow.jourlivraison_3 = row7.jourlivraison_3;
				
				row7_HashRow.cluster = row7.cluster;
				
				row7_HashRow.gs = row7.gs;
				
				row7_HashRow.statu = row7.statu;
				
				row7_HashRow.secours = row7.secours;
				
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
	if(conn_tDBInput_6 != null && !conn_tDBInput_6.isClosed()) {
		
			conn_tDBInput_6.commit();
			
		
			conn_tDBInput_6.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
			}
			
	}
	
}
globalMap.put("tDBInput_6_NB_LINE",nb_line_tDBInput_6);
 

ok_Hash.put("tDBInput_6", true);
end_Hash.put("tDBInput_6", System.currentTimeMillis());




/**
 * [tDBInput_6 end ] stop
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
	 * [tDBInput_6 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_6";

	

 



/**
 * [tDBInput_6 finally ] stop
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
		

		globalMap.put("tDBInput_6_SUBPROCESS_STATE", 1);
	}
	


public static class row8Struct implements routines.system.IPersistableComparableLookupRow<row8Struct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public long id_pdv;

				public long getId_pdv () {
					return this.id_pdv;
				}
				
			    public long id_secteur;

				public long getId_secteur () {
					return this.id_secteur;
				}
				
			    public String qr_code;

				public String getQr_code () {
					return this.qr_code;
				}
				
			    public String name;

				public String getName () {
					return this.name;
				}
				
			    public String phone;

				public String getPhone () {
					return this.phone;
				}
				
			    public String address;

				public String getAddress () {
					return this.address;
				}
				
			    public String latitude;

				public String getLatitude () {
					return this.latitude;
				}
				
			    public String longitude;

				public String getLongitude () {
					return this.longitude;
				}
				
			    public java.util.Date date_creation;

				public java.util.Date getDate_creation () {
					return this.date_creation;
				}
				
			    public java.util.Date date_update;

				public java.util.Date getDate_update () {
					return this.date_update;
				}
				
			    public String jourlivraison_1;

				public String getJourlivraison_1 () {
					return this.jourlivraison_1;
				}
				
			    public String jourlivraison_2;

				public String getJourlivraison_2 () {
					return this.jourlivraison_2;
				}
				
			    public String jourlivraison_3;

				public String getJourlivraison_3 () {
					return this.jourlivraison_3;
				}
				
			    public String cluster;

				public String getCluster () {
					return this.cluster;
				}
				
			    public Boolean gs;

				public Boolean getGs () {
					return this.gs;
				}
				
			    public String statu;

				public String getStatu () {
					return this.statu;
				}
				
			    public Boolean secours;

				public Boolean getSecours () {
					return this.secours;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
							result = prime * result + (int) this.id_pdv;
						
							result = prime * result + (int) this.id_secteur;
						
						result = prime * result + ((this.qr_code == null) ? 0 : this.qr_code.hashCode());
					
						result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
					
						result = prime * result + ((this.phone == null) ? 0 : this.phone.hashCode());
					
						result = prime * result + ((this.address == null) ? 0 : this.address.hashCode());
					
						result = prime * result + ((this.latitude == null) ? 0 : this.latitude.hashCode());
					
						result = prime * result + ((this.longitude == null) ? 0 : this.longitude.hashCode());
					
						result = prime * result + ((this.date_creation == null) ? 0 : this.date_creation.hashCode());
					
						result = prime * result + ((this.date_update == null) ? 0 : this.date_update.hashCode());
					
						result = prime * result + ((this.jourlivraison_1 == null) ? 0 : this.jourlivraison_1.hashCode());
					
						result = prime * result + ((this.jourlivraison_2 == null) ? 0 : this.jourlivraison_2.hashCode());
					
						result = prime * result + ((this.jourlivraison_3 == null) ? 0 : this.jourlivraison_3.hashCode());
					
						result = prime * result + ((this.cluster == null) ? 0 : this.cluster.hashCode());
					
						result = prime * result + ((this.gs == null) ? 0 : this.gs.hashCode());
					
						result = prime * result + ((this.statu == null) ? 0 : this.statu.hashCode());
					
						result = prime * result + ((this.secours == null) ? 0 : this.secours.hashCode());
					
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
		
						if (this.id_pdv != other.id_pdv)
							return false;
					
						if (this.id_secteur != other.id_secteur)
							return false;
					
						if (this.qr_code == null) {
							if (other.qr_code != null)
								return false;
						
						} else if (!this.qr_code.equals(other.qr_code))
						
							return false;
					
						if (this.name == null) {
							if (other.name != null)
								return false;
						
						} else if (!this.name.equals(other.name))
						
							return false;
					
						if (this.phone == null) {
							if (other.phone != null)
								return false;
						
						} else if (!this.phone.equals(other.phone))
						
							return false;
					
						if (this.address == null) {
							if (other.address != null)
								return false;
						
						} else if (!this.address.equals(other.address))
						
							return false;
					
						if (this.latitude == null) {
							if (other.latitude != null)
								return false;
						
						} else if (!this.latitude.equals(other.latitude))
						
							return false;
					
						if (this.longitude == null) {
							if (other.longitude != null)
								return false;
						
						} else if (!this.longitude.equals(other.longitude))
						
							return false;
					
						if (this.date_creation == null) {
							if (other.date_creation != null)
								return false;
						
						} else if (!this.date_creation.equals(other.date_creation))
						
							return false;
					
						if (this.date_update == null) {
							if (other.date_update != null)
								return false;
						
						} else if (!this.date_update.equals(other.date_update))
						
							return false;
					
						if (this.jourlivraison_1 == null) {
							if (other.jourlivraison_1 != null)
								return false;
						
						} else if (!this.jourlivraison_1.equals(other.jourlivraison_1))
						
							return false;
					
						if (this.jourlivraison_2 == null) {
							if (other.jourlivraison_2 != null)
								return false;
						
						} else if (!this.jourlivraison_2.equals(other.jourlivraison_2))
						
							return false;
					
						if (this.jourlivraison_3 == null) {
							if (other.jourlivraison_3 != null)
								return false;
						
						} else if (!this.jourlivraison_3.equals(other.jourlivraison_3))
						
							return false;
					
						if (this.cluster == null) {
							if (other.cluster != null)
								return false;
						
						} else if (!this.cluster.equals(other.cluster))
						
							return false;
					
						if (this.gs == null) {
							if (other.gs != null)
								return false;
						
						} else if (!this.gs.equals(other.gs))
						
							return false;
					
						if (this.statu == null) {
							if (other.statu != null)
								return false;
						
						} else if (!this.statu.equals(other.statu))
						
							return false;
					
						if (this.secours == null) {
							if (other.secours != null)
								return false;
						
						} else if (!this.secours.equals(other.secours))
						
							return false;
					

		return true;
    }

	public void copyDataTo(row8Struct other) {

		other.id_pdv = this.id_pdv;
	            other.id_secteur = this.id_secteur;
	            other.qr_code = this.qr_code;
	            other.name = this.name;
	            other.phone = this.phone;
	            other.address = this.address;
	            other.latitude = this.latitude;
	            other.longitude = this.longitude;
	            other.date_creation = this.date_creation;
	            other.date_update = this.date_update;
	            other.jourlivraison_1 = this.jourlivraison_1;
	            other.jourlivraison_2 = this.jourlivraison_2;
	            other.jourlivraison_3 = this.jourlivraison_3;
	            other.cluster = this.cluster;
	            other.gs = this.gs;
	            other.statu = this.statu;
	            other.secours = this.secours;
	            
	}

	public void copyKeysDataTo(row8Struct other) {

		other.id_pdv = this.id_pdv;
	            	other.id_secteur = this.id_secteur;
	            	other.qr_code = this.qr_code;
	            	other.name = this.name;
	            	other.phone = this.phone;
	            	other.address = this.address;
	            	other.latitude = this.latitude;
	            	other.longitude = this.longitude;
	            	other.date_creation = this.date_creation;
	            	other.date_update = this.date_update;
	            	other.jourlivraison_1 = this.jourlivraison_1;
	            	other.jourlivraison_2 = this.jourlivraison_2;
	            	other.jourlivraison_3 = this.jourlivraison_3;
	            	other.cluster = this.cluster;
	            	other.gs = this.gs;
	            	other.statu = this.statu;
	            	other.secours = this.secours;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length, utf8Charset);
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
			if(length > commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_Dim_Point_De_Ventes, 0, length, utf8Charset);
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

    public void readKeysData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes) {

        	try {

        		int length = 0;
		
			        this.id_pdv = dis.readLong();
					
			        this.id_secteur = dis.readLong();
					
					this.qr_code = readString(dis);
					
					this.name = readString(dis);
					
					this.phone = readString(dis);
					
					this.address = readString(dis);
					
					this.latitude = readString(dis);
					
					this.longitude = readString(dis);
					
					this.date_creation = readDate(dis);
					
					this.date_update = readDate(dis);
					
					this.jourlivraison_1 = readString(dis);
					
					this.jourlivraison_2 = readString(dis);
					
					this.jourlivraison_3 = readString(dis);
					
					this.cluster = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.gs = null;
           				} else {
           			    	this.gs = dis.readBoolean();
           				}
					
					this.statu = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.secours = null;
           				} else {
           			    	this.secours = dis.readBoolean();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_Dim_Point_De_Ventes) {

        	try {

        		int length = 0;
		
			        this.id_pdv = dis.readLong();
					
			        this.id_secteur = dis.readLong();
					
					this.qr_code = readString(dis);
					
					this.name = readString(dis);
					
					this.phone = readString(dis);
					
					this.address = readString(dis);
					
					this.latitude = readString(dis);
					
					this.longitude = readString(dis);
					
					this.date_creation = readDate(dis);
					
					this.date_update = readDate(dis);
					
					this.jourlivraison_1 = readString(dis);
					
					this.jourlivraison_2 = readString(dis);
					
					this.jourlivraison_3 = readString(dis);
					
					this.cluster = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.gs = null;
           				} else {
           			    	this.gs = dis.readBoolean();
           				}
					
					this.statu = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.secours = null;
           				} else {
           			    	this.secours = dis.readBoolean();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id_pdv);
					
					// long
				
		            	dos.writeLong(this.id_secteur);
					
					// String
				
						writeString(this.qr_code,dos);
					
					// String
				
						writeString(this.name,dos);
					
					// String
				
						writeString(this.phone,dos);
					
					// String
				
						writeString(this.address,dos);
					
					// String
				
						writeString(this.latitude,dos);
					
					// String
				
						writeString(this.longitude,dos);
					
					// java.util.Date
				
						writeDate(this.date_creation,dos);
					
					// java.util.Date
				
						writeDate(this.date_update,dos);
					
					// String
				
						writeString(this.jourlivraison_1,dos);
					
					// String
				
						writeString(this.jourlivraison_2,dos);
					
					// String
				
						writeString(this.jourlivraison_3,dos);
					
					// String
				
						writeString(this.cluster,dos);
					
					// Boolean
				
						if(this.gs == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.gs);
		            	}
					
					// String
				
						writeString(this.statu,dos);
					
					// Boolean
				
						if(this.secours == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.secours);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id_pdv);
					
					// long
				
		            	dos.writeLong(this.id_secteur);
					
					// String
				
						writeString(this.qr_code,dos);
					
					// String
				
						writeString(this.name,dos);
					
					// String
				
						writeString(this.phone,dos);
					
					// String
				
						writeString(this.address,dos);
					
					// String
				
						writeString(this.latitude,dos);
					
					// String
				
						writeString(this.longitude,dos);
					
					// java.util.Date
				
						writeDate(this.date_creation,dos);
					
					// java.util.Date
				
						writeDate(this.date_update,dos);
					
					// String
				
						writeString(this.jourlivraison_1,dos);
					
					// String
				
						writeString(this.jourlivraison_2,dos);
					
					// String
				
						writeString(this.jourlivraison_3,dos);
					
					// String
				
						writeString(this.cluster,dos);
					
					// Boolean
				
						if(this.gs == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.gs);
		            	}
					
					// String
				
						writeString(this.statu,dos);
					
					// Boolean
				
						if(this.secours == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.secours);
		            	}
					
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
		sb.append("id_pdv="+String.valueOf(id_pdv));
		sb.append(",id_secteur="+String.valueOf(id_secteur));
		sb.append(",qr_code="+qr_code);
		sb.append(",name="+name);
		sb.append(",phone="+phone);
		sb.append(",address="+address);
		sb.append(",latitude="+latitude);
		sb.append(",longitude="+longitude);
		sb.append(",date_creation="+String.valueOf(date_creation));
		sb.append(",date_update="+String.valueOf(date_update));
		sb.append(",jourlivraison_1="+jourlivraison_1);
		sb.append(",jourlivraison_2="+jourlivraison_2);
		sb.append(",jourlivraison_3="+jourlivraison_3);
		sb.append(",cluster="+cluster);
		sb.append(",gs="+String.valueOf(gs));
		sb.append(",statu="+statu);
		sb.append(",secours="+String.valueOf(secours));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row8Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.id_pdv, other.id_pdv);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.id_secteur, other.id_secteur);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.qr_code, other.qr_code);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.name, other.name);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.phone, other.phone);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.address, other.address);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.latitude, other.latitude);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.longitude, other.longitude);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.date_creation, other.date_creation);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.date_update, other.date_update);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.jourlivraison_1, other.jourlivraison_1);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.jourlivraison_2, other.jourlivraison_2);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.jourlivraison_3, other.jourlivraison_3);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.cluster, other.cluster);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.gs, other.gs);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.statu, other.statu);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.secours, other.secours);
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
			   		// linked node: tMap_5 - inputs:(row10,row8) outputs:(Update_PDV)
			   
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
				
				 
	final String decryptedPassword_tDBInput_7 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:Uw2Weq9bD5ggjRqi2GsmGKECBAwNodNF+ExwZZc1xbH15GBVq58=");
				
				String dbPwd_tDBInput_7 = decryptedPassword_tDBInput_7;
				
				String url_tDBInput_7 = "jdbc:postgresql://" + "163.172.166.119" + ":" + "5432" + "/" + "leuk_analytics";
				
				conn_tDBInput_7 = java.sql.DriverManager.getConnection(url_tDBInput_7,dbUser_tDBInput_7,dbPwd_tDBInput_7);
		        
				conn_tDBInput_7.setAutoCommit(false);
			
		    
			java.sql.Statement stmt_tDBInput_7 = conn_tDBInput_7.createStatement();

		    String dbquery_tDBInput_7 = "SELECT \n  \"public\".\"Dim_PointDeVentes\".\"id_pdv\", \n  \"public\".\"Dim_PointDeVentes\".\"id_secteur\", \n  \"public"
+"\".\"Dim_PointDeVentes\".\"qr_code\", \n  \"public\".\"Dim_PointDeVentes\".\"name\", \n  \"public\".\"Dim_PointDeVentes\"."
+"\"phone\", \n  \"public\".\"Dim_PointDeVentes\".\"address\", \n  \"public\".\"Dim_PointDeVentes\".\"latitude\", \n  \"publi"
+"c\".\"Dim_PointDeVentes\".\"longitude\", \n  \"public\".\"Dim_PointDeVentes\".\"date_creation\", \n  \"public\".\"Dim_Poin"
+"tDeVentes\".\"date_update\", \n  \"public\".\"Dim_PointDeVentes\".\"jourlivraison_1\", \n  \"public\".\"Dim_PointDeVentes"
+"\".\"jourlivraison_2\", \n  \"public\".\"Dim_PointDeVentes\".\"jourlivraison_3\", \n  \"public\".\"Dim_PointDeVentes\".\"c"
+"luster\", \n  \"public\".\"Dim_PointDeVentes\".\"gs\", \n  \"public\".\"Dim_PointDeVentes\".\"statu\", \n  \"public\".\"Dim"
+"_PointDeVentes\".\"secours\"\nFROM \"public\".\"Dim_PointDeVentes\"";
		    

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
								row8.id_pdv = 0;
							} else {
		                          
            row8.id_pdv = rs_tDBInput_7.getLong(1);
            if(rs_tDBInput_7.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_7 < 2) {
								row8.id_secteur = 0;
							} else {
		                          
            row8.id_secteur = rs_tDBInput_7.getLong(2);
            if(rs_tDBInput_7.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_7 < 3) {
								row8.qr_code = null;
							} else {
	                         		
        	row8.qr_code = routines.system.JDBCUtil.getString(rs_tDBInput_7, 3, false);
		                    }
							if(colQtyInRs_tDBInput_7 < 4) {
								row8.name = null;
							} else {
	                         		
        	row8.name = routines.system.JDBCUtil.getString(rs_tDBInput_7, 4, false);
		                    }
							if(colQtyInRs_tDBInput_7 < 5) {
								row8.phone = null;
							} else {
	                         		
        	row8.phone = routines.system.JDBCUtil.getString(rs_tDBInput_7, 5, false);
		                    }
							if(colQtyInRs_tDBInput_7 < 6) {
								row8.address = null;
							} else {
	                         		
        	row8.address = routines.system.JDBCUtil.getString(rs_tDBInput_7, 6, false);
		                    }
							if(colQtyInRs_tDBInput_7 < 7) {
								row8.latitude = null;
							} else {
	                         		
        	row8.latitude = routines.system.JDBCUtil.getString(rs_tDBInput_7, 7, false);
		                    }
							if(colQtyInRs_tDBInput_7 < 8) {
								row8.longitude = null;
							} else {
	                         		
        	row8.longitude = routines.system.JDBCUtil.getString(rs_tDBInput_7, 8, false);
		                    }
							if(colQtyInRs_tDBInput_7 < 9) {
								row8.date_creation = null;
							} else {
										
			row8.date_creation = routines.system.JDBCUtil.getDate(rs_tDBInput_7, 9);
		                    }
							if(colQtyInRs_tDBInput_7 < 10) {
								row8.date_update = null;
							} else {
										
			row8.date_update = routines.system.JDBCUtil.getDate(rs_tDBInput_7, 10);
		                    }
							if(colQtyInRs_tDBInput_7 < 11) {
								row8.jourlivraison_1 = null;
							} else {
	                         		
        	row8.jourlivraison_1 = routines.system.JDBCUtil.getString(rs_tDBInput_7, 11, false);
		                    }
							if(colQtyInRs_tDBInput_7 < 12) {
								row8.jourlivraison_2 = null;
							} else {
	                         		
        	row8.jourlivraison_2 = routines.system.JDBCUtil.getString(rs_tDBInput_7, 12, false);
		                    }
							if(colQtyInRs_tDBInput_7 < 13) {
								row8.jourlivraison_3 = null;
							} else {
	                         		
        	row8.jourlivraison_3 = routines.system.JDBCUtil.getString(rs_tDBInput_7, 13, false);
		                    }
							if(colQtyInRs_tDBInput_7 < 14) {
								row8.cluster = null;
							} else {
	                         		
        	row8.cluster = routines.system.JDBCUtil.getString(rs_tDBInput_7, 14, false);
		                    }
							if(colQtyInRs_tDBInput_7 < 15) {
								row8.gs = null;
							} else {
	                         		
            row8.gs = rs_tDBInput_7.getBoolean(15);
            if(rs_tDBInput_7.wasNull()){
                    row8.gs = null;
            }
		                    }
							if(colQtyInRs_tDBInput_7 < 16) {
								row8.statu = null;
							} else {
	                         		
        	row8.statu = routines.system.JDBCUtil.getString(rs_tDBInput_7, 16, false);
		                    }
							if(colQtyInRs_tDBInput_7 < 17) {
								row8.secours = null;
							} else {
	                         		
            row8.secours = rs_tDBInput_7.getBoolean(17);
            if(rs_tDBInput_7.wasNull()){
                    row8.secours = null;
            }
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
		   	   	   
				
				row8_HashRow.id_pdv = row8.id_pdv;
				
				row8_HashRow.id_secteur = row8.id_secteur;
				
				row8_HashRow.qr_code = row8.qr_code;
				
				row8_HashRow.name = row8.name;
				
				row8_HashRow.phone = row8.phone;
				
				row8_HashRow.address = row8.address;
				
				row8_HashRow.latitude = row8.latitude;
				
				row8_HashRow.longitude = row8.longitude;
				
				row8_HashRow.date_creation = row8.date_creation;
				
				row8_HashRow.date_update = row8.date_update;
				
				row8_HashRow.jourlivraison_1 = row8.jourlivraison_1;
				
				row8_HashRow.jourlivraison_2 = row8.jourlivraison_2;
				
				row8_HashRow.jourlivraison_3 = row8.jourlivraison_3;
				
				row8_HashRow.cluster = row8.cluster;
				
				row8_HashRow.gs = row8.gs;
				
				row8_HashRow.statu = row8.statu;
				
				row8_HashRow.secours = row8.secours;
				
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
        final Alimentation_Dim_Point_De_Ventes Alimentation_Dim_Point_De_VentesClass = new Alimentation_Dim_Point_De_Ventes();

        int exitCode = Alimentation_Dim_Point_De_VentesClass.runJobInTOS(args);

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
            java.io.InputStream inContext = Alimentation_Dim_Point_De_Ventes.class.getClassLoader().getResourceAsStream("warehouse/alimentation_dim_point_de_ventes_0_1/contexts/" + contextStr + ".properties");
            if (inContext == null) {
                inContext = Alimentation_Dim_Point_De_Ventes.class.getClassLoader().getResourceAsStream("config/contexts/" + contextStr + ".properties");
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
            System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : Alimentation_Dim_Point_De_Ventes");
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
 *     601776 characters generated by Talend Open Studio for Data Integration 
 *     on the 26 février 2025 à 14:58:46 UTC
 ************************************************************************************************/