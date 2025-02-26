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


package warehouse.alimentation_fait_vendeur_0_1;

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
 * Job: Alimentation_FAIT_VENDEUR Purpose: <br>
 * Description:  <br>
 * @author user@talend.com
 * @version 8.0.1.20211109_1610
 * @status PROD
 */
public class Alimentation_FAIT_VENDEUR implements TalendJob {

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
	private final String jobName = "Alimentation_FAIT_VENDEUR";
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
				Alimentation_FAIT_VENDEUR.this.exception = e;
			}
		}
		if (!(e instanceof TalendException)) {
		try {
			for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
				if (m.getName().compareTo(currentComponent + "_error") == 0) {
					m.invoke(Alimentation_FAIT_VENDEUR.this, new Object[] { e , currentComponent, globalMap});
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
			
			public void tDBConnection_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBConnection_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBConnection_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBConnection_1_onSubJobError(exception, errorComponent, globalMap);
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
			
			public void tMap_5_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
						try {
							
								if(this.execStat){
									runStat.updateStatOnConnection("OnComponentError1", 0, "error");
								}
							
							
								errorCode = null;
								tDBRollback_1Process(globalMap);
								if (!"failure".equals(status)) {
									status = "end";
								}
								

						} catch (Exception e) {
							e.printStackTrace();
						}
						
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBCommit_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBCommit_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBRollback_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBRollback_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_6_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_7_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
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
			
			public void tDBInput_7_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_9_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_8_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_10_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
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
			
			public void tAdvancedHash_row6_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_row8_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_row9_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_row11_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_row10_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_row2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
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
			
			public void tPrejob_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tChronometerStart_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBConnection_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBConnection_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBInput_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBCommit_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBRollback_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

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
				tDBConnection_2Process(globalMap);



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
            String url_tDBConnection_2 = "jdbc:postgresql://"+"leuk.laiterieduberger.sn"+":"+"5432"+"/"+"leuk_webapp_production";
            
            if(dbProperties_tDBConnection_2 != null && !"".equals(dbProperties_tDBConnection_2.trim())) {
                url_tDBConnection_2 = url_tDBConnection_2 + "?" + dbProperties_tDBConnection_2;
            }
	String dbUser_tDBConnection_2 = "malick.diouf";
	
	
		 
	final String decryptedPassword_tDBConnection_2 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:eCNmmbWRyyLT6+w9Z+tpCGiZyNFwsgz8BoTnPTdUcOxUSTC/JSSKkp55");
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
		
			conn_tDBConnection_2.setAutoCommit(false);
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

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk3", 0, "ok");
				}
				tDBConnection_1Process(globalMap);



/**
 * [tDBConnection_2 end ] stop
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
            String url_tDBConnection_1 = "jdbc:postgresql://"+"163.172.166.119"+":"+"5432"+"/"+"leuk_analytics";
            
            if(dbProperties_tDBConnection_1 != null && !"".equals(dbProperties_tDBConnection_1.trim())) {
                url_tDBConnection_1 = url_tDBConnection_1 + "?" + dbProperties_tDBConnection_1;
            }
	String dbUser_tDBConnection_1 = "malick.diouf";
	
	
		 
	final String decryptedPassword_tDBConnection_1 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:EDYj9y6dT7GYd2qAYpXsNLiBmxq40rwRpRXW6lfvoaWhk38d+LQ=");
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
		
			conn_tDBConnection_1.setAutoCommit(false);
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
	


public static class out8Struct implements routines.system.IPersistableRow<out8Struct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[0];

	
			    public String name;

				public String getName () {
					return this.name;
				}
				
			    public String address_1;

				public String getAddress_1 () {
					return this.address_1;
				}
				
			    public String qr_code_1;

				public String getQr_code_1 () {
					return this.qr_code_1;
				}
				
			    public String secteur;

				public String getSecteur () {
					return this.secteur;
				}
				
			    public String sku_sage;

				public String getSku_sage () {
					return this.sku_sage;
				}
				
			    public java.util.Date date_Ventes;

				public java.util.Date getDate_Ventes () {
					return this.date_Ventes;
				}
				
			    public int qte_vendu;

				public int getQte_vendu () {
					return this.qte_vendu;
				}
				
			    public double CANTTC;

				public double getCANTTC () {
					return this.CANTTC;
				}
				
			    public double Pertes;

				public double getPertes () {
					return this.Pertes;
				}
				
			    public String nompilier;

				public String getNompilier () {
					return this.nompilier;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR, 0, length, utf8Charset);
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
			if(length > commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR) {

        	try {

        		int length = 0;
		
					this.name = readString(dis);
					
					this.address_1 = readString(dis);
					
					this.qr_code_1 = readString(dis);
					
					this.secteur = readString(dis);
					
					this.sku_sage = readString(dis);
					
					this.date_Ventes = readDate(dis);
					
			        this.qte_vendu = dis.readInt();
					
			        this.CANTTC = dis.readDouble();
					
			        this.Pertes = dis.readDouble();
					
					this.nompilier = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR) {

        	try {

        		int length = 0;
		
					this.name = readString(dis);
					
					this.address_1 = readString(dis);
					
					this.qr_code_1 = readString(dis);
					
					this.secteur = readString(dis);
					
					this.sku_sage = readString(dis);
					
					this.date_Ventes = readDate(dis);
					
			        this.qte_vendu = dis.readInt();
					
			        this.CANTTC = dis.readDouble();
					
			        this.Pertes = dis.readDouble();
					
					this.nompilier = readString(dis);
					
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
				
						writeString(this.address_1,dos);
					
					// String
				
						writeString(this.qr_code_1,dos);
					
					// String
				
						writeString(this.secteur,dos);
					
					// String
				
						writeString(this.sku_sage,dos);
					
					// java.util.Date
				
						writeDate(this.date_Ventes,dos);
					
					// int
				
		            	dos.writeInt(this.qte_vendu);
					
					// double
				
		            	dos.writeDouble(this.CANTTC);
					
					// double
				
		            	dos.writeDouble(this.Pertes);
					
					// String
				
						writeString(this.nompilier,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.name,dos);
					
					// String
				
						writeString(this.address_1,dos);
					
					// String
				
						writeString(this.qr_code_1,dos);
					
					// String
				
						writeString(this.secteur,dos);
					
					// String
				
						writeString(this.sku_sage,dos);
					
					// java.util.Date
				
						writeDate(this.date_Ventes,dos);
					
					// int
				
		            	dos.writeInt(this.qte_vendu);
					
					// double
				
		            	dos.writeDouble(this.CANTTC);
					
					// double
				
		            	dos.writeDouble(this.Pertes);
					
					// String
				
						writeString(this.nompilier,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("name="+name);
		sb.append(",address_1="+address_1);
		sb.append(",qr_code_1="+qr_code_1);
		sb.append(",secteur="+secteur);
		sb.append(",sku_sage="+sku_sage);
		sb.append(",date_Ventes="+String.valueOf(date_Ventes));
		sb.append(",qte_vendu="+String.valueOf(qte_vendu));
		sb.append(",CANTTC="+String.valueOf(CANTTC));
		sb.append(",Pertes="+String.valueOf(Pertes));
		sb.append(",nompilier="+nompilier);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(out8Struct other) {

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

public static class out4Struct implements routines.system.IPersistableRow<out4Struct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public int id_faitvendeur;

				public int getId_faitvendeur () {
					return this.id_faitvendeur;
				}
				
			    public Long id_secteur;

				public Long getId_secteur () {
					return this.id_secteur;
				}
				
			    public Long id_produit;

				public Long getId_produit () {
					return this.id_produit;
				}
				
			    public Integer id_temps;

				public Integer getId_temps () {
					return this.id_temps;
				}
				
			    public Long id_pdv;

				public Long getId_pdv () {
					return this.id_pdv;
				}
				
			    public Double cattc;

				public Double getCattc () {
					return this.cattc;
				}
				
			    public Double caht;

				public Double getCaht () {
					return this.caht;
				}
				
			    public Double pertes;

				public Double getPertes () {
					return this.pertes;
				}
				
			    public Integer qte_vendu;

				public Integer getQte_vendu () {
					return this.qte_vendu;
				}
				
			    public Integer volume_total;

				public Integer getVolume_total () {
					return this.volume_total;
				}
				
			    public Integer penetration_p;

				public Integer getPenetration_p () {
					return this.penetration_p;
				}
				
			    public Integer penetration_g;

				public Integer getPenetration_g () {
					return this.penetration_g;
				}
				
			    public Integer ruptures;

				public Integer getRuptures () {
					return this.ruptures;
				}
				
			    public Integer com_intelligente;

				public Integer getCom_intelligente () {
					return this.com_intelligente;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
							result = prime * result + (int) this.id_faitvendeur;
						
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
		final out4Struct other = (out4Struct) obj;
		
						if (this.id_faitvendeur != other.id_faitvendeur)
							return false;
					

		return true;
    }

	public void copyDataTo(out4Struct other) {

		other.id_faitvendeur = this.id_faitvendeur;
	            other.id_secteur = this.id_secteur;
	            other.id_produit = this.id_produit;
	            other.id_temps = this.id_temps;
	            other.id_pdv = this.id_pdv;
	            other.cattc = this.cattc;
	            other.caht = this.caht;
	            other.pertes = this.pertes;
	            other.qte_vendu = this.qte_vendu;
	            other.volume_total = this.volume_total;
	            other.penetration_p = this.penetration_p;
	            other.penetration_g = this.penetration_g;
	            other.ruptures = this.ruptures;
	            other.com_intelligente = this.com_intelligente;
	            
	}

	public void copyKeysDataTo(out4Struct other) {

		other.id_faitvendeur = this.id_faitvendeur;
	            	
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR) {

        	try {

        		int length = 0;
		
			        this.id_faitvendeur = dis.readInt();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.id_secteur = null;
           				} else {
           			    	this.id_secteur = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.id_produit = null;
           				} else {
           			    	this.id_produit = dis.readLong();
           				}
					
						this.id_temps = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.id_pdv = null;
           				} else {
           			    	this.id_pdv = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.cattc = null;
           				} else {
           			    	this.cattc = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.caht = null;
           				} else {
           			    	this.caht = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.pertes = null;
           				} else {
           			    	this.pertes = dis.readDouble();
           				}
					
						this.qte_vendu = readInteger(dis);
					
						this.volume_total = readInteger(dis);
					
						this.penetration_p = readInteger(dis);
					
						this.penetration_g = readInteger(dis);
					
						this.ruptures = readInteger(dis);
					
						this.com_intelligente = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR) {

        	try {

        		int length = 0;
		
			        this.id_faitvendeur = dis.readInt();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.id_secteur = null;
           				} else {
           			    	this.id_secteur = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.id_produit = null;
           				} else {
           			    	this.id_produit = dis.readLong();
           				}
					
						this.id_temps = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.id_pdv = null;
           				} else {
           			    	this.id_pdv = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.cattc = null;
           				} else {
           			    	this.cattc = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.caht = null;
           				} else {
           			    	this.caht = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.pertes = null;
           				} else {
           			    	this.pertes = dis.readDouble();
           				}
					
						this.qte_vendu = readInteger(dis);
					
						this.volume_total = readInteger(dis);
					
						this.penetration_p = readInteger(dis);
					
						this.penetration_g = readInteger(dis);
					
						this.ruptures = readInteger(dis);
					
						this.com_intelligente = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id_faitvendeur);
					
					// Long
				
						if(this.id_secteur == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.id_secteur);
		            	}
					
					// Long
				
						if(this.id_produit == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.id_produit);
		            	}
					
					// Integer
				
						writeInteger(this.id_temps,dos);
					
					// Long
				
						if(this.id_pdv == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.id_pdv);
		            	}
					
					// Double
				
						if(this.cattc == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.cattc);
		            	}
					
					// Double
				
						if(this.caht == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.caht);
		            	}
					
					// Double
				
						if(this.pertes == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.pertes);
		            	}
					
					// Integer
				
						writeInteger(this.qte_vendu,dos);
					
					// Integer
				
						writeInteger(this.volume_total,dos);
					
					// Integer
				
						writeInteger(this.penetration_p,dos);
					
					// Integer
				
						writeInteger(this.penetration_g,dos);
					
					// Integer
				
						writeInteger(this.ruptures,dos);
					
					// Integer
				
						writeInteger(this.com_intelligente,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id_faitvendeur);
					
					// Long
				
						if(this.id_secteur == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.id_secteur);
		            	}
					
					// Long
				
						if(this.id_produit == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.id_produit);
		            	}
					
					// Integer
				
						writeInteger(this.id_temps,dos);
					
					// Long
				
						if(this.id_pdv == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.id_pdv);
		            	}
					
					// Double
				
						if(this.cattc == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.cattc);
		            	}
					
					// Double
				
						if(this.caht == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.caht);
		            	}
					
					// Double
				
						if(this.pertes == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.pertes);
		            	}
					
					// Integer
				
						writeInteger(this.qte_vendu,dos);
					
					// Integer
				
						writeInteger(this.volume_total,dos);
					
					// Integer
				
						writeInteger(this.penetration_p,dos);
					
					// Integer
				
						writeInteger(this.penetration_g,dos);
					
					// Integer
				
						writeInteger(this.ruptures,dos);
					
					// Integer
				
						writeInteger(this.com_intelligente,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id_faitvendeur="+String.valueOf(id_faitvendeur));
		sb.append(",id_secteur="+String.valueOf(id_secteur));
		sb.append(",id_produit="+String.valueOf(id_produit));
		sb.append(",id_temps="+String.valueOf(id_temps));
		sb.append(",id_pdv="+String.valueOf(id_pdv));
		sb.append(",cattc="+String.valueOf(cattc));
		sb.append(",caht="+String.valueOf(caht));
		sb.append(",pertes="+String.valueOf(pertes));
		sb.append(",qte_vendu="+String.valueOf(qte_vendu));
		sb.append(",volume_total="+String.valueOf(volume_total));
		sb.append(",penetration_p="+String.valueOf(penetration_p));
		sb.append(",penetration_g="+String.valueOf(penetration_g));
		sb.append(",ruptures="+String.valueOf(ruptures));
		sb.append(",com_intelligente="+String.valueOf(com_intelligente));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(out4Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.id_faitvendeur, other.id_faitvendeur);
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

public static class out5Struct implements routines.system.IPersistableRow<out5Struct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public int id_faitvendeur;

				public int getId_faitvendeur () {
					return this.id_faitvendeur;
				}
				
			    public Long id_secteur;

				public Long getId_secteur () {
					return this.id_secteur;
				}
				
			    public Long id_produit;

				public Long getId_produit () {
					return this.id_produit;
				}
				
			    public Integer id_temps;

				public Integer getId_temps () {
					return this.id_temps;
				}
				
			    public Long id_pdv;

				public Long getId_pdv () {
					return this.id_pdv;
				}
				
			    public Double cattc;

				public Double getCattc () {
					return this.cattc;
				}
				
			    public Double caht;

				public Double getCaht () {
					return this.caht;
				}
				
			    public Double pertes;

				public Double getPertes () {
					return this.pertes;
				}
				
			    public Integer qte_vendu;

				public Integer getQte_vendu () {
					return this.qte_vendu;
				}
				
			    public Integer volume_total;

				public Integer getVolume_total () {
					return this.volume_total;
				}
				
			    public Integer penetration_p;

				public Integer getPenetration_p () {
					return this.penetration_p;
				}
				
			    public Integer penetration_g;

				public Integer getPenetration_g () {
					return this.penetration_g;
				}
				
			    public Integer ruptures;

				public Integer getRuptures () {
					return this.ruptures;
				}
				
			    public Integer com_intelligente;

				public Integer getCom_intelligente () {
					return this.com_intelligente;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
							result = prime * result + (int) this.id_faitvendeur;
						
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
		final out5Struct other = (out5Struct) obj;
		
						if (this.id_faitvendeur != other.id_faitvendeur)
							return false;
					

		return true;
    }

	public void copyDataTo(out5Struct other) {

		other.id_faitvendeur = this.id_faitvendeur;
	            other.id_secteur = this.id_secteur;
	            other.id_produit = this.id_produit;
	            other.id_temps = this.id_temps;
	            other.id_pdv = this.id_pdv;
	            other.cattc = this.cattc;
	            other.caht = this.caht;
	            other.pertes = this.pertes;
	            other.qte_vendu = this.qte_vendu;
	            other.volume_total = this.volume_total;
	            other.penetration_p = this.penetration_p;
	            other.penetration_g = this.penetration_g;
	            other.ruptures = this.ruptures;
	            other.com_intelligente = this.com_intelligente;
	            
	}

	public void copyKeysDataTo(out5Struct other) {

		other.id_faitvendeur = this.id_faitvendeur;
	            	
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR) {

        	try {

        		int length = 0;
		
			        this.id_faitvendeur = dis.readInt();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.id_secteur = null;
           				} else {
           			    	this.id_secteur = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.id_produit = null;
           				} else {
           			    	this.id_produit = dis.readLong();
           				}
					
						this.id_temps = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.id_pdv = null;
           				} else {
           			    	this.id_pdv = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.cattc = null;
           				} else {
           			    	this.cattc = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.caht = null;
           				} else {
           			    	this.caht = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.pertes = null;
           				} else {
           			    	this.pertes = dis.readDouble();
           				}
					
						this.qte_vendu = readInteger(dis);
					
						this.volume_total = readInteger(dis);
					
						this.penetration_p = readInteger(dis);
					
						this.penetration_g = readInteger(dis);
					
						this.ruptures = readInteger(dis);
					
						this.com_intelligente = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR) {

        	try {

        		int length = 0;
		
			        this.id_faitvendeur = dis.readInt();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.id_secteur = null;
           				} else {
           			    	this.id_secteur = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.id_produit = null;
           				} else {
           			    	this.id_produit = dis.readLong();
           				}
					
						this.id_temps = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.id_pdv = null;
           				} else {
           			    	this.id_pdv = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.cattc = null;
           				} else {
           			    	this.cattc = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.caht = null;
           				} else {
           			    	this.caht = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.pertes = null;
           				} else {
           			    	this.pertes = dis.readDouble();
           				}
					
						this.qte_vendu = readInteger(dis);
					
						this.volume_total = readInteger(dis);
					
						this.penetration_p = readInteger(dis);
					
						this.penetration_g = readInteger(dis);
					
						this.ruptures = readInteger(dis);
					
						this.com_intelligente = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id_faitvendeur);
					
					// Long
				
						if(this.id_secteur == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.id_secteur);
		            	}
					
					// Long
				
						if(this.id_produit == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.id_produit);
		            	}
					
					// Integer
				
						writeInteger(this.id_temps,dos);
					
					// Long
				
						if(this.id_pdv == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.id_pdv);
		            	}
					
					// Double
				
						if(this.cattc == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.cattc);
		            	}
					
					// Double
				
						if(this.caht == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.caht);
		            	}
					
					// Double
				
						if(this.pertes == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.pertes);
		            	}
					
					// Integer
				
						writeInteger(this.qte_vendu,dos);
					
					// Integer
				
						writeInteger(this.volume_total,dos);
					
					// Integer
				
						writeInteger(this.penetration_p,dos);
					
					// Integer
				
						writeInteger(this.penetration_g,dos);
					
					// Integer
				
						writeInteger(this.ruptures,dos);
					
					// Integer
				
						writeInteger(this.com_intelligente,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id_faitvendeur);
					
					// Long
				
						if(this.id_secteur == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.id_secteur);
		            	}
					
					// Long
				
						if(this.id_produit == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.id_produit);
		            	}
					
					// Integer
				
						writeInteger(this.id_temps,dos);
					
					// Long
				
						if(this.id_pdv == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.id_pdv);
		            	}
					
					// Double
				
						if(this.cattc == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.cattc);
		            	}
					
					// Double
				
						if(this.caht == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.caht);
		            	}
					
					// Double
				
						if(this.pertes == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.pertes);
		            	}
					
					// Integer
				
						writeInteger(this.qte_vendu,dos);
					
					// Integer
				
						writeInteger(this.volume_total,dos);
					
					// Integer
				
						writeInteger(this.penetration_p,dos);
					
					// Integer
				
						writeInteger(this.penetration_g,dos);
					
					// Integer
				
						writeInteger(this.ruptures,dos);
					
					// Integer
				
						writeInteger(this.com_intelligente,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id_faitvendeur="+String.valueOf(id_faitvendeur));
		sb.append(",id_secteur="+String.valueOf(id_secteur));
		sb.append(",id_produit="+String.valueOf(id_produit));
		sb.append(",id_temps="+String.valueOf(id_temps));
		sb.append(",id_pdv="+String.valueOf(id_pdv));
		sb.append(",cattc="+String.valueOf(cattc));
		sb.append(",caht="+String.valueOf(caht));
		sb.append(",pertes="+String.valueOf(pertes));
		sb.append(",qte_vendu="+String.valueOf(qte_vendu));
		sb.append(",volume_total="+String.valueOf(volume_total));
		sb.append(",penetration_p="+String.valueOf(penetration_p));
		sb.append(",penetration_g="+String.valueOf(penetration_g));
		sb.append(",ruptures="+String.valueOf(ruptures));
		sb.append(",com_intelligente="+String.valueOf(com_intelligente));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(out5Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.id_faitvendeur, other.id_faitvendeur);
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

public static class out6Struct implements routines.system.IPersistableRow<out6Struct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[0];

	
			    public long id_pdv;

				public long getId_pdv () {
					return this.id_pdv;
				}
				
			    public long id_produit;

				public long getId_produit () {
					return this.id_produit;
				}
				
			    public long id_secteur;

				public long getId_secteur () {
					return this.id_secteur;
				}
				
			    public int id_temps;

				public int getId_temps () {
					return this.id_temps;
				}
				
			    public int qte_vendu;

				public int getQte_vendu () {
					return this.qte_vendu;
				}
				
			    public double CANTTC;

				public double getCANTTC () {
					return this.CANTTC;
				}
				
			    public double Pertes;

				public double getPertes () {
					return this.Pertes;
				}
				
			    public int Volume_Total;

				public int getVolume_Total () {
					return this.Volume_Total;
				}
				
			    public double CANHT;

				public double getCANHT () {
					return this.CANHT;
				}
				
			    public int rupture;

				public int getRupture () {
					return this.rupture;
				}
				
			    public int Commande_Intelligente;

				public int getCommande_Intelligente () {
					return this.Commande_Intelligente;
				}
				
			    public int PenetrationProduit;

				public int getPenetrationProduit () {
					return this.PenetrationProduit;
				}
				
			    public int PenetrationGamme;

				public int getPenetrationGamme () {
					return this.PenetrationGamme;
				}
				



    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR) {

        	try {

        		int length = 0;
		
			        this.id_pdv = dis.readLong();
					
			        this.id_produit = dis.readLong();
					
			        this.id_secteur = dis.readLong();
					
			        this.id_temps = dis.readInt();
					
			        this.qte_vendu = dis.readInt();
					
			        this.CANTTC = dis.readDouble();
					
			        this.Pertes = dis.readDouble();
					
			        this.Volume_Total = dis.readInt();
					
			        this.CANHT = dis.readDouble();
					
			        this.rupture = dis.readInt();
					
			        this.Commande_Intelligente = dis.readInt();
					
			        this.PenetrationProduit = dis.readInt();
					
			        this.PenetrationGamme = dis.readInt();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR) {

        	try {

        		int length = 0;
		
			        this.id_pdv = dis.readLong();
					
			        this.id_produit = dis.readLong();
					
			        this.id_secteur = dis.readLong();
					
			        this.id_temps = dis.readInt();
					
			        this.qte_vendu = dis.readInt();
					
			        this.CANTTC = dis.readDouble();
					
			        this.Pertes = dis.readDouble();
					
			        this.Volume_Total = dis.readInt();
					
			        this.CANHT = dis.readDouble();
					
			        this.rupture = dis.readInt();
					
			        this.Commande_Intelligente = dis.readInt();
					
			        this.PenetrationProduit = dis.readInt();
					
			        this.PenetrationGamme = dis.readInt();
					
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
				
		            	dos.writeLong(this.id_produit);
					
					// long
				
		            	dos.writeLong(this.id_secteur);
					
					// int
				
		            	dos.writeInt(this.id_temps);
					
					// int
				
		            	dos.writeInt(this.qte_vendu);
					
					// double
				
		            	dos.writeDouble(this.CANTTC);
					
					// double
				
		            	dos.writeDouble(this.Pertes);
					
					// int
				
		            	dos.writeInt(this.Volume_Total);
					
					// double
				
		            	dos.writeDouble(this.CANHT);
					
					// int
				
		            	dos.writeInt(this.rupture);
					
					// int
				
		            	dos.writeInt(this.Commande_Intelligente);
					
					// int
				
		            	dos.writeInt(this.PenetrationProduit);
					
					// int
				
		            	dos.writeInt(this.PenetrationGamme);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id_pdv);
					
					// long
				
		            	dos.writeLong(this.id_produit);
					
					// long
				
		            	dos.writeLong(this.id_secteur);
					
					// int
				
		            	dos.writeInt(this.id_temps);
					
					// int
				
		            	dos.writeInt(this.qte_vendu);
					
					// double
				
		            	dos.writeDouble(this.CANTTC);
					
					// double
				
		            	dos.writeDouble(this.Pertes);
					
					// int
				
		            	dos.writeInt(this.Volume_Total);
					
					// double
				
		            	dos.writeDouble(this.CANHT);
					
					// int
				
		            	dos.writeInt(this.rupture);
					
					// int
				
		            	dos.writeInt(this.Commande_Intelligente);
					
					// int
				
		            	dos.writeInt(this.PenetrationProduit);
					
					// int
				
		            	dos.writeInt(this.PenetrationGamme);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id_pdv="+String.valueOf(id_pdv));
		sb.append(",id_produit="+String.valueOf(id_produit));
		sb.append(",id_secteur="+String.valueOf(id_secteur));
		sb.append(",id_temps="+String.valueOf(id_temps));
		sb.append(",qte_vendu="+String.valueOf(qte_vendu));
		sb.append(",CANTTC="+String.valueOf(CANTTC));
		sb.append(",Pertes="+String.valueOf(Pertes));
		sb.append(",Volume_Total="+String.valueOf(Volume_Total));
		sb.append(",CANHT="+String.valueOf(CANHT));
		sb.append(",rupture="+String.valueOf(rupture));
		sb.append(",Commande_Intelligente="+String.valueOf(Commande_Intelligente));
		sb.append(",PenetrationProduit="+String.valueOf(PenetrationProduit));
		sb.append(",PenetrationGamme="+String.valueOf(PenetrationGamme));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(out6Struct other) {

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

public static class out3Struct implements routines.system.IPersistableRow<out3Struct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[0];

	
			    public int id_faitvendeur;

				public int getId_faitvendeur () {
					return this.id_faitvendeur;
				}
				
			    public long id_pdv;

				public long getId_pdv () {
					return this.id_pdv;
				}
				
			    public long id_produit;

				public long getId_produit () {
					return this.id_produit;
				}
				
			    public long id_secteur;

				public long getId_secteur () {
					return this.id_secteur;
				}
				
			    public int id_temps;

				public int getId_temps () {
					return this.id_temps;
				}
				
			    public int qte_vendu;

				public int getQte_vendu () {
					return this.qte_vendu;
				}
				
			    public double CANTTC;

				public double getCANTTC () {
					return this.CANTTC;
				}
				
			    public double Pertes;

				public double getPertes () {
					return this.Pertes;
				}
				
			    public int Volume_Total;

				public int getVolume_Total () {
					return this.Volume_Total;
				}
				
			    public double CANHT;

				public double getCANHT () {
					return this.CANHT;
				}
				
			    public int rupture;

				public int getRupture () {
					return this.rupture;
				}
				
			    public int Commande_Intelligente;

				public int getCommande_Intelligente () {
					return this.Commande_Intelligente;
				}
				
			    public int PenetrationProduit;

				public int getPenetrationProduit () {
					return this.PenetrationProduit;
				}
				
			    public int PenetrationGamme;

				public int getPenetrationGamme () {
					return this.PenetrationGamme;
				}
				



    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR) {

        	try {

        		int length = 0;
		
			        this.id_faitvendeur = dis.readInt();
					
			        this.id_pdv = dis.readLong();
					
			        this.id_produit = dis.readLong();
					
			        this.id_secteur = dis.readLong();
					
			        this.id_temps = dis.readInt();
					
			        this.qte_vendu = dis.readInt();
					
			        this.CANTTC = dis.readDouble();
					
			        this.Pertes = dis.readDouble();
					
			        this.Volume_Total = dis.readInt();
					
			        this.CANHT = dis.readDouble();
					
			        this.rupture = dis.readInt();
					
			        this.Commande_Intelligente = dis.readInt();
					
			        this.PenetrationProduit = dis.readInt();
					
			        this.PenetrationGamme = dis.readInt();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR) {

        	try {

        		int length = 0;
		
			        this.id_faitvendeur = dis.readInt();
					
			        this.id_pdv = dis.readLong();
					
			        this.id_produit = dis.readLong();
					
			        this.id_secteur = dis.readLong();
					
			        this.id_temps = dis.readInt();
					
			        this.qte_vendu = dis.readInt();
					
			        this.CANTTC = dis.readDouble();
					
			        this.Pertes = dis.readDouble();
					
			        this.Volume_Total = dis.readInt();
					
			        this.CANHT = dis.readDouble();
					
			        this.rupture = dis.readInt();
					
			        this.Commande_Intelligente = dis.readInt();
					
			        this.PenetrationProduit = dis.readInt();
					
			        this.PenetrationGamme = dis.readInt();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id_faitvendeur);
					
					// long
				
		            	dos.writeLong(this.id_pdv);
					
					// long
				
		            	dos.writeLong(this.id_produit);
					
					// long
				
		            	dos.writeLong(this.id_secteur);
					
					// int
				
		            	dos.writeInt(this.id_temps);
					
					// int
				
		            	dos.writeInt(this.qte_vendu);
					
					// double
				
		            	dos.writeDouble(this.CANTTC);
					
					// double
				
		            	dos.writeDouble(this.Pertes);
					
					// int
				
		            	dos.writeInt(this.Volume_Total);
					
					// double
				
		            	dos.writeDouble(this.CANHT);
					
					// int
				
		            	dos.writeInt(this.rupture);
					
					// int
				
		            	dos.writeInt(this.Commande_Intelligente);
					
					// int
				
		            	dos.writeInt(this.PenetrationProduit);
					
					// int
				
		            	dos.writeInt(this.PenetrationGamme);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id_faitvendeur);
					
					// long
				
		            	dos.writeLong(this.id_pdv);
					
					// long
				
		            	dos.writeLong(this.id_produit);
					
					// long
				
		            	dos.writeLong(this.id_secteur);
					
					// int
				
		            	dos.writeInt(this.id_temps);
					
					// int
				
		            	dos.writeInt(this.qte_vendu);
					
					// double
				
		            	dos.writeDouble(this.CANTTC);
					
					// double
				
		            	dos.writeDouble(this.Pertes);
					
					// int
				
		            	dos.writeInt(this.Volume_Total);
					
					// double
				
		            	dos.writeDouble(this.CANHT);
					
					// int
				
		            	dos.writeInt(this.rupture);
					
					// int
				
		            	dos.writeInt(this.Commande_Intelligente);
					
					// int
				
		            	dos.writeInt(this.PenetrationProduit);
					
					// int
				
		            	dos.writeInt(this.PenetrationGamme);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id_faitvendeur="+String.valueOf(id_faitvendeur));
		sb.append(",id_pdv="+String.valueOf(id_pdv));
		sb.append(",id_produit="+String.valueOf(id_produit));
		sb.append(",id_secteur="+String.valueOf(id_secteur));
		sb.append(",id_temps="+String.valueOf(id_temps));
		sb.append(",qte_vendu="+String.valueOf(qte_vendu));
		sb.append(",CANTTC="+String.valueOf(CANTTC));
		sb.append(",Pertes="+String.valueOf(Pertes));
		sb.append(",Volume_Total="+String.valueOf(Volume_Total));
		sb.append(",CANHT="+String.valueOf(CANHT));
		sb.append(",rupture="+String.valueOf(rupture));
		sb.append(",Commande_Intelligente="+String.valueOf(Commande_Intelligente));
		sb.append(",PenetrationProduit="+String.valueOf(PenetrationProduit));
		sb.append(",PenetrationGamme="+String.valueOf(PenetrationGamme));
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

public static class row7Struct implements routines.system.IPersistableRow<row7Struct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[0];

	
			    public long id_pdv;

				public long getId_pdv () {
					return this.id_pdv;
				}
				
			    public long id_produit;

				public long getId_produit () {
					return this.id_produit;
				}
				
			    public long id_secteur;

				public long getId_secteur () {
					return this.id_secteur;
				}
				
			    public int id_temps;

				public int getId_temps () {
					return this.id_temps;
				}
				
			    public int qte_vendu;

				public int getQte_vendu () {
					return this.qte_vendu;
				}
				
			    public double CANTTC;

				public double getCANTTC () {
					return this.CANTTC;
				}
				
			    public double Pertes;

				public double getPertes () {
					return this.Pertes;
				}
				
			    public int Volume_Total;

				public int getVolume_Total () {
					return this.Volume_Total;
				}
				
			    public double CANHT;

				public double getCANHT () {
					return this.CANHT;
				}
				
			    public int rupture;

				public int getRupture () {
					return this.rupture;
				}
				
			    public int Commande_Intelligente;

				public int getCommande_Intelligente () {
					return this.Commande_Intelligente;
				}
				
			    public int PenetrationProduit;

				public int getPenetrationProduit () {
					return this.PenetrationProduit;
				}
				
			    public int PenetrationGamme;

				public int getPenetrationGamme () {
					return this.PenetrationGamme;
				}
				
			    public java.util.Date d2;

				public java.util.Date getD2 () {
					return this.d2;
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR) {

        	try {

        		int length = 0;
		
			        this.id_pdv = dis.readLong();
					
			        this.id_produit = dis.readLong();
					
			        this.id_secteur = dis.readLong();
					
			        this.id_temps = dis.readInt();
					
			        this.qte_vendu = dis.readInt();
					
			        this.CANTTC = dis.readDouble();
					
			        this.Pertes = dis.readDouble();
					
			        this.Volume_Total = dis.readInt();
					
			        this.CANHT = dis.readDouble();
					
			        this.rupture = dis.readInt();
					
			        this.Commande_Intelligente = dis.readInt();
					
			        this.PenetrationProduit = dis.readInt();
					
			        this.PenetrationGamme = dis.readInt();
					
					this.d2 = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR) {

        	try {

        		int length = 0;
		
			        this.id_pdv = dis.readLong();
					
			        this.id_produit = dis.readLong();
					
			        this.id_secteur = dis.readLong();
					
			        this.id_temps = dis.readInt();
					
			        this.qte_vendu = dis.readInt();
					
			        this.CANTTC = dis.readDouble();
					
			        this.Pertes = dis.readDouble();
					
			        this.Volume_Total = dis.readInt();
					
			        this.CANHT = dis.readDouble();
					
			        this.rupture = dis.readInt();
					
			        this.Commande_Intelligente = dis.readInt();
					
			        this.PenetrationProduit = dis.readInt();
					
			        this.PenetrationGamme = dis.readInt();
					
					this.d2 = readDate(dis);
					
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
				
		            	dos.writeLong(this.id_produit);
					
					// long
				
		            	dos.writeLong(this.id_secteur);
					
					// int
				
		            	dos.writeInt(this.id_temps);
					
					// int
				
		            	dos.writeInt(this.qte_vendu);
					
					// double
				
		            	dos.writeDouble(this.CANTTC);
					
					// double
				
		            	dos.writeDouble(this.Pertes);
					
					// int
				
		            	dos.writeInt(this.Volume_Total);
					
					// double
				
		            	dos.writeDouble(this.CANHT);
					
					// int
				
		            	dos.writeInt(this.rupture);
					
					// int
				
		            	dos.writeInt(this.Commande_Intelligente);
					
					// int
				
		            	dos.writeInt(this.PenetrationProduit);
					
					// int
				
		            	dos.writeInt(this.PenetrationGamme);
					
					// java.util.Date
				
						writeDate(this.d2,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id_pdv);
					
					// long
				
		            	dos.writeLong(this.id_produit);
					
					// long
				
		            	dos.writeLong(this.id_secteur);
					
					// int
				
		            	dos.writeInt(this.id_temps);
					
					// int
				
		            	dos.writeInt(this.qte_vendu);
					
					// double
				
		            	dos.writeDouble(this.CANTTC);
					
					// double
				
		            	dos.writeDouble(this.Pertes);
					
					// int
				
		            	dos.writeInt(this.Volume_Total);
					
					// double
				
		            	dos.writeDouble(this.CANHT);
					
					// int
				
		            	dos.writeInt(this.rupture);
					
					// int
				
		            	dos.writeInt(this.Commande_Intelligente);
					
					// int
				
		            	dos.writeInt(this.PenetrationProduit);
					
					// int
				
		            	dos.writeInt(this.PenetrationGamme);
					
					// java.util.Date
				
						writeDate(this.d2,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id_pdv="+String.valueOf(id_pdv));
		sb.append(",id_produit="+String.valueOf(id_produit));
		sb.append(",id_secteur="+String.valueOf(id_secteur));
		sb.append(",id_temps="+String.valueOf(id_temps));
		sb.append(",qte_vendu="+String.valueOf(qte_vendu));
		sb.append(",CANTTC="+String.valueOf(CANTTC));
		sb.append(",Pertes="+String.valueOf(Pertes));
		sb.append(",Volume_Total="+String.valueOf(Volume_Total));
		sb.append(",CANHT="+String.valueOf(CANHT));
		sb.append(",rupture="+String.valueOf(rupture));
		sb.append(",Commande_Intelligente="+String.valueOf(Commande_Intelligente));
		sb.append(",PenetrationProduit="+String.valueOf(PenetrationProduit));
		sb.append(",PenetrationGamme="+String.valueOf(PenetrationGamme));
		sb.append(",d2="+String.valueOf(d2));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row7Struct other) {

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
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[0];

	
			    public long id_pdv;

				public long getId_pdv () {
					return this.id_pdv;
				}
				
			    public long id_produit;

				public long getId_produit () {
					return this.id_produit;
				}
				
			    public long id_secteur;

				public long getId_secteur () {
					return this.id_secteur;
				}
				
			    public int id_temps;

				public int getId_temps () {
					return this.id_temps;
				}
				
			    public int qte_vendu;

				public int getQte_vendu () {
					return this.qte_vendu;
				}
				
			    public double CANTTC;

				public double getCANTTC () {
					return this.CANTTC;
				}
				
			    public double Pertes;

				public double getPertes () {
					return this.Pertes;
				}
				
			    public int Volume_Total;

				public int getVolume_Total () {
					return this.Volume_Total;
				}
				
			    public double CANHT;

				public double getCANHT () {
					return this.CANHT;
				}
				
			    public int rupture;

				public int getRupture () {
					return this.rupture;
				}
				
			    public int Commande_Intelligente;

				public int getCommande_Intelligente () {
					return this.Commande_Intelligente;
				}
				
			    public int PenetrationProduit;

				public int getPenetrationProduit () {
					return this.PenetrationProduit;
				}
				
			    public int PenetrationGamme;

				public int getPenetrationGamme () {
					return this.PenetrationGamme;
				}
				
			    public java.util.Date d2;

				public java.util.Date getD2 () {
					return this.d2;
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR) {

        	try {

        		int length = 0;
		
			        this.id_pdv = dis.readLong();
					
			        this.id_produit = dis.readLong();
					
			        this.id_secteur = dis.readLong();
					
			        this.id_temps = dis.readInt();
					
			        this.qte_vendu = dis.readInt();
					
			        this.CANTTC = dis.readDouble();
					
			        this.Pertes = dis.readDouble();
					
			        this.Volume_Total = dis.readInt();
					
			        this.CANHT = dis.readDouble();
					
			        this.rupture = dis.readInt();
					
			        this.Commande_Intelligente = dis.readInt();
					
			        this.PenetrationProduit = dis.readInt();
					
			        this.PenetrationGamme = dis.readInt();
					
					this.d2 = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR) {

        	try {

        		int length = 0;
		
			        this.id_pdv = dis.readLong();
					
			        this.id_produit = dis.readLong();
					
			        this.id_secteur = dis.readLong();
					
			        this.id_temps = dis.readInt();
					
			        this.qte_vendu = dis.readInt();
					
			        this.CANTTC = dis.readDouble();
					
			        this.Pertes = dis.readDouble();
					
			        this.Volume_Total = dis.readInt();
					
			        this.CANHT = dis.readDouble();
					
			        this.rupture = dis.readInt();
					
			        this.Commande_Intelligente = dis.readInt();
					
			        this.PenetrationProduit = dis.readInt();
					
			        this.PenetrationGamme = dis.readInt();
					
					this.d2 = readDate(dis);
					
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
				
		            	dos.writeLong(this.id_produit);
					
					// long
				
		            	dos.writeLong(this.id_secteur);
					
					// int
				
		            	dos.writeInt(this.id_temps);
					
					// int
				
		            	dos.writeInt(this.qte_vendu);
					
					// double
				
		            	dos.writeDouble(this.CANTTC);
					
					// double
				
		            	dos.writeDouble(this.Pertes);
					
					// int
				
		            	dos.writeInt(this.Volume_Total);
					
					// double
				
		            	dos.writeDouble(this.CANHT);
					
					// int
				
		            	dos.writeInt(this.rupture);
					
					// int
				
		            	dos.writeInt(this.Commande_Intelligente);
					
					// int
				
		            	dos.writeInt(this.PenetrationProduit);
					
					// int
				
		            	dos.writeInt(this.PenetrationGamme);
					
					// java.util.Date
				
						writeDate(this.d2,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id_pdv);
					
					// long
				
		            	dos.writeLong(this.id_produit);
					
					// long
				
		            	dos.writeLong(this.id_secteur);
					
					// int
				
		            	dos.writeInt(this.id_temps);
					
					// int
				
		            	dos.writeInt(this.qte_vendu);
					
					// double
				
		            	dos.writeDouble(this.CANTTC);
					
					// double
				
		            	dos.writeDouble(this.Pertes);
					
					// int
				
		            	dos.writeInt(this.Volume_Total);
					
					// double
				
		            	dos.writeDouble(this.CANHT);
					
					// int
				
		            	dos.writeInt(this.rupture);
					
					// int
				
		            	dos.writeInt(this.Commande_Intelligente);
					
					// int
				
		            	dos.writeInt(this.PenetrationProduit);
					
					// int
				
		            	dos.writeInt(this.PenetrationGamme);
					
					// java.util.Date
				
						writeDate(this.d2,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id_pdv="+String.valueOf(id_pdv));
		sb.append(",id_produit="+String.valueOf(id_produit));
		sb.append(",id_secteur="+String.valueOf(id_secteur));
		sb.append(",id_temps="+String.valueOf(id_temps));
		sb.append(",qte_vendu="+String.valueOf(qte_vendu));
		sb.append(",CANTTC="+String.valueOf(CANTTC));
		sb.append(",Pertes="+String.valueOf(Pertes));
		sb.append(",Volume_Total="+String.valueOf(Volume_Total));
		sb.append(",CANHT="+String.valueOf(CANHT));
		sb.append(",rupture="+String.valueOf(rupture));
		sb.append(",Commande_Intelligente="+String.valueOf(Commande_Intelligente));
		sb.append(",PenetrationProduit="+String.valueOf(PenetrationProduit));
		sb.append(",PenetrationGamme="+String.valueOf(PenetrationGamme));
		sb.append(",d2="+String.valueOf(d2));
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
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[0];

	
			    public long id_pdv;

				public long getId_pdv () {
					return this.id_pdv;
				}
				
			    public long id_produit;

				public long getId_produit () {
					return this.id_produit;
				}
				
			    public long id_secteur;

				public long getId_secteur () {
					return this.id_secteur;
				}
				
			    public int id_temps;

				public int getId_temps () {
					return this.id_temps;
				}
				
			    public int qte_vendu;

				public int getQte_vendu () {
					return this.qte_vendu;
				}
				
			    public double CANTTC;

				public double getCANTTC () {
					return this.CANTTC;
				}
				
			    public double Pertes;

				public double getPertes () {
					return this.Pertes;
				}
				
			    public int Volume_Total;

				public int getVolume_Total () {
					return this.Volume_Total;
				}
				
			    public double CANHT;

				public double getCANHT () {
					return this.CANHT;
				}
				
			    public int rupture;

				public int getRupture () {
					return this.rupture;
				}
				
			    public int Commande_Intelligente;

				public int getCommande_Intelligente () {
					return this.Commande_Intelligente;
				}
				
			    public int PenetrationProduit;

				public int getPenetrationProduit () {
					return this.PenetrationProduit;
				}
				
			    public int PenetrationGamme;

				public int getPenetrationGamme () {
					return this.PenetrationGamme;
				}
				
			    public java.util.Date d2;

				public java.util.Date getD2 () {
					return this.d2;
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR) {

        	try {

        		int length = 0;
		
			        this.id_pdv = dis.readLong();
					
			        this.id_produit = dis.readLong();
					
			        this.id_secteur = dis.readLong();
					
			        this.id_temps = dis.readInt();
					
			        this.qte_vendu = dis.readInt();
					
			        this.CANTTC = dis.readDouble();
					
			        this.Pertes = dis.readDouble();
					
			        this.Volume_Total = dis.readInt();
					
			        this.CANHT = dis.readDouble();
					
			        this.rupture = dis.readInt();
					
			        this.Commande_Intelligente = dis.readInt();
					
			        this.PenetrationProduit = dis.readInt();
					
			        this.PenetrationGamme = dis.readInt();
					
					this.d2 = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR) {

        	try {

        		int length = 0;
		
			        this.id_pdv = dis.readLong();
					
			        this.id_produit = dis.readLong();
					
			        this.id_secteur = dis.readLong();
					
			        this.id_temps = dis.readInt();
					
			        this.qte_vendu = dis.readInt();
					
			        this.CANTTC = dis.readDouble();
					
			        this.Pertes = dis.readDouble();
					
			        this.Volume_Total = dis.readInt();
					
			        this.CANHT = dis.readDouble();
					
			        this.rupture = dis.readInt();
					
			        this.Commande_Intelligente = dis.readInt();
					
			        this.PenetrationProduit = dis.readInt();
					
			        this.PenetrationGamme = dis.readInt();
					
					this.d2 = readDate(dis);
					
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
				
		            	dos.writeLong(this.id_produit);
					
					// long
				
		            	dos.writeLong(this.id_secteur);
					
					// int
				
		            	dos.writeInt(this.id_temps);
					
					// int
				
		            	dos.writeInt(this.qte_vendu);
					
					// double
				
		            	dos.writeDouble(this.CANTTC);
					
					// double
				
		            	dos.writeDouble(this.Pertes);
					
					// int
				
		            	dos.writeInt(this.Volume_Total);
					
					// double
				
		            	dos.writeDouble(this.CANHT);
					
					// int
				
		            	dos.writeInt(this.rupture);
					
					// int
				
		            	dos.writeInt(this.Commande_Intelligente);
					
					// int
				
		            	dos.writeInt(this.PenetrationProduit);
					
					// int
				
		            	dos.writeInt(this.PenetrationGamme);
					
					// java.util.Date
				
						writeDate(this.d2,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id_pdv);
					
					// long
				
		            	dos.writeLong(this.id_produit);
					
					// long
				
		            	dos.writeLong(this.id_secteur);
					
					// int
				
		            	dos.writeInt(this.id_temps);
					
					// int
				
		            	dos.writeInt(this.qte_vendu);
					
					// double
				
		            	dos.writeDouble(this.CANTTC);
					
					// double
				
		            	dos.writeDouble(this.Pertes);
					
					// int
				
		            	dos.writeInt(this.Volume_Total);
					
					// double
				
		            	dos.writeDouble(this.CANHT);
					
					// int
				
		            	dos.writeInt(this.rupture);
					
					// int
				
		            	dos.writeInt(this.Commande_Intelligente);
					
					// int
				
		            	dos.writeInt(this.PenetrationProduit);
					
					// int
				
		            	dos.writeInt(this.PenetrationGamme);
					
					// java.util.Date
				
						writeDate(this.d2,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id_pdv="+String.valueOf(id_pdv));
		sb.append(",id_produit="+String.valueOf(id_produit));
		sb.append(",id_secteur="+String.valueOf(id_secteur));
		sb.append(",id_temps="+String.valueOf(id_temps));
		sb.append(",qte_vendu="+String.valueOf(qte_vendu));
		sb.append(",CANTTC="+String.valueOf(CANTTC));
		sb.append(",Pertes="+String.valueOf(Pertes));
		sb.append(",Volume_Total="+String.valueOf(Volume_Total));
		sb.append(",CANHT="+String.valueOf(CANHT));
		sb.append(",rupture="+String.valueOf(rupture));
		sb.append(",Commande_Intelligente="+String.valueOf(Commande_Intelligente));
		sb.append(",PenetrationProduit="+String.valueOf(PenetrationProduit));
		sb.append(",PenetrationGamme="+String.valueOf(PenetrationGamme));
		sb.append(",d2="+String.valueOf(d2));
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
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[0];

	
			    public java.util.Date d2;

				public java.util.Date getD2 () {
					return this.d2;
				}
				
			    public long id_pdv;

				public long getId_pdv () {
					return this.id_pdv;
				}
				
			    public long id_produit;

				public long getId_produit () {
					return this.id_produit;
				}
				
			    public long id_secteur;

				public long getId_secteur () {
					return this.id_secteur;
				}
				
			    public int qte_vendu;

				public int getQte_vendu () {
					return this.qte_vendu;
				}
				
			    public double CANTTC;

				public double getCANTTC () {
					return this.CANTTC;
				}
				
			    public double Pertes;

				public double getPertes () {
					return this.Pertes;
				}
				
			    public int Volume_Total;

				public int getVolume_Total () {
					return this.Volume_Total;
				}
				
			    public String nompilier;

				public String getNompilier () {
					return this.nompilier;
				}
				
			    public int final_stock;

				public int getFinal_stock () {
					return this.final_stock;
				}
				
			    public String statu;

				public String getStatu () {
					return this.statu;
				}
				
			    public Boolean secours;

				public Boolean getSecours () {
					return this.secours;
				}
				
			    public int Min;

				public int getMin () {
					return this.Min;
				}
				
			    public int Max;

				public int getMax () {
					return this.Max;
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

	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR, 0, length, utf8Charset);
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
			if(length > commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR) {

        	try {

        		int length = 0;
		
					this.d2 = readDate(dis);
					
			        this.id_pdv = dis.readLong();
					
			        this.id_produit = dis.readLong();
					
			        this.id_secteur = dis.readLong();
					
			        this.qte_vendu = dis.readInt();
					
			        this.CANTTC = dis.readDouble();
					
			        this.Pertes = dis.readDouble();
					
			        this.Volume_Total = dis.readInt();
					
					this.nompilier = readString(dis);
					
			        this.final_stock = dis.readInt();
					
					this.statu = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.secours = null;
           				} else {
           			    	this.secours = dis.readBoolean();
           				}
					
			        this.Min = dis.readInt();
					
			        this.Max = dis.readInt();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR) {

        	try {

        		int length = 0;
		
					this.d2 = readDate(dis);
					
			        this.id_pdv = dis.readLong();
					
			        this.id_produit = dis.readLong();
					
			        this.id_secteur = dis.readLong();
					
			        this.qte_vendu = dis.readInt();
					
			        this.CANTTC = dis.readDouble();
					
			        this.Pertes = dis.readDouble();
					
			        this.Volume_Total = dis.readInt();
					
					this.nompilier = readString(dis);
					
			        this.final_stock = dis.readInt();
					
					this.statu = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.secours = null;
           				} else {
           			    	this.secours = dis.readBoolean();
           				}
					
			        this.Min = dis.readInt();
					
			        this.Max = dis.readInt();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// java.util.Date
				
						writeDate(this.d2,dos);
					
					// long
				
		            	dos.writeLong(this.id_pdv);
					
					// long
				
		            	dos.writeLong(this.id_produit);
					
					// long
				
		            	dos.writeLong(this.id_secteur);
					
					// int
				
		            	dos.writeInt(this.qte_vendu);
					
					// double
				
		            	dos.writeDouble(this.CANTTC);
					
					// double
				
		            	dos.writeDouble(this.Pertes);
					
					// int
				
		            	dos.writeInt(this.Volume_Total);
					
					// String
				
						writeString(this.nompilier,dos);
					
					// int
				
		            	dos.writeInt(this.final_stock);
					
					// String
				
						writeString(this.statu,dos);
					
					// Boolean
				
						if(this.secours == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.secours);
		            	}
					
					// int
				
		            	dos.writeInt(this.Min);
					
					// int
				
		            	dos.writeInt(this.Max);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// java.util.Date
				
						writeDate(this.d2,dos);
					
					// long
				
		            	dos.writeLong(this.id_pdv);
					
					// long
				
		            	dos.writeLong(this.id_produit);
					
					// long
				
		            	dos.writeLong(this.id_secteur);
					
					// int
				
		            	dos.writeInt(this.qte_vendu);
					
					// double
				
		            	dos.writeDouble(this.CANTTC);
					
					// double
				
		            	dos.writeDouble(this.Pertes);
					
					// int
				
		            	dos.writeInt(this.Volume_Total);
					
					// String
				
						writeString(this.nompilier,dos);
					
					// int
				
		            	dos.writeInt(this.final_stock);
					
					// String
				
						writeString(this.statu,dos);
					
					// Boolean
				
						if(this.secours == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.secours);
		            	}
					
					// int
				
		            	dos.writeInt(this.Min);
					
					// int
				
		            	dos.writeInt(this.Max);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("d2="+String.valueOf(d2));
		sb.append(",id_pdv="+String.valueOf(id_pdv));
		sb.append(",id_produit="+String.valueOf(id_produit));
		sb.append(",id_secteur="+String.valueOf(id_secteur));
		sb.append(",qte_vendu="+String.valueOf(qte_vendu));
		sb.append(",CANTTC="+String.valueOf(CANTTC));
		sb.append(",Pertes="+String.valueOf(Pertes));
		sb.append(",Volume_Total="+String.valueOf(Volume_Total));
		sb.append(",nompilier="+nompilier);
		sb.append(",final_stock="+String.valueOf(final_stock));
		sb.append(",statu="+statu);
		sb.append(",secours="+String.valueOf(secours));
		sb.append(",Min="+String.valueOf(Min));
		sb.append(",Max="+String.valueOf(Max));
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

public static class out7Struct implements routines.system.IPersistableRow<out7Struct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[0];

	
			    public String name;

				public String getName () {
					return this.name;
				}
				
			    public String qr_code_1;

				public String getQr_code_1 () {
					return this.qr_code_1;
				}
				
			    public String secteur;

				public String getSecteur () {
					return this.secteur;
				}
				
			    public String sku_sage;

				public String getSku_sage () {
					return this.sku_sage;
				}
				
			    public java.util.Date date_Ventes;

				public java.util.Date getDate_Ventes () {
					return this.date_Ventes;
				}
				
			    public int qte_vendu;

				public int getQte_vendu () {
					return this.qte_vendu;
				}
				
			    public double CANTTC;

				public double getCANTTC () {
					return this.CANTTC;
				}
				
			    public double Pertes;

				public double getPertes () {
					return this.Pertes;
				}
				
			    public String nompilier;

				public String getNompilier () {
					return this.nompilier;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR, 0, length, utf8Charset);
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
			if(length > commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR) {

        	try {

        		int length = 0;
		
					this.name = readString(dis);
					
					this.qr_code_1 = readString(dis);
					
					this.secteur = readString(dis);
					
					this.sku_sage = readString(dis);
					
					this.date_Ventes = readDate(dis);
					
			        this.qte_vendu = dis.readInt();
					
			        this.CANTTC = dis.readDouble();
					
			        this.Pertes = dis.readDouble();
					
					this.nompilier = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR) {

        	try {

        		int length = 0;
		
					this.name = readString(dis);
					
					this.qr_code_1 = readString(dis);
					
					this.secteur = readString(dis);
					
					this.sku_sage = readString(dis);
					
					this.date_Ventes = readDate(dis);
					
			        this.qte_vendu = dis.readInt();
					
			        this.CANTTC = dis.readDouble();
					
			        this.Pertes = dis.readDouble();
					
					this.nompilier = readString(dis);
					
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
				
						writeString(this.qr_code_1,dos);
					
					// String
				
						writeString(this.secteur,dos);
					
					// String
				
						writeString(this.sku_sage,dos);
					
					// java.util.Date
				
						writeDate(this.date_Ventes,dos);
					
					// int
				
		            	dos.writeInt(this.qte_vendu);
					
					// double
				
		            	dos.writeDouble(this.CANTTC);
					
					// double
				
		            	dos.writeDouble(this.Pertes);
					
					// String
				
						writeString(this.nompilier,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.name,dos);
					
					// String
				
						writeString(this.qr_code_1,dos);
					
					// String
				
						writeString(this.secteur,dos);
					
					// String
				
						writeString(this.sku_sage,dos);
					
					// java.util.Date
				
						writeDate(this.date_Ventes,dos);
					
					// int
				
		            	dos.writeInt(this.qte_vendu);
					
					// double
				
		            	dos.writeDouble(this.CANTTC);
					
					// double
				
		            	dos.writeDouble(this.Pertes);
					
					// String
				
						writeString(this.nompilier,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("name="+name);
		sb.append(",qr_code_1="+qr_code_1);
		sb.append(",secteur="+secteur);
		sb.append(",sku_sage="+sku_sage);
		sb.append(",date_Ventes="+String.valueOf(date_Ventes));
		sb.append(",qte_vendu="+String.valueOf(qte_vendu));
		sb.append(",CANTTC="+String.valueOf(CANTTC));
		sb.append(",Pertes="+String.valueOf(Pertes));
		sb.append(",nompilier="+nompilier);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(out7Struct other) {

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

public static class lineStruct implements routines.system.IPersistableRow<lineStruct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[0];

	
			    public int sale_qte;

				public int getSale_qte () {
					return this.sale_qte;
				}
				
			    public int final_stock;

				public int getFinal_stock () {
					return this.final_stock;
				}
				
			    public int Min;

				public int getMin () {
					return this.Min;
				}
				
			    public int Max;

				public int getMax () {
					return this.Max;
				}
				
			    public int return_qte;

				public int getReturn_qte () {
					return this.return_qte;
				}
				
			    public long id_produit;

				public long getId_produit () {
					return this.id_produit;
				}
				
			    public String nomproduit;

				public String getNomproduit () {
					return this.nomproduit;
				}
				
			    public String nompilier;

				public String getNompilier () {
					return this.nompilier;
				}
				
			    public Integer Prix_Mali_Guinee;

				public Integer getPrix_Mali_Guinee () {
					return this.Prix_Mali_Guinee;
				}
				
			    public Double Prix__Gambie;

				public Double getPrix__Gambie () {
					return this.Prix__Gambie;
				}
				
			    public Integer price;

				public Integer getPrice () {
					return this.price;
				}
				
			    public Integer prix;

				public Integer getPrix () {
					return this.prix;
				}
				
			    public java.util.Date d2;

				public java.util.Date getD2 () {
					return this.d2;
				}
				
			    public String qr_code;

				public String getQr_code () {
					return this.qr_code;
				}
				
			    public Long catalog_id;

				public Long getCatalog_id () {
					return this.catalog_id;
				}
				
			    public Long sect_id;

				public Long getSect_id () {
					return this.sect_id;
				}
				
			    public String sku_commcare;

				public String getSku_commcare () {
					return this.sku_commcare;
				}
				
			    public String sku_sage;

				public String getSku_sage () {
					return this.sku_sage;
				}
				
			    public Integer volume_unitaire;

				public Integer getVolume_unitaire () {
					return this.volume_unitaire;
				}
				
			    public String name;

				public String getName () {
					return this.name;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR, 0, length, utf8Charset);
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
			if(length > commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR) {

        	try {

        		int length = 0;
		
			        this.sale_qte = dis.readInt();
					
			        this.final_stock = dis.readInt();
					
			        this.Min = dis.readInt();
					
			        this.Max = dis.readInt();
					
			        this.return_qte = dis.readInt();
					
			        this.id_produit = dis.readLong();
					
					this.nomproduit = readString(dis);
					
					this.nompilier = readString(dis);
					
						this.Prix_Mali_Guinee = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.Prix__Gambie = null;
           				} else {
           			    	this.Prix__Gambie = dis.readDouble();
           				}
					
						this.price = readInteger(dis);
					
						this.prix = readInteger(dis);
					
					this.d2 = readDate(dis);
					
					this.qr_code = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.catalog_id = null;
           				} else {
           			    	this.catalog_id = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.sect_id = null;
           				} else {
           			    	this.sect_id = dis.readLong();
           				}
					
					this.sku_commcare = readString(dis);
					
					this.sku_sage = readString(dis);
					
						this.volume_unitaire = readInteger(dis);
					
					this.name = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR) {

        	try {

        		int length = 0;
		
			        this.sale_qte = dis.readInt();
					
			        this.final_stock = dis.readInt();
					
			        this.Min = dis.readInt();
					
			        this.Max = dis.readInt();
					
			        this.return_qte = dis.readInt();
					
			        this.id_produit = dis.readLong();
					
					this.nomproduit = readString(dis);
					
					this.nompilier = readString(dis);
					
						this.Prix_Mali_Guinee = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.Prix__Gambie = null;
           				} else {
           			    	this.Prix__Gambie = dis.readDouble();
           				}
					
						this.price = readInteger(dis);
					
						this.prix = readInteger(dis);
					
					this.d2 = readDate(dis);
					
					this.qr_code = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.catalog_id = null;
           				} else {
           			    	this.catalog_id = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.sect_id = null;
           				} else {
           			    	this.sect_id = dis.readLong();
           				}
					
					this.sku_commcare = readString(dis);
					
					this.sku_sage = readString(dis);
					
						this.volume_unitaire = readInteger(dis);
					
					this.name = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.sale_qte);
					
					// int
				
		            	dos.writeInt(this.final_stock);
					
					// int
				
		            	dos.writeInt(this.Min);
					
					// int
				
		            	dos.writeInt(this.Max);
					
					// int
				
		            	dos.writeInt(this.return_qte);
					
					// long
				
		            	dos.writeLong(this.id_produit);
					
					// String
				
						writeString(this.nomproduit,dos);
					
					// String
				
						writeString(this.nompilier,dos);
					
					// Integer
				
						writeInteger(this.Prix_Mali_Guinee,dos);
					
					// Double
				
						if(this.Prix__Gambie == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.Prix__Gambie);
		            	}
					
					// Integer
				
						writeInteger(this.price,dos);
					
					// Integer
				
						writeInteger(this.prix,dos);
					
					// java.util.Date
				
						writeDate(this.d2,dos);
					
					// String
				
						writeString(this.qr_code,dos);
					
					// Long
				
						if(this.catalog_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.catalog_id);
		            	}
					
					// Long
				
						if(this.sect_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.sect_id);
		            	}
					
					// String
				
						writeString(this.sku_commcare,dos);
					
					// String
				
						writeString(this.sku_sage,dos);
					
					// Integer
				
						writeInteger(this.volume_unitaire,dos);
					
					// String
				
						writeString(this.name,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.sale_qte);
					
					// int
				
		            	dos.writeInt(this.final_stock);
					
					// int
				
		            	dos.writeInt(this.Min);
					
					// int
				
		            	dos.writeInt(this.Max);
					
					// int
				
		            	dos.writeInt(this.return_qte);
					
					// long
				
		            	dos.writeLong(this.id_produit);
					
					// String
				
						writeString(this.nomproduit,dos);
					
					// String
				
						writeString(this.nompilier,dos);
					
					// Integer
				
						writeInteger(this.Prix_Mali_Guinee,dos);
					
					// Double
				
						if(this.Prix__Gambie == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.Prix__Gambie);
		            	}
					
					// Integer
				
						writeInteger(this.price,dos);
					
					// Integer
				
						writeInteger(this.prix,dos);
					
					// java.util.Date
				
						writeDate(this.d2,dos);
					
					// String
				
						writeString(this.qr_code,dos);
					
					// Long
				
						if(this.catalog_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.catalog_id);
		            	}
					
					// Long
				
						if(this.sect_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.sect_id);
		            	}
					
					// String
				
						writeString(this.sku_commcare,dos);
					
					// String
				
						writeString(this.sku_sage,dos);
					
					// Integer
				
						writeInteger(this.volume_unitaire,dos);
					
					// String
				
						writeString(this.name,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("sale_qte="+String.valueOf(sale_qte));
		sb.append(",final_stock="+String.valueOf(final_stock));
		sb.append(",Min="+String.valueOf(Min));
		sb.append(",Max="+String.valueOf(Max));
		sb.append(",return_qte="+String.valueOf(return_qte));
		sb.append(",id_produit="+String.valueOf(id_produit));
		sb.append(",nomproduit="+nomproduit);
		sb.append(",nompilier="+nompilier);
		sb.append(",Prix_Mali_Guinee="+String.valueOf(Prix_Mali_Guinee));
		sb.append(",Prix__Gambie="+String.valueOf(Prix__Gambie));
		sb.append(",price="+String.valueOf(price));
		sb.append(",prix="+String.valueOf(prix));
		sb.append(",d2="+String.valueOf(d2));
		sb.append(",qr_code="+qr_code);
		sb.append(",catalog_id="+String.valueOf(catalog_id));
		sb.append(",sect_id="+String.valueOf(sect_id));
		sb.append(",sku_commcare="+sku_commcare);
		sb.append(",sku_sage="+sku_sage);
		sb.append(",volume_unitaire="+String.valueOf(volume_unitaire));
		sb.append(",name="+name);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(lineStruct other) {

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
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[0];

	
			    public java.util.Date d2;

				public java.util.Date getD2 () {
					return this.d2;
				}
				
			    public Integer sale_qte;

				public Integer getSale_qte () {
					return this.sale_qte;
				}
				
			    public Integer final_stock;

				public Integer getFinal_stock () {
					return this.final_stock;
				}
				
			    public Integer rotation;

				public Integer getRotation () {
					return this.rotation;
				}
				
			    public Integer remaning;

				public Integer getRemaning () {
					return this.remaning;
				}
				
			    public Integer price_total;

				public Integer getPrice_total () {
					return this.price_total;
				}
				
			    public Integer max;

				public Integer getMax () {
					return this.max;
				}
				
			    public Integer min;

				public Integer getMin () {
					return this.min;
				}
				
			    public Integer rotation_today;

				public Integer getRotation_today () {
					return this.rotation_today;
				}
				
			    public String name;

				public String getName () {
					return this.name;
				}
				
			    public String qr_code;

				public String getQr_code () {
					return this.qr_code;
				}
				
			    public Long catalog_id;

				public Long getCatalog_id () {
					return this.catalog_id;
				}
				
			    public Boolean gs;

				public Boolean getGs () {
					return this.gs;
				}
				
			    public Integer price;

				public Integer getPrice () {
					return this.price;
				}
				
			    public String cluster;

				public String getCluster () {
					return this.cluster;
				}
				
			    public Integer prix;

				public Integer getPrix () {
					return this.prix;
				}
				
			    public String sku_commcare;

				public String getSku_commcare () {
					return this.sku_commcare;
				}
				
			    public String sku_sage;

				public String getSku_sage () {
					return this.sku_sage;
				}
				
			    public String label;

				public String getLabel () {
					return this.label;
				}
				
			    public Integer ini_qte;

				public Integer getIni_qte () {
					return this.ini_qte;
				}
				
			    public Integer return_qte;

				public Integer getReturn_qte () {
					return this.return_qte;
				}
				
			    public Long sect_id;

				public Long getSect_id () {
					return this.sect_id;
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

	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR, 0, length, utf8Charset);
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
			if(length > commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR) {

        	try {

        		int length = 0;
		
					this.d2 = readDate(dis);
					
						this.sale_qte = readInteger(dis);
					
						this.final_stock = readInteger(dis);
					
						this.rotation = readInteger(dis);
					
						this.remaning = readInteger(dis);
					
						this.price_total = readInteger(dis);
					
						this.max = readInteger(dis);
					
						this.min = readInteger(dis);
					
						this.rotation_today = readInteger(dis);
					
					this.name = readString(dis);
					
					this.qr_code = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.catalog_id = null;
           				} else {
           			    	this.catalog_id = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.gs = null;
           				} else {
           			    	this.gs = dis.readBoolean();
           				}
					
						this.price = readInteger(dis);
					
					this.cluster = readString(dis);
					
						this.prix = readInteger(dis);
					
					this.sku_commcare = readString(dis);
					
					this.sku_sage = readString(dis);
					
					this.label = readString(dis);
					
						this.ini_qte = readInteger(dis);
					
						this.return_qte = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.sect_id = null;
           				} else {
           			    	this.sect_id = dis.readLong();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR) {

        	try {

        		int length = 0;
		
					this.d2 = readDate(dis);
					
						this.sale_qte = readInteger(dis);
					
						this.final_stock = readInteger(dis);
					
						this.rotation = readInteger(dis);
					
						this.remaning = readInteger(dis);
					
						this.price_total = readInteger(dis);
					
						this.max = readInteger(dis);
					
						this.min = readInteger(dis);
					
						this.rotation_today = readInteger(dis);
					
					this.name = readString(dis);
					
					this.qr_code = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.catalog_id = null;
           				} else {
           			    	this.catalog_id = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.gs = null;
           				} else {
           			    	this.gs = dis.readBoolean();
           				}
					
						this.price = readInteger(dis);
					
					this.cluster = readString(dis);
					
						this.prix = readInteger(dis);
					
					this.sku_commcare = readString(dis);
					
					this.sku_sage = readString(dis);
					
					this.label = readString(dis);
					
						this.ini_qte = readInteger(dis);
					
						this.return_qte = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.sect_id = null;
           				} else {
           			    	this.sect_id = dis.readLong();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// java.util.Date
				
						writeDate(this.d2,dos);
					
					// Integer
				
						writeInteger(this.sale_qte,dos);
					
					// Integer
				
						writeInteger(this.final_stock,dos);
					
					// Integer
				
						writeInteger(this.rotation,dos);
					
					// Integer
				
						writeInteger(this.remaning,dos);
					
					// Integer
				
						writeInteger(this.price_total,dos);
					
					// Integer
				
						writeInteger(this.max,dos);
					
					// Integer
				
						writeInteger(this.min,dos);
					
					// Integer
				
						writeInteger(this.rotation_today,dos);
					
					// String
				
						writeString(this.name,dos);
					
					// String
				
						writeString(this.qr_code,dos);
					
					// Long
				
						if(this.catalog_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.catalog_id);
		            	}
					
					// Boolean
				
						if(this.gs == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.gs);
		            	}
					
					// Integer
				
						writeInteger(this.price,dos);
					
					// String
				
						writeString(this.cluster,dos);
					
					// Integer
				
						writeInteger(this.prix,dos);
					
					// String
				
						writeString(this.sku_commcare,dos);
					
					// String
				
						writeString(this.sku_sage,dos);
					
					// String
				
						writeString(this.label,dos);
					
					// Integer
				
						writeInteger(this.ini_qte,dos);
					
					// Integer
				
						writeInteger(this.return_qte,dos);
					
					// Long
				
						if(this.sect_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.sect_id);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// java.util.Date
				
						writeDate(this.d2,dos);
					
					// Integer
				
						writeInteger(this.sale_qte,dos);
					
					// Integer
				
						writeInteger(this.final_stock,dos);
					
					// Integer
				
						writeInteger(this.rotation,dos);
					
					// Integer
				
						writeInteger(this.remaning,dos);
					
					// Integer
				
						writeInteger(this.price_total,dos);
					
					// Integer
				
						writeInteger(this.max,dos);
					
					// Integer
				
						writeInteger(this.min,dos);
					
					// Integer
				
						writeInteger(this.rotation_today,dos);
					
					// String
				
						writeString(this.name,dos);
					
					// String
				
						writeString(this.qr_code,dos);
					
					// Long
				
						if(this.catalog_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.catalog_id);
		            	}
					
					// Boolean
				
						if(this.gs == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.gs);
		            	}
					
					// Integer
				
						writeInteger(this.price,dos);
					
					// String
				
						writeString(this.cluster,dos);
					
					// Integer
				
						writeInteger(this.prix,dos);
					
					// String
				
						writeString(this.sku_commcare,dos);
					
					// String
				
						writeString(this.sku_sage,dos);
					
					// String
				
						writeString(this.label,dos);
					
					// Integer
				
						writeInteger(this.ini_qte,dos);
					
					// Integer
				
						writeInteger(this.return_qte,dos);
					
					// Long
				
						if(this.sect_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.sect_id);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("d2="+String.valueOf(d2));
		sb.append(",sale_qte="+String.valueOf(sale_qte));
		sb.append(",final_stock="+String.valueOf(final_stock));
		sb.append(",rotation="+String.valueOf(rotation));
		sb.append(",remaning="+String.valueOf(remaning));
		sb.append(",price_total="+String.valueOf(price_total));
		sb.append(",max="+String.valueOf(max));
		sb.append(",min="+String.valueOf(min));
		sb.append(",rotation_today="+String.valueOf(rotation_today));
		sb.append(",name="+name);
		sb.append(",qr_code="+qr_code);
		sb.append(",catalog_id="+String.valueOf(catalog_id));
		sb.append(",gs="+String.valueOf(gs));
		sb.append(",price="+String.valueOf(price));
		sb.append(",cluster="+cluster);
		sb.append(",prix="+String.valueOf(prix));
		sb.append(",sku_commcare="+sku_commcare);
		sb.append(",sku_sage="+sku_sage);
		sb.append(",label="+label);
		sb.append(",ini_qte="+String.valueOf(ini_qte));
		sb.append(",return_qte="+String.valueOf(return_qte));
		sb.append(",sect_id="+String.valueOf(sect_id));
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
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[0];

	
			    public java.util.Date d2;

				public java.util.Date getD2 () {
					return this.d2;
				}
				
			    public Integer sale_qte;

				public Integer getSale_qte () {
					return this.sale_qte;
				}
				
			    public Integer final_stock;

				public Integer getFinal_stock () {
					return this.final_stock;
				}
				
			    public Integer rotation;

				public Integer getRotation () {
					return this.rotation;
				}
				
			    public Integer remaning;

				public Integer getRemaning () {
					return this.remaning;
				}
				
			    public Integer price_total;

				public Integer getPrice_total () {
					return this.price_total;
				}
				
			    public Integer max;

				public Integer getMax () {
					return this.max;
				}
				
			    public Integer min;

				public Integer getMin () {
					return this.min;
				}
				
			    public Integer rotation_today;

				public Integer getRotation_today () {
					return this.rotation_today;
				}
				
			    public String name;

				public String getName () {
					return this.name;
				}
				
			    public String qr_code;

				public String getQr_code () {
					return this.qr_code;
				}
				
			    public Long catalog_id;

				public Long getCatalog_id () {
					return this.catalog_id;
				}
				
			    public Boolean gs;

				public Boolean getGs () {
					return this.gs;
				}
				
			    public Integer price;

				public Integer getPrice () {
					return this.price;
				}
				
			    public String cluster;

				public String getCluster () {
					return this.cluster;
				}
				
			    public Integer prix;

				public Integer getPrix () {
					return this.prix;
				}
				
			    public String sku_commcare;

				public String getSku_commcare () {
					return this.sku_commcare;
				}
				
			    public String sku_sage;

				public String getSku_sage () {
					return this.sku_sage;
				}
				
			    public String label;

				public String getLabel () {
					return this.label;
				}
				
			    public Integer ini_qte;

				public Integer getIni_qte () {
					return this.ini_qte;
				}
				
			    public Integer return_qte;

				public Integer getReturn_qte () {
					return this.return_qte;
				}
				
			    public Long sect_id;

				public Long getSect_id () {
					return this.sect_id;
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

	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR, 0, length, utf8Charset);
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
			if(length > commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR) {

        	try {

        		int length = 0;
		
					this.d2 = readDate(dis);
					
						this.sale_qte = readInteger(dis);
					
						this.final_stock = readInteger(dis);
					
						this.rotation = readInteger(dis);
					
						this.remaning = readInteger(dis);
					
						this.price_total = readInteger(dis);
					
						this.max = readInteger(dis);
					
						this.min = readInteger(dis);
					
						this.rotation_today = readInteger(dis);
					
					this.name = readString(dis);
					
					this.qr_code = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.catalog_id = null;
           				} else {
           			    	this.catalog_id = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.gs = null;
           				} else {
           			    	this.gs = dis.readBoolean();
           				}
					
						this.price = readInteger(dis);
					
					this.cluster = readString(dis);
					
						this.prix = readInteger(dis);
					
					this.sku_commcare = readString(dis);
					
					this.sku_sage = readString(dis);
					
					this.label = readString(dis);
					
						this.ini_qte = readInteger(dis);
					
						this.return_qte = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.sect_id = null;
           				} else {
           			    	this.sect_id = dis.readLong();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR) {

        	try {

        		int length = 0;
		
					this.d2 = readDate(dis);
					
						this.sale_qte = readInteger(dis);
					
						this.final_stock = readInteger(dis);
					
						this.rotation = readInteger(dis);
					
						this.remaning = readInteger(dis);
					
						this.price_total = readInteger(dis);
					
						this.max = readInteger(dis);
					
						this.min = readInteger(dis);
					
						this.rotation_today = readInteger(dis);
					
					this.name = readString(dis);
					
					this.qr_code = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.catalog_id = null;
           				} else {
           			    	this.catalog_id = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.gs = null;
           				} else {
           			    	this.gs = dis.readBoolean();
           				}
					
						this.price = readInteger(dis);
					
					this.cluster = readString(dis);
					
						this.prix = readInteger(dis);
					
					this.sku_commcare = readString(dis);
					
					this.sku_sage = readString(dis);
					
					this.label = readString(dis);
					
						this.ini_qte = readInteger(dis);
					
						this.return_qte = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.sect_id = null;
           				} else {
           			    	this.sect_id = dis.readLong();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// java.util.Date
				
						writeDate(this.d2,dos);
					
					// Integer
				
						writeInteger(this.sale_qte,dos);
					
					// Integer
				
						writeInteger(this.final_stock,dos);
					
					// Integer
				
						writeInteger(this.rotation,dos);
					
					// Integer
				
						writeInteger(this.remaning,dos);
					
					// Integer
				
						writeInteger(this.price_total,dos);
					
					// Integer
				
						writeInteger(this.max,dos);
					
					// Integer
				
						writeInteger(this.min,dos);
					
					// Integer
				
						writeInteger(this.rotation_today,dos);
					
					// String
				
						writeString(this.name,dos);
					
					// String
				
						writeString(this.qr_code,dos);
					
					// Long
				
						if(this.catalog_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.catalog_id);
		            	}
					
					// Boolean
				
						if(this.gs == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.gs);
		            	}
					
					// Integer
				
						writeInteger(this.price,dos);
					
					// String
				
						writeString(this.cluster,dos);
					
					// Integer
				
						writeInteger(this.prix,dos);
					
					// String
				
						writeString(this.sku_commcare,dos);
					
					// String
				
						writeString(this.sku_sage,dos);
					
					// String
				
						writeString(this.label,dos);
					
					// Integer
				
						writeInteger(this.ini_qte,dos);
					
					// Integer
				
						writeInteger(this.return_qte,dos);
					
					// Long
				
						if(this.sect_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.sect_id);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// java.util.Date
				
						writeDate(this.d2,dos);
					
					// Integer
				
						writeInteger(this.sale_qte,dos);
					
					// Integer
				
						writeInteger(this.final_stock,dos);
					
					// Integer
				
						writeInteger(this.rotation,dos);
					
					// Integer
				
						writeInteger(this.remaning,dos);
					
					// Integer
				
						writeInteger(this.price_total,dos);
					
					// Integer
				
						writeInteger(this.max,dos);
					
					// Integer
				
						writeInteger(this.min,dos);
					
					// Integer
				
						writeInteger(this.rotation_today,dos);
					
					// String
				
						writeString(this.name,dos);
					
					// String
				
						writeString(this.qr_code,dos);
					
					// Long
				
						if(this.catalog_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.catalog_id);
		            	}
					
					// Boolean
				
						if(this.gs == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.gs);
		            	}
					
					// Integer
				
						writeInteger(this.price,dos);
					
					// String
				
						writeString(this.cluster,dos);
					
					// Integer
				
						writeInteger(this.prix,dos);
					
					// String
				
						writeString(this.sku_commcare,dos);
					
					// String
				
						writeString(this.sku_sage,dos);
					
					// String
				
						writeString(this.label,dos);
					
					// Integer
				
						writeInteger(this.ini_qte,dos);
					
					// Integer
				
						writeInteger(this.return_qte,dos);
					
					// Long
				
						if(this.sect_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.sect_id);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("d2="+String.valueOf(d2));
		sb.append(",sale_qte="+String.valueOf(sale_qte));
		sb.append(",final_stock="+String.valueOf(final_stock));
		sb.append(",rotation="+String.valueOf(rotation));
		sb.append(",remaning="+String.valueOf(remaning));
		sb.append(",price_total="+String.valueOf(price_total));
		sb.append(",max="+String.valueOf(max));
		sb.append(",min="+String.valueOf(min));
		sb.append(",rotation_today="+String.valueOf(rotation_today));
		sb.append(",name="+name);
		sb.append(",qr_code="+qr_code);
		sb.append(",catalog_id="+String.valueOf(catalog_id));
		sb.append(",gs="+String.valueOf(gs));
		sb.append(",price="+String.valueOf(price));
		sb.append(",cluster="+cluster);
		sb.append(",prix="+String.valueOf(prix));
		sb.append(",sku_commcare="+sku_commcare);
		sb.append(",sku_sage="+sku_sage);
		sb.append(",label="+label);
		sb.append(",ini_qte="+String.valueOf(ini_qte));
		sb.append(",return_qte="+String.valueOf(return_qte));
		sb.append(",sect_id="+String.valueOf(sect_id));
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
		tDBInput_3Process(globalMap);
		tDBInput_4Process(globalMap);
		tDBInput_5Process(globalMap);
		tDBInput_6Process(globalMap);
		tDBInput_7Process(globalMap);
		tDBInput_9Process(globalMap);
		tDBInput_8Process(globalMap);
		tDBInput_10Process(globalMap);

		row1Struct row1 = new row1Struct();
lineStruct line = new lineStruct();
out1Struct out1 = new out1Struct();
out2Struct out2 = new out2Struct();
row7Struct row7 = new row7Struct();
out6Struct out6 = new out6Struct();
out5Struct out5 = new out5Struct();
out3Struct out3 = new out3Struct();
out4Struct out4 = new out4Struct();
out7Struct out7 = new out7Struct();
out8Struct out8 = new out8Struct();







	
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

		if(this.d2 == null && other.d2 != null){
			return -1;
						
		}else if(this.d2 != null && other.d2 == null){
			return 1;
						
		}else if(this.d2 != null && other.d2 != null){
			if(!this.d2.equals(other.d2)){
				return this.d2.compareTo(other.d2);
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
	 * [tMap_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_3", false);
		start_Hash.put("tMap_3", System.currentTimeMillis());
		
	
	currentComponent="tMap_3";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"out1");
					}
				
		int tos_count_tMap_3 = 0;
		




// ###############################
// # Lookup's keys initialization
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row6Struct> tHash_Lookup_row6 = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row6Struct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row6Struct>) 
					globalMap.get( "tHash_Lookup_row6" ))
					;					
					
	

row6Struct row6HashKey = new row6Struct();
row6Struct row6Default = new row6Struct();
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_3__Struct  {
	double CANHT;
	int rupture;
	int Commande_Intelligente;
	int PenetrationProduit;
	int PenetrationGamme;
}
Var__tMap_3__Struct Var__tMap_3 = new Var__tMap_3__Struct();
// ###############################

// ###############################
// # Outputs initialization
out2Struct out2_tmp = new out2Struct();
// ###############################

        
        



        









 



/**
 * [tMap_3 begin ] stop
 */





	
	/**
	 * [tLogRow_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tLogRow_1", false);
		start_Hash.put("tLogRow_1", System.currentTimeMillis());
		
	
	currentComponent="tLogRow_1";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"out8");
					}
				
		int tos_count_tLogRow_1 = 0;
		

	///////////////////////
	
         class Util_tLogRow_1 {

        String[] des_top = { ".", ".", "-", "+" };

        String[] des_head = { "|=", "=|", "-", "+" };

        String[] des_bottom = { "'", "'", "-", "+" };

        String name="";

        java.util.List<String[]> list = new java.util.ArrayList<String[]>();

        int[] colLengths = new int[10];

        public void addRow(String[] row) {

            for (int i = 0; i < 10; i++) {
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
                    for (k = 0; k < (totals + 9 - name.length()) / 2; k++) {
                        sb.append(' ');
                    }
                    sb.append(name);
                    for (int i = 0; i < totals + 9 - name.length() - k; i++) {
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
        			              
        			        sbformat.append("|%8$-");
        			        sbformat.append(colLengths[7]);
        			        sbformat.append("s");
        			              
        			        sbformat.append("|%9$-");
        			        sbformat.append(colLengths[8]);
        			        sbformat.append("s");
        			              
        			        sbformat.append("|%10$-");
        			        sbformat.append(colLengths[9]);
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
                    for (int i = 0; i < colLengths[6] - fillChars[3].length() + 1; i++) {
                        sb.append(fillChars[2]);
                    }
                    sb.append(fillChars[3]);
                    for (int i = 0; i < colLengths[7] - fillChars[3].length() + 1; i++) {
                        sb.append(fillChars[2]);
                    }
                    sb.append(fillChars[3]);
                    for (int i = 0; i < colLengths[8] - fillChars[3].length() + 1; i++) {
                        sb.append(fillChars[2]);
                    }
                    sb.append(fillChars[3]);
                
                    //last column
                    for (int i = 0; i < colLengths[9] - fillChars[1].length() + 1; i++) {
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
        util_tLogRow_1.setTableName("Donnees Rejeté");
        util_tLogRow_1.addRow(new String[]{"name","address_1","qr_code_1","secteur","sku_sage","date_Ventes","qte_vendu","CANTTC","Pertes","nompilier",});        
 		StringBuilder strBuffer_tLogRow_1 = null;
		int nb_line_tLogRow_1 = 0;
///////////////////////    			



 



/**
 * [tLogRow_1 begin ] stop
 */



	
	/**
	 * [tMap_7 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_7", false);
		start_Hash.put("tMap_7", System.currentTimeMillis());
		
	
	currentComponent="tMap_7";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"out7");
					}
				
		int tos_count_tMap_7 = 0;
		




// ###############################
// # Lookup's keys initialization
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row11Struct> tHash_Lookup_row11 = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row11Struct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row11Struct>) 
					globalMap.get( "tHash_Lookup_row11" ))
					;					
					
	

row11Struct row11HashKey = new row11Struct();
row11Struct row11Default = new row11Struct();
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_7__Struct  {
}
Var__tMap_7__Struct Var__tMap_7 = new Var__tMap_7__Struct();
// ###############################

// ###############################
// # Outputs initialization
out8Struct out8_tmp = new out8Struct();
// ###############################

        
        



        









 



/**
 * [tMap_7 begin ] stop
 */



	
	/**
	 * [tMap_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_2", false);
		start_Hash.put("tMap_2", System.currentTimeMillis());
		
	
	currentComponent="tMap_2";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"line");
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
	int qte_vendu;
	double CANTTC;
	double Pertes;
	int Volume_Total;
	boolean var1;
}
Var__tMap_2__Struct Var__tMap_2 = new Var__tMap_2__Struct();
// ###############################

// ###############################
// # Outputs initialization
out1Struct out1_tmp = new out1Struct();
out7Struct out7_tmp = new out7Struct();
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
	int sale_qte;
	int final_stock;
	int Min;
	int Max;
	int return_qte;
}
Var__tMap_1__Struct Var__tMap_1 = new Var__tMap_1__Struct();
// ###############################

// ###############################
// # Outputs initialization
lineStruct line_tmp = new lineStruct();
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
				
				 
	final String decryptedPassword_tDBInput_1 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:OxAPfvgGiujzqZisJXBjldVbC1Y2Q7N12rHPugklWYQ2H2QjXiAV9UNn");
				
				String dbPwd_tDBInput_1 = decryptedPassword_tDBInput_1;
				
				String url_tDBInput_1 = "jdbc:postgresql://" + "leuk.laiterieduberger.sn" + ":" + "5432" + "/" + "leuk_webapp_production";
				
				conn_tDBInput_1 = java.sql.DriverManager.getConnection(url_tDBInput_1,dbUser_tDBInput_1,dbPwd_tDBInput_1);
		        
				conn_tDBInput_1.setAutoCommit(false);
			
		    
			java.sql.Statement stmt_tDBInput_1 = conn_tDBInput_1.createStatement();

		    String dbquery_tDBInput_1 = "SELECT \n\npos.d2,\n    COALESCE(sales.sale_qte, 0) - COALESCE(pped.pped, 0::bigint) - COALESCE(us.quantity::bigint, 0:"
+":bigint) AS sale_qte,\n    COALESCE(sales.final_stock, 0) AS final_stock,\n    COALESCE(sales.rotation, 0) AS rotation,"
+"\n    COALESCE(sales.remaning, 0) AS remaning,\n    COALESCE(sales.price_total, 0::double precision) AS price_total,\n   "
+" COALESCE(sales.max, 0) AS max,\n    COALESCE(sales.min, 0) AS min,\n    COALESCE(sales.rotation_today, 0) AS rotation_t"
+"oday,\n    pos.name,\n    pos.qr_code,\n    pos.catalog_id,\n    pos.golden_shop,\n    pos.price,\n    c.cluster,\n    p"
+"os.prix,\n    pos.sku_commcare,\n    pos.sku_sage,\n    st.label,\n    COALESCE(init.quantity, 0) AS ini_qte,\n    COALE"
+"SCE(declass.quantity, 0) AS return_qte,\n    st.id AS sect_id\n   FROM ( SELECT p.id AS p2,\n            p.sku_sage,\n  "
+"          p.sku_commcare,\n            calendrier.date AS d2,\n            pos_1.id AS pos_id,\n            pos_1.zone_i"
+"d,\n            pos_1.cluster_id,\n            pos_1.name,\n            pos_1.catalog_id,\n            p.price,\n       "
+"     cp.price AS prix,\n            pos_1.qr_code,\n            pos_1.golden_shop,\n            pos_1.sector_id\n       "
+"    FROM products p\n             CROSS JOIN calendrier('2020-10-01'::date, CURRENT_DATE) calendrier(date)\n            "
+" CROSS JOIN point_of_sales pos_1\n             JOIN catalog_products cp ON cp.catalog_id = pos_1.catalog_id AND cp.produ"
+"ct_id = p.id) pos\n     LEFT JOIN ( SELECT s.point_of_sale_id,\n            COALESCE(t.date, s.date) AS date,\n         "
+"   s.sector_id,\n           \n            p.product_id,\n            p.quantity AS sale_qte,\n            p.final_stock,"
+"\n            p.rotation,\n            p.remaning,\n            p.price_total,\n            p.max,\n            p.min,\n"
+"            p.rotation_today\n           FROM sales s\n             JOIN sale_products p ON s.id = p.sale_id\n          "
+"   LEFT JOIN tournees t ON t.id = s.tournee_id\n          WHERE s.date >= '2020-10-01'::date AND s.date <= CURRENT_DATE)"
+" sales ON sales.point_of_sale_id = pos.pos_id AND pos.d2 = sales.date AND pos.p2 = sales.product_id\n     LEFT JOIN ( SE"
+"LECT initialstocks.product_id,\n            initialstocks.point_of_sale_id,\n            initialstocks.quantity,\n      "
+"      initialstocks.date\n           FROM initialstocks\n          WHERE initialstocks.date >= '2020-10-01'::date AND in"
+"itialstocks.date <= CURRENT_DATE) init ON init.point_of_sale_id = pos.pos_id AND pos.d2 = init.date AND pos.p2 = init.pr"
+"oduct_id\n     LEFT JOIN ( SELECT return_products.date,\n            return_products.quantity,\n            return_produ"
+"cts.product_id,\n            return_products.point_of_sale_id\n           FROM return_products\n          WHERE return_p"
+"roducts.date >= '2020-10-01'::date AND return_products.date <= CURRENT_DATE AND return_products.return_type::text = 'dec"
+"lass'::text) declass ON declass.point_of_sale_id = pos.pos_id AND pos.d2 = declass.date AND pos.p2 = declass.product_id"
+"\n     LEFT JOIN ( SELECT return_products.date,\n            sum(return_products.quantity) AS pped,\n            return_p"
+"roducts.product_id,\n            return_products.point_of_sale_id\n           FROM return_products\n          WHERE retu"
+"rn_products.date >= '2020-10-01'::date AND return_products.date <= CURRENT_DATE AND return_products.return_type::text <>"
+" 'declass'::text\n          GROUP BY return_products.date, return_products.product_id, return_products.point_of_sale_id)"
+" pped ON pped.point_of_sale_id = pos.pos_id AND pos.d2 = pped.date AND pos.p2 = pped.product_id\n     LEFT JOIN ( SELECT"
+" unsolds.date,\n            unsolds.quantity,\n            unsolds.product_id,\n            unsolds.point_of_sale_id\n  "
+"         FROM unsolds\n          WHERE unsolds.date >= '2020-10-01'::date AND unsolds.date <= CURRENT_DATE) us ON us.poi"
+"nt_of_sale_id = pos.pos_id AND pos.d2 = us.date AND pos.p2 = us.product_id\n     JOIN sectors st ON st.id = sales.sector"
+"_id\n     JOIN clusters c ON c.id = pos.cluster_id\n  WHERE (COALESCE(us.quantity::bigint, 0::bigint) + COALESCE(sales.s"
+"ale_qte, 0) + COALESCE(pped.pped, 0::bigint) + COALESCE(init.quantity, 0) + COALESCE(declass.quantity, 0)) <> 0\nand d2 "
+" BETWEEN   CURRENT_DATE - INTERVAL '2 DAY' AND CURRENT_DATE - INTERVAL '1 DAY'\norder by d2 asc";
		    

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
								row1.d2 = null;
							} else {
										
			row1.d2 = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 1);
		                    }
							if(colQtyInRs_tDBInput_1 < 2) {
								row1.sale_qte = null;
							} else {
		                          
            row1.sale_qte = rs_tDBInput_1.getInt(2);
            if(rs_tDBInput_1.wasNull()){
                    row1.sale_qte = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 3) {
								row1.final_stock = null;
							} else {
		                          
            row1.final_stock = rs_tDBInput_1.getInt(3);
            if(rs_tDBInput_1.wasNull()){
                    row1.final_stock = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 4) {
								row1.rotation = null;
							} else {
		                          
            row1.rotation = rs_tDBInput_1.getInt(4);
            if(rs_tDBInput_1.wasNull()){
                    row1.rotation = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 5) {
								row1.remaning = null;
							} else {
		                          
            row1.remaning = rs_tDBInput_1.getInt(5);
            if(rs_tDBInput_1.wasNull()){
                    row1.remaning = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 6) {
								row1.price_total = null;
							} else {
		                          
            row1.price_total = rs_tDBInput_1.getInt(6);
            if(rs_tDBInput_1.wasNull()){
                    row1.price_total = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 7) {
								row1.max = null;
							} else {
		                          
            row1.max = rs_tDBInput_1.getInt(7);
            if(rs_tDBInput_1.wasNull()){
                    row1.max = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 8) {
								row1.min = null;
							} else {
		                          
            row1.min = rs_tDBInput_1.getInt(8);
            if(rs_tDBInput_1.wasNull()){
                    row1.min = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 9) {
								row1.rotation_today = null;
							} else {
		                          
            row1.rotation_today = rs_tDBInput_1.getInt(9);
            if(rs_tDBInput_1.wasNull()){
                    row1.rotation_today = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 10) {
								row1.name = null;
							} else {
	                         		
        	row1.name = routines.system.JDBCUtil.getString(rs_tDBInput_1, 10, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 11) {
								row1.qr_code = null;
							} else {
	                         		
        	row1.qr_code = routines.system.JDBCUtil.getString(rs_tDBInput_1, 11, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 12) {
								row1.catalog_id = null;
							} else {
		                          
            row1.catalog_id = rs_tDBInput_1.getLong(12);
            if(rs_tDBInput_1.wasNull()){
                    row1.catalog_id = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 13) {
								row1.gs = null;
							} else {
	                         		
            row1.gs = rs_tDBInput_1.getBoolean(13);
            if(rs_tDBInput_1.wasNull()){
                    row1.gs = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 14) {
								row1.price = null;
							} else {
		                          
            row1.price = rs_tDBInput_1.getInt(14);
            if(rs_tDBInput_1.wasNull()){
                    row1.price = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 15) {
								row1.cluster = null;
							} else {
	                         		
        	row1.cluster = routines.system.JDBCUtil.getString(rs_tDBInput_1, 15, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 16) {
								row1.prix = null;
							} else {
		                          
            row1.prix = rs_tDBInput_1.getInt(16);
            if(rs_tDBInput_1.wasNull()){
                    row1.prix = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 17) {
								row1.sku_commcare = null;
							} else {
	                         		
        	row1.sku_commcare = routines.system.JDBCUtil.getString(rs_tDBInput_1, 17, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 18) {
								row1.sku_sage = null;
							} else {
	                         		
        	row1.sku_sage = routines.system.JDBCUtil.getString(rs_tDBInput_1, 18, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 19) {
								row1.label = null;
							} else {
	                         		
        	row1.label = routines.system.JDBCUtil.getString(rs_tDBInput_1, 19, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 20) {
								row1.ini_qte = null;
							} else {
		                          
            row1.ini_qte = rs_tDBInput_1.getInt(20);
            if(rs_tDBInput_1.wasNull()){
                    row1.ini_qte = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 21) {
								row1.return_qte = null;
							} else {
		                          
            row1.return_qte = rs_tDBInput_1.getInt(21);
            if(rs_tDBInput_1.wasNull()){
                    row1.return_qte = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 22) {
								row1.sect_id = null;
							} else {
		                          
            row1.sect_id = rs_tDBInput_1.getLong(22);
            if(rs_tDBInput_1.wasNull()){
                    row1.sect_id = null;
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
								
                        		    		    row2HashKey.sku_commcare = row1.sku_commcare ;
                        		    		

								
		                        	row2HashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_row2.lookup( row2HashKey );

	  							

	  							

 								
								  
								  if(!tHash_Lookup_row2.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_1 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row2 != null && tHash_Lookup_row2.getCount(row2HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row2' and it contains more one result from keys :  row2.sku_commcare = '" + row2HashKey.sku_commcare + "'");
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
								
                        		    		    row3HashKey.produits = row1.sku_sage ;
                        		    		

								
		                        	row3HashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_row3.lookup( row3HashKey );

	  							

	  							

 								
								  
								  if(!tHash_Lookup_row3.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_1 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row3 != null && tHash_Lookup_row3.getCount(row3HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row3' and it contains more one result from keys :  row3.produits = '" + row3HashKey.produits + "'");
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
        
Var__tMap_1__Struct Var = Var__tMap_1;
Var.sale_qte = row1.sale_qte != null ? row1.sale_qte : 0 ;
Var.final_stock = row1.final_stock != null ? row1.final_stock : 0 ;
Var.Min = row1.min != null ? row1.min : 0 ;
Var.Max = row1.max != null ? row1.max : 0 ;
Var.return_qte = row1.return_qte != null ? row1.return_qte : 0 ;// ###############################
        // ###############################
        // # Output tables

line = null;

if(!rejectedInnerJoin_tMap_1 ) {

// # Output table : 'line'
line_tmp.sale_qte = Var.sale_qte ;
line_tmp.final_stock = Var.final_stock ;
line_tmp.Min = Var.Min ;
line_tmp.Max = Var.Max ;
line_tmp.return_qte = Var.return_qte ;
line_tmp.id_produit = row3.id_produit ;
line_tmp.nomproduit = row3.produits;
line_tmp.nompilier = row3.pilier ;
line_tmp.Prix_Mali_Guinee = row2.prix__mali_guinee ;
line_tmp.Prix__Gambie = row2.prix_gambie ;
line_tmp.price = row1.price ;
line_tmp.prix = row1.prix ;
line_tmp.d2 = row1.d2 ;
line_tmp.qr_code = row1.qr_code ;
line_tmp.catalog_id = row1.catalog_id ;
line_tmp.sect_id = row1.sect_id ;
line_tmp.sku_commcare = row1.sku_commcare ;
line_tmp.sku_sage = row1.sku_sage ;
line_tmp.volume_unitaire = row3.volume_unitaire ;
line_tmp.name = row1.name ;
line = line_tmp;
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
// Start of branch "line"
if(line != null) { 



	
	/**
	 * [tMap_2 main ] start
	 */

	

	
	
	currentComponent="tMap_2";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"line"
						
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
								
	                        		    	Object exprKeyValue_row4__id_secteur = line.sect_id ;
	                        		    	if(exprKeyValue_row4__id_secteur == null) {
	                        		    		hasCasePrimitiveKeyWithNull_tMap_2 = true;
	                        		    	} else {
                        		    			row4HashKey.id_secteur = (long)(Long) exprKeyValue_row4__id_secteur;
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
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row4' and it contains more one result from keys :  row4.id_secteur = '" + row4HashKey.id_secteur + "'");
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
								
                        		    		    row5HashKey.qr_code = line.qr_code ;
                        		    		

								
		                        	row5HashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_row5.lookup( row5HashKey );

	  							

	  							

 								
								  
								  if(!tHash_Lookup_row5.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_2 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row5 != null && tHash_Lookup_row5.getCount(row5HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row5' and it contains more one result from keys :  row5.qr_code = '" + row5HashKey.qr_code + "'");
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
        
Var__tMap_2__Struct Var = Var__tMap_2;
Var.qte_vendu = (line.sale_qte - line.return_qte) ;
Var.CANTTC = (
(row4.region_commercial.equals("BAMAKO (MALI)") || row4.region_commercial.equals("CONAKRY"))?

 (line.sale_qte - line.return_qte)*Integer.valueOf(line.Prix_Mali_Guinee)
 
         : (
         
   		 row4.region_commercial.equals("BANJUL")?
  		  (line.sale_qte - line.return_qte)* line.Prix__Gambie
  		 
  		 : (

           TalendDate.compareDate(line.d2,TalendDate.parseDate("yyyy-MM-dd","2021-12-31"))<= 0 ? 
  
	         (line.sale_qte - line.return_qte)*Integer.valueOf(line.price)
	
	      :(
	      
		TalendDate.compareDate(line.d2,TalendDate.parseDate("yyyy-MM-dd","2022-01-01"))>= 0 
		
			&& TalendDate.compareDate(line.d2,TalendDate.parseDate("yyyy-MM-dd","2023-07-31"))>= 0 
			
			&& line.sku_commcare.contains("S02")
			
			&& line.catalog_id == 1 ? 
			
				(line.sale_qte - line.return_qte)*Integer.valueOf(line.price)
				
		   :(
		
			TalendDate.compareDate(row1.d2,TalendDate.parseDate("yyyy-MM-dd","2024-05-13"))<=0 
			
				&& (line.sku_commcare.equals("P20") || line.sku_commcare.equals("VP5000"))
				
				&&  line.catalog_id == 1 ?
				
					(line.sale_qte - line.return_qte)*Integer.valueOf(line.price)
					
		     : (line.sale_qte - line.return_qte)*Integer.valueOf(line.prix)
		     	
		     		)
		     	)
		     )
	     )
	 ) ;
Var.Pertes = (
(row4.region_commercial.equals("BAMAKO (MALI)") || row4.region_commercial.equals("CONAKRY"))?

  line.return_qte * Integer.valueOf(line.Prix_Mali_Guinee)
 
         : (
         
   		 row4.region_commercial.equals("BANJUL")?
  		  line.return_qte * line.Prix__Gambie
  		 
  		 : (

           TalendDate.compareDate(line.d2,TalendDate.parseDate("yyyy-MM-dd","2021-12-31"))<= 0 ? 
  
	         line.return_qte * Integer.valueOf(line.price)
	
	      :(
	      
		TalendDate.compareDate(line.d2,TalendDate.parseDate("yyyy-MM-dd","2022-01-01"))>= 0 
		
			&& TalendDate.compareDate(line.d2,TalendDate.parseDate("yyyy-MM-dd","2023-07-31"))>= 0 
			
			&& line.sku_commcare.contains("S02")
			
			&& line.catalog_id == 1 ? 
			
				line.return_qte * Integer.valueOf(line.price)
				
		   :(
		
			TalendDate.compareDate(row1.d2,TalendDate.parseDate("yyyy-MM-dd","2024-05-13"))<=0 
			
				&& (line.sku_commcare.equals("P20") || line.sku_commcare.equals("VP5000"))
				
				&&  line.catalog_id == 1 ?
				
					(line.sale_qte - line.return_qte)*Integer.valueOf(line.price)
					
		     : line.return_qte * Integer.valueOf(line.prix)
		     	
		     		)
		     	)
		     )
	     )
	 ) ;
Var.Volume_Total = (line.volume_unitaire * (line.sale_qte - line.return_qte)) ;
Var.var1 = row5.secours != null ? row5.secours : false ;// ###############################
        // ###############################
        // # Output tables

out1 = null;
out7 = null;

if(!rejectedInnerJoin_tMap_2 ) {

// # Output table : 'out1'
out1_tmp.d2 = line.d2 ;
out1_tmp.id_pdv = row5.id_pdv ;
out1_tmp.id_produit = line.id_produit ;
out1_tmp.id_secteur = row4.id_secteur ;
out1_tmp.qte_vendu = Var.qte_vendu ;
out1_tmp.CANTTC = (Math.floor(Var.CANTTC * 100) / 100) ;
out1_tmp.Pertes = (Math.floor(Var.Pertes * 100) / 100) ;
out1_tmp.Volume_Total = Var.Volume_Total ;
out1_tmp.nompilier = line.nompilier ;
out1_tmp.final_stock = line.final_stock ;
out1_tmp.statu = row5.statu ;
out1_tmp.secours =  Var.var1 ;
out1_tmp.Min = line.Min ;
out1_tmp.Max = line.Max ;
out1 = out1_tmp;
} // closing inner join bracket (1)
// ###### START REJECTS ##### 

// # Output reject table : 'out7'
// # Filter conditions 
if( rejectedInnerJoin_tMap_2 ) {
out7_tmp.name = line.name ;
out7_tmp.qr_code_1 = line.qr_code ;
out7_tmp.secteur = row4.secteur ;
out7_tmp.sku_sage = line.sku_sage ;
out7_tmp.date_Ventes = line.d2  ;
out7_tmp.qte_vendu = Var.qte_vendu  ;
out7_tmp.CANTTC = (Math.floor(Var.CANTTC * 100) / 100) ;
out7_tmp.Pertes = (Math.floor(Var.Pertes * 100) / 100) ;
out7_tmp.nompilier = line.nompilier  ;
out7 = out7_tmp;
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
// Start of branch "out1"
if(out1 != null) { 



	
	/**
	 * [tMap_3 main ] start
	 */

	

	
	
	currentComponent="tMap_3";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"out1"
						
						);
					}
					

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_3 = false;
		

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_3 = false;
		  boolean mainRowRejected_tMap_3 = false;
            				    								  
		

				///////////////////////////////////////////////
				// Starting Lookup Table "row6" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLooprow6 = false;
       		  	    	
       		  	    	
 							row6Struct row6ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_3) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_3 = false;
								
                        		    		    row6HashKey.date = out1.d2  == null ? null : new java.util.Date(out1.d2 .getTime());
                        		    		

								
		                        	row6HashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_row6.lookup( row6HashKey );

	  							

	  							

 								
								  
								  if(!tHash_Lookup_row6.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_3 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row6 != null && tHash_Lookup_row6.getCount(row6HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row6' and it contains more one result from keys :  row6.date = '" + row6HashKey.date + "'");
								} // G 071
							

							row6Struct row6 = null;
                    		  	 
							   
                    		  	 
	       		  	    	row6Struct fromLookup_row6 = null;
							row6 = row6Default;
										 
							
								 
							
							
								if (tHash_Lookup_row6 !=null && tHash_Lookup_row6.hasNext()) { // G 099
								
							
								
								fromLookup_row6 = tHash_Lookup_row6.next();

							
							
								} // G 099
							
							

							if(fromLookup_row6 != null) {
								row6 = fromLookup_row6;
							}
							
							
							
			  							
								
	                    		  	
		                    
	            	
	            	
	            // ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_3__Struct Var = Var__tMap_3;
Var.CANHT = (out1.nompilier.equals("LF") ? out1.CANTTC : (out1.CANTTC/1.18)) ;
Var.rupture = out1.final_stock == out1.qte_vendu ? 1 : 0 ;
Var.Commande_Intelligente = out1.final_stock >= out1.Min ? 1 : 0 ;
Var.PenetrationProduit = (out1.final_stock > 0 && !out1.secours  )?  1 : 0 ;
Var.PenetrationGamme = (out1.final_stock > 0 && !out1.secours )?  1 : 0 ;// ###############################
        // ###############################
        // # Output tables

out2 = null;

if(!rejectedInnerJoin_tMap_3 ) {

// # Output table : 'out2'
out2_tmp.id_pdv = out1.id_pdv ;
out2_tmp.id_produit = out1.id_produit ;
out2_tmp.id_secteur = out1.id_secteur ;
out2_tmp.id_temps = row6.id_temps ;
out2_tmp.qte_vendu = out1.qte_vendu ;
out2_tmp.CANTTC = out1.CANTTC ;
out2_tmp.Pertes = out1.Pertes ;
out2_tmp.Volume_Total = out1.Volume_Total ;
out2_tmp.CANHT = (Math.floor(Var.CANHT * 100) / 100) ;
out2_tmp.rupture = Var.rupture ;
out2_tmp.Commande_Intelligente = Var.Commande_Intelligente ;
out2_tmp.PenetrationProduit = Var.PenetrationProduit ;
out2_tmp.PenetrationGamme = Var.PenetrationGamme ;
out2_tmp.d2 = out1.d2 ;
out2 = out2_tmp;
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

	arrayRowtSortRow_1_SortOut.id_pdv = out2.id_pdv;
	arrayRowtSortRow_1_SortOut.id_produit = out2.id_produit;
	arrayRowtSortRow_1_SortOut.id_secteur = out2.id_secteur;
	arrayRowtSortRow_1_SortOut.id_temps = out2.id_temps;
	arrayRowtSortRow_1_SortOut.qte_vendu = out2.qte_vendu;
	arrayRowtSortRow_1_SortOut.CANTTC = out2.CANTTC;
	arrayRowtSortRow_1_SortOut.Pertes = out2.Pertes;
	arrayRowtSortRow_1_SortOut.Volume_Total = out2.Volume_Total;
	arrayRowtSortRow_1_SortOut.CANHT = out2.CANHT;
	arrayRowtSortRow_1_SortOut.rupture = out2.rupture;
	arrayRowtSortRow_1_SortOut.Commande_Intelligente = out2.Commande_Intelligente;
	arrayRowtSortRow_1_SortOut.PenetrationProduit = out2.PenetrationProduit;
	arrayRowtSortRow_1_SortOut.PenetrationGamme = out2.PenetrationGamme;
	arrayRowtSortRow_1_SortOut.d2 = out2.d2;	
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
	 * [tMap_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_3";

	

 



/**
 * [tMap_3 process_data_end ] stop
 */

} // End of branch "out1"




// Start of branch "out7"
if(out7 != null) { 



	
	/**
	 * [tMap_7 main ] start
	 */

	

	
	
	currentComponent="tMap_7";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"out7"
						
						);
					}
					

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_7 = false;
		

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_7 = false;
		  boolean mainRowRejected_tMap_7 = false;
            				    								  
		

				///////////////////////////////////////////////
				// Starting Lookup Table "row11" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLooprow11 = false;
       		  	    	
       		  	    	
 							row11Struct row11ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_7) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_7 = false;
								
                        		    		    row11HashKey.qr_code = out7.qr_code_1 ;
                        		    		

								
		                        	row11HashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_row11.lookup( row11HashKey );

	  							

	  							

 								
								  
								  if(!tHash_Lookup_row11.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_7 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row11 != null && tHash_Lookup_row11.getCount(row11HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row11' and it contains more one result from keys :  row11.qr_code = '" + row11HashKey.qr_code + "'");
								} // G 071
							

							row11Struct row11 = null;
                    		  	 
							   
                    		  	 
	       		  	    	row11Struct fromLookup_row11 = null;
							row11 = row11Default;
										 
							
								 
							
							
								if (tHash_Lookup_row11 !=null && tHash_Lookup_row11.hasNext()) { // G 099
								
							
								
								fromLookup_row11 = tHash_Lookup_row11.next();

							
							
								} // G 099
							
							

							if(fromLookup_row11 != null) {
								row11 = fromLookup_row11;
							}
							
							
							
			  							
								
	                    		  	
		                    
	            	
	            	
	            // ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_7__Struct Var = Var__tMap_7;// ###############################
        // ###############################
        // # Output tables

out8 = null;

if(!rejectedInnerJoin_tMap_7 ) {

// # Output table : 'out8'
out8_tmp.name = out7.name ;
out8_tmp.address_1 = row11.address ;
out8_tmp.qr_code_1 = out7.qr_code_1 ;
out8_tmp.secteur = out7.secteur ;
out8_tmp.sku_sage = out7.sku_sage ;
out8_tmp.date_Ventes = out7.date_Ventes ;
out8_tmp.qte_vendu = out7.qte_vendu ;
out8_tmp.CANTTC = out7.CANTTC ;
out8_tmp.Pertes = out7.Pertes ;
out8_tmp.nompilier = out7.nompilier ;
out8 = out8_tmp;
}  // closing inner join bracket (2)
// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_7 = false;










 


	tos_count_tMap_7++;

/**
 * [tMap_7 main ] stop
 */
	
	/**
	 * [tMap_7 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMap_7";

	

 



/**
 * [tMap_7 process_data_begin ] stop
 */
// Start of branch "out8"
if(out8 != null) { 



	
	/**
	 * [tLogRow_1 main ] start
	 */

	

	
	
	currentComponent="tLogRow_1";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"out8"
						
						);
					}
					
///////////////////////		
						

				
				String[] row_tLogRow_1 = new String[10];
   				
	    		if(out8.name != null) { //              
                 row_tLogRow_1[0]=    						    
				                String.valueOf(out8.name)			
					          ;	
							
	    		} //			
    			   				
	    		if(out8.address_1 != null) { //              
                 row_tLogRow_1[1]=    						    
				                String.valueOf(out8.address_1)			
					          ;	
							
	    		} //			
    			   				
	    		if(out8.qr_code_1 != null) { //              
                 row_tLogRow_1[2]=    						    
				                String.valueOf(out8.qr_code_1)			
					          ;	
							
	    		} //			
    			   				
	    		if(out8.secteur != null) { //              
                 row_tLogRow_1[3]=    						    
				                String.valueOf(out8.secteur)			
					          ;	
							
	    		} //			
    			   				
	    		if(out8.sku_sage != null) { //              
                 row_tLogRow_1[4]=    						    
				                String.valueOf(out8.sku_sage)			
					          ;	
							
	    		} //			
    			   				
	    		if(out8.date_Ventes != null) { //              
                 row_tLogRow_1[5]=    						
								FormatterUtils.format_Date(out8.date_Ventes, "dd-MM-yyyy")
					          ;	
							
	    		} //			
    			              
                 row_tLogRow_1[6]=    						    
				                String.valueOf(out8.qte_vendu)			
					          ;	
										
    			              
                 row_tLogRow_1[7]=    						
								FormatterUtils.formatUnwithE(out8.CANTTC)
					          ;	
										
    			              
                 row_tLogRow_1[8]=    						
								FormatterUtils.formatUnwithE(out8.Pertes)
					          ;	
										
    			   				
	    		if(out8.nompilier != null) { //              
                 row_tLogRow_1[9]=    						    
				                String.valueOf(out8.nompilier)			
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

} // End of branch "out8"




	
	/**
	 * [tMap_7 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_7";

	

 



/**
 * [tMap_7 process_data_end ] stop
 */

} // End of branch "out7"




	
	/**
	 * [tMap_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_2";

	

 



/**
 * [tMap_2 process_data_end ] stop
 */

} // End of branch "line"




	
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
			  		runStat.updateStat(resourceMap,iterateId,2,0,"line");
			  	}
			  	
 

ok_Hash.put("tMap_2", true);
end_Hash.put("tMap_2", System.currentTimeMillis());




/**
 * [tMap_2 end ] stop
 */

	
	/**
	 * [tMap_3 end ] start
	 */

	

	
	
	currentComponent="tMap_3";

	


// ###############################
// # Lookup hashes releasing
					if(tHash_Lookup_row6 != null) {
						tHash_Lookup_row6.endGet();
					}
					globalMap.remove( "tHash_Lookup_row6" );

					
					
				
// ###############################      





				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"out1");
			  	}
			  	
 

ok_Hash.put("tMap_3", true);
end_Hash.put("tMap_3", System.currentTimeMillis());




/**
 * [tMap_3 end ] stop
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
	 * [tDBOutput_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_1", false);
		start_Hash.put("tDBOutput_1", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_1";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"out5");
					}
				
		int tos_count_tDBOutput_1 = 0;
		





String dbschema_tDBOutput_1 = null;
	dbschema_tDBOutput_1 = "public";
	

String tableName_tDBOutput_1 = null;
if(dbschema_tDBOutput_1 == null || dbschema_tDBOutput_1.trim().length() == 0) {
	tableName_tDBOutput_1 = ("Fait_Vendeur");
} else {
	tableName_tDBOutput_1 = dbschema_tDBOutput_1 + "\".\"" + ("Fait_Vendeur");
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
 
	final String decryptedPassword_tDBOutput_1 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:JBU7sa898MjRFKjtgfo1bIHs7MtlkaHTxV70kcjmfNWAWLePvoc=");

    String dbPwd_tDBOutput_1 = decryptedPassword_tDBOutput_1;

    conn_tDBOutput_1 = java.sql.DriverManager.getConnection(url_tDBOutput_1,dbUser_tDBOutput_1,dbPwd_tDBOutput_1);
	
	resourceMap.put("conn_tDBOutput_1", conn_tDBOutput_1);
        conn_tDBOutput_1.setAutoCommit(false);
        int commitEvery_tDBOutput_1 = 1000;
        int commitCounter_tDBOutput_1 = 0;


   int batchSize_tDBOutput_1 = 1000;
   int batchSizeCounter_tDBOutput_1=0;

int count_tDBOutput_1=0;
	    String insert_tDBOutput_1 = "INSERT INTO \"" + tableName_tDBOutput_1 + "\" (\"id_faitvendeur\",\"id_secteur\",\"id_produit\",\"id_temps\",\"id_pdv\",\"cattc\",\"caht\",\"pertes\",\"qte_vendu\",\"volume_total\",\"penetration_p\",\"penetration_g\",\"ruptures\",\"com_intelligente\") VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	    
	    java.sql.PreparedStatement pstmt_tDBOutput_1 = conn_tDBOutput_1.prepareStatement(insert_tDBOutput_1);
	    resourceMap.put("pstmt_tDBOutput_1", pstmt_tDBOutput_1);
	    
        StringBuffer query_tDBOutput_1 = null;
       	
		 	String[] insertSQLSplits_tDBOutput_1 = insert_tDBOutput_1.split("\\?");

 



/**
 * [tDBOutput_1 begin ] stop
 */



	
	/**
	 * [tMap_4 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_4", false);
		start_Hash.put("tMap_4", System.currentTimeMillis());
		
	
	currentComponent="tMap_4";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"out6");
					}
				
		int tos_count_tMap_4 = 0;
		




// ###############################
// # Lookup's keys initialization
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row9Struct> tHash_Lookup_row9 = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row9Struct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row9Struct>) 
					globalMap.get( "tHash_Lookup_row9" ))
					;					
					
	
		tHash_Lookup_row9.initGet();
	

row9Struct row9HashKey = new row9Struct();
row9Struct row9Default = new row9Struct();
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_4__Struct  {
	int idfaitvendeur;
}
Var__tMap_4__Struct Var__tMap_4 = new Var__tMap_4__Struct();
// ###############################

// ###############################
// # Outputs initialization
out5Struct out5_tmp = new out5Struct();
// ###############################

        
        



        









 



/**
 * [tMap_4 begin ] stop
 */





	
	/**
	 * [tDBOutput_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_2", false);
		start_Hash.put("tDBOutput_2", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_2";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"out4");
					}
				
		int tos_count_tDBOutput_2 = 0;
		





String dbschema_tDBOutput_2 = null;
	dbschema_tDBOutput_2 = "public";
	

String tableName_tDBOutput_2 = null;
if(dbschema_tDBOutput_2 == null || dbschema_tDBOutput_2.trim().length() == 0) {
	tableName_tDBOutput_2 = ("Fait_Vendeur");
} else {
	tableName_tDBOutput_2 = dbschema_tDBOutput_2 + "\".\"" + ("Fait_Vendeur");
}

        int updateKeyCount_tDBOutput_2 = 1;
        if(updateKeyCount_tDBOutput_2 < 1) {
            throw new RuntimeException("For update, Schema must have a key");
        } else if (updateKeyCount_tDBOutput_2 == 14 && true) {        
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
 
	final String decryptedPassword_tDBOutput_2 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:cLsX8jwpSA62NFeeQ2U7vyXzgGU//3GJoWHPTaWTzMvXsvVkoyA=");

    String dbPwd_tDBOutput_2 = decryptedPassword_tDBOutput_2;

    conn_tDBOutput_2 = java.sql.DriverManager.getConnection(url_tDBOutput_2,dbUser_tDBOutput_2,dbPwd_tDBOutput_2);
	
	resourceMap.put("conn_tDBOutput_2", conn_tDBOutput_2);
        conn_tDBOutput_2.setAutoCommit(false);
        int commitEvery_tDBOutput_2 = 1000;
        int commitCounter_tDBOutput_2 = 0;


   int batchSize_tDBOutput_2 = 1000;
   int batchSizeCounter_tDBOutput_2=0;

int count_tDBOutput_2=0;
	    String update_tDBOutput_2 = "UPDATE \"" + tableName_tDBOutput_2 + "\" SET \"id_secteur\" = ?,\"id_produit\" = ?,\"id_temps\" = ?,\"id_pdv\" = ?,\"cattc\" = ?,\"caht\" = ?,\"pertes\" = ?,\"qte_vendu\" = ?,\"volume_total\" = ?,\"penetration_p\" = ?,\"penetration_g\" = ?,\"ruptures\" = ?,\"com_intelligente\" = ? WHERE \"id_faitvendeur\" = ?";
	    java.sql.PreparedStatement pstmt_tDBOutput_2 = conn_tDBOutput_2.prepareStatement(update_tDBOutput_2);
	    resourceMap.put("pstmt_tDBOutput_2", pstmt_tDBOutput_2);
	    
        StringBuffer query_tDBOutput_2 = null;
       	
			update_tDBOutput_2 += " ";
	    	String[] updateSQLSplits_tDBOutput_2 = update_tDBOutput_2.split("\\?");

 



/**
 * [tDBOutput_2 begin ] stop
 */



	
	/**
	 * [tMap_6 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_6", false);
		start_Hash.put("tMap_6", System.currentTimeMillis());
		
	
	currentComponent="tMap_6";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"out3");
					}
				
		int tos_count_tMap_6 = 0;
		




// ###############################
// # Lookup's keys initialization
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row10Struct> tHash_Lookup_row10 = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row10Struct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row10Struct>) 
					globalMap.get( "tHash_Lookup_row10" ))
					;					
					
	

row10Struct row10HashKey = new row10Struct();
row10Struct row10Default = new row10Struct();
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_6__Struct  {
}
Var__tMap_6__Struct Var__tMap_6 = new Var__tMap_6__Struct();
// ###############################

// ###############################
// # Outputs initialization
out4Struct out4_tmp = new out4Struct();
// ###############################

        
        



        









 



/**
 * [tMap_6 begin ] stop
 */



	
	/**
	 * [tMap_5 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_5", false);
		start_Hash.put("tMap_5", System.currentTimeMillis());
		
	
	currentComponent="tMap_5";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row7");
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
out6Struct out6_tmp = new out6Struct();
out3Struct out3_tmp = new out3Struct();
// ###############################

        
        



        









 



/**
 * [tMap_5 begin ] stop
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
	row7.id_pdv = current_tSortRow_1_SortIn.id_pdv;
	row7.id_produit = current_tSortRow_1_SortIn.id_produit;
	row7.id_secteur = current_tSortRow_1_SortIn.id_secteur;
	row7.id_temps = current_tSortRow_1_SortIn.id_temps;
	row7.qte_vendu = current_tSortRow_1_SortIn.qte_vendu;
	row7.CANTTC = current_tSortRow_1_SortIn.CANTTC;
	row7.Pertes = current_tSortRow_1_SortIn.Pertes;
	row7.Volume_Total = current_tSortRow_1_SortIn.Volume_Total;
	row7.CANHT = current_tSortRow_1_SortIn.CANHT;
	row7.rupture = current_tSortRow_1_SortIn.rupture;
	row7.Commande_Intelligente = current_tSortRow_1_SortIn.Commande_Intelligente;
	row7.PenetrationProduit = current_tSortRow_1_SortIn.PenetrationProduit;
	row7.PenetrationGamme = current_tSortRow_1_SortIn.PenetrationGamme;
	row7.d2 = current_tSortRow_1_SortIn.d2;
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
	 * [tMap_5 main ] start
	 */

	

	
	
	currentComponent="tMap_5";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row7"
						
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
								
                        		    		    row8HashKey.id_secteur = row7.id_secteur ;
                        		    		
                        		    		    row8HashKey.id_produit = row7.id_produit ;
                        		    		
                        		    		    row8HashKey.id_temps = row7.id_temps ;
                        		    		
                        		    		    row8HashKey.id_pdv = row7.id_pdv ;
                        		    		

								
		                        	row8HashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_row8.lookup( row8HashKey );

	  							

	  							

 								
								  
								  if(!tHash_Lookup_row8.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_5 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row8 != null && tHash_Lookup_row8.getCount(row8HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row8' and it contains more one result from keys :  row8.id_secteur = '" + row8HashKey.id_secteur + "', row8.id_produit = '" + row8HashKey.id_produit + "', row8.id_temps = '" + row8HashKey.id_temps + "', row8.id_pdv = '" + row8HashKey.id_pdv + "'");
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

out3 = null;
out6 = null;

if(!rejectedInnerJoin_tMap_5 ) {

// # Output table : 'out3'
out3_tmp.id_faitvendeur = row8.id_faitvendeur ;
out3_tmp.id_pdv = row7.id_pdv ;
out3_tmp.id_produit = row7.id_produit ;
out3_tmp.id_secteur = row7.id_secteur ;
out3_tmp.id_temps = row7.id_temps ;
out3_tmp.qte_vendu = row7.qte_vendu ;
out3_tmp.CANTTC = row7.CANTTC ;
out3_tmp.Pertes = row7.Pertes ;
out3_tmp.Volume_Total = row7.Volume_Total ;
out3_tmp.CANHT = row7.CANHT ;
out3_tmp.rupture = row7.rupture ;
out3_tmp.Commande_Intelligente = row7.Commande_Intelligente ;
out3_tmp.PenetrationProduit = row7.PenetrationProduit ;
out3_tmp.PenetrationGamme = row7.PenetrationGamme ;
out3 = out3_tmp;
} // closing inner join bracket (1)
// ###### START REJECTS ##### 

// # Output reject table : 'out6'
// # Filter conditions 
if( rejectedInnerJoin_tMap_5 ) {
out6_tmp.id_pdv = row7.id_pdv ;
out6_tmp.id_produit = row7.id_produit ;
out6_tmp.id_secteur = row7.id_secteur ;
out6_tmp.id_temps = row7.id_temps ;
out6_tmp.qte_vendu = row7.qte_vendu ;
out6_tmp.CANTTC = row7.CANTTC ;
out6_tmp.Pertes = row7.Pertes ;
out6_tmp.Volume_Total = row7.Volume_Total ;
out6_tmp.CANHT = row7.CANHT ;
out6_tmp.rupture = row7.rupture ;
out6_tmp.Commande_Intelligente = row7.Commande_Intelligente ;
out6_tmp.PenetrationProduit = row7.PenetrationProduit ;
out6_tmp.PenetrationGamme = row7.PenetrationGamme ;
out6 = out6_tmp;
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
// Start of branch "out6"
if(out6 != null) { 



	
	/**
	 * [tMap_4 main ] start
	 */

	

	
	
	currentComponent="tMap_4";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"out6"
						
						);
					}
					

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_4 = false;
		

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_4 = false;
		  boolean mainRowRejected_tMap_4 = false;
            				    								  
		

				///////////////////////////////////////////////
				// Starting Lookup Table "row9" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLooprow9 = false;
       		  	    	
       		  	    	
 							row9Struct row9ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_4) { // G_TM_M_020

								

								
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_row9.lookup( row9HashKey );

	  							

	  							

 								
								  
								  if(!tHash_Lookup_row9.hasNext()) { // G_TM_M_090

  								
		  				
	  								
						
									
	
		  								forceLooprow9 = true;
	  					
  									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
								
								else { // G 20 - G 21
   									forceLooprow9 = true;
			           		  	} // G 21
                    		  	
                    		

							row9Struct row9 = null;
                    		  	 
							

								while ((tHash_Lookup_row9 != null && tHash_Lookup_row9.hasNext()) || forceLooprow9) { // G_TM_M_043

								
									 // CALL close loop of lookup 'row9'
									
                    		  	 
							   
                    		  	 
	       		  	    	row9Struct fromLookup_row9 = null;
							row9 = row9Default;
										 
							
								
								if(!forceLooprow9) { // G 46
								
							
								 
							
								
								fromLookup_row9 = tHash_Lookup_row9.next();

							

							if(fromLookup_row9 != null) {
								row9 = fromLookup_row9;
							}
							
							
							
			  							
								
	                    		  	
		                    
	                    	
	                    		} // G 46
	                    		  	
								forceLooprow9 = false;
									 	
							
	            	
	            	
	            // ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_4__Struct Var = Var__tMap_4;
Var.idfaitvendeur = Numeric.sequence("s1",row9.id_faitvendeur +1,1) ;// ###############################
        // ###############################
        // # Output tables

out5 = null;


// # Output table : 'out5'
out5_tmp.id_faitvendeur = Var.idfaitvendeur ;
out5_tmp.id_secteur = out6.id_secteur ;
out5_tmp.id_produit = out6.id_produit ;
out5_tmp.id_temps = out6.id_temps ;
out5_tmp.id_pdv = out6.id_pdv ;
out5_tmp.cattc = out6.CANTTC ;
out5_tmp.caht = out6.CANHT ;
out5_tmp.pertes = out6.Pertes ;
out5_tmp.qte_vendu = out6.qte_vendu ;
out5_tmp.volume_total = out6.Volume_Total ;
out5_tmp.penetration_p = out6.PenetrationProduit ;
out5_tmp.penetration_g = out6.PenetrationGamme ;
out5_tmp.ruptures = out6.rupture ;
out5_tmp.com_intelligente = out6.Commande_Intelligente ;
out5 = out5_tmp;
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
// Start of branch "out5"
if(out5 != null) { 



	
	/**
	 * [tDBOutput_1 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"out5"
						
						);
					}
					



		query_tDBOutput_1 = new StringBuffer("");
        whetherReject_tDBOutput_1 = false;
                    pstmt_tDBOutput_1.setInt(1, out5.id_faitvendeur);

                        query_tDBOutput_1 = query_tDBOutput_1.append(insertSQLSplits_tDBOutput_1[0]).append(String.valueOf(out5.id_faitvendeur)).append(insertSQLSplits_tDBOutput_1[1]);
                    if(out5.id_secteur == null) {
pstmt_tDBOutput_1.setNull(2, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_1.setLong(2, out5.id_secteur);
}

                        query_tDBOutput_1 = query_tDBOutput_1.append(out5.id_secteur== null ?  "null" :String.valueOf(out5.id_secteur)).append(insertSQLSplits_tDBOutput_1[2]);
                    if(out5.id_produit == null) {
pstmt_tDBOutput_1.setNull(3, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_1.setLong(3, out5.id_produit);
}

                        query_tDBOutput_1 = query_tDBOutput_1.append(out5.id_produit== null ?  "null" :String.valueOf(out5.id_produit)).append(insertSQLSplits_tDBOutput_1[3]);
                    if(out5.id_temps == null) {
pstmt_tDBOutput_1.setNull(4, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_1.setInt(4, out5.id_temps);
}

                        query_tDBOutput_1 = query_tDBOutput_1.append(out5.id_temps== null ?  "null" :String.valueOf(out5.id_temps)).append(insertSQLSplits_tDBOutput_1[4]);
                    if(out5.id_pdv == null) {
pstmt_tDBOutput_1.setNull(5, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_1.setLong(5, out5.id_pdv);
}

                        query_tDBOutput_1 = query_tDBOutput_1.append(out5.id_pdv== null ?  "null" :String.valueOf(out5.id_pdv)).append(insertSQLSplits_tDBOutput_1[5]);
                    if(out5.cattc == null) {
pstmt_tDBOutput_1.setNull(6, java.sql.Types.DOUBLE);
} else {pstmt_tDBOutput_1.setDouble(6, out5.cattc);
}

                        query_tDBOutput_1 = query_tDBOutput_1.append(out5.cattc== null ?  "null" :String.valueOf(out5.cattc)).append(insertSQLSplits_tDBOutput_1[6]);
                    if(out5.caht == null) {
pstmt_tDBOutput_1.setNull(7, java.sql.Types.DOUBLE);
} else {pstmt_tDBOutput_1.setDouble(7, out5.caht);
}

                        query_tDBOutput_1 = query_tDBOutput_1.append(out5.caht== null ?  "null" :String.valueOf(out5.caht)).append(insertSQLSplits_tDBOutput_1[7]);
                    if(out5.pertes == null) {
pstmt_tDBOutput_1.setNull(8, java.sql.Types.DOUBLE);
} else {pstmt_tDBOutput_1.setDouble(8, out5.pertes);
}

                        query_tDBOutput_1 = query_tDBOutput_1.append(out5.pertes== null ?  "null" :String.valueOf(out5.pertes)).append(insertSQLSplits_tDBOutput_1[8]);
                    if(out5.qte_vendu == null) {
pstmt_tDBOutput_1.setNull(9, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_1.setInt(9, out5.qte_vendu);
}

                        query_tDBOutput_1 = query_tDBOutput_1.append(out5.qte_vendu== null ?  "null" :String.valueOf(out5.qte_vendu)).append(insertSQLSplits_tDBOutput_1[9]);
                    if(out5.volume_total == null) {
pstmt_tDBOutput_1.setNull(10, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_1.setInt(10, out5.volume_total);
}

                        query_tDBOutput_1 = query_tDBOutput_1.append(out5.volume_total== null ?  "null" :String.valueOf(out5.volume_total)).append(insertSQLSplits_tDBOutput_1[10]);
                    if(out5.penetration_p == null) {
pstmt_tDBOutput_1.setNull(11, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_1.setInt(11, out5.penetration_p);
}

                        query_tDBOutput_1 = query_tDBOutput_1.append(out5.penetration_p== null ?  "null" :String.valueOf(out5.penetration_p)).append(insertSQLSplits_tDBOutput_1[11]);
                    if(out5.penetration_g == null) {
pstmt_tDBOutput_1.setNull(12, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_1.setInt(12, out5.penetration_g);
}

                        query_tDBOutput_1 = query_tDBOutput_1.append(out5.penetration_g== null ?  "null" :String.valueOf(out5.penetration_g)).append(insertSQLSplits_tDBOutput_1[12]);
                    if(out5.ruptures == null) {
pstmt_tDBOutput_1.setNull(13, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_1.setInt(13, out5.ruptures);
}

                        query_tDBOutput_1 = query_tDBOutput_1.append(out5.ruptures== null ?  "null" :String.valueOf(out5.ruptures)).append(insertSQLSplits_tDBOutput_1[13]);
                    if(out5.com_intelligente == null) {
pstmt_tDBOutput_1.setNull(14, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_1.setInt(14, out5.com_intelligente);
}

                        query_tDBOutput_1 = query_tDBOutput_1.append(out5.com_intelligente== null ?  "null" :String.valueOf(out5.com_intelligente)).append(insertSQLSplits_tDBOutput_1[14]);
                globalMap.put("tDBOutput_1_QUERY", query_tDBOutput_1.toString().trim());
			
    		pstmt_tDBOutput_1.addBatch();
    		nb_line_tDBOutput_1++;
    		  
    		  
    		  batchSizeCounter_tDBOutput_1++;
    		  
            if(!whetherReject_tDBOutput_1) {
            }
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

} // End of branch "out5"



	
		} // close loop of lookup 'row9' // G_TM_M_043
	
	
	/**
	 * [tMap_4 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_4";

	

 



/**
 * [tMap_4 process_data_end ] stop
 */

} // End of branch "out6"




// Start of branch "out3"
if(out3 != null) { 



	
	/**
	 * [tMap_6 main ] start
	 */

	

	
	
	currentComponent="tMap_6";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"out3"
						
						);
					}
					

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_6 = false;
		

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_6 = false;
		  boolean mainRowRejected_tMap_6 = false;
            				    								  
		

				///////////////////////////////////////////////
				// Starting Lookup Table "row10" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLooprow10 = false;
       		  	    	
       		  	    	
 							row10Struct row10ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_6) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_6 = false;
								
                        		    		    row10HashKey.id_secteur = out3.id_secteur ;
                        		    		
                        		    		    row10HashKey.id_produit = out3.id_produit ;
                        		    		
                        		    		    row10HashKey.id_temps = out3.id_temps ;
                        		    		
                        		    		    row10HashKey.id_pdv = out3.id_pdv ;
                        		    		
                        		    		    row10HashKey.cattc = out3.CANTTC ;
                        		    		
                        		    		    row10HashKey.caht = out3.CANHT ;
                        		    		
                        		    		    row10HashKey.pertes = out3.Pertes ;
                        		    		
                        		    		    row10HashKey.qte_vendu = out3.qte_vendu ;
                        		    		
                        		    		    row10HashKey.volume_total = out3.Volume_Total ;
                        		    		
                        		    		    row10HashKey.penetration_p = out3.PenetrationProduit ;
                        		    		
                        		    		    row10HashKey.penetration_g = out3.PenetrationGamme ;
                        		    		
                        		    		    row10HashKey.ruptures = out3.rupture ;
                        		    		
                        		    		    row10HashKey.com_intelligente = out3.Commande_Intelligente ;
                        		    		

								
		                        	row10HashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_row10.lookup( row10HashKey );

	  							

	  							

 								
								  
								  if(!tHash_Lookup_row10.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_6 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row10 != null && tHash_Lookup_row10.getCount(row10HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row10' and it contains more one result from keys :  row10.id_secteur = '" + row10HashKey.id_secteur + "', row10.id_produit = '" + row10HashKey.id_produit + "', row10.id_temps = '" + row10HashKey.id_temps + "', row10.id_pdv = '" + row10HashKey.id_pdv + "', row10.cattc = '" + row10HashKey.cattc + "', row10.caht = '" + row10HashKey.caht + "', row10.pertes = '" + row10HashKey.pertes + "', row10.qte_vendu = '" + row10HashKey.qte_vendu + "', row10.volume_total = '" + row10HashKey.volume_total + "', row10.penetration_p = '" + row10HashKey.penetration_p + "', row10.penetration_g = '" + row10HashKey.penetration_g + "', row10.ruptures = '" + row10HashKey.ruptures + "', row10.com_intelligente = '" + row10HashKey.com_intelligente + "'");
								} // G 071
							

							row10Struct row10 = null;
                    		  	 
							   
                    		  	 
	       		  	    	row10Struct fromLookup_row10 = null;
							row10 = row10Default;
										 
							
								 
							
							
								if (tHash_Lookup_row10 !=null && tHash_Lookup_row10.hasNext()) { // G 099
								
							
								
								fromLookup_row10 = tHash_Lookup_row10.next();

							
							
								} // G 099
							
							

							if(fromLookup_row10 != null) {
								row10 = fromLookup_row10;
							}
							
							
							
			  							
								
	                    		  	
		                    
	            	
	            	
	            // ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_6__Struct Var = Var__tMap_6;// ###############################
        // ###############################
        // # Output tables

out4 = null;

if(!rejectedInnerJoin_tMap_6 ) {
} // closing inner join bracket (1)
// ###### START REJECTS ##### 

// # Output reject table : 'out4'
// # Filter conditions 
if( rejectedInnerJoin_tMap_6 ) {
out4_tmp.id_faitvendeur = out3.id_faitvendeur ;
out4_tmp.id_secteur = out3.id_secteur ;
out4_tmp.id_produit = out3.id_produit ;
out4_tmp.id_temps = out3.id_temps ;
out4_tmp.id_pdv = out3.id_pdv ;
out4_tmp.cattc = out3.CANTTC ;
out4_tmp.caht = out3.CANHT ;
out4_tmp.pertes = out3.Pertes ;
out4_tmp.qte_vendu = out3.qte_vendu ;
out4_tmp.volume_total = out3.Volume_Total ;
out4_tmp.penetration_p = out3.PenetrationProduit ;
out4_tmp.penetration_g = out3.PenetrationGamme ;
out4_tmp.ruptures = out3.rupture ;
out4_tmp.com_intelligente = out3.Commande_Intelligente ;
out4 = out4_tmp;
} // closing filter/reject
// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_6 = false;










 


	tos_count_tMap_6++;

/**
 * [tMap_6 main ] stop
 */
	
	/**
	 * [tMap_6 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMap_6";

	

 



/**
 * [tMap_6 process_data_begin ] stop
 */
// Start of branch "out4"
if(out4 != null) { 



	
	/**
	 * [tDBOutput_2 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_2";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"out4"
						
						);
					}
					



		query_tDBOutput_2 = new StringBuffer("");
        whetherReject_tDBOutput_2 = false;
                    if(out4.id_secteur == null) {
pstmt_tDBOutput_2.setNull(1, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_2.setLong(1, out4.id_secteur);
}

                        query_tDBOutput_2 = query_tDBOutput_2.append(updateSQLSplits_tDBOutput_2[0]).append(out4.id_secteur== null ?  "null" :String.valueOf(out4.id_secteur)).append(updateSQLSplits_tDBOutput_2[1]);
                    if(out4.id_produit == null) {
pstmt_tDBOutput_2.setNull(2, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_2.setLong(2, out4.id_produit);
}

                        query_tDBOutput_2 = query_tDBOutput_2.append(out4.id_produit== null ?  "null" :String.valueOf(out4.id_produit)).append(updateSQLSplits_tDBOutput_2[2]);
                    if(out4.id_temps == null) {
pstmt_tDBOutput_2.setNull(3, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_2.setInt(3, out4.id_temps);
}

                        query_tDBOutput_2 = query_tDBOutput_2.append(out4.id_temps== null ?  "null" :String.valueOf(out4.id_temps)).append(updateSQLSplits_tDBOutput_2[3]);
                    if(out4.id_pdv == null) {
pstmt_tDBOutput_2.setNull(4, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_2.setLong(4, out4.id_pdv);
}

                        query_tDBOutput_2 = query_tDBOutput_2.append(out4.id_pdv== null ?  "null" :String.valueOf(out4.id_pdv)).append(updateSQLSplits_tDBOutput_2[4]);
                    if(out4.cattc == null) {
pstmt_tDBOutput_2.setNull(5, java.sql.Types.DOUBLE);
} else {pstmt_tDBOutput_2.setDouble(5, out4.cattc);
}

                        query_tDBOutput_2 = query_tDBOutput_2.append(out4.cattc== null ?  "null" :String.valueOf(out4.cattc)).append(updateSQLSplits_tDBOutput_2[5]);
                    if(out4.caht == null) {
pstmt_tDBOutput_2.setNull(6, java.sql.Types.DOUBLE);
} else {pstmt_tDBOutput_2.setDouble(6, out4.caht);
}

                        query_tDBOutput_2 = query_tDBOutput_2.append(out4.caht== null ?  "null" :String.valueOf(out4.caht)).append(updateSQLSplits_tDBOutput_2[6]);
                    if(out4.pertes == null) {
pstmt_tDBOutput_2.setNull(7, java.sql.Types.DOUBLE);
} else {pstmt_tDBOutput_2.setDouble(7, out4.pertes);
}

                        query_tDBOutput_2 = query_tDBOutput_2.append(out4.pertes== null ?  "null" :String.valueOf(out4.pertes)).append(updateSQLSplits_tDBOutput_2[7]);
                    if(out4.qte_vendu == null) {
pstmt_tDBOutput_2.setNull(8, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_2.setInt(8, out4.qte_vendu);
}

                        query_tDBOutput_2 = query_tDBOutput_2.append(out4.qte_vendu== null ?  "null" :String.valueOf(out4.qte_vendu)).append(updateSQLSplits_tDBOutput_2[8]);
                    if(out4.volume_total == null) {
pstmt_tDBOutput_2.setNull(9, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_2.setInt(9, out4.volume_total);
}

                        query_tDBOutput_2 = query_tDBOutput_2.append(out4.volume_total== null ?  "null" :String.valueOf(out4.volume_total)).append(updateSQLSplits_tDBOutput_2[9]);
                    if(out4.penetration_p == null) {
pstmt_tDBOutput_2.setNull(10, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_2.setInt(10, out4.penetration_p);
}

                        query_tDBOutput_2 = query_tDBOutput_2.append(out4.penetration_p== null ?  "null" :String.valueOf(out4.penetration_p)).append(updateSQLSplits_tDBOutput_2[10]);
                    if(out4.penetration_g == null) {
pstmt_tDBOutput_2.setNull(11, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_2.setInt(11, out4.penetration_g);
}

                        query_tDBOutput_2 = query_tDBOutput_2.append(out4.penetration_g== null ?  "null" :String.valueOf(out4.penetration_g)).append(updateSQLSplits_tDBOutput_2[11]);
                    if(out4.ruptures == null) {
pstmt_tDBOutput_2.setNull(12, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_2.setInt(12, out4.ruptures);
}

                        query_tDBOutput_2 = query_tDBOutput_2.append(out4.ruptures== null ?  "null" :String.valueOf(out4.ruptures)).append(updateSQLSplits_tDBOutput_2[12]);
                    if(out4.com_intelligente == null) {
pstmt_tDBOutput_2.setNull(13, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_2.setInt(13, out4.com_intelligente);
}

                        query_tDBOutput_2 = query_tDBOutput_2.append(out4.com_intelligente== null ?  "null" :String.valueOf(out4.com_intelligente)).append(updateSQLSplits_tDBOutput_2[13]);
                    pstmt_tDBOutput_2.setInt(14 + count_tDBOutput_2, out4.id_faitvendeur);


				   query_tDBOutput_2 = query_tDBOutput_2.append(String.valueOf(out4.id_faitvendeur)).append(updateSQLSplits_tDBOutput_2[14]);
			    
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

} // End of branch "out4"




	
	/**
	 * [tMap_6 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_6";

	

 



/**
 * [tMap_6 process_data_end ] stop
 */

} // End of branch "out3"




	
	/**
	 * [tMap_5 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_5";

	

 



/**
 * [tMap_5 process_data_end ] stop
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
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row7");
			  	}
			  	
 

ok_Hash.put("tMap_5", true);
end_Hash.put("tMap_5", System.currentTimeMillis());




/**
 * [tMap_5 end ] stop
 */

	
	/**
	 * [tMap_4 end ] start
	 */

	

	
	
	currentComponent="tMap_4";

	


// ###############################
// # Lookup hashes releasing
					if(tHash_Lookup_row9 != null) {
						tHash_Lookup_row9.endGet();
					}
					globalMap.remove( "tHash_Lookup_row9" );

					
					
				
// ###############################      





				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"out6");
			  	}
			  	
 

ok_Hash.put("tMap_4", true);
end_Hash.put("tMap_4", System.currentTimeMillis());




/**
 * [tMap_4 end ] stop
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
			  		runStat.updateStat(resourceMap,iterateId,2,0,"out5");
			  	}
			  	
 

ok_Hash.put("tDBOutput_1", true);
end_Hash.put("tDBOutput_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk12", 0, "ok");
				}
				tDBCommit_1Process(globalMap);



/**
 * [tDBOutput_1 end ] stop
 */







	
	/**
	 * [tMap_6 end ] start
	 */

	

	
	
	currentComponent="tMap_6";

	


// ###############################
// # Lookup hashes releasing
					if(tHash_Lookup_row10 != null) {
						tHash_Lookup_row10.endGet();
					}
					globalMap.remove( "tHash_Lookup_row10" );

					
					
				
// ###############################      





				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"out3");
			  	}
			  	
 

ok_Hash.put("tMap_6", true);
end_Hash.put("tMap_6", System.currentTimeMillis());




/**
 * [tMap_6 end ] stop
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
			  		runStat.updateStat(resourceMap,iterateId,2,0,"out4");
			  	}
			  	
 

ok_Hash.put("tDBOutput_2", true);
end_Hash.put("tDBOutput_2", System.currentTimeMillis());




/**
 * [tDBOutput_2 end ] stop
 */



















	
	/**
	 * [tMap_7 end ] start
	 */

	

	
	
	currentComponent="tMap_7";

	


// ###############################
// # Lookup hashes releasing
					if(tHash_Lookup_row11 != null) {
						tHash_Lookup_row11.endGet();
					}
					globalMap.remove( "tHash_Lookup_row11" );

					
					
				
// ###############################      





				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"out7");
			  	}
			  	
 

ok_Hash.put("tMap_7", true);
end_Hash.put("tMap_7", System.currentTimeMillis());




/**
 * [tMap_7 end ] stop
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
			  		runStat.updateStat(resourceMap,iterateId,2,0,"out8");
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
				
					     			//free memory for "tMap_7"
					     			globalMap.remove("tHash_Lookup_row11"); 
				     			
					     			//free memory for "tMap_6"
					     			globalMap.remove("tHash_Lookup_row10"); 
				     			
					     			//free memory for "tMap_4"
					     			globalMap.remove("tHash_Lookup_row9"); 
				     			
					     			//free memory for "tMap_5"
					     			globalMap.remove("tHash_Lookup_row8"); 
				     			
							//free memory for "tSortRow_1_SortIn"
							globalMap.remove("tSortRow_1");
						
					     			//free memory for "tMap_3"
					     			globalMap.remove("tHash_Lookup_row6"); 
				     			
					     			//free memory for "tMap_2"
					     			globalMap.remove("tHash_Lookup_row4"); 
				     			
					     			//free memory for "tMap_2"
					     			globalMap.remove("tHash_Lookup_row5"); 
				     			
					     			//free memory for "tMap_1"
					     			globalMap.remove("tHash_Lookup_row3"); 
				     			
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
	 * [tMap_3 finally ] start
	 */

	

	
	
	currentComponent="tMap_3";

	

 



/**
 * [tMap_3 finally ] stop
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
	 * [tMap_5 finally ] start
	 */

	

	
	
	currentComponent="tMap_5";

	

 



/**
 * [tMap_5 finally ] stop
 */

	
	/**
	 * [tMap_4 finally ] start
	 */

	

	
	
	currentComponent="tMap_4";

	

 



/**
 * [tMap_4 finally ] stop
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
	 * [tMap_6 finally ] start
	 */

	

	
	
	currentComponent="tMap_6";

	

 



/**
 * [tMap_6 finally ] stop
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
	 * [tMap_7 finally ] start
	 */

	

	
	
	currentComponent="tMap_7";

	

 



/**
 * [tMap_7 finally ] stop
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
	

public void tDBCommit_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBCommit_1_SUBPROCESS_STATE", 0);

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
	 * [tDBCommit_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBCommit_1", false);
		start_Hash.put("tDBCommit_1", System.currentTimeMillis());
		
	
	currentComponent="tDBCommit_1";

	
		int tos_count_tDBCommit_1 = 0;
		

 



/**
 * [tDBCommit_1 begin ] stop
 */
	
	/**
	 * [tDBCommit_1 main ] start
	 */

	

	
	
	currentComponent="tDBCommit_1";

	

	java.sql.Connection conn_tDBCommit_1 = (java.sql.Connection)globalMap.get("conn_tDBConnection_1");
	if(conn_tDBCommit_1 != null && !conn_tDBCommit_1.isClosed())
	{
	
		try{
	
			
			conn_tDBCommit_1.commit();
			
	
		}finally{
			
			conn_tDBCommit_1.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_tDBConnection_1"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
			}
			
	    }
	
	}

 


	tos_count_tDBCommit_1++;

/**
 * [tDBCommit_1 main ] stop
 */
	
	/**
	 * [tDBCommit_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBCommit_1";

	

 



/**
 * [tDBCommit_1 process_data_begin ] stop
 */
	
	/**
	 * [tDBCommit_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBCommit_1";

	

 



/**
 * [tDBCommit_1 process_data_end ] stop
 */
	
	/**
	 * [tDBCommit_1 end ] start
	 */

	

	
	
	currentComponent="tDBCommit_1";

	

 

ok_Hash.put("tDBCommit_1", true);
end_Hash.put("tDBCommit_1", System.currentTimeMillis());




/**
 * [tDBCommit_1 end ] stop
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
	 * [tDBCommit_1 finally ] start
	 */

	

	
	
	currentComponent="tDBCommit_1";

	

 



/**
 * [tDBCommit_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBCommit_1_SUBPROCESS_STATE", 1);
	}
	

public void tDBRollback_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBRollback_1_SUBPROCESS_STATE", 0);

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
	 * [tDBRollback_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBRollback_1", false);
		start_Hash.put("tDBRollback_1", System.currentTimeMillis());
		
	
	currentComponent="tDBRollback_1";

	
		int tos_count_tDBRollback_1 = 0;
		

 



/**
 * [tDBRollback_1 begin ] stop
 */
	
	/**
	 * [tDBRollback_1 main ] start
	 */

	

	
	
	currentComponent="tDBRollback_1";

	

	java.sql.Connection conn_tDBRollback_1 = (java.sql.Connection)globalMap.get("conn_tDBConnection_1");
	if(conn_tDBRollback_1 != null && !conn_tDBRollback_1.isClosed()) {
		
			try{
				
			conn_tDBRollback_1.rollback();
			
			}finally{
		    	
			conn_tDBRollback_1.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_tDBConnection_1"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
			}
			
		    }
		
	}

 


	tos_count_tDBRollback_1++;

/**
 * [tDBRollback_1 main ] stop
 */
	
	/**
	 * [tDBRollback_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBRollback_1";

	

 



/**
 * [tDBRollback_1 process_data_begin ] stop
 */
	
	/**
	 * [tDBRollback_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBRollback_1";

	

 



/**
 * [tDBRollback_1 process_data_end ] stop
 */
	
	/**
	 * [tDBRollback_1 end ] start
	 */

	

	
	
	currentComponent="tDBRollback_1";

	

 

ok_Hash.put("tDBRollback_1", true);
end_Hash.put("tDBRollback_1", System.currentTimeMillis());




/**
 * [tDBRollback_1 end ] stop
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
	 * [tDBRollback_1 finally ] start
	 */

	

	
	
	currentComponent="tDBRollback_1";

	

 



/**
 * [tDBRollback_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBRollback_1_SUBPROCESS_STATE", 1);
	}
	


public static class row3Struct implements routines.system.IPersistableComparableLookupRow<row3Struct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[0];
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
	
						result = prime * result + ((this.produits == null) ? 0 : this.produits.hashCode());
					
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
		
						if (this.produits == null) {
							if (other.produits != null)
								return false;
						
						} else if (!this.produits.equals(other.produits))
						
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

		other.produits = this.produits;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR, 0, length, utf8Charset);
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
			if(length > commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR) {

        	try {

        		int length = 0;
		
					this.produits = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR) {

        	try {

        		int length = 0;
		
					this.produits = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.produits,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.produits,dos);
					
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
		
			            this.id_produit = dis.readLong();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.id_pilier = null;
           				} else {
           			    	this.id_pilier = dis.readLong();
           				}
					
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
		
			            this.id_produit = objectIn.readLong();
					
			            length = objectIn.readByte();
           				if (length == -1) {
           	    			this.id_pilier = null;
           				} else {
           			    	this.id_pilier = objectIn.readLong();
           				}
					
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

		
		            	dos.writeLong(this.id_produit);
					
						if(this.id_pilier == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.id_pilier);
		            	}
					
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

		
					objectOut.writeLong(this.id_produit);
					
						if(this.id_pilier == null) {
							objectOut.writeByte(-1);
						} else {
							objectOut.writeByte(0);
							objectOut.writeLong(this.id_pilier);
		            	}
					
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
		
						returnValue = checkNullsAndCompare(this.produits, other.produits);
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
			   		// source node:tDBInput_2 - inputs:(after_tDBInput_1) outputs:(row3,row3) | target node:tAdvancedHash_row3 - inputs:(row3) outputs:()
			   		// linked node: tMap_1 - inputs:(row1,row3,row2) outputs:(line)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row3 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row3Struct> tHash_Lookup_row3 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row3Struct>getLookup(matchingModeEnum_row3);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row3", tHash_Lookup_row3);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row3 begin ] stop
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
				
				 
	final String decryptedPassword_tDBInput_2 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:N7LnkB9XUUsRyp2n1v8sSeQugwGpbpnn9k0ngJ5PnRPKeiIECcc=");
				
				String dbPwd_tDBInput_2 = decryptedPassword_tDBInput_2;
				
				String url_tDBInput_2 = "jdbc:postgresql://" + "163.172.166.119" + ":" + "5432" + "/" + "leuk_analytics";
				
				conn_tDBInput_2 = java.sql.DriverManager.getConnection(url_tDBInput_2,dbUser_tDBInput_2,dbPwd_tDBInput_2);
		        
				conn_tDBInput_2.setAutoCommit(false);
			
		    
			java.sql.Statement stmt_tDBInput_2 = conn_tDBInput_2.createStatement();

		    String dbquery_tDBInput_2 = "SELECT \n  \"public\".\"Dim_Produits\".\"id_produit\", \n  \"public\".\"Dim_Produits\".\"id_pilier\", \n  \"public\".\"Dim"
+"_Produits\".\"produits\", \n  \"public\".\"Dim_Produits\".\"pilier\", \n  \"public\".\"Dim_Produits\".\"prix\", \n  \"publi"
+"c\".\"Dim_Produits\".\"tva\", \n  \"public\".\"Dim_Produits\".\"volume_unitaire\"\nFROM \"public\".\"Dim_Produits\"";
		    

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
								row3.id_produit = 0;
							} else {
		                          
            row3.id_produit = rs_tDBInput_2.getLong(1);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 2) {
								row3.id_pilier = null;
							} else {
		                          
            row3.id_pilier = rs_tDBInput_2.getLong(2);
            if(rs_tDBInput_2.wasNull()){
                    row3.id_pilier = null;
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 3) {
								row3.produits = null;
							} else {
	                         		
        	row3.produits = routines.system.JDBCUtil.getString(rs_tDBInput_2, 3, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 4) {
								row3.pilier = null;
							} else {
	                         		
        	row3.pilier = routines.system.JDBCUtil.getString(rs_tDBInput_2, 4, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 5) {
								row3.prix = null;
							} else {
		                          
            row3.prix = rs_tDBInput_2.getInt(5);
            if(rs_tDBInput_2.wasNull()){
                    row3.prix = null;
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 6) {
								row3.volume_unitaire = null;
							} else {
		                          
            row3.volume_unitaire = rs_tDBInput_2.getInt(6);
            if(rs_tDBInput_2.wasNull()){
                    row3.volume_unitaire = null;
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 7) {
								row3.tva = null;
							} else {
	                         		
            row3.tva = rs_tDBInput_2.getDouble(7);
            if(rs_tDBInput_2.wasNull()){
                    row3.tva = null;
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
	 * [tDBInput_2 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_2";

	

 



/**
 * [tDBInput_2 finally ] stop
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
		

		globalMap.put("tDBInput_2_SUBPROCESS_STATE", 1);
	}
	


public static class row4Struct implements routines.system.IPersistableComparableLookupRow<row4Struct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[0];
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
		final row4Struct other = (row4Struct) obj;
		
						if (this.id_secteur != other.id_secteur)
							return false;
					

		return true;
    }

	public void copyDataTo(row4Struct other) {

		other.id_secteur = this.id_secteur;
	            other.region_commercial = this.region_commercial;
	            other.zone_supervision = this.zone_supervision;
	            other.secteur = this.secteur;
	            other.hub = this.hub;
	            other.pays = this.pays;
	            
	}

	public void copyKeysDataTo(row4Struct other) {

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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR) {

        	try {

        		int length = 0;
		
			        this.id_secteur = dis.readLong();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR) {

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
    public int compareTo(row4Struct other) {

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
			   		// linked node: tMap_2 - inputs:(line,row4,row5) outputs:(out1,out7)
			   
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
				
				 
	final String decryptedPassword_tDBInput_3 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:lU4GJbL9XQLYINaOTmUXpjDJ+hj1XhL39Q+9raxj7FeSxeVGyRA=");
				
				String dbPwd_tDBInput_3 = decryptedPassword_tDBInput_3;
				
				String url_tDBInput_3 = "jdbc:postgresql://" + "163.172.166.119" + ":" + "5432" + "/" + "leuk_analytics";
				
				conn_tDBInput_3 = java.sql.DriverManager.getConnection(url_tDBInput_3,dbUser_tDBInput_3,dbPwd_tDBInput_3);
		        
				conn_tDBInput_3.setAutoCommit(false);
			
		    
			java.sql.Statement stmt_tDBInput_3 = conn_tDBInput_3.createStatement();

		    String dbquery_tDBInput_3 = "SELECT \n  \"public\".\"Dim_Geographie\".\"id_secteur\", \n  \"public\".\"Dim_Geographie\".\"region_commercial\", \n  \"pu"
+"blic\".\"Dim_Geographie\".\"zone_supervision\", \n  \"public\".\"Dim_Geographie\".\"secteur\", \n  \"public\".\"Dim_Geogra"
+"phie\".\"hub\", \n  \"public\".\"Dim_Geographie\".\"pays\"\nFROM \"public\".\"Dim_Geographie\"";
		    

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
								row4.id_secteur = 0;
							} else {
		                          
            row4.id_secteur = rs_tDBInput_3.getLong(1);
            if(rs_tDBInput_3.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_3 < 2) {
								row4.region_commercial = null;
							} else {
	                         		
        	row4.region_commercial = routines.system.JDBCUtil.getString(rs_tDBInput_3, 2, false);
		                    }
							if(colQtyInRs_tDBInput_3 < 3) {
								row4.zone_supervision = null;
							} else {
	                         		
        	row4.zone_supervision = routines.system.JDBCUtil.getString(rs_tDBInput_3, 3, false);
		                    }
							if(colQtyInRs_tDBInput_3 < 4) {
								row4.secteur = null;
							} else {
	                         		
        	row4.secteur = routines.system.JDBCUtil.getString(rs_tDBInput_3, 4, false);
		                    }
							if(colQtyInRs_tDBInput_3 < 5) {
								row4.hub = null;
							} else {
	                         		
        	row4.hub = routines.system.JDBCUtil.getString(rs_tDBInput_3, 5, false);
		                    }
							if(colQtyInRs_tDBInput_3 < 6) {
								row4.pays = null;
							} else {
	                         		
        	row4.pays = routines.system.JDBCUtil.getString(rs_tDBInput_3, 6, false);
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
		   	   	   
				
				row4_HashRow.id_secteur = row4.id_secteur;
				
				row4_HashRow.region_commercial = row4.region_commercial;
				
				row4_HashRow.zone_supervision = row4.zone_supervision;
				
				row4_HashRow.secteur = row4.secteur;
				
				row4_HashRow.hub = row4.hub;
				
				row4_HashRow.pays = row4.pays;
				
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
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[0];
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
	
						result = prime * result + ((this.qr_code == null) ? 0 : this.qr_code.hashCode());
					
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
		
						if (this.qr_code == null) {
							if (other.qr_code != null)
								return false;
						
						} else if (!this.qr_code.equals(other.qr_code))
						
							return false;
					

		return true;
    }

	public void copyDataTo(row5Struct other) {

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

	public void copyKeysDataTo(row5Struct other) {

		other.qr_code = this.qr_code;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR, 0, length, utf8Charset);
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
			if(length > commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR) {

        	try {

        		int length = 0;
		
					this.qr_code = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR) {

        	try {

        		int length = 0;
		
					this.qr_code = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.qr_code,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.qr_code,dos);
					
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
		
			            this.id_pdv = dis.readLong();
					
			            this.id_secteur = dis.readLong();
					
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
		
			            this.id_pdv = objectIn.readLong();
					
			            this.id_secteur = objectIn.readLong();
					
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

		
		            	dos.writeLong(this.id_pdv);
					
		            	dos.writeLong(this.id_secteur);
					
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

		
					objectOut.writeLong(this.id_pdv);
					
					objectOut.writeLong(this.id_secteur);
					
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
    public int compareTo(row5Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.qr_code, other.qr_code);
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
			   		// linked node: tMap_2 - inputs:(line,row4,row5) outputs:(out1,out7)
			   
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
				
				 
	final String decryptedPassword_tDBInput_4 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:C7pVBQOdTie3eeS6wODGd6qLfWdmp5troTrJkj0fsfoU2a6xV40=");
				
				String dbPwd_tDBInput_4 = decryptedPassword_tDBInput_4;
				
				String url_tDBInput_4 = "jdbc:postgresql://" + "163.172.166.119" + ":" + "5432" + "/" + "leuk_analytics";
				
				conn_tDBInput_4 = java.sql.DriverManager.getConnection(url_tDBInput_4,dbUser_tDBInput_4,dbPwd_tDBInput_4);
		        
				conn_tDBInput_4.setAutoCommit(false);
			
		    
			java.sql.Statement stmt_tDBInput_4 = conn_tDBInput_4.createStatement();

		    String dbquery_tDBInput_4 = "SELECT \n  \"public\".\"Dim_PointDeVentes\".\"id_pdv\", \n  \"public\".\"Dim_PointDeVentes\".\"id_secteur\", \n  \"public"
+"\".\"Dim_PointDeVentes\".\"qr_code\", \n  \"public\".\"Dim_PointDeVentes\".\"name\", \n  \"public\".\"Dim_PointDeVentes\"."
+"\"phone\", \n  \"public\".\"Dim_PointDeVentes\".\"address\", \n  \"public\".\"Dim_PointDeVentes\".\"latitude\", \n  \"publi"
+"c\".\"Dim_PointDeVentes\".\"longitude\", \n  \"public\".\"Dim_PointDeVentes\".\"date_creation\", \n  \"public\".\"Dim_Poin"
+"tDeVentes\".\"date_update\", \n  \"public\".\"Dim_PointDeVentes\".\"jourlivraison_1\", \n  \"public\".\"Dim_PointDeVentes"
+"\".\"jourlivraison_2\", \n  \"public\".\"Dim_PointDeVentes\".\"jourlivraison_3\", \n  \"public\".\"Dim_PointDeVentes\".\"c"
+"luster\", \n  \"public\".\"Dim_PointDeVentes\".\"gs\", \n  \"public\".\"Dim_PointDeVentes\".\"statu\", \n  \"public\".\"Dim"
+"_PointDeVentes\".\"secours\"\nFROM \"public\".\"Dim_PointDeVentes\"";
		    

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
								row5.id_pdv = 0;
							} else {
		                          
            row5.id_pdv = rs_tDBInput_4.getLong(1);
            if(rs_tDBInput_4.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_4 < 2) {
								row5.id_secteur = 0;
							} else {
		                          
            row5.id_secteur = rs_tDBInput_4.getLong(2);
            if(rs_tDBInput_4.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_4 < 3) {
								row5.qr_code = null;
							} else {
	                         		
        	row5.qr_code = routines.system.JDBCUtil.getString(rs_tDBInput_4, 3, false);
		                    }
							if(colQtyInRs_tDBInput_4 < 4) {
								row5.name = null;
							} else {
	                         		
        	row5.name = routines.system.JDBCUtil.getString(rs_tDBInput_4, 4, false);
		                    }
							if(colQtyInRs_tDBInput_4 < 5) {
								row5.phone = null;
							} else {
	                         		
        	row5.phone = routines.system.JDBCUtil.getString(rs_tDBInput_4, 5, false);
		                    }
							if(colQtyInRs_tDBInput_4 < 6) {
								row5.address = null;
							} else {
	                         		
        	row5.address = routines.system.JDBCUtil.getString(rs_tDBInput_4, 6, false);
		                    }
							if(colQtyInRs_tDBInput_4 < 7) {
								row5.latitude = null;
							} else {
	                         		
        	row5.latitude = routines.system.JDBCUtil.getString(rs_tDBInput_4, 7, false);
		                    }
							if(colQtyInRs_tDBInput_4 < 8) {
								row5.longitude = null;
							} else {
	                         		
        	row5.longitude = routines.system.JDBCUtil.getString(rs_tDBInput_4, 8, false);
		                    }
							if(colQtyInRs_tDBInput_4 < 9) {
								row5.date_creation = null;
							} else {
										
			row5.date_creation = routines.system.JDBCUtil.getDate(rs_tDBInput_4, 9);
		                    }
							if(colQtyInRs_tDBInput_4 < 10) {
								row5.date_update = null;
							} else {
										
			row5.date_update = routines.system.JDBCUtil.getDate(rs_tDBInput_4, 10);
		                    }
							if(colQtyInRs_tDBInput_4 < 11) {
								row5.jourlivraison_1 = null;
							} else {
	                         		
        	row5.jourlivraison_1 = routines.system.JDBCUtil.getString(rs_tDBInput_4, 11, false);
		                    }
							if(colQtyInRs_tDBInput_4 < 12) {
								row5.jourlivraison_2 = null;
							} else {
	                         		
        	row5.jourlivraison_2 = routines.system.JDBCUtil.getString(rs_tDBInput_4, 12, false);
		                    }
							if(colQtyInRs_tDBInput_4 < 13) {
								row5.jourlivraison_3 = null;
							} else {
	                         		
        	row5.jourlivraison_3 = routines.system.JDBCUtil.getString(rs_tDBInput_4, 13, false);
		                    }
							if(colQtyInRs_tDBInput_4 < 14) {
								row5.cluster = null;
							} else {
	                         		
        	row5.cluster = routines.system.JDBCUtil.getString(rs_tDBInput_4, 14, false);
		                    }
							if(colQtyInRs_tDBInput_4 < 15) {
								row5.gs = null;
							} else {
	                         		
            row5.gs = rs_tDBInput_4.getBoolean(15);
            if(rs_tDBInput_4.wasNull()){
                    row5.gs = null;
            }
		                    }
							if(colQtyInRs_tDBInput_4 < 16) {
								row5.statu = null;
							} else {
	                         		
        	row5.statu = routines.system.JDBCUtil.getString(rs_tDBInput_4, 16, false);
		                    }
							if(colQtyInRs_tDBInput_4 < 17) {
								row5.secours = null;
							} else {
	                         		
            row5.secours = rs_tDBInput_4.getBoolean(17);
            if(rs_tDBInput_4.wasNull()){
                    row5.secours = null;
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
		   	   	   
				
				row5_HashRow.id_pdv = row5.id_pdv;
				
				row5_HashRow.id_secteur = row5.id_secteur;
				
				row5_HashRow.qr_code = row5.qr_code;
				
				row5_HashRow.name = row5.name;
				
				row5_HashRow.phone = row5.phone;
				
				row5_HashRow.address = row5.address;
				
				row5_HashRow.latitude = row5.latitude;
				
				row5_HashRow.longitude = row5.longitude;
				
				row5_HashRow.date_creation = row5.date_creation;
				
				row5_HashRow.date_update = row5.date_update;
				
				row5_HashRow.jourlivraison_1 = row5.jourlivraison_1;
				
				row5_HashRow.jourlivraison_2 = row5.jourlivraison_2;
				
				row5_HashRow.jourlivraison_3 = row5.jourlivraison_3;
				
				row5_HashRow.cluster = row5.cluster;
				
				row5_HashRow.gs = row5.gs;
				
				row5_HashRow.statu = row5.statu;
				
				row5_HashRow.secours = row5.secours;
				
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
	


public static class row6Struct implements routines.system.IPersistableComparableLookupRow<row6Struct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public int id_temps;

				public int getId_temps () {
					return this.id_temps;
				}
				
			    public java.util.Date date;

				public java.util.Date getDate () {
					return this.date;
				}
				
			    public Integer annee;

				public Integer getAnnee () {
					return this.annee;
				}
				
			    public Integer numero_mois;

				public Integer getNumero_mois () {
					return this.numero_mois;
				}
				
			    public String mois;

				public String getMois () {
					return this.mois;
				}
				
			    public String annee_mois;

				public String getAnnee_mois () {
					return this.annee_mois;
				}
				
			    public Integer numero_jours_semaine;

				public Integer getNumero_jours_semaine () {
					return this.numero_jours_semaine;
				}
				
			    public String jour_semaine;

				public String getJour_semaine () {
					return this.jour_semaine;
				}
				
			    public String semaine;

				public String getSemaine () {
					return this.semaine;
				}
				
			    public String trimestre;

				public String getTrimestre () {
					return this.trimestre;
				}
				
			    public String semestre;

				public String getSemestre () {
					return this.semestre;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.date == null) ? 0 : this.date.hashCode());
					
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
		
						if (this.date == null) {
							if (other.date != null)
								return false;
						
						} else if (!this.date.equals(other.date))
						
							return false;
					

		return true;
    }

	public void copyDataTo(row6Struct other) {

		other.id_temps = this.id_temps;
	            other.date = this.date;
	            other.annee = this.annee;
	            other.numero_mois = this.numero_mois;
	            other.mois = this.mois;
	            other.annee_mois = this.annee_mois;
	            other.numero_jours_semaine = this.numero_jours_semaine;
	            other.jour_semaine = this.jour_semaine;
	            other.semaine = this.semaine;
	            other.trimestre = this.trimestre;
	            other.semestre = this.semestre;
	            
	}

	public void copyKeysDataTo(row6Struct other) {

		other.date = this.date;
	            	
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR) {

        	try {

        		int length = 0;
		
					this.date = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR) {

        	try {

        		int length = 0;
		
					this.date = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// java.util.Date
				
						writeDate(this.date,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// java.util.Date
				
						writeDate(this.date,dos);
					
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
		
			            this.id_temps = dis.readInt();
					
						this.annee = readInteger(dis,ois);
					
						this.numero_mois = readInteger(dis,ois);
					
						this.mois = readString(dis,ois);
					
						this.annee_mois = readString(dis,ois);
					
						this.numero_jours_semaine = readInteger(dis,ois);
					
						this.jour_semaine = readString(dis,ois);
					
						this.semaine = readString(dis,ois);
					
						this.trimestre = readString(dis,ois);
					
						this.semestre = readString(dis,ois);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
			            this.id_temps = objectIn.readInt();
					
						this.annee = readInteger(dis,objectIn);
					
						this.numero_mois = readInteger(dis,objectIn);
					
						this.mois = readString(dis,objectIn);
					
						this.annee_mois = readString(dis,objectIn);
					
						this.numero_jours_semaine = readInteger(dis,objectIn);
					
						this.jour_semaine = readString(dis,objectIn);
					
						this.semaine = readString(dis,objectIn);
					
						this.trimestre = readString(dis,objectIn);
					
						this.semestre = readString(dis,objectIn);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
		            	dos.writeInt(this.id_temps);
					
					writeInteger(this.annee, dos, oos);
					
					writeInteger(this.numero_mois, dos, oos);
					
						writeString(this.mois, dos, oos);
					
						writeString(this.annee_mois, dos, oos);
					
					writeInteger(this.numero_jours_semaine, dos, oos);
					
						writeString(this.jour_semaine, dos, oos);
					
						writeString(this.semaine, dos, oos);
					
						writeString(this.trimestre, dos, oos);
					
						writeString(this.semestre, dos, oos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
					objectOut.writeInt(this.id_temps);
					
					writeInteger(this.annee, dos, objectOut);
					
					writeInteger(this.numero_mois, dos, objectOut);
					
						writeString(this.mois, dos, objectOut);
					
						writeString(this.annee_mois, dos, objectOut);
					
					writeInteger(this.numero_jours_semaine, dos, objectOut);
					
						writeString(this.jour_semaine, dos, objectOut);
					
						writeString(this.semaine, dos, objectOut);
					
						writeString(this.trimestre, dos, objectOut);
					
						writeString(this.semestre, dos, objectOut);
					
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
		sb.append("id_temps="+String.valueOf(id_temps));
		sb.append(",date="+String.valueOf(date));
		sb.append(",annee="+String.valueOf(annee));
		sb.append(",numero_mois="+String.valueOf(numero_mois));
		sb.append(",mois="+mois);
		sb.append(",annee_mois="+annee_mois);
		sb.append(",numero_jours_semaine="+String.valueOf(numero_jours_semaine));
		sb.append(",jour_semaine="+jour_semaine);
		sb.append(",semaine="+semaine);
		sb.append(",trimestre="+trimestre);
		sb.append(",semestre="+semestre);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row6Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.date, other.date);
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



		row6Struct row6 = new row6Struct();




	
	/**
	 * [tAdvancedHash_row6 begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_row6", false);
		start_Hash.put("tAdvancedHash_row6", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_row6";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row6");
					}
				
		int tos_count_tAdvancedHash_row6 = 0;
		

			   		// connection name:row6
			   		// source node:tDBInput_5 - inputs:(after_tDBInput_1) outputs:(row6,row6) | target node:tAdvancedHash_row6 - inputs:(row6) outputs:()
			   		// linked node: tMap_3 - inputs:(out1,row6) outputs:(out2)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row6 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row6Struct> tHash_Lookup_row6 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row6Struct>getLookup(matchingModeEnum_row6);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row6", tHash_Lookup_row6);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row6 begin ] stop
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
				
				 
	final String decryptedPassword_tDBInput_5 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:iVSfaclyrezEEVIM7sT1JqZYFDUKr5r7uYXdH+Y5qJlWo0DrPhs=");
				
				String dbPwd_tDBInput_5 = decryptedPassword_tDBInput_5;
				
				String url_tDBInput_5 = "jdbc:postgresql://" + "163.172.166.119" + ":" + "5432" + "/" + "leuk_analytics";
				
				conn_tDBInput_5 = java.sql.DriverManager.getConnection(url_tDBInput_5,dbUser_tDBInput_5,dbPwd_tDBInput_5);
		        
				conn_tDBInput_5.setAutoCommit(false);
			
		    
			java.sql.Statement stmt_tDBInput_5 = conn_tDBInput_5.createStatement();

		    String dbquery_tDBInput_5 = "SELECT \n  \"public\".\"Dim_Temps\".\"id_temps\", \n  \"public\".\"Dim_Temps\".\"date\", \n  \"public\".\"Dim_Temps\".\"an"
+"nee\", \n  \"public\".\"Dim_Temps\".\"numero_mois\", \n  \"public\".\"Dim_Temps\".\"mois\", \n  \"public\".\"Dim_Temps\".\""
+"annee_mois\", \n  \"public\".\"Dim_Temps\".\"numero_jours_semaine\", \n  \"public\".\"Dim_Temps\".\"jour_semaine\", \n  \"p"
+"ublic\".\"Dim_Temps\".\"semaine\", \n  \"public\".\"Dim_Temps\".\"trimestre\", \n  \"public\".\"Dim_Temps\".\"semestre\"\nF"
+"ROM \"public\".\"Dim_Temps\"\nWHERE  \"public\".\"Dim_Temps\".\"date\" Between CURRENT_DATE - INTERVAL '2 DAY' and CURRE"
+"NT_DATE - INTERVAL '1 DAY'\nORDER BY    \"public\".\"Dim_Temps\".\"id_temps\" ASC";
		    

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
								row6.id_temps = 0;
							} else {
		                          
            row6.id_temps = rs_tDBInput_5.getInt(1);
            if(rs_tDBInput_5.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_5 < 2) {
								row6.date = null;
							} else {
										
			row6.date = routines.system.JDBCUtil.getDate(rs_tDBInput_5, 2);
		                    }
							if(colQtyInRs_tDBInput_5 < 3) {
								row6.annee = null;
							} else {
		                          
            row6.annee = rs_tDBInput_5.getInt(3);
            if(rs_tDBInput_5.wasNull()){
                    row6.annee = null;
            }
		                    }
							if(colQtyInRs_tDBInput_5 < 4) {
								row6.numero_mois = null;
							} else {
		                          
            row6.numero_mois = rs_tDBInput_5.getInt(4);
            if(rs_tDBInput_5.wasNull()){
                    row6.numero_mois = null;
            }
		                    }
							if(colQtyInRs_tDBInput_5 < 5) {
								row6.mois = null;
							} else {
	                         		
        	row6.mois = routines.system.JDBCUtil.getString(rs_tDBInput_5, 5, false);
		                    }
							if(colQtyInRs_tDBInput_5 < 6) {
								row6.annee_mois = null;
							} else {
	                         		
        	row6.annee_mois = routines.system.JDBCUtil.getString(rs_tDBInput_5, 6, false);
		                    }
							if(colQtyInRs_tDBInput_5 < 7) {
								row6.numero_jours_semaine = null;
							} else {
		                          
            row6.numero_jours_semaine = rs_tDBInput_5.getInt(7);
            if(rs_tDBInput_5.wasNull()){
                    row6.numero_jours_semaine = null;
            }
		                    }
							if(colQtyInRs_tDBInput_5 < 8) {
								row6.jour_semaine = null;
							} else {
	                         		
        	row6.jour_semaine = routines.system.JDBCUtil.getString(rs_tDBInput_5, 8, false);
		                    }
							if(colQtyInRs_tDBInput_5 < 9) {
								row6.semaine = null;
							} else {
	                         		
        	row6.semaine = routines.system.JDBCUtil.getString(rs_tDBInput_5, 9, false);
		                    }
							if(colQtyInRs_tDBInput_5 < 10) {
								row6.trimestre = null;
							} else {
	                         		
        	row6.trimestre = routines.system.JDBCUtil.getString(rs_tDBInput_5, 10, false);
		                    }
							if(colQtyInRs_tDBInput_5 < 11) {
								row6.semestre = null;
							} else {
	                         		
        	row6.semestre = routines.system.JDBCUtil.getString(rs_tDBInput_5, 11, false);
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
	 * [tAdvancedHash_row6 main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row6";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row6"
						
						);
					}
					


			   
			   

					row6Struct row6_HashRow = new row6Struct();
		   	   	   
				
				row6_HashRow.id_temps = row6.id_temps;
				
				row6_HashRow.date = row6.date;
				
				row6_HashRow.annee = row6.annee;
				
				row6_HashRow.numero_mois = row6.numero_mois;
				
				row6_HashRow.mois = row6.mois;
				
				row6_HashRow.annee_mois = row6.annee_mois;
				
				row6_HashRow.numero_jours_semaine = row6.numero_jours_semaine;
				
				row6_HashRow.jour_semaine = row6.jour_semaine;
				
				row6_HashRow.semaine = row6.semaine;
				
				row6_HashRow.trimestre = row6.trimestre;
				
				row6_HashRow.semestre = row6.semestre;
				
			tHash_Lookup_row6.put(row6_HashRow);
			
            




 


	tos_count_tAdvancedHash_row6++;

/**
 * [tAdvancedHash_row6 main ] stop
 */
	
	/**
	 * [tAdvancedHash_row6 process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row6";

	

 



/**
 * [tAdvancedHash_row6 process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_row6 process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row6";

	

 



/**
 * [tAdvancedHash_row6 process_data_end ] stop
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
	 * [tAdvancedHash_row6 end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row6";

	

tHash_Lookup_row6.endPut();

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row6");
			  	}
			  	
 

ok_Hash.put("tAdvancedHash_row6", true);
end_Hash.put("tAdvancedHash_row6", System.currentTimeMillis());




/**
 * [tAdvancedHash_row6 end ] stop
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
	 * [tAdvancedHash_row6 finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row6";

	

 



/**
 * [tAdvancedHash_row6 finally ] stop
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
	


public static class row8Struct implements routines.system.IPersistableComparableLookupRow<row8Struct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public int id_faitvendeur;

				public int getId_faitvendeur () {
					return this.id_faitvendeur;
				}
				
			    public Long id_secteur;

				public Long getId_secteur () {
					return this.id_secteur;
				}
				
			    public Long id_produit;

				public Long getId_produit () {
					return this.id_produit;
				}
				
			    public Integer id_temps;

				public Integer getId_temps () {
					return this.id_temps;
				}
				
			    public Long id_pdv;

				public Long getId_pdv () {
					return this.id_pdv;
				}
				
			    public Double cattc;

				public Double getCattc () {
					return this.cattc;
				}
				
			    public Double caht;

				public Double getCaht () {
					return this.caht;
				}
				
			    public Double pertes;

				public Double getPertes () {
					return this.pertes;
				}
				
			    public Integer qte_vendu;

				public Integer getQte_vendu () {
					return this.qte_vendu;
				}
				
			    public Integer volume_total;

				public Integer getVolume_total () {
					return this.volume_total;
				}
				
			    public Integer penetration_p;

				public Integer getPenetration_p () {
					return this.penetration_p;
				}
				
			    public Integer penetration_g;

				public Integer getPenetration_g () {
					return this.penetration_g;
				}
				
			    public Integer ruptures;

				public Integer getRuptures () {
					return this.ruptures;
				}
				
			    public Integer com_intelligente;

				public Integer getCom_intelligente () {
					return this.com_intelligente;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.id_secteur == null) ? 0 : this.id_secteur.hashCode());
					
						result = prime * result + ((this.id_produit == null) ? 0 : this.id_produit.hashCode());
					
						result = prime * result + ((this.id_temps == null) ? 0 : this.id_temps.hashCode());
					
						result = prime * result + ((this.id_pdv == null) ? 0 : this.id_pdv.hashCode());
					
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
		
						if (this.id_secteur == null) {
							if (other.id_secteur != null)
								return false;
						
						} else if (!this.id_secteur.equals(other.id_secteur))
						
							return false;
					
						if (this.id_produit == null) {
							if (other.id_produit != null)
								return false;
						
						} else if (!this.id_produit.equals(other.id_produit))
						
							return false;
					
						if (this.id_temps == null) {
							if (other.id_temps != null)
								return false;
						
						} else if (!this.id_temps.equals(other.id_temps))
						
							return false;
					
						if (this.id_pdv == null) {
							if (other.id_pdv != null)
								return false;
						
						} else if (!this.id_pdv.equals(other.id_pdv))
						
							return false;
					

		return true;
    }

	public void copyDataTo(row8Struct other) {

		other.id_faitvendeur = this.id_faitvendeur;
	            other.id_secteur = this.id_secteur;
	            other.id_produit = this.id_produit;
	            other.id_temps = this.id_temps;
	            other.id_pdv = this.id_pdv;
	            other.cattc = this.cattc;
	            other.caht = this.caht;
	            other.pertes = this.pertes;
	            other.qte_vendu = this.qte_vendu;
	            other.volume_total = this.volume_total;
	            other.penetration_p = this.penetration_p;
	            other.penetration_g = this.penetration_g;
	            other.ruptures = this.ruptures;
	            other.com_intelligente = this.com_intelligente;
	            
	}

	public void copyKeysDataTo(row8Struct other) {

		other.id_secteur = this.id_secteur;
	            	other.id_produit = this.id_produit;
	            	other.id_temps = this.id_temps;
	            	other.id_pdv = this.id_pdv;
	            	
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR) {

        	try {

        		int length = 0;
		
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.id_secteur = null;
           				} else {
           			    	this.id_secteur = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.id_produit = null;
           				} else {
           			    	this.id_produit = dis.readLong();
           				}
					
						this.id_temps = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.id_pdv = null;
           				} else {
           			    	this.id_pdv = dis.readLong();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR) {

        	try {

        		int length = 0;
		
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.id_secteur = null;
           				} else {
           			    	this.id_secteur = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.id_produit = null;
           				} else {
           			    	this.id_produit = dis.readLong();
           				}
					
						this.id_temps = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.id_pdv = null;
           				} else {
           			    	this.id_pdv = dis.readLong();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// Long
				
						if(this.id_secteur == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.id_secteur);
		            	}
					
					// Long
				
						if(this.id_produit == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.id_produit);
		            	}
					
					// Integer
				
						writeInteger(this.id_temps,dos);
					
					// Long
				
						if(this.id_pdv == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.id_pdv);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// Long
				
						if(this.id_secteur == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.id_secteur);
		            	}
					
					// Long
				
						if(this.id_produit == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.id_produit);
		            	}
					
					// Integer
				
						writeInteger(this.id_temps,dos);
					
					// Long
				
						if(this.id_pdv == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.id_pdv);
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
		
			            this.id_faitvendeur = dis.readInt();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.cattc = null;
           				} else {
           			    	this.cattc = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.caht = null;
           				} else {
           			    	this.caht = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.pertes = null;
           				} else {
           			    	this.pertes = dis.readDouble();
           				}
					
						this.qte_vendu = readInteger(dis,ois);
					
						this.volume_total = readInteger(dis,ois);
					
						this.penetration_p = readInteger(dis,ois);
					
						this.penetration_g = readInteger(dis,ois);
					
						this.ruptures = readInteger(dis,ois);
					
						this.com_intelligente = readInteger(dis,ois);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
			            this.id_faitvendeur = objectIn.readInt();
					
			            length = objectIn.readByte();
           				if (length == -1) {
           	    			this.cattc = null;
           				} else {
           			    	this.cattc = objectIn.readDouble();
           				}
					
			            length = objectIn.readByte();
           				if (length == -1) {
           	    			this.caht = null;
           				} else {
           			    	this.caht = objectIn.readDouble();
           				}
					
			            length = objectIn.readByte();
           				if (length == -1) {
           	    			this.pertes = null;
           				} else {
           			    	this.pertes = objectIn.readDouble();
           				}
					
						this.qte_vendu = readInteger(dis,objectIn);
					
						this.volume_total = readInteger(dis,objectIn);
					
						this.penetration_p = readInteger(dis,objectIn);
					
						this.penetration_g = readInteger(dis,objectIn);
					
						this.ruptures = readInteger(dis,objectIn);
					
						this.com_intelligente = readInteger(dis,objectIn);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
		            	dos.writeInt(this.id_faitvendeur);
					
						if(this.cattc == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.cattc);
		            	}
					
						if(this.caht == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.caht);
		            	}
					
						if(this.pertes == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.pertes);
		            	}
					
					writeInteger(this.qte_vendu, dos, oos);
					
					writeInteger(this.volume_total, dos, oos);
					
					writeInteger(this.penetration_p, dos, oos);
					
					writeInteger(this.penetration_g, dos, oos);
					
					writeInteger(this.ruptures, dos, oos);
					
					writeInteger(this.com_intelligente, dos, oos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
					objectOut.writeInt(this.id_faitvendeur);
					
						if(this.cattc == null) {
							objectOut.writeByte(-1);
						} else {
							objectOut.writeByte(0);
							objectOut.writeDouble(this.cattc);
		            	}
					
						if(this.caht == null) {
							objectOut.writeByte(-1);
						} else {
							objectOut.writeByte(0);
							objectOut.writeDouble(this.caht);
		            	}
					
						if(this.pertes == null) {
							objectOut.writeByte(-1);
						} else {
							objectOut.writeByte(0);
							objectOut.writeDouble(this.pertes);
		            	}
					
					writeInteger(this.qte_vendu, dos, objectOut);
					
					writeInteger(this.volume_total, dos, objectOut);
					
					writeInteger(this.penetration_p, dos, objectOut);
					
					writeInteger(this.penetration_g, dos, objectOut);
					
					writeInteger(this.ruptures, dos, objectOut);
					
					writeInteger(this.com_intelligente, dos, objectOut);
					
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
		sb.append("id_faitvendeur="+String.valueOf(id_faitvendeur));
		sb.append(",id_secteur="+String.valueOf(id_secteur));
		sb.append(",id_produit="+String.valueOf(id_produit));
		sb.append(",id_temps="+String.valueOf(id_temps));
		sb.append(",id_pdv="+String.valueOf(id_pdv));
		sb.append(",cattc="+String.valueOf(cattc));
		sb.append(",caht="+String.valueOf(caht));
		sb.append(",pertes="+String.valueOf(pertes));
		sb.append(",qte_vendu="+String.valueOf(qte_vendu));
		sb.append(",volume_total="+String.valueOf(volume_total));
		sb.append(",penetration_p="+String.valueOf(penetration_p));
		sb.append(",penetration_g="+String.valueOf(penetration_g));
		sb.append(",ruptures="+String.valueOf(ruptures));
		sb.append(",com_intelligente="+String.valueOf(com_intelligente));
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

					
						returnValue = checkNullsAndCompare(this.id_produit, other.id_produit);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.id_temps, other.id_temps);
						if(returnValue != 0) {
							return returnValue;
						}

					
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
			   		// source node:tDBInput_6 - inputs:(after_tDBInput_1) outputs:(row8,row8) | target node:tAdvancedHash_row8 - inputs:(row8) outputs:()
			   		// linked node: tMap_5 - inputs:(row7,row8) outputs:(out6,out3)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row8 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row8Struct> tHash_Lookup_row8 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row8Struct>getLookup(matchingModeEnum_row8);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row8", tHash_Lookup_row8);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row8 begin ] stop
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
				
				 
	final String decryptedPassword_tDBInput_6 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:NaEX++fEToQFe1O+9g+pMmWxN5tc452Gc+MWHlobdzhdW7Df5eU=");
				
				String dbPwd_tDBInput_6 = decryptedPassword_tDBInput_6;
				
				String url_tDBInput_6 = "jdbc:postgresql://" + "163.172.166.119" + ":" + "5432" + "/" + "leuk_analytics";
				
				conn_tDBInput_6 = java.sql.DriverManager.getConnection(url_tDBInput_6,dbUser_tDBInput_6,dbPwd_tDBInput_6);
		        
				conn_tDBInput_6.setAutoCommit(false);
			
		    
			java.sql.Statement stmt_tDBInput_6 = conn_tDBInput_6.createStatement();

		    String dbquery_tDBInput_6 = "SELECT \n  \"public\".\"Fait_Vendeur\".\"id_faitvendeur\", \n  \"public\".\"Fait_Vendeur\".\"id_secteur\", \n  \"public\"."
+"\"Fait_Vendeur\".\"id_produit\", \n  \"public\".\"Fait_Vendeur\".\"id_temps\", \n  \"public\".\"Fait_Vendeur\".\"id_pdv\","
+" \n  \"public\".\"Fait_Vendeur\".\"cattc\", \n  \"public\".\"Fait_Vendeur\".\"caht\", \n  \"public\".\"Fait_Vendeur\".\"per"
+"tes\", \n  \"public\".\"Fait_Vendeur\".\"qte_vendu\", \n  \"public\".\"Fait_Vendeur\".\"volume_total\", \n  \"public\".\"Fa"
+"it_Vendeur\".\"penetration_p\", \n  \"public\".\"Fait_Vendeur\".\"penetration_g\", \n  \"public\".\"Fait_Vendeur\".\"ruptu"
+"res\", \n  \"public\".\"Fait_Vendeur\".\"com_intelligente\"\nFROM \"public\".\"Fait_Vendeur\"\nINNER JOIN \"public\".\"Dim"
+"_Temps\" On \"public\".\"Fait_Vendeur\".\"id_temps\" = \"public\".\"Dim_Temps\".\"id_temps\"\nwhere \"public\".\"Dim_Tem"
+"ps\".\"date\"  between CURRENT_DATE - INTERVAL '5 day' and CURRENT_DATE - INTERVAL '1 day'\nORDER BY    \"public\".\"Fai"
+"t_Vendeur\".\"id_faitvendeur\" asc";
		    

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
								row8.id_faitvendeur = 0;
							} else {
		                          
            row8.id_faitvendeur = rs_tDBInput_6.getInt(1);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 2) {
								row8.id_secteur = null;
							} else {
		                          
            row8.id_secteur = rs_tDBInput_6.getLong(2);
            if(rs_tDBInput_6.wasNull()){
                    row8.id_secteur = null;
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 3) {
								row8.id_produit = null;
							} else {
		                          
            row8.id_produit = rs_tDBInput_6.getLong(3);
            if(rs_tDBInput_6.wasNull()){
                    row8.id_produit = null;
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 4) {
								row8.id_temps = null;
							} else {
		                          
            row8.id_temps = rs_tDBInput_6.getInt(4);
            if(rs_tDBInput_6.wasNull()){
                    row8.id_temps = null;
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 5) {
								row8.id_pdv = null;
							} else {
		                          
            row8.id_pdv = rs_tDBInput_6.getLong(5);
            if(rs_tDBInput_6.wasNull()){
                    row8.id_pdv = null;
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 6) {
								row8.cattc = null;
							} else {
	                         		
            row8.cattc = rs_tDBInput_6.getDouble(6);
            if(rs_tDBInput_6.wasNull()){
                    row8.cattc = null;
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 7) {
								row8.caht = null;
							} else {
	                         		
            row8.caht = rs_tDBInput_6.getDouble(7);
            if(rs_tDBInput_6.wasNull()){
                    row8.caht = null;
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 8) {
								row8.pertes = null;
							} else {
	                         		
            row8.pertes = rs_tDBInput_6.getDouble(8);
            if(rs_tDBInput_6.wasNull()){
                    row8.pertes = null;
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 9) {
								row8.qte_vendu = null;
							} else {
		                          
            row8.qte_vendu = rs_tDBInput_6.getInt(9);
            if(rs_tDBInput_6.wasNull()){
                    row8.qte_vendu = null;
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 10) {
								row8.volume_total = null;
							} else {
		                          
            row8.volume_total = rs_tDBInput_6.getInt(10);
            if(rs_tDBInput_6.wasNull()){
                    row8.volume_total = null;
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 11) {
								row8.penetration_p = null;
							} else {
		                          
            row8.penetration_p = rs_tDBInput_6.getInt(11);
            if(rs_tDBInput_6.wasNull()){
                    row8.penetration_p = null;
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 12) {
								row8.penetration_g = null;
							} else {
		                          
            row8.penetration_g = rs_tDBInput_6.getInt(12);
            if(rs_tDBInput_6.wasNull()){
                    row8.penetration_g = null;
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 13) {
								row8.ruptures = null;
							} else {
		                          
            row8.ruptures = rs_tDBInput_6.getInt(13);
            if(rs_tDBInput_6.wasNull()){
                    row8.ruptures = null;
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 14) {
								row8.com_intelligente = null;
							} else {
		                          
            row8.com_intelligente = rs_tDBInput_6.getInt(14);
            if(rs_tDBInput_6.wasNull()){
                    row8.com_intelligente = null;
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
	 * [tAdvancedHash_row8 main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row8";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row8"
						
						);
					}
					


			   
			   

					row8Struct row8_HashRow = new row8Struct();
		   	   	   
				
				row8_HashRow.id_faitvendeur = row8.id_faitvendeur;
				
				row8_HashRow.id_secteur = row8.id_secteur;
				
				row8_HashRow.id_produit = row8.id_produit;
				
				row8_HashRow.id_temps = row8.id_temps;
				
				row8_HashRow.id_pdv = row8.id_pdv;
				
				row8_HashRow.cattc = row8.cattc;
				
				row8_HashRow.caht = row8.caht;
				
				row8_HashRow.pertes = row8.pertes;
				
				row8_HashRow.qte_vendu = row8.qte_vendu;
				
				row8_HashRow.volume_total = row8.volume_total;
				
				row8_HashRow.penetration_p = row8.penetration_p;
				
				row8_HashRow.penetration_g = row8.penetration_g;
				
				row8_HashRow.ruptures = row8.ruptures;
				
				row8_HashRow.com_intelligente = row8.com_intelligente;
				
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
	 * [tDBInput_6 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_6";

	

 



/**
 * [tDBInput_6 finally ] stop
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
		

		globalMap.put("tDBInput_6_SUBPROCESS_STATE", 1);
	}
	


public static class row9Struct implements routines.system.IPersistableRow<row9Struct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[0];

	
			    public int id_faitvendeur;

				public int getId_faitvendeur () {
					return this.id_faitvendeur;
				}
				
			    public Long id_secteur;

				public Long getId_secteur () {
					return this.id_secteur;
				}
				
			    public Long id_produit;

				public Long getId_produit () {
					return this.id_produit;
				}
				
			    public Integer id_temps;

				public Integer getId_temps () {
					return this.id_temps;
				}
				
			    public Long id_pdv;

				public Long getId_pdv () {
					return this.id_pdv;
				}
				
			    public Double cattc;

				public Double getCattc () {
					return this.cattc;
				}
				
			    public Double caht;

				public Double getCaht () {
					return this.caht;
				}
				
			    public Double pertes;

				public Double getPertes () {
					return this.pertes;
				}
				
			    public Integer qte_vendu;

				public Integer getQte_vendu () {
					return this.qte_vendu;
				}
				
			    public Integer volume_total;

				public Integer getVolume_total () {
					return this.volume_total;
				}
				
			    public Integer penetration_p;

				public Integer getPenetration_p () {
					return this.penetration_p;
				}
				
			    public Integer penetration_g;

				public Integer getPenetration_g () {
					return this.penetration_g;
				}
				
			    public Integer ruptures;

				public Integer getRuptures () {
					return this.ruptures;
				}
				
			    public Integer com_intelligente;

				public Integer getCom_intelligente () {
					return this.com_intelligente;
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR) {

        	try {

        		int length = 0;
		
			        this.id_faitvendeur = dis.readInt();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.id_secteur = null;
           				} else {
           			    	this.id_secteur = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.id_produit = null;
           				} else {
           			    	this.id_produit = dis.readLong();
           				}
					
						this.id_temps = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.id_pdv = null;
           				} else {
           			    	this.id_pdv = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.cattc = null;
           				} else {
           			    	this.cattc = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.caht = null;
           				} else {
           			    	this.caht = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.pertes = null;
           				} else {
           			    	this.pertes = dis.readDouble();
           				}
					
						this.qte_vendu = readInteger(dis);
					
						this.volume_total = readInteger(dis);
					
						this.penetration_p = readInteger(dis);
					
						this.penetration_g = readInteger(dis);
					
						this.ruptures = readInteger(dis);
					
						this.com_intelligente = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR) {

        	try {

        		int length = 0;
		
			        this.id_faitvendeur = dis.readInt();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.id_secteur = null;
           				} else {
           			    	this.id_secteur = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.id_produit = null;
           				} else {
           			    	this.id_produit = dis.readLong();
           				}
					
						this.id_temps = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.id_pdv = null;
           				} else {
           			    	this.id_pdv = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.cattc = null;
           				} else {
           			    	this.cattc = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.caht = null;
           				} else {
           			    	this.caht = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.pertes = null;
           				} else {
           			    	this.pertes = dis.readDouble();
           				}
					
						this.qte_vendu = readInteger(dis);
					
						this.volume_total = readInteger(dis);
					
						this.penetration_p = readInteger(dis);
					
						this.penetration_g = readInteger(dis);
					
						this.ruptures = readInteger(dis);
					
						this.com_intelligente = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id_faitvendeur);
					
					// Long
				
						if(this.id_secteur == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.id_secteur);
		            	}
					
					// Long
				
						if(this.id_produit == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.id_produit);
		            	}
					
					// Integer
				
						writeInteger(this.id_temps,dos);
					
					// Long
				
						if(this.id_pdv == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.id_pdv);
		            	}
					
					// Double
				
						if(this.cattc == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.cattc);
		            	}
					
					// Double
				
						if(this.caht == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.caht);
		            	}
					
					// Double
				
						if(this.pertes == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.pertes);
		            	}
					
					// Integer
				
						writeInteger(this.qte_vendu,dos);
					
					// Integer
				
						writeInteger(this.volume_total,dos);
					
					// Integer
				
						writeInteger(this.penetration_p,dos);
					
					// Integer
				
						writeInteger(this.penetration_g,dos);
					
					// Integer
				
						writeInteger(this.ruptures,dos);
					
					// Integer
				
						writeInteger(this.com_intelligente,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id_faitvendeur);
					
					// Long
				
						if(this.id_secteur == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.id_secteur);
		            	}
					
					// Long
				
						if(this.id_produit == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.id_produit);
		            	}
					
					// Integer
				
						writeInteger(this.id_temps,dos);
					
					// Long
				
						if(this.id_pdv == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.id_pdv);
		            	}
					
					// Double
				
						if(this.cattc == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.cattc);
		            	}
					
					// Double
				
						if(this.caht == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.caht);
		            	}
					
					// Double
				
						if(this.pertes == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.pertes);
		            	}
					
					// Integer
				
						writeInteger(this.qte_vendu,dos);
					
					// Integer
				
						writeInteger(this.volume_total,dos);
					
					// Integer
				
						writeInteger(this.penetration_p,dos);
					
					// Integer
				
						writeInteger(this.penetration_g,dos);
					
					// Integer
				
						writeInteger(this.ruptures,dos);
					
					// Integer
				
						writeInteger(this.com_intelligente,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id_faitvendeur="+String.valueOf(id_faitvendeur));
		sb.append(",id_secteur="+String.valueOf(id_secteur));
		sb.append(",id_produit="+String.valueOf(id_produit));
		sb.append(",id_temps="+String.valueOf(id_temps));
		sb.append(",id_pdv="+String.valueOf(id_pdv));
		sb.append(",cattc="+String.valueOf(cattc));
		sb.append(",caht="+String.valueOf(caht));
		sb.append(",pertes="+String.valueOf(pertes));
		sb.append(",qte_vendu="+String.valueOf(qte_vendu));
		sb.append(",volume_total="+String.valueOf(volume_total));
		sb.append(",penetration_p="+String.valueOf(penetration_p));
		sb.append(",penetration_g="+String.valueOf(penetration_g));
		sb.append(",ruptures="+String.valueOf(ruptures));
		sb.append(",com_intelligente="+String.valueOf(com_intelligente));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row9Struct other) {

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



		row9Struct row9 = new row9Struct();




	
	/**
	 * [tAdvancedHash_row9 begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_row9", false);
		start_Hash.put("tAdvancedHash_row9", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_row9";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row9");
					}
				
		int tos_count_tAdvancedHash_row9 = 0;
		

			   		// connection name:row9
			   		// source node:tDBInput_7 - inputs:(after_tDBInput_1) outputs:(row9,row9) | target node:tAdvancedHash_row9 - inputs:(row9) outputs:()
			   		// linked node: tMap_4 - inputs:(out6,row9) outputs:(out5)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row9 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.ALL_ROWS;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row9Struct> tHash_Lookup_row9 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row9Struct>getLookup(matchingModeEnum_row9);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row9", tHash_Lookup_row9);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row9 begin ] stop
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
				
				 
	final String decryptedPassword_tDBInput_7 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:PsnTcsnQ6ba5L8PDJak4TUsk+hMKch9usqMb9pCeVq8zJCK4ULs=");
				
				String dbPwd_tDBInput_7 = decryptedPassword_tDBInput_7;
				
				String url_tDBInput_7 = "jdbc:postgresql://" + "163.172.166.119" + ":" + "5432" + "/" + "leuk_analytics";
				
				conn_tDBInput_7 = java.sql.DriverManager.getConnection(url_tDBInput_7,dbUser_tDBInput_7,dbPwd_tDBInput_7);
		        
				conn_tDBInput_7.setAutoCommit(false);
			
		    
			java.sql.Statement stmt_tDBInput_7 = conn_tDBInput_7.createStatement();

		    String dbquery_tDBInput_7 = "SELECT \n  \"public\".\"Fait_Vendeur\".\"id_faitvendeur\", \n  \"public\".\"Fait_Vendeur\".\"id_secteur\", \n  \"public\"."
+"\"Fait_Vendeur\".\"id_produit\", \n  \"public\".\"Fait_Vendeur\".\"id_temps\", \n  \"public\".\"Fait_Vendeur\".\"id_pdv\","
+" \n  \"public\".\"Fait_Vendeur\".\"cattc\", \n  \"public\".\"Fait_Vendeur\".\"caht\", \n  \"public\".\"Fait_Vendeur\".\"per"
+"tes\", \n  \"public\".\"Fait_Vendeur\".\"qte_vendu\", \n  \"public\".\"Fait_Vendeur\".\"volume_total\", \n  \"public\".\"Fa"
+"it_Vendeur\".\"penetration_p\", \n  \"public\".\"Fait_Vendeur\".\"penetration_g\", \n  \"public\".\"Fait_Vendeur\".\"ruptu"
+"res\", \n  \"public\".\"Fait_Vendeur\".\"com_intelligente\"\nFROM \"public\".\"Fait_Vendeur\"\nORDER BY   \"public\".\"Fai"
+"t_Vendeur\".\"id_faitvendeur\" desc\nLIMIT 1";
		    

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
								row9.id_faitvendeur = 0;
							} else {
		                          
            row9.id_faitvendeur = rs_tDBInput_7.getInt(1);
            if(rs_tDBInput_7.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_7 < 2) {
								row9.id_secteur = null;
							} else {
		                          
            row9.id_secteur = rs_tDBInput_7.getLong(2);
            if(rs_tDBInput_7.wasNull()){
                    row9.id_secteur = null;
            }
		                    }
							if(colQtyInRs_tDBInput_7 < 3) {
								row9.id_produit = null;
							} else {
		                          
            row9.id_produit = rs_tDBInput_7.getLong(3);
            if(rs_tDBInput_7.wasNull()){
                    row9.id_produit = null;
            }
		                    }
							if(colQtyInRs_tDBInput_7 < 4) {
								row9.id_temps = null;
							} else {
		                          
            row9.id_temps = rs_tDBInput_7.getInt(4);
            if(rs_tDBInput_7.wasNull()){
                    row9.id_temps = null;
            }
		                    }
							if(colQtyInRs_tDBInput_7 < 5) {
								row9.id_pdv = null;
							} else {
		                          
            row9.id_pdv = rs_tDBInput_7.getLong(5);
            if(rs_tDBInput_7.wasNull()){
                    row9.id_pdv = null;
            }
		                    }
							if(colQtyInRs_tDBInput_7 < 6) {
								row9.cattc = null;
							} else {
	                         		
            row9.cattc = rs_tDBInput_7.getDouble(6);
            if(rs_tDBInput_7.wasNull()){
                    row9.cattc = null;
            }
		                    }
							if(colQtyInRs_tDBInput_7 < 7) {
								row9.caht = null;
							} else {
	                         		
            row9.caht = rs_tDBInput_7.getDouble(7);
            if(rs_tDBInput_7.wasNull()){
                    row9.caht = null;
            }
		                    }
							if(colQtyInRs_tDBInput_7 < 8) {
								row9.pertes = null;
							} else {
	                         		
            row9.pertes = rs_tDBInput_7.getDouble(8);
            if(rs_tDBInput_7.wasNull()){
                    row9.pertes = null;
            }
		                    }
							if(colQtyInRs_tDBInput_7 < 9) {
								row9.qte_vendu = null;
							} else {
		                          
            row9.qte_vendu = rs_tDBInput_7.getInt(9);
            if(rs_tDBInput_7.wasNull()){
                    row9.qte_vendu = null;
            }
		                    }
							if(colQtyInRs_tDBInput_7 < 10) {
								row9.volume_total = null;
							} else {
		                          
            row9.volume_total = rs_tDBInput_7.getInt(10);
            if(rs_tDBInput_7.wasNull()){
                    row9.volume_total = null;
            }
		                    }
							if(colQtyInRs_tDBInput_7 < 11) {
								row9.penetration_p = null;
							} else {
		                          
            row9.penetration_p = rs_tDBInput_7.getInt(11);
            if(rs_tDBInput_7.wasNull()){
                    row9.penetration_p = null;
            }
		                    }
							if(colQtyInRs_tDBInput_7 < 12) {
								row9.penetration_g = null;
							} else {
		                          
            row9.penetration_g = rs_tDBInput_7.getInt(12);
            if(rs_tDBInput_7.wasNull()){
                    row9.penetration_g = null;
            }
		                    }
							if(colQtyInRs_tDBInput_7 < 13) {
								row9.ruptures = null;
							} else {
		                          
            row9.ruptures = rs_tDBInput_7.getInt(13);
            if(rs_tDBInput_7.wasNull()){
                    row9.ruptures = null;
            }
		                    }
							if(colQtyInRs_tDBInput_7 < 14) {
								row9.com_intelligente = null;
							} else {
		                          
            row9.com_intelligente = rs_tDBInput_7.getInt(14);
            if(rs_tDBInput_7.wasNull()){
                    row9.com_intelligente = null;
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
	 * [tAdvancedHash_row9 main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row9";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row9"
						
						);
					}
					


			   
			   

					row9Struct row9_HashRow = new row9Struct();
		   	   	   
				
				row9_HashRow.id_faitvendeur = row9.id_faitvendeur;
				
				row9_HashRow.id_secteur = row9.id_secteur;
				
				row9_HashRow.id_produit = row9.id_produit;
				
				row9_HashRow.id_temps = row9.id_temps;
				
				row9_HashRow.id_pdv = row9.id_pdv;
				
				row9_HashRow.cattc = row9.cattc;
				
				row9_HashRow.caht = row9.caht;
				
				row9_HashRow.pertes = row9.pertes;
				
				row9_HashRow.qte_vendu = row9.qte_vendu;
				
				row9_HashRow.volume_total = row9.volume_total;
				
				row9_HashRow.penetration_p = row9.penetration_p;
				
				row9_HashRow.penetration_g = row9.penetration_g;
				
				row9_HashRow.ruptures = row9.ruptures;
				
				row9_HashRow.com_intelligente = row9.com_intelligente;
				
			tHash_Lookup_row9.put(row9_HashRow);
			
            




 


	tos_count_tAdvancedHash_row9++;

/**
 * [tAdvancedHash_row9 main ] stop
 */
	
	/**
	 * [tAdvancedHash_row9 process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row9";

	

 



/**
 * [tAdvancedHash_row9 process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_row9 process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row9";

	

 



/**
 * [tAdvancedHash_row9 process_data_end ] stop
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
	 * [tAdvancedHash_row9 end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row9";

	

tHash_Lookup_row9.endPut();

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row9");
			  	}
			  	
 

ok_Hash.put("tAdvancedHash_row9", true);
end_Hash.put("tAdvancedHash_row9", System.currentTimeMillis());




/**
 * [tAdvancedHash_row9 end ] stop
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
	 * [tAdvancedHash_row9 finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row9";

	

 



/**
 * [tAdvancedHash_row9 finally ] stop
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
	


public static class row11Struct implements routines.system.IPersistableComparableLookupRow<row11Struct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
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
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.qr_code == null) ? 0 : this.qr_code.hashCode());
					
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
		
						if (this.qr_code == null) {
							if (other.qr_code != null)
								return false;
						
						} else if (!this.qr_code.equals(other.qr_code))
						
							return false;
					

		return true;
    }

	public void copyDataTo(row11Struct other) {

		other.id = this.id;
	            other.name = this.name;
	            other.qr_code = this.qr_code;
	            other.phone = this.phone;
	            other.address = this.address;
	            other.lat = this.lat;
	            other.lng = this.lng;
	            other.created_at = this.created_at;
	            other.updated_at = this.updated_at;
	            other.status = this.status;
	            other.zone_id = this.zone_id;
	            other.cluster_id = this.cluster_id;
	            other.paiementmode_id = this.paiementmode_id;
	            other.second_deliveryday = this.second_deliveryday;
	            other.three_deliveryday = this.three_deliveryday;
	            other.golden_shop = this.golden_shop;
	            other.secours = this.secours;
	            other.user_id = this.user_id;
	            other.sector_id = this.sector_id;
	            other.catalog_id = this.catalog_id;
	            other.catalog_promo_id = this.catalog_promo_id;
	            
	}

	public void copyKeysDataTo(row11Struct other) {

		other.qr_code = this.qr_code;
	            	
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

	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR, 0, length, utf8Charset);
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
			if(length > commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR) {

        	try {

        		int length = 0;
		
					this.qr_code = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR) {

        	try {

        		int length = 0;
		
					this.qr_code = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.qr_code,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.qr_code,dos);
					
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
		
			            this.id = dis.readLong();
					
						this.name = readString(dis,ois);
					
						this.phone = readString(dis,ois);
					
						this.address = readString(dis,ois);
					
						this.lat = readString(dis,ois);
					
						this.lng = readString(dis,ois);
					
						this.created_at = readDate(dis,ois);
					
						this.updated_at = readDate(dis,ois);
					
						this.status = readString(dis,ois);
					
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
					
						this.second_deliveryday = readString(dis,ois);
					
						this.three_deliveryday = readString(dis,ois);
					
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
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
			            this.id = objectIn.readLong();
					
						this.name = readString(dis,objectIn);
					
						this.phone = readString(dis,objectIn);
					
						this.address = readString(dis,objectIn);
					
						this.lat = readString(dis,objectIn);
					
						this.lng = readString(dis,objectIn);
					
						this.created_at = readDate(dis,objectIn);
					
						this.updated_at = readDate(dis,objectIn);
					
						this.status = readString(dis,objectIn);
					
			            length = objectIn.readByte();
           				if (length == -1) {
           	    			this.zone_id = null;
           				} else {
           			    	this.zone_id = objectIn.readLong();
           				}
					
			            length = objectIn.readByte();
           				if (length == -1) {
           	    			this.cluster_id = null;
           				} else {
           			    	this.cluster_id = objectIn.readLong();
           				}
					
			            length = objectIn.readByte();
           				if (length == -1) {
           	    			this.paiementmode_id = null;
           				} else {
           			    	this.paiementmode_id = objectIn.readLong();
           				}
					
						this.second_deliveryday = readString(dis,objectIn);
					
						this.three_deliveryday = readString(dis,objectIn);
					
			            length = objectIn.readByte();
           				if (length == -1) {
           	    			this.golden_shop = null;
           				} else {
           			    	this.golden_shop = objectIn.readBoolean();
           				}
					
			            length = objectIn.readByte();
           				if (length == -1) {
           	    			this.secours = null;
           				} else {
           			    	this.secours = objectIn.readBoolean();
           				}
					
			            length = objectIn.readByte();
           				if (length == -1) {
           	    			this.user_id = null;
           				} else {
           			    	this.user_id = objectIn.readLong();
           				}
					
			            length = objectIn.readByte();
           				if (length == -1) {
           	    			this.sector_id = null;
           				} else {
           			    	this.sector_id = objectIn.readLong();
           				}
					
			            length = objectIn.readByte();
           				if (length == -1) {
           	    			this.catalog_id = null;
           				} else {
           			    	this.catalog_id = objectIn.readLong();
           				}
					
			            length = objectIn.readByte();
           				if (length == -1) {
           	    			this.catalog_promo_id = null;
           				} else {
           			    	this.catalog_promo_id = objectIn.readLong();
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

		
		            	dos.writeLong(this.id);
					
						writeString(this.name, dos, oos);
					
						writeString(this.phone, dos, oos);
					
						writeString(this.address, dos, oos);
					
						writeString(this.lat, dos, oos);
					
						writeString(this.lng, dos, oos);
					
						writeDate(this.created_at, dos, oos);
					
						writeDate(this.updated_at, dos, oos);
					
						writeString(this.status, dos, oos);
					
						if(this.zone_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.zone_id);
		            	}
					
						if(this.cluster_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.cluster_id);
		            	}
					
						if(this.paiementmode_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.paiementmode_id);
		            	}
					
						writeString(this.second_deliveryday, dos, oos);
					
						writeString(this.three_deliveryday, dos, oos);
					
						if(this.golden_shop == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.golden_shop);
		            	}
					
						if(this.secours == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.secours);
		            	}
					
						if(this.user_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.user_id);
		            	}
					
						if(this.sector_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.sector_id);
		            	}
					
						if(this.catalog_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.catalog_id);
		            	}
					
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
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
					objectOut.writeLong(this.id);
					
						writeString(this.name, dos, objectOut);
					
						writeString(this.phone, dos, objectOut);
					
						writeString(this.address, dos, objectOut);
					
						writeString(this.lat, dos, objectOut);
					
						writeString(this.lng, dos, objectOut);
					
						writeDate(this.created_at, dos, objectOut);
					
						writeDate(this.updated_at, dos, objectOut);
					
						writeString(this.status, dos, objectOut);
					
						if(this.zone_id == null) {
							objectOut.writeByte(-1);
						} else {
							objectOut.writeByte(0);
							objectOut.writeLong(this.zone_id);
		            	}
					
						if(this.cluster_id == null) {
							objectOut.writeByte(-1);
						} else {
							objectOut.writeByte(0);
							objectOut.writeLong(this.cluster_id);
		            	}
					
						if(this.paiementmode_id == null) {
							objectOut.writeByte(-1);
						} else {
							objectOut.writeByte(0);
							objectOut.writeLong(this.paiementmode_id);
		            	}
					
						writeString(this.second_deliveryday, dos, objectOut);
					
						writeString(this.three_deliveryday, dos, objectOut);
					
						if(this.golden_shop == null) {
							objectOut.writeByte(-1);
						} else {
							objectOut.writeByte(0);
							objectOut.writeBoolean(this.golden_shop);
		            	}
					
						if(this.secours == null) {
							objectOut.writeByte(-1);
						} else {
							objectOut.writeByte(0);
							objectOut.writeBoolean(this.secours);
		            	}
					
						if(this.user_id == null) {
							objectOut.writeByte(-1);
						} else {
							objectOut.writeByte(0);
							objectOut.writeLong(this.user_id);
		            	}
					
						if(this.sector_id == null) {
							objectOut.writeByte(-1);
						} else {
							objectOut.writeByte(0);
							objectOut.writeLong(this.sector_id);
		            	}
					
						if(this.catalog_id == null) {
							objectOut.writeByte(-1);
						} else {
							objectOut.writeByte(0);
							objectOut.writeLong(this.catalog_id);
		            	}
					
						if(this.catalog_promo_id == null) {
							objectOut.writeByte(-1);
						} else {
							objectOut.writeByte(0);
							objectOut.writeLong(this.catalog_promo_id);
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
    public int compareTo(row11Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.qr_code, other.qr_code);
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
public void tDBInput_9Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_9_SUBPROCESS_STATE", 0);

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



		row11Struct row11 = new row11Struct();




	
	/**
	 * [tAdvancedHash_row11 begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_row11", false);
		start_Hash.put("tAdvancedHash_row11", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_row11";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row11");
					}
				
		int tos_count_tAdvancedHash_row11 = 0;
		

			   		// connection name:row11
			   		// source node:tDBInput_9 - inputs:(after_tDBInput_1) outputs:(row11,row11) | target node:tAdvancedHash_row11 - inputs:(row11) outputs:()
			   		// linked node: tMap_7 - inputs:(out7,row11) outputs:(out8)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row11 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row11Struct> tHash_Lookup_row11 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row11Struct>getLookup(matchingModeEnum_row11);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row11", tHash_Lookup_row11);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row11 begin ] stop
 */



	
	/**
	 * [tDBInput_9 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_9", false);
		start_Hash.put("tDBInput_9", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_9";

	
		int tos_count_tDBInput_9 = 0;
		
	
    
	
		    int nb_line_tDBInput_9 = 0;
		    java.sql.Connection conn_tDBInput_9 = null;
				String driverClass_tDBInput_9 = "org.postgresql.Driver";
			    java.lang.Class jdbcclazz_tDBInput_9 = java.lang.Class.forName(driverClass_tDBInput_9);
				String dbUser_tDBInput_9 = "malick.diouf";
				
				 
	final String decryptedPassword_tDBInput_9 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:ZKPoTunTDfJooyZhGjA5FIpQHRQUoWRRbJKw3twU63Wxb0Iv+8vl9kGP");
				
				String dbPwd_tDBInput_9 = decryptedPassword_tDBInput_9;
				
				String url_tDBInput_9 = "jdbc:postgresql://" + "leuk.laiterieduberger.sn" + ":" + "5432" + "/" + "leuk_webapp_production";
				
				conn_tDBInput_9 = java.sql.DriverManager.getConnection(url_tDBInput_9,dbUser_tDBInput_9,dbPwd_tDBInput_9);
		        
				conn_tDBInput_9.setAutoCommit(false);
			
		    
			java.sql.Statement stmt_tDBInput_9 = conn_tDBInput_9.createStatement();

		    String dbquery_tDBInput_9 = "SELECT \n  \"public\".\"point_of_sales\".\"id\", \n  \"public\".\"point_of_sales\".\"name\", \n  \"public\".\"point_of_sal"
+"es\".\"qr_code\", \n  \"public\".\"point_of_sales\".\"phone\", \n  \"public\".\"point_of_sales\".\"address\", \n  \"public"
+"\".\"point_of_sales\".\"lat\", \n  \"public\".\"point_of_sales\".\"lng\", \n  \"public\".\"point_of_sales\".\"created_at\""
+", \n  \"public\".\"point_of_sales\".\"updated_at\", \n  \"public\".\"point_of_sales\".\"status\", \n  \"public\".\"point_of"
+"_sales\".\"zone_id\", \n  \"public\".\"point_of_sales\".\"cluster_id\", \n  \"public\".\"point_of_sales\".\"paiementmode_i"
+"d\", \n  \"public\".\"point_of_sales\".\"second_deliveryday\", \n  \"public\".\"point_of_sales\".\"three_deliveryday\", \n "
+" \"public\".\"point_of_sales\".\"golden_shop\", \n  \"public\".\"point_of_sales\".\"secours\", \n  \"public\".\"point_of_s"
+"ales\".\"user_id\", \n  \"public\".\"point_of_sales\".\"sector_id\", \n  \"public\".\"point_of_sales\".\"catalog_id\", \n  "
+"\"public\".\"point_of_sales\".\"catalog_promo_id\"\nFROM \"public\".\"point_of_sales\"";
		    

            	globalMap.put("tDBInput_9_QUERY",dbquery_tDBInput_9);
		    java.sql.ResultSet rs_tDBInput_9 = null;

		    try {
		    	rs_tDBInput_9 = stmt_tDBInput_9.executeQuery(dbquery_tDBInput_9);
		    	java.sql.ResultSetMetaData rsmd_tDBInput_9 = rs_tDBInput_9.getMetaData();
		    	int colQtyInRs_tDBInput_9 = rsmd_tDBInput_9.getColumnCount();

		    String tmpContent_tDBInput_9 = null;
		    
		    
		    while (rs_tDBInput_9.next()) {
		        nb_line_tDBInput_9++;
		        
							if(colQtyInRs_tDBInput_9 < 1) {
								row11.id = 0;
							} else {
		                          
            row11.id = rs_tDBInput_9.getLong(1);
            if(rs_tDBInput_9.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_9 < 2) {
								row11.name = null;
							} else {
	                         		
        	row11.name = routines.system.JDBCUtil.getString(rs_tDBInput_9, 2, false);
		                    }
							if(colQtyInRs_tDBInput_9 < 3) {
								row11.qr_code = null;
							} else {
	                         		
        	row11.qr_code = routines.system.JDBCUtil.getString(rs_tDBInput_9, 3, false);
		                    }
							if(colQtyInRs_tDBInput_9 < 4) {
								row11.phone = null;
							} else {
	                         		
        	row11.phone = routines.system.JDBCUtil.getString(rs_tDBInput_9, 4, false);
		                    }
							if(colQtyInRs_tDBInput_9 < 5) {
								row11.address = null;
							} else {
	                         		
        	row11.address = routines.system.JDBCUtil.getString(rs_tDBInput_9, 5, false);
		                    }
							if(colQtyInRs_tDBInput_9 < 6) {
								row11.lat = null;
							} else {
	                         		
        	row11.lat = routines.system.JDBCUtil.getString(rs_tDBInput_9, 6, false);
		                    }
							if(colQtyInRs_tDBInput_9 < 7) {
								row11.lng = null;
							} else {
	                         		
        	row11.lng = routines.system.JDBCUtil.getString(rs_tDBInput_9, 7, false);
		                    }
							if(colQtyInRs_tDBInput_9 < 8) {
								row11.created_at = null;
							} else {
										
			row11.created_at = routines.system.JDBCUtil.getDate(rs_tDBInput_9, 8);
		                    }
							if(colQtyInRs_tDBInput_9 < 9) {
								row11.updated_at = null;
							} else {
										
			row11.updated_at = routines.system.JDBCUtil.getDate(rs_tDBInput_9, 9);
		                    }
							if(colQtyInRs_tDBInput_9 < 10) {
								row11.status = null;
							} else {
	                         		
        	row11.status = routines.system.JDBCUtil.getString(rs_tDBInput_9, 10, false);
		                    }
							if(colQtyInRs_tDBInput_9 < 11) {
								row11.zone_id = null;
							} else {
		                          
            row11.zone_id = rs_tDBInput_9.getLong(11);
            if(rs_tDBInput_9.wasNull()){
                    row11.zone_id = null;
            }
		                    }
							if(colQtyInRs_tDBInput_9 < 12) {
								row11.cluster_id = null;
							} else {
		                          
            row11.cluster_id = rs_tDBInput_9.getLong(12);
            if(rs_tDBInput_9.wasNull()){
                    row11.cluster_id = null;
            }
		                    }
							if(colQtyInRs_tDBInput_9 < 13) {
								row11.paiementmode_id = null;
							} else {
		                          
            row11.paiementmode_id = rs_tDBInput_9.getLong(13);
            if(rs_tDBInput_9.wasNull()){
                    row11.paiementmode_id = null;
            }
		                    }
							if(colQtyInRs_tDBInput_9 < 14) {
								row11.second_deliveryday = null;
							} else {
	                         		
        	row11.second_deliveryday = routines.system.JDBCUtil.getString(rs_tDBInput_9, 14, false);
		                    }
							if(colQtyInRs_tDBInput_9 < 15) {
								row11.three_deliveryday = null;
							} else {
	                         		
        	row11.three_deliveryday = routines.system.JDBCUtil.getString(rs_tDBInput_9, 15, false);
		                    }
							if(colQtyInRs_tDBInput_9 < 16) {
								row11.golden_shop = null;
							} else {
	                         		
            row11.golden_shop = rs_tDBInput_9.getBoolean(16);
            if(rs_tDBInput_9.wasNull()){
                    row11.golden_shop = null;
            }
		                    }
							if(colQtyInRs_tDBInput_9 < 17) {
								row11.secours = null;
							} else {
	                         		
            row11.secours = rs_tDBInput_9.getBoolean(17);
            if(rs_tDBInput_9.wasNull()){
                    row11.secours = null;
            }
		                    }
							if(colQtyInRs_tDBInput_9 < 18) {
								row11.user_id = null;
							} else {
		                          
            row11.user_id = rs_tDBInput_9.getLong(18);
            if(rs_tDBInput_9.wasNull()){
                    row11.user_id = null;
            }
		                    }
							if(colQtyInRs_tDBInput_9 < 19) {
								row11.sector_id = null;
							} else {
		                          
            row11.sector_id = rs_tDBInput_9.getLong(19);
            if(rs_tDBInput_9.wasNull()){
                    row11.sector_id = null;
            }
		                    }
							if(colQtyInRs_tDBInput_9 < 20) {
								row11.catalog_id = null;
							} else {
		                          
            row11.catalog_id = rs_tDBInput_9.getLong(20);
            if(rs_tDBInput_9.wasNull()){
                    row11.catalog_id = null;
            }
		                    }
							if(colQtyInRs_tDBInput_9 < 21) {
								row11.catalog_promo_id = null;
							} else {
		                          
            row11.catalog_promo_id = rs_tDBInput_9.getLong(21);
            if(rs_tDBInput_9.wasNull()){
                    row11.catalog_promo_id = null;
            }
		                    }
					


 



/**
 * [tDBInput_9 begin ] stop
 */
	
	/**
	 * [tDBInput_9 main ] start
	 */

	

	
	
	currentComponent="tDBInput_9";

	

 


	tos_count_tDBInput_9++;

/**
 * [tDBInput_9 main ] stop
 */
	
	/**
	 * [tDBInput_9 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_9";

	

 



/**
 * [tDBInput_9 process_data_begin ] stop
 */

	
	/**
	 * [tAdvancedHash_row11 main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row11";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row11"
						
						);
					}
					


			   
			   

					row11Struct row11_HashRow = new row11Struct();
		   	   	   
				
				row11_HashRow.id = row11.id;
				
				row11_HashRow.name = row11.name;
				
				row11_HashRow.qr_code = row11.qr_code;
				
				row11_HashRow.phone = row11.phone;
				
				row11_HashRow.address = row11.address;
				
				row11_HashRow.lat = row11.lat;
				
				row11_HashRow.lng = row11.lng;
				
				row11_HashRow.created_at = row11.created_at;
				
				row11_HashRow.updated_at = row11.updated_at;
				
				row11_HashRow.status = row11.status;
				
				row11_HashRow.zone_id = row11.zone_id;
				
				row11_HashRow.cluster_id = row11.cluster_id;
				
				row11_HashRow.paiementmode_id = row11.paiementmode_id;
				
				row11_HashRow.second_deliveryday = row11.second_deliveryday;
				
				row11_HashRow.three_deliveryday = row11.three_deliveryday;
				
				row11_HashRow.golden_shop = row11.golden_shop;
				
				row11_HashRow.secours = row11.secours;
				
				row11_HashRow.user_id = row11.user_id;
				
				row11_HashRow.sector_id = row11.sector_id;
				
				row11_HashRow.catalog_id = row11.catalog_id;
				
				row11_HashRow.catalog_promo_id = row11.catalog_promo_id;
				
			tHash_Lookup_row11.put(row11_HashRow);
			
            




 


	tos_count_tAdvancedHash_row11++;

/**
 * [tAdvancedHash_row11 main ] stop
 */
	
	/**
	 * [tAdvancedHash_row11 process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row11";

	

 



/**
 * [tAdvancedHash_row11 process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_row11 process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row11";

	

 



/**
 * [tAdvancedHash_row11 process_data_end ] stop
 */



	
	/**
	 * [tDBInput_9 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_9";

	

 



/**
 * [tDBInput_9 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_9 end ] start
	 */

	

	
	
	currentComponent="tDBInput_9";

	

	}
}finally{
	if (rs_tDBInput_9 != null) {
		rs_tDBInput_9.close();
	}
	if (stmt_tDBInput_9 != null) {
		stmt_tDBInput_9.close();
	}
	if(conn_tDBInput_9 != null && !conn_tDBInput_9.isClosed()) {
		
			conn_tDBInput_9.commit();
			
		
			conn_tDBInput_9.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
			}
			
	}
	
}
globalMap.put("tDBInput_9_NB_LINE",nb_line_tDBInput_9);
 

ok_Hash.put("tDBInput_9", true);
end_Hash.put("tDBInput_9", System.currentTimeMillis());




/**
 * [tDBInput_9 end ] stop
 */

	
	/**
	 * [tAdvancedHash_row11 end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row11";

	

tHash_Lookup_row11.endPut();

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row11");
			  	}
			  	
 

ok_Hash.put("tAdvancedHash_row11", true);
end_Hash.put("tAdvancedHash_row11", System.currentTimeMillis());




/**
 * [tAdvancedHash_row11 end ] stop
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
	 * [tDBInput_9 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_9";

	

 



/**
 * [tDBInput_9 finally ] stop
 */

	
	/**
	 * [tAdvancedHash_row11 finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row11";

	

 



/**
 * [tAdvancedHash_row11 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBInput_9_SUBPROCESS_STATE", 1);
	}
	


public static class row10Struct implements routines.system.IPersistableComparableLookupRow<row10Struct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public int id_faitvendeur;

				public int getId_faitvendeur () {
					return this.id_faitvendeur;
				}
				
			    public Long id_secteur;

				public Long getId_secteur () {
					return this.id_secteur;
				}
				
			    public Long id_produit;

				public Long getId_produit () {
					return this.id_produit;
				}
				
			    public Integer id_temps;

				public Integer getId_temps () {
					return this.id_temps;
				}
				
			    public Long id_pdv;

				public Long getId_pdv () {
					return this.id_pdv;
				}
				
			    public Double cattc;

				public Double getCattc () {
					return this.cattc;
				}
				
			    public Double caht;

				public Double getCaht () {
					return this.caht;
				}
				
			    public Double pertes;

				public Double getPertes () {
					return this.pertes;
				}
				
			    public Integer qte_vendu;

				public Integer getQte_vendu () {
					return this.qte_vendu;
				}
				
			    public Integer volume_total;

				public Integer getVolume_total () {
					return this.volume_total;
				}
				
			    public Integer penetration_p;

				public Integer getPenetration_p () {
					return this.penetration_p;
				}
				
			    public Integer penetration_g;

				public Integer getPenetration_g () {
					return this.penetration_g;
				}
				
			    public Integer ruptures;

				public Integer getRuptures () {
					return this.ruptures;
				}
				
			    public Integer com_intelligente;

				public Integer getCom_intelligente () {
					return this.com_intelligente;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.id_secteur == null) ? 0 : this.id_secteur.hashCode());
					
						result = prime * result + ((this.id_produit == null) ? 0 : this.id_produit.hashCode());
					
						result = prime * result + ((this.id_temps == null) ? 0 : this.id_temps.hashCode());
					
						result = prime * result + ((this.id_pdv == null) ? 0 : this.id_pdv.hashCode());
					
						result = prime * result + ((this.cattc == null) ? 0 : this.cattc.hashCode());
					
						result = prime * result + ((this.caht == null) ? 0 : this.caht.hashCode());
					
						result = prime * result + ((this.pertes == null) ? 0 : this.pertes.hashCode());
					
						result = prime * result + ((this.qte_vendu == null) ? 0 : this.qte_vendu.hashCode());
					
						result = prime * result + ((this.volume_total == null) ? 0 : this.volume_total.hashCode());
					
						result = prime * result + ((this.penetration_p == null) ? 0 : this.penetration_p.hashCode());
					
						result = prime * result + ((this.penetration_g == null) ? 0 : this.penetration_g.hashCode());
					
						result = prime * result + ((this.ruptures == null) ? 0 : this.ruptures.hashCode());
					
						result = prime * result + ((this.com_intelligente == null) ? 0 : this.com_intelligente.hashCode());
					
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
		final row10Struct other = (row10Struct) obj;
		
						if (this.id_secteur == null) {
							if (other.id_secteur != null)
								return false;
						
						} else if (!this.id_secteur.equals(other.id_secteur))
						
							return false;
					
						if (this.id_produit == null) {
							if (other.id_produit != null)
								return false;
						
						} else if (!this.id_produit.equals(other.id_produit))
						
							return false;
					
						if (this.id_temps == null) {
							if (other.id_temps != null)
								return false;
						
						} else if (!this.id_temps.equals(other.id_temps))
						
							return false;
					
						if (this.id_pdv == null) {
							if (other.id_pdv != null)
								return false;
						
						} else if (!this.id_pdv.equals(other.id_pdv))
						
							return false;
					
						if (this.cattc == null) {
							if (other.cattc != null)
								return false;
						
						} else if (!this.cattc.equals(other.cattc))
						
							return false;
					
						if (this.caht == null) {
							if (other.caht != null)
								return false;
						
						} else if (!this.caht.equals(other.caht))
						
							return false;
					
						if (this.pertes == null) {
							if (other.pertes != null)
								return false;
						
						} else if (!this.pertes.equals(other.pertes))
						
							return false;
					
						if (this.qte_vendu == null) {
							if (other.qte_vendu != null)
								return false;
						
						} else if (!this.qte_vendu.equals(other.qte_vendu))
						
							return false;
					
						if (this.volume_total == null) {
							if (other.volume_total != null)
								return false;
						
						} else if (!this.volume_total.equals(other.volume_total))
						
							return false;
					
						if (this.penetration_p == null) {
							if (other.penetration_p != null)
								return false;
						
						} else if (!this.penetration_p.equals(other.penetration_p))
						
							return false;
					
						if (this.penetration_g == null) {
							if (other.penetration_g != null)
								return false;
						
						} else if (!this.penetration_g.equals(other.penetration_g))
						
							return false;
					
						if (this.ruptures == null) {
							if (other.ruptures != null)
								return false;
						
						} else if (!this.ruptures.equals(other.ruptures))
						
							return false;
					
						if (this.com_intelligente == null) {
							if (other.com_intelligente != null)
								return false;
						
						} else if (!this.com_intelligente.equals(other.com_intelligente))
						
							return false;
					

		return true;
    }

	public void copyDataTo(row10Struct other) {

		other.id_faitvendeur = this.id_faitvendeur;
	            other.id_secteur = this.id_secteur;
	            other.id_produit = this.id_produit;
	            other.id_temps = this.id_temps;
	            other.id_pdv = this.id_pdv;
	            other.cattc = this.cattc;
	            other.caht = this.caht;
	            other.pertes = this.pertes;
	            other.qte_vendu = this.qte_vendu;
	            other.volume_total = this.volume_total;
	            other.penetration_p = this.penetration_p;
	            other.penetration_g = this.penetration_g;
	            other.ruptures = this.ruptures;
	            other.com_intelligente = this.com_intelligente;
	            
	}

	public void copyKeysDataTo(row10Struct other) {

		other.id_secteur = this.id_secteur;
	            	other.id_produit = this.id_produit;
	            	other.id_temps = this.id_temps;
	            	other.id_pdv = this.id_pdv;
	            	other.cattc = this.cattc;
	            	other.caht = this.caht;
	            	other.pertes = this.pertes;
	            	other.qte_vendu = this.qte_vendu;
	            	other.volume_total = this.volume_total;
	            	other.penetration_p = this.penetration_p;
	            	other.penetration_g = this.penetration_g;
	            	other.ruptures = this.ruptures;
	            	other.com_intelligente = this.com_intelligente;
	            	
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

    public void readKeysData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR) {

        	try {

        		int length = 0;
		
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.id_secteur = null;
           				} else {
           			    	this.id_secteur = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.id_produit = null;
           				} else {
           			    	this.id_produit = dis.readLong();
           				}
					
						this.id_temps = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.id_pdv = null;
           				} else {
           			    	this.id_pdv = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.cattc = null;
           				} else {
           			    	this.cattc = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.caht = null;
           				} else {
           			    	this.caht = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.pertes = null;
           				} else {
           			    	this.pertes = dis.readDouble();
           				}
					
						this.qte_vendu = readInteger(dis);
					
						this.volume_total = readInteger(dis);
					
						this.penetration_p = readInteger(dis);
					
						this.penetration_g = readInteger(dis);
					
						this.ruptures = readInteger(dis);
					
						this.com_intelligente = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR) {

        	try {

        		int length = 0;
		
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.id_secteur = null;
           				} else {
           			    	this.id_secteur = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.id_produit = null;
           				} else {
           			    	this.id_produit = dis.readLong();
           				}
					
						this.id_temps = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.id_pdv = null;
           				} else {
           			    	this.id_pdv = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.cattc = null;
           				} else {
           			    	this.cattc = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.caht = null;
           				} else {
           			    	this.caht = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.pertes = null;
           				} else {
           			    	this.pertes = dis.readDouble();
           				}
					
						this.qte_vendu = readInteger(dis);
					
						this.volume_total = readInteger(dis);
					
						this.penetration_p = readInteger(dis);
					
						this.penetration_g = readInteger(dis);
					
						this.ruptures = readInteger(dis);
					
						this.com_intelligente = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// Long
				
						if(this.id_secteur == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.id_secteur);
		            	}
					
					// Long
				
						if(this.id_produit == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.id_produit);
		            	}
					
					// Integer
				
						writeInteger(this.id_temps,dos);
					
					// Long
				
						if(this.id_pdv == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.id_pdv);
		            	}
					
					// Double
				
						if(this.cattc == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.cattc);
		            	}
					
					// Double
				
						if(this.caht == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.caht);
		            	}
					
					// Double
				
						if(this.pertes == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.pertes);
		            	}
					
					// Integer
				
						writeInteger(this.qte_vendu,dos);
					
					// Integer
				
						writeInteger(this.volume_total,dos);
					
					// Integer
				
						writeInteger(this.penetration_p,dos);
					
					// Integer
				
						writeInteger(this.penetration_g,dos);
					
					// Integer
				
						writeInteger(this.ruptures,dos);
					
					// Integer
				
						writeInteger(this.com_intelligente,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// Long
				
						if(this.id_secteur == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.id_secteur);
		            	}
					
					// Long
				
						if(this.id_produit == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.id_produit);
		            	}
					
					// Integer
				
						writeInteger(this.id_temps,dos);
					
					// Long
				
						if(this.id_pdv == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.id_pdv);
		            	}
					
					// Double
				
						if(this.cattc == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.cattc);
		            	}
					
					// Double
				
						if(this.caht == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.caht);
		            	}
					
					// Double
				
						if(this.pertes == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.pertes);
		            	}
					
					// Integer
				
						writeInteger(this.qte_vendu,dos);
					
					// Integer
				
						writeInteger(this.volume_total,dos);
					
					// Integer
				
						writeInteger(this.penetration_p,dos);
					
					// Integer
				
						writeInteger(this.penetration_g,dos);
					
					// Integer
				
						writeInteger(this.ruptures,dos);
					
					// Integer
				
						writeInteger(this.com_intelligente,dos);
					
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
		
			            this.id_faitvendeur = dis.readInt();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
			            this.id_faitvendeur = objectIn.readInt();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
		            	dos.writeInt(this.id_faitvendeur);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
					objectOut.writeInt(this.id_faitvendeur);
					
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
		sb.append("id_faitvendeur="+String.valueOf(id_faitvendeur));
		sb.append(",id_secteur="+String.valueOf(id_secteur));
		sb.append(",id_produit="+String.valueOf(id_produit));
		sb.append(",id_temps="+String.valueOf(id_temps));
		sb.append(",id_pdv="+String.valueOf(id_pdv));
		sb.append(",cattc="+String.valueOf(cattc));
		sb.append(",caht="+String.valueOf(caht));
		sb.append(",pertes="+String.valueOf(pertes));
		sb.append(",qte_vendu="+String.valueOf(qte_vendu));
		sb.append(",volume_total="+String.valueOf(volume_total));
		sb.append(",penetration_p="+String.valueOf(penetration_p));
		sb.append(",penetration_g="+String.valueOf(penetration_g));
		sb.append(",ruptures="+String.valueOf(ruptures));
		sb.append(",com_intelligente="+String.valueOf(com_intelligente));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row10Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.id_secteur, other.id_secteur);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.id_produit, other.id_produit);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.id_temps, other.id_temps);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.id_pdv, other.id_pdv);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.cattc, other.cattc);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.caht, other.caht);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.pertes, other.pertes);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.qte_vendu, other.qte_vendu);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.volume_total, other.volume_total);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.penetration_p, other.penetration_p);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.penetration_g, other.penetration_g);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.ruptures, other.ruptures);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.com_intelligente, other.com_intelligente);
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
public void tDBInput_8Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_8_SUBPROCESS_STATE", 0);

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



		row10Struct row10 = new row10Struct();




	
	/**
	 * [tAdvancedHash_row10 begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_row10", false);
		start_Hash.put("tAdvancedHash_row10", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_row10";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row10");
					}
				
		int tos_count_tAdvancedHash_row10 = 0;
		

			   		// connection name:row10
			   		// source node:tDBInput_8 - inputs:(after_tDBInput_1) outputs:(row10,row10) | target node:tAdvancedHash_row10 - inputs:(row10) outputs:()
			   		// linked node: tMap_6 - inputs:(out3,row10) outputs:(out4)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row10 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row10Struct> tHash_Lookup_row10 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row10Struct>getLookup(matchingModeEnum_row10);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row10", tHash_Lookup_row10);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row10 begin ] stop
 */



	
	/**
	 * [tDBInput_8 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_8", false);
		start_Hash.put("tDBInput_8", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_8";

	
		int tos_count_tDBInput_8 = 0;
		
	
    
	
		    int nb_line_tDBInput_8 = 0;
		    java.sql.Connection conn_tDBInput_8 = null;
				String driverClass_tDBInput_8 = "org.postgresql.Driver";
			    java.lang.Class jdbcclazz_tDBInput_8 = java.lang.Class.forName(driverClass_tDBInput_8);
				String dbUser_tDBInput_8 = "malick.diouf";
				
				 
	final String decryptedPassword_tDBInput_8 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:vytDyU0l/lhjOTTe9pkSdbW6OU+Mx6OMR0cUaeJsnmA37PiYpXw=");
				
				String dbPwd_tDBInput_8 = decryptedPassword_tDBInput_8;
				
				String url_tDBInput_8 = "jdbc:postgresql://" + "163.172.166.119" + ":" + "5432" + "/" + "leuk_analytics";
				
				conn_tDBInput_8 = java.sql.DriverManager.getConnection(url_tDBInput_8,dbUser_tDBInput_8,dbPwd_tDBInput_8);
		        
				conn_tDBInput_8.setAutoCommit(false);
			
		    
			java.sql.Statement stmt_tDBInput_8 = conn_tDBInput_8.createStatement();

		    String dbquery_tDBInput_8 = "SELECT \n  \"public\".\"Fait_Vendeur\".\"id_faitvendeur\", \n  \"public\".\"Fait_Vendeur\".\"id_secteur\", \n  \"public\"."
+"\"Fait_Vendeur\".\"id_produit\", \n  \"public\".\"Fait_Vendeur\".\"id_temps\", \n  \"public\".\"Fait_Vendeur\".\"id_pdv\","
+" \n  \"public\".\"Fait_Vendeur\".\"cattc\", \n  \"public\".\"Fait_Vendeur\".\"caht\", \n  \"public\".\"Fait_Vendeur\".\"per"
+"tes\", \n  \"public\".\"Fait_Vendeur\".\"qte_vendu\", \n  \"public\".\"Fait_Vendeur\".\"volume_total\", \n  \"public\".\"Fa"
+"it_Vendeur\".\"penetration_p\", \n  \"public\".\"Fait_Vendeur\".\"penetration_g\", \n  \"public\".\"Fait_Vendeur\".\"ruptu"
+"res\", \n  \"public\".\"Fait_Vendeur\".\"com_intelligente\"\nFROM \"public\".\"Fait_Vendeur\"\nINNER JOIN \"public\".\"Dim"
+"_Temps\" On \"public\".\"Fait_Vendeur\".\"id_temps\" = \"public\".\"Dim_Temps\".\"id_temps\"\nwhere \"public\".\"Dim_Tem"
+"ps\".\"date\"  between CURRENT_DATE - INTERVAL '5 day' and CURRENT_DATE - INTERVAL '1 day'\nORDER BY    \"public\".\"Fai"
+"t_Vendeur\".\"id_faitvendeur\" asc";
		    

            	globalMap.put("tDBInput_8_QUERY",dbquery_tDBInput_8);
		    java.sql.ResultSet rs_tDBInput_8 = null;

		    try {
		    	rs_tDBInput_8 = stmt_tDBInput_8.executeQuery(dbquery_tDBInput_8);
		    	java.sql.ResultSetMetaData rsmd_tDBInput_8 = rs_tDBInput_8.getMetaData();
		    	int colQtyInRs_tDBInput_8 = rsmd_tDBInput_8.getColumnCount();

		    String tmpContent_tDBInput_8 = null;
		    
		    
		    while (rs_tDBInput_8.next()) {
		        nb_line_tDBInput_8++;
		        
							if(colQtyInRs_tDBInput_8 < 1) {
								row10.id_faitvendeur = 0;
							} else {
		                          
            row10.id_faitvendeur = rs_tDBInput_8.getInt(1);
            if(rs_tDBInput_8.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_8 < 2) {
								row10.id_secteur = null;
							} else {
		                          
            row10.id_secteur = rs_tDBInput_8.getLong(2);
            if(rs_tDBInput_8.wasNull()){
                    row10.id_secteur = null;
            }
		                    }
							if(colQtyInRs_tDBInput_8 < 3) {
								row10.id_produit = null;
							} else {
		                          
            row10.id_produit = rs_tDBInput_8.getLong(3);
            if(rs_tDBInput_8.wasNull()){
                    row10.id_produit = null;
            }
		                    }
							if(colQtyInRs_tDBInput_8 < 4) {
								row10.id_temps = null;
							} else {
		                          
            row10.id_temps = rs_tDBInput_8.getInt(4);
            if(rs_tDBInput_8.wasNull()){
                    row10.id_temps = null;
            }
		                    }
							if(colQtyInRs_tDBInput_8 < 5) {
								row10.id_pdv = null;
							} else {
		                          
            row10.id_pdv = rs_tDBInput_8.getLong(5);
            if(rs_tDBInput_8.wasNull()){
                    row10.id_pdv = null;
            }
		                    }
							if(colQtyInRs_tDBInput_8 < 6) {
								row10.cattc = null;
							} else {
	                         		
            row10.cattc = rs_tDBInput_8.getDouble(6);
            if(rs_tDBInput_8.wasNull()){
                    row10.cattc = null;
            }
		                    }
							if(colQtyInRs_tDBInput_8 < 7) {
								row10.caht = null;
							} else {
	                         		
            row10.caht = rs_tDBInput_8.getDouble(7);
            if(rs_tDBInput_8.wasNull()){
                    row10.caht = null;
            }
		                    }
							if(colQtyInRs_tDBInput_8 < 8) {
								row10.pertes = null;
							} else {
	                         		
            row10.pertes = rs_tDBInput_8.getDouble(8);
            if(rs_tDBInput_8.wasNull()){
                    row10.pertes = null;
            }
		                    }
							if(colQtyInRs_tDBInput_8 < 9) {
								row10.qte_vendu = null;
							} else {
		                          
            row10.qte_vendu = rs_tDBInput_8.getInt(9);
            if(rs_tDBInput_8.wasNull()){
                    row10.qte_vendu = null;
            }
		                    }
							if(colQtyInRs_tDBInput_8 < 10) {
								row10.volume_total = null;
							} else {
		                          
            row10.volume_total = rs_tDBInput_8.getInt(10);
            if(rs_tDBInput_8.wasNull()){
                    row10.volume_total = null;
            }
		                    }
							if(colQtyInRs_tDBInput_8 < 11) {
								row10.penetration_p = null;
							} else {
		                          
            row10.penetration_p = rs_tDBInput_8.getInt(11);
            if(rs_tDBInput_8.wasNull()){
                    row10.penetration_p = null;
            }
		                    }
							if(colQtyInRs_tDBInput_8 < 12) {
								row10.penetration_g = null;
							} else {
		                          
            row10.penetration_g = rs_tDBInput_8.getInt(12);
            if(rs_tDBInput_8.wasNull()){
                    row10.penetration_g = null;
            }
		                    }
							if(colQtyInRs_tDBInput_8 < 13) {
								row10.ruptures = null;
							} else {
		                          
            row10.ruptures = rs_tDBInput_8.getInt(13);
            if(rs_tDBInput_8.wasNull()){
                    row10.ruptures = null;
            }
		                    }
							if(colQtyInRs_tDBInput_8 < 14) {
								row10.com_intelligente = null;
							} else {
		                          
            row10.com_intelligente = rs_tDBInput_8.getInt(14);
            if(rs_tDBInput_8.wasNull()){
                    row10.com_intelligente = null;
            }
		                    }
					


 



/**
 * [tDBInput_8 begin ] stop
 */
	
	/**
	 * [tDBInput_8 main ] start
	 */

	

	
	
	currentComponent="tDBInput_8";

	

 


	tos_count_tDBInput_8++;

/**
 * [tDBInput_8 main ] stop
 */
	
	/**
	 * [tDBInput_8 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_8";

	

 



/**
 * [tDBInput_8 process_data_begin ] stop
 */

	
	/**
	 * [tAdvancedHash_row10 main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row10";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row10"
						
						);
					}
					


			   
			   

					row10Struct row10_HashRow = new row10Struct();
		   	   	   
				
				row10_HashRow.id_faitvendeur = row10.id_faitvendeur;
				
				row10_HashRow.id_secteur = row10.id_secteur;
				
				row10_HashRow.id_produit = row10.id_produit;
				
				row10_HashRow.id_temps = row10.id_temps;
				
				row10_HashRow.id_pdv = row10.id_pdv;
				
				row10_HashRow.cattc = row10.cattc;
				
				row10_HashRow.caht = row10.caht;
				
				row10_HashRow.pertes = row10.pertes;
				
				row10_HashRow.qte_vendu = row10.qte_vendu;
				
				row10_HashRow.volume_total = row10.volume_total;
				
				row10_HashRow.penetration_p = row10.penetration_p;
				
				row10_HashRow.penetration_g = row10.penetration_g;
				
				row10_HashRow.ruptures = row10.ruptures;
				
				row10_HashRow.com_intelligente = row10.com_intelligente;
				
			tHash_Lookup_row10.put(row10_HashRow);
			
            




 


	tos_count_tAdvancedHash_row10++;

/**
 * [tAdvancedHash_row10 main ] stop
 */
	
	/**
	 * [tAdvancedHash_row10 process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row10";

	

 



/**
 * [tAdvancedHash_row10 process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_row10 process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row10";

	

 



/**
 * [tAdvancedHash_row10 process_data_end ] stop
 */



	
	/**
	 * [tDBInput_8 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_8";

	

 



/**
 * [tDBInput_8 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_8 end ] start
	 */

	

	
	
	currentComponent="tDBInput_8";

	

	}
}finally{
	if (rs_tDBInput_8 != null) {
		rs_tDBInput_8.close();
	}
	if (stmt_tDBInput_8 != null) {
		stmt_tDBInput_8.close();
	}
	if(conn_tDBInput_8 != null && !conn_tDBInput_8.isClosed()) {
		
			conn_tDBInput_8.commit();
			
		
			conn_tDBInput_8.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
			}
			
	}
	
}
globalMap.put("tDBInput_8_NB_LINE",nb_line_tDBInput_8);
 

ok_Hash.put("tDBInput_8", true);
end_Hash.put("tDBInput_8", System.currentTimeMillis());




/**
 * [tDBInput_8 end ] stop
 */

	
	/**
	 * [tAdvancedHash_row10 end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row10";

	

tHash_Lookup_row10.endPut();

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row10");
			  	}
			  	
 

ok_Hash.put("tAdvancedHash_row10", true);
end_Hash.put("tAdvancedHash_row10", System.currentTimeMillis());




/**
 * [tAdvancedHash_row10 end ] stop
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
	 * [tDBInput_8 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_8";

	

 



/**
 * [tDBInput_8 finally ] stop
 */

	
	/**
	 * [tAdvancedHash_row10 finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row10";

	

 



/**
 * [tAdvancedHash_row10 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBInput_8_SUBPROCESS_STATE", 1);
	}
	


public static class row2Struct implements routines.system.IPersistableComparableLookupRow<row2Struct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public String sku_commcare;

				public String getSku_commcare () {
					return this.sku_commcare;
				}
				
			    public Integer prix__mali_guinee;

				public Integer getPrix__mali_guinee () {
					return this.prix__mali_guinee;
				}
				
			    public Double prix_gambie;

				public Double getPrix_gambie () {
					return this.prix_gambie;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.sku_commcare == null) ? 0 : this.sku_commcare.hashCode());
					
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
		
						if (this.sku_commcare == null) {
							if (other.sku_commcare != null)
								return false;
						
						} else if (!this.sku_commcare.equals(other.sku_commcare))
						
							return false;
					

		return true;
    }

	public void copyDataTo(row2Struct other) {

		other.sku_commcare = this.sku_commcare;
	            other.prix__mali_guinee = this.prix__mali_guinee;
	            other.prix_gambie = this.prix_gambie;
	            
	}

	public void copyKeysDataTo(row2Struct other) {

		other.sku_commcare = this.sku_commcare;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR, 0, length, utf8Charset);
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
			if(length > commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_FAIT_VENDEUR, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR) {

        	try {

        		int length = 0;
		
					this.sku_commcare = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_VENDEUR) {

        	try {

        		int length = 0;
		
					this.sku_commcare = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.sku_commcare,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.sku_commcare,dos);
					
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
		
						this.prix__mali_guinee = readInteger(dis,ois);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.prix_gambie = null;
           				} else {
           			    	this.prix_gambie = dis.readDouble();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
						this.prix__mali_guinee = readInteger(dis,objectIn);
					
			            length = objectIn.readByte();
           				if (length == -1) {
           	    			this.prix_gambie = null;
           				} else {
           			    	this.prix_gambie = objectIn.readDouble();
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

		
					writeInteger(this.prix__mali_guinee, dos, oos);
					
						if(this.prix_gambie == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.prix_gambie);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
					writeInteger(this.prix__mali_guinee, dos, objectOut);
					
						if(this.prix_gambie == null) {
							objectOut.writeByte(-1);
						} else {
							objectOut.writeByte(0);
							objectOut.writeDouble(this.prix_gambie);
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
		sb.append("sku_commcare="+sku_commcare);
		sb.append(",prix__mali_guinee="+String.valueOf(prix__mali_guinee));
		sb.append(",prix_gambie="+String.valueOf(prix_gambie));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row2Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.sku_commcare, other.sku_commcare);
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
public void tDBInput_10Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_10_SUBPROCESS_STATE", 0);

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
			   		// source node:tDBInput_10 - inputs:(after_tDBInput_1) outputs:(row2,row2) | target node:tAdvancedHash_row2 - inputs:(row2) outputs:()
			   		// linked node: tMap_1 - inputs:(row1,row3,row2) outputs:(line)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row2 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row2Struct> tHash_Lookup_row2 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row2Struct>getLookup(matchingModeEnum_row2);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row2", tHash_Lookup_row2);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row2 begin ] stop
 */



	
	/**
	 * [tDBInput_10 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_10", false);
		start_Hash.put("tDBInput_10", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_10";

	
		int tos_count_tDBInput_10 = 0;
		
	
    
	
		    int nb_line_tDBInput_10 = 0;
		    java.sql.Connection conn_tDBInput_10 = null;
				String driverClass_tDBInput_10 = "org.postgresql.Driver";
			    java.lang.Class jdbcclazz_tDBInput_10 = java.lang.Class.forName(driverClass_tDBInput_10);
				String dbUser_tDBInput_10 = "malick.diouf";
				
				 
	final String decryptedPassword_tDBInput_10 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:ZKW0bc2kAJPcaEENCs7KoI1cQNUYaVwUpY3QsdoVKC+20wIvepA=");
				
				String dbPwd_tDBInput_10 = decryptedPassword_tDBInput_10;
				
				String url_tDBInput_10 = "jdbc:postgresql://" + "163.172.166.119" + ":" + "5432" + "/" + "leuk_analytics";
				
				conn_tDBInput_10 = java.sql.DriverManager.getConnection(url_tDBInput_10,dbUser_tDBInput_10,dbPwd_tDBInput_10);
		        
				conn_tDBInput_10.setAutoCommit(false);
			
		    
			java.sql.Statement stmt_tDBInput_10 = conn_tDBInput_10.createStatement();

		    String dbquery_tDBInput_10 = "SELECT \n  \"public\".\"catalogue_produit\".\"sku_commcare\", \n  \"public\".\"catalogue_produit\".\"prix__mali_guinee\","
+" \n  \"public\".\"catalogue_produit\".\"prix_gambie\"\nFROM \"public\".\"catalogue_produit\"";
		    

            	globalMap.put("tDBInput_10_QUERY",dbquery_tDBInput_10);
		    java.sql.ResultSet rs_tDBInput_10 = null;

		    try {
		    	rs_tDBInput_10 = stmt_tDBInput_10.executeQuery(dbquery_tDBInput_10);
		    	java.sql.ResultSetMetaData rsmd_tDBInput_10 = rs_tDBInput_10.getMetaData();
		    	int colQtyInRs_tDBInput_10 = rsmd_tDBInput_10.getColumnCount();

		    String tmpContent_tDBInput_10 = null;
		    
		    
		    while (rs_tDBInput_10.next()) {
		        nb_line_tDBInput_10++;
		        
							if(colQtyInRs_tDBInput_10 < 1) {
								row2.sku_commcare = null;
							} else {
	                         		
        	row2.sku_commcare = routines.system.JDBCUtil.getString(rs_tDBInput_10, 1, false);
		                    }
							if(colQtyInRs_tDBInput_10 < 2) {
								row2.prix__mali_guinee = null;
							} else {
		                          
            row2.prix__mali_guinee = rs_tDBInput_10.getInt(2);
            if(rs_tDBInput_10.wasNull()){
                    row2.prix__mali_guinee = null;
            }
		                    }
							if(colQtyInRs_tDBInput_10 < 3) {
								row2.prix_gambie = null;
							} else {
	                         		
            row2.prix_gambie = rs_tDBInput_10.getDouble(3);
            if(rs_tDBInput_10.wasNull()){
                    row2.prix_gambie = null;
            }
		                    }
					


 



/**
 * [tDBInput_10 begin ] stop
 */
	
	/**
	 * [tDBInput_10 main ] start
	 */

	

	
	
	currentComponent="tDBInput_10";

	

 


	tos_count_tDBInput_10++;

/**
 * [tDBInput_10 main ] stop
 */
	
	/**
	 * [tDBInput_10 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_10";

	

 



/**
 * [tDBInput_10 process_data_begin ] stop
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
		   	   	   
				
				row2_HashRow.sku_commcare = row2.sku_commcare;
				
				row2_HashRow.prix__mali_guinee = row2.prix__mali_guinee;
				
				row2_HashRow.prix_gambie = row2.prix_gambie;
				
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
	 * [tDBInput_10 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_10";

	

 



/**
 * [tDBInput_10 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_10 end ] start
	 */

	

	
	
	currentComponent="tDBInput_10";

	

	}
}finally{
	if (rs_tDBInput_10 != null) {
		rs_tDBInput_10.close();
	}
	if (stmt_tDBInput_10 != null) {
		stmt_tDBInput_10.close();
	}
	if(conn_tDBInput_10 != null && !conn_tDBInput_10.isClosed()) {
		
			conn_tDBInput_10.commit();
			
		
			conn_tDBInput_10.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
			}
			
	}
	
}
globalMap.put("tDBInput_10_NB_LINE",nb_line_tDBInput_10);
 

ok_Hash.put("tDBInput_10", true);
end_Hash.put("tDBInput_10", System.currentTimeMillis());




/**
 * [tDBInput_10 end ] stop
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
	 * [tDBInput_10 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_10";

	

 



/**
 * [tDBInput_10 finally ] stop
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
		

		globalMap.put("tDBInput_10_SUBPROCESS_STATE", 1);
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
        final Alimentation_FAIT_VENDEUR Alimentation_FAIT_VENDEURClass = new Alimentation_FAIT_VENDEUR();

        int exitCode = Alimentation_FAIT_VENDEURClass.runJobInTOS(args);

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
            java.io.InputStream inContext = Alimentation_FAIT_VENDEUR.class.getClassLoader().getResourceAsStream("warehouse/alimentation_fait_vendeur_0_1/contexts/" + contextStr + ".properties");
            if (inContext == null) {
                inContext = Alimentation_FAIT_VENDEUR.class.getClassLoader().getResourceAsStream("config/contexts/" + contextStr + ".properties");
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

try {
errorCode = null;tDBInput_1Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tDBInput_1) {
globalMap.put("tDBInput_1_SUBPROCESS_STATE", -1);

e_tDBInput_1.printStackTrace();

}

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
            System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : Alimentation_FAIT_VENDEUR");
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
            obj_conn = globalMap.remove("conn_tDBConnection_2");
            if (null != obj_conn) {
                ((java.sql.Connection) obj_conn).close();
            }
            obj_conn = globalMap.remove("conn_tDBConnection_1");
            if (null != obj_conn) {
                ((java.sql.Connection) obj_conn).close();
            }
        } catch (java.lang.Exception e) {
        }
    }











    private java.util.Map<String, Object> getSharedConnections4REST() {
        java.util.Map<String, Object> connections = new java.util.HashMap<String, Object>();
            connections.put("conn_tDBConnection_2", globalMap.get("conn_tDBConnection_2"));
            connections.put("conn_tDBConnection_1", globalMap.get("conn_tDBConnection_1"));






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
 *     619800 characters generated by Talend Open Studio for Data Integration 
 *     on the 26 février 2025 à 14:58:47 UTC
 ************************************************************************************************/