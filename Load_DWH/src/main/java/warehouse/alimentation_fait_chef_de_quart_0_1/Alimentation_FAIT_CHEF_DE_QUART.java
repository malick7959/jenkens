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


package warehouse.alimentation_fait_chef_de_quart_0_1;

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
 




	//the import part of tJava_2
	//import java.util.List;


@SuppressWarnings("unused")

/**
 * Job: Alimentation_FAIT_CHEF_DE_QUART Purpose: <br>
 * Description:  <br>
 * @author user@talend.com
 * @version 8.0.1.20211109_1610
 * @status PROD
 */
public class Alimentation_FAIT_CHEF_DE_QUART implements TalendJob {

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
	private final String jobName = "Alimentation_FAIT_CHEF_DE_QUART";
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
				Alimentation_FAIT_CHEF_DE_QUART.this.exception = e;
			}
		}
		if (!(e instanceof TalendException)) {
		try {
			for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
				if (m.getName().compareTo(currentComponent + "_error") == 0) {
					m.invoke(Alimentation_FAIT_CHEF_DE_QUART.this, new Object[] { e , currentComponent, globalMap});
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
			
			public void tMap_4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_5_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_6_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_7_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
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
				
					tDBInput_5_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_7_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_6_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_8_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
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
			
			public void tChronometerStop_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tChronometerStop_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tJava_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tJava_2_onSubJobError(exception, errorComponent, globalMap);
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
				
					tDBInput_5_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_row9_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
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
			
			public void tSortRow_2_SortOut_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
							tSortRow_2_SortIn_error(exception, errorComponent, globalMap);
						
						}
					
			public void tSortRow_2_SortIn_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_5_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBInput_5_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

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
			public void tPostjob_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBClose_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBClose_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tChronometerStop_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tJava_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
	






public static class Update_DataStruct implements routines.system.IPersistableRow<Update_DataStruct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public int id_faitcdq;

				public int getId_faitcdq () {
					return this.id_faitcdq;
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
				
			    public Integer quantite;

				public Integer getQuantite () {
					return this.quantite;
				}
				
			    public Integer volume_total;

				public Integer getVolume_total () {
					return this.volume_total;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
							result = prime * result + (int) this.id_faitcdq;
						
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
		final Update_DataStruct other = (Update_DataStruct) obj;
		
						if (this.id_faitcdq != other.id_faitcdq)
							return false;
					

		return true;
    }

	public void copyDataTo(Update_DataStruct other) {

		other.id_faitcdq = this.id_faitcdq;
	            other.id_secteur = this.id_secteur;
	            other.id_produit = this.id_produit;
	            other.id_temps = this.id_temps;
	            other.cattc = this.cattc;
	            other.caht = this.caht;
	            other.pertes = this.pertes;
	            other.quantite = this.quantite;
	            other.volume_total = this.volume_total;
	            
	}

	public void copyKeysDataTo(Update_DataStruct other) {

		other.id_faitcdq = this.id_faitcdq;
	            	
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART) {

        	try {

        		int length = 0;
		
			        this.id_faitcdq = dis.readInt();
					
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
					
						this.quantite = readInteger(dis);
					
						this.volume_total = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART) {

        	try {

        		int length = 0;
		
			        this.id_faitcdq = dis.readInt();
					
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
					
						this.quantite = readInteger(dis);
					
						this.volume_total = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id_faitcdq);
					
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
				
						writeInteger(this.quantite,dos);
					
					// Integer
				
						writeInteger(this.volume_total,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id_faitcdq);
					
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
				
						writeInteger(this.quantite,dos);
					
					// Integer
				
						writeInteger(this.volume_total,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id_faitcdq="+String.valueOf(id_faitcdq));
		sb.append(",id_secteur="+String.valueOf(id_secteur));
		sb.append(",id_produit="+String.valueOf(id_produit));
		sb.append(",id_temps="+String.valueOf(id_temps));
		sb.append(",cattc="+String.valueOf(cattc));
		sb.append(",caht="+String.valueOf(caht));
		sb.append(",pertes="+String.valueOf(pertes));
		sb.append(",quantite="+String.valueOf(quantite));
		sb.append(",volume_total="+String.valueOf(volume_total));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(Update_DataStruct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.id_faitcdq, other.id_faitcdq);
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
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public int id_faitcdq;

				public int getId_faitcdq () {
					return this.id_faitcdq;
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
				
			    public Integer quantite;

				public Integer getQuantite () {
					return this.quantite;
				}
				
			    public Integer volume_total;

				public Integer getVolume_total () {
					return this.volume_total;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
							result = prime * result + (int) this.id_faitcdq;
						
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
		
						if (this.id_faitcdq != other.id_faitcdq)
							return false;
					

		return true;
    }

	public void copyDataTo(Insert_New_DataStruct other) {

		other.id_faitcdq = this.id_faitcdq;
	            other.id_secteur = this.id_secteur;
	            other.id_produit = this.id_produit;
	            other.id_temps = this.id_temps;
	            other.cattc = this.cattc;
	            other.caht = this.caht;
	            other.pertes = this.pertes;
	            other.quantite = this.quantite;
	            other.volume_total = this.volume_total;
	            
	}

	public void copyKeysDataTo(Insert_New_DataStruct other) {

		other.id_faitcdq = this.id_faitcdq;
	            	
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART) {

        	try {

        		int length = 0;
		
			        this.id_faitcdq = dis.readInt();
					
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
					
						this.quantite = readInteger(dis);
					
						this.volume_total = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART) {

        	try {

        		int length = 0;
		
			        this.id_faitcdq = dis.readInt();
					
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
					
						this.quantite = readInteger(dis);
					
						this.volume_total = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id_faitcdq);
					
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
				
						writeInteger(this.quantite,dos);
					
					// Integer
				
						writeInteger(this.volume_total,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id_faitcdq);
					
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
				
						writeInteger(this.quantite,dos);
					
					// Integer
				
						writeInteger(this.volume_total,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id_faitcdq="+String.valueOf(id_faitcdq));
		sb.append(",id_secteur="+String.valueOf(id_secteur));
		sb.append(",id_produit="+String.valueOf(id_produit));
		sb.append(",id_temps="+String.valueOf(id_temps));
		sb.append(",cattc="+String.valueOf(cattc));
		sb.append(",caht="+String.valueOf(caht));
		sb.append(",pertes="+String.valueOf(pertes));
		sb.append(",quantite="+String.valueOf(quantite));
		sb.append(",volume_total="+String.valueOf(volume_total));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(Insert_New_DataStruct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.id_faitcdq, other.id_faitcdq);
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
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[0];

	
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
				
			    public Integer quantite;

				public Integer getQuantite () {
					return this.quantite;
				}
				
			    public Integer volume_total;

				public Integer getVolume_total () {
					return this.volume_total;
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART) {

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
					
						this.quantite = readInteger(dis);
					
						this.volume_total = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART) {

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
					
						this.quantite = readInteger(dis);
					
						this.volume_total = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
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
				
						writeInteger(this.quantite,dos);
					
					// Integer
				
						writeInteger(this.volume_total,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
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
				
						writeInteger(this.quantite,dos);
					
					// Integer
				
						writeInteger(this.volume_total,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id_secteur="+String.valueOf(id_secteur));
		sb.append(",id_produit="+String.valueOf(id_produit));
		sb.append(",id_temps="+String.valueOf(id_temps));
		sb.append(",cattc="+String.valueOf(cattc));
		sb.append(",caht="+String.valueOf(caht));
		sb.append(",pertes="+String.valueOf(pertes));
		sb.append(",quantite="+String.valueOf(quantite));
		sb.append(",volume_total="+String.valueOf(volume_total));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(out5Struct other) {

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

public static class out6Struct implements routines.system.IPersistableRow<out6Struct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[0];

	
			    public int id_faitcdq;

				public int getId_faitcdq () {
					return this.id_faitcdq;
				}
				
			    public long id_secteur;

				public long getId_secteur () {
					return this.id_secteur;
				}
				
			    public long id_produit;

				public long getId_produit () {
					return this.id_produit;
				}
				
			    public int id_temps;

				public int getId_temps () {
					return this.id_temps;
				}
				
			    public int qte_vendu;

				public int getQte_vendu () {
					return this.qte_vendu;
				}
				
			    public double Pertes;

				public double getPertes () {
					return this.Pertes;
				}
				
			    public double CANTTC;

				public double getCANTTC () {
					return this.CANTTC;
				}
				
			    public double CAHT;

				public double getCAHT () {
					return this.CAHT;
				}
				
			    public int Volume_Total;

				public int getVolume_Total () {
					return this.Volume_Total;
				}
				



    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART) {

        	try {

        		int length = 0;
		
			        this.id_faitcdq = dis.readInt();
					
			        this.id_secteur = dis.readLong();
					
			        this.id_produit = dis.readLong();
					
			        this.id_temps = dis.readInt();
					
			        this.qte_vendu = dis.readInt();
					
			        this.Pertes = dis.readDouble();
					
			        this.CANTTC = dis.readDouble();
					
			        this.CAHT = dis.readDouble();
					
			        this.Volume_Total = dis.readInt();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART) {

        	try {

        		int length = 0;
		
			        this.id_faitcdq = dis.readInt();
					
			        this.id_secteur = dis.readLong();
					
			        this.id_produit = dis.readLong();
					
			        this.id_temps = dis.readInt();
					
			        this.qte_vendu = dis.readInt();
					
			        this.Pertes = dis.readDouble();
					
			        this.CANTTC = dis.readDouble();
					
			        this.CAHT = dis.readDouble();
					
			        this.Volume_Total = dis.readInt();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id_faitcdq);
					
					// long
				
		            	dos.writeLong(this.id_secteur);
					
					// long
				
		            	dos.writeLong(this.id_produit);
					
					// int
				
		            	dos.writeInt(this.id_temps);
					
					// int
				
		            	dos.writeInt(this.qte_vendu);
					
					// double
				
		            	dos.writeDouble(this.Pertes);
					
					// double
				
		            	dos.writeDouble(this.CANTTC);
					
					// double
				
		            	dos.writeDouble(this.CAHT);
					
					// int
				
		            	dos.writeInt(this.Volume_Total);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id_faitcdq);
					
					// long
				
		            	dos.writeLong(this.id_secteur);
					
					// long
				
		            	dos.writeLong(this.id_produit);
					
					// int
				
		            	dos.writeInt(this.id_temps);
					
					// int
				
		            	dos.writeInt(this.qte_vendu);
					
					// double
				
		            	dos.writeDouble(this.Pertes);
					
					// double
				
		            	dos.writeDouble(this.CANTTC);
					
					// double
				
		            	dos.writeDouble(this.CAHT);
					
					// int
				
		            	dos.writeInt(this.Volume_Total);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id_faitcdq="+String.valueOf(id_faitcdq));
		sb.append(",id_secteur="+String.valueOf(id_secteur));
		sb.append(",id_produit="+String.valueOf(id_produit));
		sb.append(",id_temps="+String.valueOf(id_temps));
		sb.append(",qte_vendu="+String.valueOf(qte_vendu));
		sb.append(",Pertes="+String.valueOf(Pertes));
		sb.append(",CANTTC="+String.valueOf(CANTTC));
		sb.append(",CAHT="+String.valueOf(CAHT));
		sb.append(",Volume_Total="+String.valueOf(Volume_Total));
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

public static class out4Struct implements routines.system.IPersistableRow<out4Struct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[0];

	
			    public long id_secteur;

				public long getId_secteur () {
					return this.id_secteur;
				}
				
			    public long id_produit;

				public long getId_produit () {
					return this.id_produit;
				}
				
			    public int id_temps;

				public int getId_temps () {
					return this.id_temps;
				}
				
			    public int qte_vendu;

				public int getQte_vendu () {
					return this.qte_vendu;
				}
				
			    public double Pertes;

				public double getPertes () {
					return this.Pertes;
				}
				
			    public double CANTTC;

				public double getCANTTC () {
					return this.CANTTC;
				}
				
			    public double CAHT;

				public double getCAHT () {
					return this.CAHT;
				}
				
			    public int Volume_Total;

				public int getVolume_Total () {
					return this.Volume_Total;
				}
				



    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART) {

        	try {

        		int length = 0;
		
			        this.id_secteur = dis.readLong();
					
			        this.id_produit = dis.readLong();
					
			        this.id_temps = dis.readInt();
					
			        this.qte_vendu = dis.readInt();
					
			        this.Pertes = dis.readDouble();
					
			        this.CANTTC = dis.readDouble();
					
			        this.CAHT = dis.readDouble();
					
			        this.Volume_Total = dis.readInt();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART) {

        	try {

        		int length = 0;
		
			        this.id_secteur = dis.readLong();
					
			        this.id_produit = dis.readLong();
					
			        this.id_temps = dis.readInt();
					
			        this.qte_vendu = dis.readInt();
					
			        this.Pertes = dis.readDouble();
					
			        this.CANTTC = dis.readDouble();
					
			        this.CAHT = dis.readDouble();
					
			        this.Volume_Total = dis.readInt();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id_secteur);
					
					// long
				
		            	dos.writeLong(this.id_produit);
					
					// int
				
		            	dos.writeInt(this.id_temps);
					
					// int
				
		            	dos.writeInt(this.qte_vendu);
					
					// double
				
		            	dos.writeDouble(this.Pertes);
					
					// double
				
		            	dos.writeDouble(this.CANTTC);
					
					// double
				
		            	dos.writeDouble(this.CAHT);
					
					// int
				
		            	dos.writeInt(this.Volume_Total);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id_secteur);
					
					// long
				
		            	dos.writeLong(this.id_produit);
					
					// int
				
		            	dos.writeInt(this.id_temps);
					
					// int
				
		            	dos.writeInt(this.qte_vendu);
					
					// double
				
		            	dos.writeDouble(this.Pertes);
					
					// double
				
		            	dos.writeDouble(this.CANTTC);
					
					// double
				
		            	dos.writeDouble(this.CAHT);
					
					// int
				
		            	dos.writeInt(this.Volume_Total);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id_secteur="+String.valueOf(id_secteur));
		sb.append(",id_produit="+String.valueOf(id_produit));
		sb.append(",id_temps="+String.valueOf(id_temps));
		sb.append(",qte_vendu="+String.valueOf(qte_vendu));
		sb.append(",Pertes="+String.valueOf(Pertes));
		sb.append(",CANTTC="+String.valueOf(CANTTC));
		sb.append(",CAHT="+String.valueOf(CAHT));
		sb.append(",Volume_Total="+String.valueOf(Volume_Total));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(out4Struct other) {

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
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[0];

	
			    public long id_secteur;

				public long getId_secteur () {
					return this.id_secteur;
				}
				
			    public long id_produit;

				public long getId_produit () {
					return this.id_produit;
				}
				
			    public int id_temps;

				public int getId_temps () {
					return this.id_temps;
				}
				
			    public int qte_vendu;

				public int getQte_vendu () {
					return this.qte_vendu;
				}
				
			    public double Pertes;

				public double getPertes () {
					return this.Pertes;
				}
				
			    public double CANTTC;

				public double getCANTTC () {
					return this.CANTTC;
				}
				
			    public int Volume_Total;

				public int getVolume_Total () {
					return this.Volume_Total;
				}
				
			    public String nompilier;

				public String getNompilier () {
					return this.nompilier;
				}
				
			    public java.util.Date dt;

				public java.util.Date getDt () {
					return this.dt;
				}
				
			    public String zone_supervision;

				public String getZone_supervision () {
					return this.zone_supervision;
				}
				
			    public String sku_commcare;

				public String getSku_commcare () {
					return this.sku_commcare;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART, 0, length, utf8Charset);
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
			if(length > commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART) {

        	try {

        		int length = 0;
		
			        this.id_secteur = dis.readLong();
					
			        this.id_produit = dis.readLong();
					
			        this.id_temps = dis.readInt();
					
			        this.qte_vendu = dis.readInt();
					
			        this.Pertes = dis.readDouble();
					
			        this.CANTTC = dis.readDouble();
					
			        this.Volume_Total = dis.readInt();
					
					this.nompilier = readString(dis);
					
					this.dt = readDate(dis);
					
					this.zone_supervision = readString(dis);
					
					this.sku_commcare = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART) {

        	try {

        		int length = 0;
		
			        this.id_secteur = dis.readLong();
					
			        this.id_produit = dis.readLong();
					
			        this.id_temps = dis.readInt();
					
			        this.qte_vendu = dis.readInt();
					
			        this.Pertes = dis.readDouble();
					
			        this.CANTTC = dis.readDouble();
					
			        this.Volume_Total = dis.readInt();
					
					this.nompilier = readString(dis);
					
					this.dt = readDate(dis);
					
					this.zone_supervision = readString(dis);
					
					this.sku_commcare = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id_secteur);
					
					// long
				
		            	dos.writeLong(this.id_produit);
					
					// int
				
		            	dos.writeInt(this.id_temps);
					
					// int
				
		            	dos.writeInt(this.qte_vendu);
					
					// double
				
		            	dos.writeDouble(this.Pertes);
					
					// double
				
		            	dos.writeDouble(this.CANTTC);
					
					// int
				
		            	dos.writeInt(this.Volume_Total);
					
					// String
				
						writeString(this.nompilier,dos);
					
					// java.util.Date
				
						writeDate(this.dt,dos);
					
					// String
				
						writeString(this.zone_supervision,dos);
					
					// String
				
						writeString(this.sku_commcare,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id_secteur);
					
					// long
				
		            	dos.writeLong(this.id_produit);
					
					// int
				
		            	dos.writeInt(this.id_temps);
					
					// int
				
		            	dos.writeInt(this.qte_vendu);
					
					// double
				
		            	dos.writeDouble(this.Pertes);
					
					// double
				
		            	dos.writeDouble(this.CANTTC);
					
					// int
				
		            	dos.writeInt(this.Volume_Total);
					
					// String
				
						writeString(this.nompilier,dos);
					
					// java.util.Date
				
						writeDate(this.dt,dos);
					
					// String
				
						writeString(this.zone_supervision,dos);
					
					// String
				
						writeString(this.sku_commcare,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id_secteur="+String.valueOf(id_secteur));
		sb.append(",id_produit="+String.valueOf(id_produit));
		sb.append(",id_temps="+String.valueOf(id_temps));
		sb.append(",qte_vendu="+String.valueOf(qte_vendu));
		sb.append(",Pertes="+String.valueOf(Pertes));
		sb.append(",CANTTC="+String.valueOf(CANTTC));
		sb.append(",Volume_Total="+String.valueOf(Volume_Total));
		sb.append(",nompilier="+nompilier);
		sb.append(",dt="+String.valueOf(dt));
		sb.append(",zone_supervision="+zone_supervision);
		sb.append(",sku_commcare="+sku_commcare);
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

public static class out2Struct implements routines.system.IPersistableRow<out2Struct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[0];

	
			    public long id_secteur;

				public long getId_secteur () {
					return this.id_secteur;
				}
				
			    public long id_produit;

				public long getId_produit () {
					return this.id_produit;
				}
				
			    public String nompilier;

				public String getNompilier () {
					return this.nompilier;
				}
				
			    public int qte_vendu;

				public int getQte_vendu () {
					return this.qte_vendu;
				}
				
			    public double Pertes;

				public double getPertes () {
					return this.Pertes;
				}
				
			    public java.util.Date dt;

				public java.util.Date getDt () {
					return this.dt;
				}
				
			    public String region_commercial;

				public String getRegion_commercial () {
					return this.region_commercial;
				}
				
			    public Long catalog_id;

				public Long getCatalog_id () {
					return this.catalog_id;
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
				
			    public String sku_commcare;

				public String getSku_commcare () {
					return this.sku_commcare;
				}
				
			    public Integer volume_unitaire;

				public Integer getVolume_unitaire () {
					return this.volume_unitaire;
				}
				
			    public String zone_supervision;

				public String getZone_supervision () {
					return this.zone_supervision;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART, 0, length, utf8Charset);
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
			if(length > commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART) {

        	try {

        		int length = 0;
		
			        this.id_secteur = dis.readLong();
					
			        this.id_produit = dis.readLong();
					
					this.nompilier = readString(dis);
					
			        this.qte_vendu = dis.readInt();
					
			        this.Pertes = dis.readDouble();
					
					this.dt = readDate(dis);
					
					this.region_commercial = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.catalog_id = null;
           				} else {
           			    	this.catalog_id = dis.readLong();
           				}
					
						this.Prix_Mali_Guinee = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.Prix__Gambie = null;
           				} else {
           			    	this.Prix__Gambie = dis.readDouble();
           				}
					
						this.price = readInteger(dis);
					
						this.prix = readInteger(dis);
					
					this.sku_commcare = readString(dis);
					
						this.volume_unitaire = readInteger(dis);
					
					this.zone_supervision = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART) {

        	try {

        		int length = 0;
		
			        this.id_secteur = dis.readLong();
					
			        this.id_produit = dis.readLong();
					
					this.nompilier = readString(dis);
					
			        this.qte_vendu = dis.readInt();
					
			        this.Pertes = dis.readDouble();
					
					this.dt = readDate(dis);
					
					this.region_commercial = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.catalog_id = null;
           				} else {
           			    	this.catalog_id = dis.readLong();
           				}
					
						this.Prix_Mali_Guinee = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.Prix__Gambie = null;
           				} else {
           			    	this.Prix__Gambie = dis.readDouble();
           				}
					
						this.price = readInteger(dis);
					
						this.prix = readInteger(dis);
					
					this.sku_commcare = readString(dis);
					
						this.volume_unitaire = readInteger(dis);
					
					this.zone_supervision = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id_secteur);
					
					// long
				
		            	dos.writeLong(this.id_produit);
					
					// String
				
						writeString(this.nompilier,dos);
					
					// int
				
		            	dos.writeInt(this.qte_vendu);
					
					// double
				
		            	dos.writeDouble(this.Pertes);
					
					// java.util.Date
				
						writeDate(this.dt,dos);
					
					// String
				
						writeString(this.region_commercial,dos);
					
					// Long
				
						if(this.catalog_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.catalog_id);
		            	}
					
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
					
					// String
				
						writeString(this.sku_commcare,dos);
					
					// Integer
				
						writeInteger(this.volume_unitaire,dos);
					
					// String
				
						writeString(this.zone_supervision,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// long
				
		            	dos.writeLong(this.id_secteur);
					
					// long
				
		            	dos.writeLong(this.id_produit);
					
					// String
				
						writeString(this.nompilier,dos);
					
					// int
				
		            	dos.writeInt(this.qte_vendu);
					
					// double
				
		            	dos.writeDouble(this.Pertes);
					
					// java.util.Date
				
						writeDate(this.dt,dos);
					
					// String
				
						writeString(this.region_commercial,dos);
					
					// Long
				
						if(this.catalog_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.catalog_id);
		            	}
					
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
					
					// String
				
						writeString(this.sku_commcare,dos);
					
					// Integer
				
						writeInteger(this.volume_unitaire,dos);
					
					// String
				
						writeString(this.zone_supervision,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id_secteur="+String.valueOf(id_secteur));
		sb.append(",id_produit="+String.valueOf(id_produit));
		sb.append(",nompilier="+nompilier);
		sb.append(",qte_vendu="+String.valueOf(qte_vendu));
		sb.append(",Pertes="+String.valueOf(Pertes));
		sb.append(",dt="+String.valueOf(dt));
		sb.append(",region_commercial="+region_commercial);
		sb.append(",catalog_id="+String.valueOf(catalog_id));
		sb.append(",Prix_Mali_Guinee="+String.valueOf(Prix_Mali_Guinee));
		sb.append(",Prix__Gambie="+String.valueOf(Prix__Gambie));
		sb.append(",price="+String.valueOf(price));
		sb.append(",prix="+String.valueOf(prix));
		sb.append(",sku_commcare="+sku_commcare);
		sb.append(",volume_unitaire="+String.valueOf(volume_unitaire));
		sb.append(",zone_supervision="+zone_supervision);
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

public static class row8Struct implements routines.system.IPersistableRow<row8Struct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[0];

	
			    public long id_produit;

				public long getId_produit () {
					return this.id_produit;
				}
				
			    public int loaded;

				public int getLoaded () {
					return this.loaded;
				}
				
			    public int quantity_pierced_chef;

				public int getQuantity_pierced_chef () {
					return this.quantity_pierced_chef;
				}
				
			    public int quantity_declass_chef;

				public int getQuantity_declass_chef () {
					return this.quantity_declass_chef;
				}
				
			    public int quantity_not_sale_chef;

				public int getQuantity_not_sale_chef () {
					return this.quantity_not_sale_chef;
				}
				
			    public int quantity_claim_chef;

				public int getQuantity_claim_chef () {
					return this.quantity_claim_chef;
				}
				
			    public int quantity_missing_chef;

				public int getQuantity_missing_chef () {
					return this.quantity_missing_chef;
				}
				
			    public java.util.Date dt;

				public java.util.Date getDt () {
					return this.dt;
				}
				
			    public Integer price;

				public Integer getPrice () {
					return this.price;
				}
				
			    public Integer prix;

				public Integer getPrix () {
					return this.prix;
				}
				
			    public String label;

				public String getLabel () {
					return this.label;
				}
				
			    public Long catalog_id;

				public Long getCatalog_id () {
					return this.catalog_id;
				}
				
			    public Integer Prix_Mali_Guinee;

				public Integer getPrix_Mali_Guinee () {
					return this.Prix_Mali_Guinee;
				}
				
			    public Double Prix__Gambie;

				public Double getPrix__Gambie () {
					return this.Prix__Gambie;
				}
				
			    public String nompilier;

				public String getNompilier () {
					return this.nompilier;
				}
				
			    public String sku_commcare;

				public String getSku_commcare () {
					return this.sku_commcare;
				}
				
			    public Integer volume_unitaire;

				public Integer getVolume_unitaire () {
					return this.volume_unitaire;
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
			if(length > commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART, 0, length, utf8Charset);
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
			if(length > commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART) {

        	try {

        		int length = 0;
		
			        this.id_produit = dis.readLong();
					
			        this.loaded = dis.readInt();
					
			        this.quantity_pierced_chef = dis.readInt();
					
			        this.quantity_declass_chef = dis.readInt();
					
			        this.quantity_not_sale_chef = dis.readInt();
					
			        this.quantity_claim_chef = dis.readInt();
					
			        this.quantity_missing_chef = dis.readInt();
					
					this.dt = readDate(dis);
					
						this.price = readInteger(dis);
					
						this.prix = readInteger(dis);
					
					this.label = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.catalog_id = null;
           				} else {
           			    	this.catalog_id = dis.readLong();
           				}
					
						this.Prix_Mali_Guinee = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.Prix__Gambie = null;
           				} else {
           			    	this.Prix__Gambie = dis.readDouble();
           				}
					
					this.nompilier = readString(dis);
					
					this.sku_commcare = readString(dis);
					
						this.volume_unitaire = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART) {

        	try {

        		int length = 0;
		
			        this.id_produit = dis.readLong();
					
			        this.loaded = dis.readInt();
					
			        this.quantity_pierced_chef = dis.readInt();
					
			        this.quantity_declass_chef = dis.readInt();
					
			        this.quantity_not_sale_chef = dis.readInt();
					
			        this.quantity_claim_chef = dis.readInt();
					
			        this.quantity_missing_chef = dis.readInt();
					
					this.dt = readDate(dis);
					
						this.price = readInteger(dis);
					
						this.prix = readInteger(dis);
					
					this.label = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.catalog_id = null;
           				} else {
           			    	this.catalog_id = dis.readLong();
           				}
					
						this.Prix_Mali_Guinee = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.Prix__Gambie = null;
           				} else {
           			    	this.Prix__Gambie = dis.readDouble();
           				}
					
					this.nompilier = readString(dis);
					
					this.sku_commcare = readString(dis);
					
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
					
					// int
				
		            	dos.writeInt(this.loaded);
					
					// int
				
		            	dos.writeInt(this.quantity_pierced_chef);
					
					// int
				
		            	dos.writeInt(this.quantity_declass_chef);
					
					// int
				
		            	dos.writeInt(this.quantity_not_sale_chef);
					
					// int
				
		            	dos.writeInt(this.quantity_claim_chef);
					
					// int
				
		            	dos.writeInt(this.quantity_missing_chef);
					
					// java.util.Date
				
						writeDate(this.dt,dos);
					
					// Integer
				
						writeInteger(this.price,dos);
					
					// Integer
				
						writeInteger(this.prix,dos);
					
					// String
				
						writeString(this.label,dos);
					
					// Long
				
						if(this.catalog_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.catalog_id);
		            	}
					
					// Integer
				
						writeInteger(this.Prix_Mali_Guinee,dos);
					
					// Double
				
						if(this.Prix__Gambie == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.Prix__Gambie);
		            	}
					
					// String
				
						writeString(this.nompilier,dos);
					
					// String
				
						writeString(this.sku_commcare,dos);
					
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
					
					// int
				
		            	dos.writeInt(this.loaded);
					
					// int
				
		            	dos.writeInt(this.quantity_pierced_chef);
					
					// int
				
		            	dos.writeInt(this.quantity_declass_chef);
					
					// int
				
		            	dos.writeInt(this.quantity_not_sale_chef);
					
					// int
				
		            	dos.writeInt(this.quantity_claim_chef);
					
					// int
				
		            	dos.writeInt(this.quantity_missing_chef);
					
					// java.util.Date
				
						writeDate(this.dt,dos);
					
					// Integer
				
						writeInteger(this.price,dos);
					
					// Integer
				
						writeInteger(this.prix,dos);
					
					// String
				
						writeString(this.label,dos);
					
					// Long
				
						if(this.catalog_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.catalog_id);
		            	}
					
					// Integer
				
						writeInteger(this.Prix_Mali_Guinee,dos);
					
					// Double
				
						if(this.Prix__Gambie == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.Prix__Gambie);
		            	}
					
					// String
				
						writeString(this.nompilier,dos);
					
					// String
				
						writeString(this.sku_commcare,dos);
					
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
		sb.append(",loaded="+String.valueOf(loaded));
		sb.append(",quantity_pierced_chef="+String.valueOf(quantity_pierced_chef));
		sb.append(",quantity_declass_chef="+String.valueOf(quantity_declass_chef));
		sb.append(",quantity_not_sale_chef="+String.valueOf(quantity_not_sale_chef));
		sb.append(",quantity_claim_chef="+String.valueOf(quantity_claim_chef));
		sb.append(",quantity_missing_chef="+String.valueOf(quantity_missing_chef));
		sb.append(",dt="+String.valueOf(dt));
		sb.append(",price="+String.valueOf(price));
		sb.append(",prix="+String.valueOf(prix));
		sb.append(",label="+label);
		sb.append(",catalog_id="+String.valueOf(catalog_id));
		sb.append(",Prix_Mali_Guinee="+String.valueOf(Prix_Mali_Guinee));
		sb.append(",Prix__Gambie="+String.valueOf(Prix__Gambie));
		sb.append(",nompilier="+nompilier);
		sb.append(",sku_commcare="+sku_commcare);
		sb.append(",volume_unitaire="+String.valueOf(volume_unitaire));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row8Struct other) {

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
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[0];

	
			    public long id_produit;

				public long getId_produit () {
					return this.id_produit;
				}
				
			    public int loaded;

				public int getLoaded () {
					return this.loaded;
				}
				
			    public int quantity_pierced_chef;

				public int getQuantity_pierced_chef () {
					return this.quantity_pierced_chef;
				}
				
			    public int quantity_declass_chef;

				public int getQuantity_declass_chef () {
					return this.quantity_declass_chef;
				}
				
			    public int quantity_not_sale_chef;

				public int getQuantity_not_sale_chef () {
					return this.quantity_not_sale_chef;
				}
				
			    public int quantity_claim_chef;

				public int getQuantity_claim_chef () {
					return this.quantity_claim_chef;
				}
				
			    public int quantity_missing_chef;

				public int getQuantity_missing_chef () {
					return this.quantity_missing_chef;
				}
				
			    public java.util.Date dt;

				public java.util.Date getDt () {
					return this.dt;
				}
				
			    public Integer price;

				public Integer getPrice () {
					return this.price;
				}
				
			    public Integer prix;

				public Integer getPrix () {
					return this.prix;
				}
				
			    public String label;

				public String getLabel () {
					return this.label;
				}
				
			    public Long catalog_id;

				public Long getCatalog_id () {
					return this.catalog_id;
				}
				
			    public Integer Prix_Mali_Guinee;

				public Integer getPrix_Mali_Guinee () {
					return this.Prix_Mali_Guinee;
				}
				
			    public Double Prix__Gambie;

				public Double getPrix__Gambie () {
					return this.Prix__Gambie;
				}
				
			    public String nompilier;

				public String getNompilier () {
					return this.nompilier;
				}
				
			    public String sku_commcare;

				public String getSku_commcare () {
					return this.sku_commcare;
				}
				
			    public Integer volume_unitaire;

				public Integer getVolume_unitaire () {
					return this.volume_unitaire;
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
			if(length > commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART, 0, length, utf8Charset);
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
			if(length > commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART) {

        	try {

        		int length = 0;
		
			        this.id_produit = dis.readLong();
					
			        this.loaded = dis.readInt();
					
			        this.quantity_pierced_chef = dis.readInt();
					
			        this.quantity_declass_chef = dis.readInt();
					
			        this.quantity_not_sale_chef = dis.readInt();
					
			        this.quantity_claim_chef = dis.readInt();
					
			        this.quantity_missing_chef = dis.readInt();
					
					this.dt = readDate(dis);
					
						this.price = readInteger(dis);
					
						this.prix = readInteger(dis);
					
					this.label = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.catalog_id = null;
           				} else {
           			    	this.catalog_id = dis.readLong();
           				}
					
						this.Prix_Mali_Guinee = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.Prix__Gambie = null;
           				} else {
           			    	this.Prix__Gambie = dis.readDouble();
           				}
					
					this.nompilier = readString(dis);
					
					this.sku_commcare = readString(dis);
					
						this.volume_unitaire = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART) {

        	try {

        		int length = 0;
		
			        this.id_produit = dis.readLong();
					
			        this.loaded = dis.readInt();
					
			        this.quantity_pierced_chef = dis.readInt();
					
			        this.quantity_declass_chef = dis.readInt();
					
			        this.quantity_not_sale_chef = dis.readInt();
					
			        this.quantity_claim_chef = dis.readInt();
					
			        this.quantity_missing_chef = dis.readInt();
					
					this.dt = readDate(dis);
					
						this.price = readInteger(dis);
					
						this.prix = readInteger(dis);
					
					this.label = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.catalog_id = null;
           				} else {
           			    	this.catalog_id = dis.readLong();
           				}
					
						this.Prix_Mali_Guinee = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.Prix__Gambie = null;
           				} else {
           			    	this.Prix__Gambie = dis.readDouble();
           				}
					
					this.nompilier = readString(dis);
					
					this.sku_commcare = readString(dis);
					
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
					
					// int
				
		            	dos.writeInt(this.loaded);
					
					// int
				
		            	dos.writeInt(this.quantity_pierced_chef);
					
					// int
				
		            	dos.writeInt(this.quantity_declass_chef);
					
					// int
				
		            	dos.writeInt(this.quantity_not_sale_chef);
					
					// int
				
		            	dos.writeInt(this.quantity_claim_chef);
					
					// int
				
		            	dos.writeInt(this.quantity_missing_chef);
					
					// java.util.Date
				
						writeDate(this.dt,dos);
					
					// Integer
				
						writeInteger(this.price,dos);
					
					// Integer
				
						writeInteger(this.prix,dos);
					
					// String
				
						writeString(this.label,dos);
					
					// Long
				
						if(this.catalog_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.catalog_id);
		            	}
					
					// Integer
				
						writeInteger(this.Prix_Mali_Guinee,dos);
					
					// Double
				
						if(this.Prix__Gambie == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.Prix__Gambie);
		            	}
					
					// String
				
						writeString(this.nompilier,dos);
					
					// String
				
						writeString(this.sku_commcare,dos);
					
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
					
					// int
				
		            	dos.writeInt(this.loaded);
					
					// int
				
		            	dos.writeInt(this.quantity_pierced_chef);
					
					// int
				
		            	dos.writeInt(this.quantity_declass_chef);
					
					// int
				
		            	dos.writeInt(this.quantity_not_sale_chef);
					
					// int
				
		            	dos.writeInt(this.quantity_claim_chef);
					
					// int
				
		            	dos.writeInt(this.quantity_missing_chef);
					
					// java.util.Date
				
						writeDate(this.dt,dos);
					
					// Integer
				
						writeInteger(this.price,dos);
					
					// Integer
				
						writeInteger(this.prix,dos);
					
					// String
				
						writeString(this.label,dos);
					
					// Long
				
						if(this.catalog_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.catalog_id);
		            	}
					
					// Integer
				
						writeInteger(this.Prix_Mali_Guinee,dos);
					
					// Double
				
						if(this.Prix__Gambie == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.Prix__Gambie);
		            	}
					
					// String
				
						writeString(this.nompilier,dos);
					
					// String
				
						writeString(this.sku_commcare,dos);
					
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
		sb.append(",loaded="+String.valueOf(loaded));
		sb.append(",quantity_pierced_chef="+String.valueOf(quantity_pierced_chef));
		sb.append(",quantity_declass_chef="+String.valueOf(quantity_declass_chef));
		sb.append(",quantity_not_sale_chef="+String.valueOf(quantity_not_sale_chef));
		sb.append(",quantity_claim_chef="+String.valueOf(quantity_claim_chef));
		sb.append(",quantity_missing_chef="+String.valueOf(quantity_missing_chef));
		sb.append(",dt="+String.valueOf(dt));
		sb.append(",price="+String.valueOf(price));
		sb.append(",prix="+String.valueOf(prix));
		sb.append(",label="+label);
		sb.append(",catalog_id="+String.valueOf(catalog_id));
		sb.append(",Prix_Mali_Guinee="+String.valueOf(Prix_Mali_Guinee));
		sb.append(",Prix__Gambie="+String.valueOf(Prix__Gambie));
		sb.append(",nompilier="+nompilier);
		sb.append(",sku_commcare="+sku_commcare);
		sb.append(",volume_unitaire="+String.valueOf(volume_unitaire));
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
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[0];

	
			    public long id_produit;

				public long getId_produit () {
					return this.id_produit;
				}
				
			    public int loaded;

				public int getLoaded () {
					return this.loaded;
				}
				
			    public int quantity_pierced_chef;

				public int getQuantity_pierced_chef () {
					return this.quantity_pierced_chef;
				}
				
			    public int quantity_declass_chef;

				public int getQuantity_declass_chef () {
					return this.quantity_declass_chef;
				}
				
			    public int quantity_not_sale_chef;

				public int getQuantity_not_sale_chef () {
					return this.quantity_not_sale_chef;
				}
				
			    public int quantity_claim_chef;

				public int getQuantity_claim_chef () {
					return this.quantity_claim_chef;
				}
				
			    public int quantity_missing_chef;

				public int getQuantity_missing_chef () {
					return this.quantity_missing_chef;
				}
				
			    public java.util.Date dt;

				public java.util.Date getDt () {
					return this.dt;
				}
				
			    public Integer price;

				public Integer getPrice () {
					return this.price;
				}
				
			    public Integer prix;

				public Integer getPrix () {
					return this.prix;
				}
				
			    public String label;

				public String getLabel () {
					return this.label;
				}
				
			    public Long catalog_id;

				public Long getCatalog_id () {
					return this.catalog_id;
				}
				
			    public Integer Prix_Mali_Guinee;

				public Integer getPrix_Mali_Guinee () {
					return this.Prix_Mali_Guinee;
				}
				
			    public Double Prix__Gambie;

				public Double getPrix__Gambie () {
					return this.Prix__Gambie;
				}
				
			    public String nompilier;

				public String getNompilier () {
					return this.nompilier;
				}
				
			    public String sku_commcare;

				public String getSku_commcare () {
					return this.sku_commcare;
				}
				
			    public Integer volume_unitaire;

				public Integer getVolume_unitaire () {
					return this.volume_unitaire;
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
			if(length > commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART, 0, length, utf8Charset);
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
			if(length > commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART) {

        	try {

        		int length = 0;
		
			        this.id_produit = dis.readLong();
					
			        this.loaded = dis.readInt();
					
			        this.quantity_pierced_chef = dis.readInt();
					
			        this.quantity_declass_chef = dis.readInt();
					
			        this.quantity_not_sale_chef = dis.readInt();
					
			        this.quantity_claim_chef = dis.readInt();
					
			        this.quantity_missing_chef = dis.readInt();
					
					this.dt = readDate(dis);
					
						this.price = readInteger(dis);
					
						this.prix = readInteger(dis);
					
					this.label = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.catalog_id = null;
           				} else {
           			    	this.catalog_id = dis.readLong();
           				}
					
						this.Prix_Mali_Guinee = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.Prix__Gambie = null;
           				} else {
           			    	this.Prix__Gambie = dis.readDouble();
           				}
					
					this.nompilier = readString(dis);
					
					this.sku_commcare = readString(dis);
					
						this.volume_unitaire = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART) {

        	try {

        		int length = 0;
		
			        this.id_produit = dis.readLong();
					
			        this.loaded = dis.readInt();
					
			        this.quantity_pierced_chef = dis.readInt();
					
			        this.quantity_declass_chef = dis.readInt();
					
			        this.quantity_not_sale_chef = dis.readInt();
					
			        this.quantity_claim_chef = dis.readInt();
					
			        this.quantity_missing_chef = dis.readInt();
					
					this.dt = readDate(dis);
					
						this.price = readInteger(dis);
					
						this.prix = readInteger(dis);
					
					this.label = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.catalog_id = null;
           				} else {
           			    	this.catalog_id = dis.readLong();
           				}
					
						this.Prix_Mali_Guinee = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.Prix__Gambie = null;
           				} else {
           			    	this.Prix__Gambie = dis.readDouble();
           				}
					
					this.nompilier = readString(dis);
					
					this.sku_commcare = readString(dis);
					
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
					
					// int
				
		            	dos.writeInt(this.loaded);
					
					// int
				
		            	dos.writeInt(this.quantity_pierced_chef);
					
					// int
				
		            	dos.writeInt(this.quantity_declass_chef);
					
					// int
				
		            	dos.writeInt(this.quantity_not_sale_chef);
					
					// int
				
		            	dos.writeInt(this.quantity_claim_chef);
					
					// int
				
		            	dos.writeInt(this.quantity_missing_chef);
					
					// java.util.Date
				
						writeDate(this.dt,dos);
					
					// Integer
				
						writeInteger(this.price,dos);
					
					// Integer
				
						writeInteger(this.prix,dos);
					
					// String
				
						writeString(this.label,dos);
					
					// Long
				
						if(this.catalog_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.catalog_id);
		            	}
					
					// Integer
				
						writeInteger(this.Prix_Mali_Guinee,dos);
					
					// Double
				
						if(this.Prix__Gambie == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.Prix__Gambie);
		            	}
					
					// String
				
						writeString(this.nompilier,dos);
					
					// String
				
						writeString(this.sku_commcare,dos);
					
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
					
					// int
				
		            	dos.writeInt(this.loaded);
					
					// int
				
		            	dos.writeInt(this.quantity_pierced_chef);
					
					// int
				
		            	dos.writeInt(this.quantity_declass_chef);
					
					// int
				
		            	dos.writeInt(this.quantity_not_sale_chef);
					
					// int
				
		            	dos.writeInt(this.quantity_claim_chef);
					
					// int
				
		            	dos.writeInt(this.quantity_missing_chef);
					
					// java.util.Date
				
						writeDate(this.dt,dos);
					
					// Integer
				
						writeInteger(this.price,dos);
					
					// Integer
				
						writeInteger(this.prix,dos);
					
					// String
				
						writeString(this.label,dos);
					
					// Long
				
						if(this.catalog_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.catalog_id);
		            	}
					
					// Integer
				
						writeInteger(this.Prix_Mali_Guinee,dos);
					
					// Double
				
						if(this.Prix__Gambie == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.Prix__Gambie);
		            	}
					
					// String
				
						writeString(this.nompilier,dos);
					
					// String
				
						writeString(this.sku_commcare,dos);
					
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
		sb.append(",loaded="+String.valueOf(loaded));
		sb.append(",quantity_pierced_chef="+String.valueOf(quantity_pierced_chef));
		sb.append(",quantity_declass_chef="+String.valueOf(quantity_declass_chef));
		sb.append(",quantity_not_sale_chef="+String.valueOf(quantity_not_sale_chef));
		sb.append(",quantity_claim_chef="+String.valueOf(quantity_claim_chef));
		sb.append(",quantity_missing_chef="+String.valueOf(quantity_missing_chef));
		sb.append(",dt="+String.valueOf(dt));
		sb.append(",price="+String.valueOf(price));
		sb.append(",prix="+String.valueOf(prix));
		sb.append(",label="+label);
		sb.append(",catalog_id="+String.valueOf(catalog_id));
		sb.append(",Prix_Mali_Guinee="+String.valueOf(Prix_Mali_Guinee));
		sb.append(",Prix__Gambie="+String.valueOf(Prix__Gambie));
		sb.append(",nompilier="+nompilier);
		sb.append(",sku_commcare="+sku_commcare);
		sb.append(",volume_unitaire="+String.valueOf(volume_unitaire));
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
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[0];

	
			    public java.util.Date dt;

				public java.util.Date getDt () {
					return this.dt;
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
				
			    public Integer prix;

				public Integer getPrix () {
					return this.prix;
				}
				
			    public String label;

				public String getLabel () {
					return this.label;
				}
				
			    public Integer loaded;

				public Integer getLoaded () {
					return this.loaded;
				}
				
			    public Integer quantity_pierced_chef;

				public Integer getQuantity_pierced_chef () {
					return this.quantity_pierced_chef;
				}
				
			    public Integer quantity_declass_chef;

				public Integer getQuantity_declass_chef () {
					return this.quantity_declass_chef;
				}
				
			    public Integer quantity_claim_chef;

				public Integer getQuantity_claim_chef () {
					return this.quantity_claim_chef;
				}
				
			    public Integer quantity_not_sale_chef;

				public Integer getQuantity_not_sale_chef () {
					return this.quantity_not_sale_chef;
				}
				
			    public Integer quantity_missing_chef;

				public Integer getQuantity_missing_chef () {
					return this.quantity_missing_chef;
				}
				
			    public Long catalog_id;

				public Long getCatalog_id () {
					return this.catalog_id;
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
			if(length > commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART, 0, length, utf8Charset);
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
			if(length > commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART) {

        	try {

        		int length = 0;
		
					this.dt = readDate(dis);
					
					this.sku_commcare = readString(dis);
					
					this.sku_sage = readString(dis);
					
						this.price = readInteger(dis);
					
						this.prix = readInteger(dis);
					
					this.label = readString(dis);
					
						this.loaded = readInteger(dis);
					
						this.quantity_pierced_chef = readInteger(dis);
					
						this.quantity_declass_chef = readInteger(dis);
					
						this.quantity_claim_chef = readInteger(dis);
					
						this.quantity_not_sale_chef = readInteger(dis);
					
						this.quantity_missing_chef = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.catalog_id = null;
           				} else {
           			    	this.catalog_id = dis.readLong();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART) {

        	try {

        		int length = 0;
		
					this.dt = readDate(dis);
					
					this.sku_commcare = readString(dis);
					
					this.sku_sage = readString(dis);
					
						this.price = readInteger(dis);
					
						this.prix = readInteger(dis);
					
					this.label = readString(dis);
					
						this.loaded = readInteger(dis);
					
						this.quantity_pierced_chef = readInteger(dis);
					
						this.quantity_declass_chef = readInteger(dis);
					
						this.quantity_claim_chef = readInteger(dis);
					
						this.quantity_not_sale_chef = readInteger(dis);
					
						this.quantity_missing_chef = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.catalog_id = null;
           				} else {
           			    	this.catalog_id = dis.readLong();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// java.util.Date
				
						writeDate(this.dt,dos);
					
					// String
				
						writeString(this.sku_commcare,dos);
					
					// String
				
						writeString(this.sku_sage,dos);
					
					// Integer
				
						writeInteger(this.price,dos);
					
					// Integer
				
						writeInteger(this.prix,dos);
					
					// String
				
						writeString(this.label,dos);
					
					// Integer
				
						writeInteger(this.loaded,dos);
					
					// Integer
				
						writeInteger(this.quantity_pierced_chef,dos);
					
					// Integer
				
						writeInteger(this.quantity_declass_chef,dos);
					
					// Integer
				
						writeInteger(this.quantity_claim_chef,dos);
					
					// Integer
				
						writeInteger(this.quantity_not_sale_chef,dos);
					
					// Integer
				
						writeInteger(this.quantity_missing_chef,dos);
					
					// Long
				
						if(this.catalog_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.catalog_id);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// java.util.Date
				
						writeDate(this.dt,dos);
					
					// String
				
						writeString(this.sku_commcare,dos);
					
					// String
				
						writeString(this.sku_sage,dos);
					
					// Integer
				
						writeInteger(this.price,dos);
					
					// Integer
				
						writeInteger(this.prix,dos);
					
					// String
				
						writeString(this.label,dos);
					
					// Integer
				
						writeInteger(this.loaded,dos);
					
					// Integer
				
						writeInteger(this.quantity_pierced_chef,dos);
					
					// Integer
				
						writeInteger(this.quantity_declass_chef,dos);
					
					// Integer
				
						writeInteger(this.quantity_claim_chef,dos);
					
					// Integer
				
						writeInteger(this.quantity_not_sale_chef,dos);
					
					// Integer
				
						writeInteger(this.quantity_missing_chef,dos);
					
					// Long
				
						if(this.catalog_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.catalog_id);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("dt="+String.valueOf(dt));
		sb.append(",sku_commcare="+sku_commcare);
		sb.append(",sku_sage="+sku_sage);
		sb.append(",price="+String.valueOf(price));
		sb.append(",prix="+String.valueOf(prix));
		sb.append(",label="+label);
		sb.append(",loaded="+String.valueOf(loaded));
		sb.append(",quantity_pierced_chef="+String.valueOf(quantity_pierced_chef));
		sb.append(",quantity_declass_chef="+String.valueOf(quantity_declass_chef));
		sb.append(",quantity_claim_chef="+String.valueOf(quantity_claim_chef));
		sb.append(",quantity_not_sale_chef="+String.valueOf(quantity_not_sale_chef));
		sb.append(",quantity_missing_chef="+String.valueOf(quantity_missing_chef));
		sb.append(",catalog_id="+String.valueOf(catalog_id));
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
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[0];

	
			    public java.util.Date dt;

				public java.util.Date getDt () {
					return this.dt;
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
				
			    public Integer prix;

				public Integer getPrix () {
					return this.prix;
				}
				
			    public String label;

				public String getLabel () {
					return this.label;
				}
				
			    public Integer loaded;

				public Integer getLoaded () {
					return this.loaded;
				}
				
			    public Integer quantity_pierced_chef;

				public Integer getQuantity_pierced_chef () {
					return this.quantity_pierced_chef;
				}
				
			    public Integer quantity_declass_chef;

				public Integer getQuantity_declass_chef () {
					return this.quantity_declass_chef;
				}
				
			    public Integer quantity_claim_chef;

				public Integer getQuantity_claim_chef () {
					return this.quantity_claim_chef;
				}
				
			    public Integer quantity_not_sale_chef;

				public Integer getQuantity_not_sale_chef () {
					return this.quantity_not_sale_chef;
				}
				
			    public Integer quantity_missing_chef;

				public Integer getQuantity_missing_chef () {
					return this.quantity_missing_chef;
				}
				
			    public Long catalog_id;

				public Long getCatalog_id () {
					return this.catalog_id;
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
			if(length > commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART, 0, length, utf8Charset);
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
			if(length > commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART) {

        	try {

        		int length = 0;
		
					this.dt = readDate(dis);
					
					this.sku_commcare = readString(dis);
					
					this.sku_sage = readString(dis);
					
						this.price = readInteger(dis);
					
						this.prix = readInteger(dis);
					
					this.label = readString(dis);
					
						this.loaded = readInteger(dis);
					
						this.quantity_pierced_chef = readInteger(dis);
					
						this.quantity_declass_chef = readInteger(dis);
					
						this.quantity_claim_chef = readInteger(dis);
					
						this.quantity_not_sale_chef = readInteger(dis);
					
						this.quantity_missing_chef = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.catalog_id = null;
           				} else {
           			    	this.catalog_id = dis.readLong();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART) {

        	try {

        		int length = 0;
		
					this.dt = readDate(dis);
					
					this.sku_commcare = readString(dis);
					
					this.sku_sage = readString(dis);
					
						this.price = readInteger(dis);
					
						this.prix = readInteger(dis);
					
					this.label = readString(dis);
					
						this.loaded = readInteger(dis);
					
						this.quantity_pierced_chef = readInteger(dis);
					
						this.quantity_declass_chef = readInteger(dis);
					
						this.quantity_claim_chef = readInteger(dis);
					
						this.quantity_not_sale_chef = readInteger(dis);
					
						this.quantity_missing_chef = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.catalog_id = null;
           				} else {
           			    	this.catalog_id = dis.readLong();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// java.util.Date
				
						writeDate(this.dt,dos);
					
					// String
				
						writeString(this.sku_commcare,dos);
					
					// String
				
						writeString(this.sku_sage,dos);
					
					// Integer
				
						writeInteger(this.price,dos);
					
					// Integer
				
						writeInteger(this.prix,dos);
					
					// String
				
						writeString(this.label,dos);
					
					// Integer
				
						writeInteger(this.loaded,dos);
					
					// Integer
				
						writeInteger(this.quantity_pierced_chef,dos);
					
					// Integer
				
						writeInteger(this.quantity_declass_chef,dos);
					
					// Integer
				
						writeInteger(this.quantity_claim_chef,dos);
					
					// Integer
				
						writeInteger(this.quantity_not_sale_chef,dos);
					
					// Integer
				
						writeInteger(this.quantity_missing_chef,dos);
					
					// Long
				
						if(this.catalog_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.catalog_id);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// java.util.Date
				
						writeDate(this.dt,dos);
					
					// String
				
						writeString(this.sku_commcare,dos);
					
					// String
				
						writeString(this.sku_sage,dos);
					
					// Integer
				
						writeInteger(this.price,dos);
					
					// Integer
				
						writeInteger(this.prix,dos);
					
					// String
				
						writeString(this.label,dos);
					
					// Integer
				
						writeInteger(this.loaded,dos);
					
					// Integer
				
						writeInteger(this.quantity_pierced_chef,dos);
					
					// Integer
				
						writeInteger(this.quantity_declass_chef,dos);
					
					// Integer
				
						writeInteger(this.quantity_claim_chef,dos);
					
					// Integer
				
						writeInteger(this.quantity_not_sale_chef,dos);
					
					// Integer
				
						writeInteger(this.quantity_missing_chef,dos);
					
					// Long
				
						if(this.catalog_id == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.catalog_id);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("dt="+String.valueOf(dt));
		sb.append(",sku_commcare="+sku_commcare);
		sb.append(",sku_sage="+sku_sage);
		sb.append(",price="+String.valueOf(price));
		sb.append(",prix="+String.valueOf(prix));
		sb.append(",label="+label);
		sb.append(",loaded="+String.valueOf(loaded));
		sb.append(",quantity_pierced_chef="+String.valueOf(quantity_pierced_chef));
		sb.append(",quantity_declass_chef="+String.valueOf(quantity_declass_chef));
		sb.append(",quantity_claim_chef="+String.valueOf(quantity_claim_chef));
		sb.append(",quantity_not_sale_chef="+String.valueOf(quantity_not_sale_chef));
		sb.append(",quantity_missing_chef="+String.valueOf(quantity_missing_chef));
		sb.append(",catalog_id="+String.valueOf(catalog_id));
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
		tDBInput_7Process(globalMap);
		tDBInput_6Process(globalMap);
		tDBInput_8Process(globalMap);

		row1Struct row1 = new row1Struct();
out1Struct out1 = new out1Struct();
row8Struct row8 = new row8Struct();
out2Struct out2 = new out2Struct();
out3Struct out3 = new out3Struct();
out4Struct out4 = new out4Struct();
out5Struct out5 = new out5Struct();
Insert_New_DataStruct Insert_New_Data = new Insert_New_DataStruct();
out6Struct out6 = new out6Struct();
Update_DataStruct Update_Data = new Update_DataStruct();





	
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

		if(this.dt == null && other.dt != null){
			return -1;
						
		}else if(this.dt != null && other.dt == null){
			return 1;
						
		}else if(this.dt != null && other.dt != null){
			if(!this.dt.equals(other.dt)){
				return this.dt.compareTo(other.dt);
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
	int loaded;
	int quantity_pierced_chef;
	int quantity_declass_chef;
	int quantity_not_sale_chef;
	int quantity_claim_chef;
	int quantity_missing_chef;
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
				
				 
	final String decryptedPassword_tDBInput_1 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:OH1krUY6uorscJ56lJB6GXxbXlv7r3uXhH+t2iUV6Ggi5BJigqZKdVil");
				
				String dbPwd_tDBInput_1 = decryptedPassword_tDBInput_1;
				
				String url_tDBInput_1 = "jdbc:postgresql://" + "leuk.laiterieduberger.sn" + ":" + "5432" + "/" + "leuk_webapp_production";
				
				conn_tDBInput_1 = java.sql.DriverManager.getConnection(url_tDBInput_1,dbUser_tDBInput_1,dbPwd_tDBInput_1);
		        
				conn_tDBInput_1.setAutoCommit(false);
			
		    
			java.sql.Statement stmt_tDBInput_1 = conn_tDBInput_1.createStatement();

		    String dbquery_tDBInput_1 = "SELECT \n	x.dt,\n    x.sku_commcare,\n	x.sku_sage,\n    x.price,\n    z.prix,\n    x.label,\n    l.loaded,\n    u.quant"
+"ity_pierced_chef,\n    u.quantity_declass_chef,\n    u.quantity_claim_chef,\n    u.quantity_not_sale_chef,\n    u.quanti"
+"ty_missing_chef,\n    z.catalog_id\n   FROM ( SELECT c.date AS dt,\n            p.id AS p_id,\n            p.sku_commcar"
+"e,\n		    p.sku_sage,\n            p.price,\n            s.id AS s_id,\n            s.label\n           FROM calendrier("
+"'2021-01-01'::date, date(now())) c(date)\n             CROSS JOIN products p\n             CROSS JOIN sectors s\n       "
+"   WHERE s.created_at >= '2020-09-11 00:00:00'::timestamp without time zone) x\n     LEFT JOIN ( SELECT sum(x_1.loaded) "
+"AS loaded,\n            x_1.date,\n            x_1.product_id,\n            x_1.sector_id\n           FROM ( SELECT sum("
+"loadings.loaded::integer)::integer AS loaded,\n                        CASE\n                            WHEN loadings.d"
+"ate <= '2021-10-24'::date THEN loadings.date\n                            ELSE t.date\n                        END AS da"
+"te,\n                    loadings.product_id,\n                    loadings.sector_id\n                   FROM loadings"
+"\n                     LEFT JOIN tournees t ON t.id = loadings.tournee_id\n                  GROUP BY (\n                "
+"        CASE\n                            WHEN loadings.date <= '2021-10-24'::date THEN loadings.date\n                 "
+"           ELSE t.date\n                        END), loadings.product_id, loadings.sector_id\n                UNION ALL"
+"\n                 SELECT adi.quantity,\n                        CASE\n                            WHEN ad.date <= '2021"
+"-10-24'::date THEN ad.date\n                            ELSE t.date\n                        END AS date,\n             "
+"       adi.product_id,\n                    ad.sector_id\n                   FROM additionnal_loadings ad\n             "
+"        JOIN additionnal_loading_items adi ON ad.id = adi.additionnal_loading_id\n                     LEFT JOIN tournee"
+"s t ON t.id = ad.tournee_id\n                UNION ALL\n                 SELECT\n                        CASE\n         "
+"                   WHEN ms.direction::text = 'sending'::text THEN '-1'::integer * msi.quantity\n                        "
+"    ELSE msi.quantity\n                        END AS loaded,\n                        CASE\n                           "
+" WHEN ms.date <= '2021-10-24 00:00:00'::timestamp without time zone THEN ms.date\n                            ELSE t.dat"
+"e::timestamp without time zone\n                        END AS date,\n                    msi.product_id,\n             "
+"       ms.sector_id\n                   FROM movement_of_stocks ms\n                     JOIN movement_of_stock_items ms"
+"i ON msi.movement_of_stock_id = ms.id\n                     LEFT JOIN tournees t ON t.id = ms.tournee_id) x_1\n         "
+" GROUP BY x_1.date, x_1.product_id, x_1.sector_id) l ON l.date = x.dt AND l.product_id = x.p_id AND l.sector_id = x.s_id"
+"\n     RIGHT JOIN ( SELECT sum(u_1.quantity_pierced_chef)::integer AS quantity_pierced_chef,\n            sum(u_1.quanti"
+"ty_declass_chef)::integer AS quantity_declass_chef,\n            sum(u_1.quantity_claim_chef)::integer AS quantity_claim"
+"_chef,\n            sum(u_1.quantity_not_sale_chef)::integer AS quantity_not_sale_chef,\n            sum(u_1.quantity_mi"
+"ssing_chef)::integer AS quantity_missing_chef,\n                CASE\n                    WHEN u_1.date <= '2021-10-24':"
+":date THEN u_1.date\n                    ELSE t.date\n                END AS date,\n            u_1.product_id,\n       "
+"     u_1.sector_id\n           FROM unloadings u_1\n             LEFT JOIN tournees t ON t.id = u_1.tournee_id\n        "
+"  WHERE u_1.id <> 0\n          GROUP BY u_1.product_id, u_1.sector_id, (\n                CASE\n                    WHEN"
+" u_1.date <= '2021-10-24'::date THEN u_1.date\n                    ELSE t.date\n                END)) u ON u.date = x.dt"
+" AND u.product_id = x.p_id AND u.sector_id = x.s_id\n     JOIN ( SELECT sectors.id,\n            cp.product_id,\n       "
+"     cp.stock_min,\n            cp.stock_max,\n            cat.id AS catalog_id,\n                CASE\n                "
+"    WHEN region_commercials.label::text ~~ '%MT%'::text THEN mt.price\n                    ELSE cp.price\n              "
+"  END AS prix\n           FROM sectors\n             JOIN zone_supervisors ON zone_supervisors.id = sectors.zone_supervi"
+"sor_id\n             JOIN region_commercials ON zone_supervisors.region_commercial_id = region_commercials.id\n         "
+"    JOIN countries c ON c.id = region_commercials.country_id\n             JOIN catalogs cat ON cat.country_id = c.id\n "
+"            JOIN catalog_products cp ON cat.id = cp.catalog_id AND cat.is_mt = false AND cp.catalog_id <> 6\n           "
+"  JOIN products p ON p.id = cp.product_id\n             LEFT JOIN ( SELECT cp_1.product_id,\n                    cp_1.pr"
+"ice\n                   FROM catalogs c_1\n                     JOIN catalog_products cp_1 ON c_1.id = cp_1.catalog_id A"
+"ND c_1.is_mt = true) mt ON mt.product_id = p.id) z ON z.id = x.s_id AND z.product_id = x.p_id\n       where dt  between "
+" CURRENT_DATE - INTERVAL '2 DAY'  and CURRENT_DATE - INTERVAL '1 DAY'      and   x.sku_commcare not in ('Casier','Bis1L'"
+",'Bis100','Binat1L','Bou100','Gel pack','Glacière','FCL08')\nUNION\n SELECT dsm.date::date AS dt,\n    p.sku_commcare,\n"
+"	p.sku_sage,\n    dsmi.price::integer AS price,\n    dsmi.price::integer AS prix,\n    d.name AS label,\n    dsmi.quanti"
+"ty AS loaded,\n    0 AS quantity_pierced_chef,\n    0 AS quantity_declass_chef,\n    0 AS quantity_claim_chef,\n    0 AS"
+" quantity_not_sale_chef,\n    0 AS quantity_missing_chef, \n    0::bigint AS catalog_id\n   FROM depot_stock_movement_it"
+"ems dsmi\n     JOIN depot_stock_movements dsm ON dsmi.depot_stock_movement_id = dsm.id\n     JOIN products p ON dsmi.pro"
+"duct_id = p.id\n     JOIN depots d ON d.id = dsm.depot_id\n  WHERE dsm.movement_type::text = 'SALE'::text and date  betw"
+"een CURRENT_DATE - INTERVAL '2 DAY'  and CURRENT_DATE - INTERVAL '1 DAY'  and   p.sku_commcare not in ('Casier','Bis1L',"
+"'Bis100','Binat1L','Bou100','Gel pack','Glacière','FCL08')\norder by dt asc;";
		    

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
								row1.dt = null;
							} else {
										
			row1.dt = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 1);
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
								row1.prix = null;
							} else {
		                          
            row1.prix = rs_tDBInput_1.getInt(5);
            if(rs_tDBInput_1.wasNull()){
                    row1.prix = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 6) {
								row1.label = null;
							} else {
	                         		
        	row1.label = routines.system.JDBCUtil.getString(rs_tDBInput_1, 6, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 7) {
								row1.loaded = null;
							} else {
		                          
            row1.loaded = rs_tDBInput_1.getInt(7);
            if(rs_tDBInput_1.wasNull()){
                    row1.loaded = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 8) {
								row1.quantity_pierced_chef = null;
							} else {
		                          
            row1.quantity_pierced_chef = rs_tDBInput_1.getInt(8);
            if(rs_tDBInput_1.wasNull()){
                    row1.quantity_pierced_chef = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 9) {
								row1.quantity_declass_chef = null;
							} else {
		                          
            row1.quantity_declass_chef = rs_tDBInput_1.getInt(9);
            if(rs_tDBInput_1.wasNull()){
                    row1.quantity_declass_chef = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 10) {
								row1.quantity_claim_chef = null;
							} else {
		                          
            row1.quantity_claim_chef = rs_tDBInput_1.getInt(10);
            if(rs_tDBInput_1.wasNull()){
                    row1.quantity_claim_chef = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 11) {
								row1.quantity_not_sale_chef = null;
							} else {
		                          
            row1.quantity_not_sale_chef = rs_tDBInput_1.getInt(11);
            if(rs_tDBInput_1.wasNull()){
                    row1.quantity_not_sale_chef = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 12) {
								row1.quantity_missing_chef = null;
							} else {
		                          
            row1.quantity_missing_chef = rs_tDBInput_1.getInt(12);
            if(rs_tDBInput_1.wasNull()){
                    row1.quantity_missing_chef = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 13) {
								row1.catalog_id = null;
							} else {
		                          
            row1.catalog_id = rs_tDBInput_1.getLong(13);
            if(rs_tDBInput_1.wasNull()){
                    row1.catalog_id = null;
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
 				  		  			
 				  		  			row1.prix != null
 				  		  			
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
Var.loaded = row1.loaded != null ? row1.loaded : 0 ;
Var.quantity_pierced_chef = row1.quantity_pierced_chef != null ? row1.quantity_pierced_chef : 0 ;
Var.quantity_declass_chef = row1.quantity_declass_chef != null ?row1.quantity_declass_chef : 0 ;
Var.quantity_not_sale_chef = row1.quantity_not_sale_chef != null ? row1.quantity_not_sale_chef : 0 ;
Var.quantity_claim_chef = row1.quantity_claim_chef != null ? row1.quantity_claim_chef : 0 ;
Var.quantity_missing_chef = row1.quantity_missing_chef != null ? row1.quantity_missing_chef : 0 ;// ###############################
        // ###############################
        // # Output tables

out1 = null;

if(!rejectedInnerJoin_tMap_1 ) {

// # Output table : 'out1'
out1_tmp.id_produit = row3.id_produit ;
out1_tmp.loaded = Var.loaded ;
out1_tmp.quantity_pierced_chef = Var.quantity_pierced_chef ;
out1_tmp.quantity_declass_chef = Var.quantity_declass_chef ;
out1_tmp.quantity_not_sale_chef = Var.quantity_not_sale_chef ;
out1_tmp.quantity_claim_chef = Var.quantity_claim_chef ;
out1_tmp.quantity_missing_chef = Var.quantity_missing_chef ;
out1_tmp.dt = row1.dt ;
out1_tmp.price = row1.price ;
out1_tmp.prix = row1.prix ;
out1_tmp.label = row1.label;
out1_tmp.catalog_id = row1.catalog_id ;
out1_tmp.Prix_Mali_Guinee = row2.prix__mali_guinee ;
out1_tmp.Prix__Gambie = row2.prix_gambie ;
out1_tmp.nompilier = row3.pilier ;
out1_tmp.sku_commcare = row1.sku_commcare ;
out1_tmp.volume_unitaire = row3.volume_unitaire ;
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
	arrayRowtSortRow_1_SortOut.loaded = out1.loaded;
	arrayRowtSortRow_1_SortOut.quantity_pierced_chef = out1.quantity_pierced_chef;
	arrayRowtSortRow_1_SortOut.quantity_declass_chef = out1.quantity_declass_chef;
	arrayRowtSortRow_1_SortOut.quantity_not_sale_chef = out1.quantity_not_sale_chef;
	arrayRowtSortRow_1_SortOut.quantity_claim_chef = out1.quantity_claim_chef;
	arrayRowtSortRow_1_SortOut.quantity_missing_chef = out1.quantity_missing_chef;
	arrayRowtSortRow_1_SortOut.dt = out1.dt;
	arrayRowtSortRow_1_SortOut.price = out1.price;
	arrayRowtSortRow_1_SortOut.prix = out1.prix;
	arrayRowtSortRow_1_SortOut.label = out1.label;
	arrayRowtSortRow_1_SortOut.catalog_id = out1.catalog_id;
	arrayRowtSortRow_1_SortOut.Prix_Mali_Guinee = out1.Prix_Mali_Guinee;
	arrayRowtSortRow_1_SortOut.Prix__Gambie = out1.Prix__Gambie;
	arrayRowtSortRow_1_SortOut.nompilier = out1.nompilier;
	arrayRowtSortRow_1_SortOut.sku_commcare = out1.sku_commcare;
	arrayRowtSortRow_1_SortOut.volume_unitaire = out1.volume_unitaire;	
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
	 * [tDBOutput_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_1", false);
		start_Hash.put("tDBOutput_1", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_1";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"Insert_New_Data");
					}
				
		int tos_count_tDBOutput_1 = 0;
		





String dbschema_tDBOutput_1 = null;
	dbschema_tDBOutput_1 = "public";
	

String tableName_tDBOutput_1 = null;
if(dbschema_tDBOutput_1 == null || dbschema_tDBOutput_1.trim().length() == 0) {
	tableName_tDBOutput_1 = ("Fait_CDQ");
} else {
	tableName_tDBOutput_1 = dbschema_tDBOutput_1 + "\".\"" + ("Fait_CDQ");
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
 
	final String decryptedPassword_tDBOutput_1 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:8w9ABdJ1w38jNeZp8mla4aLVZ4YyFeOkZ5yuos3afNfBxA2H1/E=");

    String dbPwd_tDBOutput_1 = decryptedPassword_tDBOutput_1;

    conn_tDBOutput_1 = java.sql.DriverManager.getConnection(url_tDBOutput_1,dbUser_tDBOutput_1,dbPwd_tDBOutput_1);
	
	resourceMap.put("conn_tDBOutput_1", conn_tDBOutput_1);
        conn_tDBOutput_1.setAutoCommit(false);
        int commitEvery_tDBOutput_1 = 1000;
        int commitCounter_tDBOutput_1 = 0;


   int batchSize_tDBOutput_1 = 1000;
   int batchSizeCounter_tDBOutput_1=0;

int count_tDBOutput_1=0;
	    String insert_tDBOutput_1 = "INSERT INTO \"" + tableName_tDBOutput_1 + "\" (\"id_faitcdq\",\"id_secteur\",\"id_produit\",\"id_temps\",\"cattc\",\"caht\",\"pertes\",\"quantite\",\"volume_total\") VALUES (?,?,?,?,?,?,?,?,?)";
	    
	    java.sql.PreparedStatement pstmt_tDBOutput_1 = conn_tDBOutput_1.prepareStatement(insert_tDBOutput_1);
	    resourceMap.put("pstmt_tDBOutput_1", pstmt_tDBOutput_1);
	    

 



/**
 * [tDBOutput_1 begin ] stop
 */



	
	/**
	 * [tMap_6 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_6", false);
		start_Hash.put("tMap_6", System.currentTimeMillis());
		
	
	currentComponent="tMap_6";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"out5");
					}
				
		int tos_count_tMap_6 = 0;
		




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
class  Var__tMap_6__Struct  {
	int idFaitCDQ;
}
Var__tMap_6__Struct Var__tMap_6 = new Var__tMap_6__Struct();
// ###############################

// ###############################
// # Outputs initialization
Insert_New_DataStruct Insert_New_Data_tmp = new Insert_New_DataStruct();
// ###############################

        
        



        









 



/**
 * [tMap_6 begin ] stop
 */





	
	/**
	 * [tDBOutput_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_2", false);
		start_Hash.put("tDBOutput_2", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_2";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"Update_Data");
					}
				
		int tos_count_tDBOutput_2 = 0;
		





String dbschema_tDBOutput_2 = null;
	dbschema_tDBOutput_2 = "public";
	

String tableName_tDBOutput_2 = null;
if(dbschema_tDBOutput_2 == null || dbschema_tDBOutput_2.trim().length() == 0) {
	tableName_tDBOutput_2 = ("Fait_CDQ");
} else {
	tableName_tDBOutput_2 = dbschema_tDBOutput_2 + "\".\"" + ("Fait_CDQ");
}

        int updateKeyCount_tDBOutput_2 = 1;
        if(updateKeyCount_tDBOutput_2 < 1) {
            throw new RuntimeException("For update, Schema must have a key");
        } else if (updateKeyCount_tDBOutput_2 == 9 && true) {        
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
 
	final String decryptedPassword_tDBOutput_2 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:6NVok76sMWTTIJ5KUUq/33UAB7hvSb60Du6NOClW26xmY+rl+EY=");

    String dbPwd_tDBOutput_2 = decryptedPassword_tDBOutput_2;

    conn_tDBOutput_2 = java.sql.DriverManager.getConnection(url_tDBOutput_2,dbUser_tDBOutput_2,dbPwd_tDBOutput_2);
	
	resourceMap.put("conn_tDBOutput_2", conn_tDBOutput_2);
        conn_tDBOutput_2.setAutoCommit(false);
        int commitEvery_tDBOutput_2 = 1000;
        int commitCounter_tDBOutput_2 = 0;


   int batchSize_tDBOutput_2 = 1000;
   int batchSizeCounter_tDBOutput_2=0;

int count_tDBOutput_2=0;
	    String update_tDBOutput_2 = "UPDATE \"" + tableName_tDBOutput_2 + "\" SET \"id_secteur\" = ?,\"id_produit\" = ?,\"id_temps\" = ?,\"cattc\" = ?,\"caht\" = ?,\"pertes\" = ?,\"quantite\" = ?,\"volume_total\" = ? WHERE \"id_faitcdq\" = ?";
	    java.sql.PreparedStatement pstmt_tDBOutput_2 = conn_tDBOutput_2.prepareStatement(update_tDBOutput_2);
	    resourceMap.put("pstmt_tDBOutput_2", pstmt_tDBOutput_2);
	    

 



/**
 * [tDBOutput_2 begin ] stop
 */



	
	/**
	 * [tMap_7 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_7", false);
		start_Hash.put("tMap_7", System.currentTimeMillis());
		
	
	currentComponent="tMap_7";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"out6");
					}
				
		int tos_count_tMap_7 = 0;
		




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
class  Var__tMap_7__Struct  {
}
Var__tMap_7__Struct Var__tMap_7 = new Var__tMap_7__Struct();
// ###############################

// ###############################
// # Outputs initialization
Update_DataStruct Update_Data_tmp = new Update_DataStruct();
// ###############################

        
        



        









 



/**
 * [tMap_7 begin ] stop
 */



	
	/**
	 * [tMap_5 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_5", false);
		start_Hash.put("tMap_5", System.currentTimeMillis());
		
	
	currentComponent="tMap_5";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"out4");
					}
				
		int tos_count_tMap_5 = 0;
		




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
class  Var__tMap_5__Struct  {
}
Var__tMap_5__Struct Var__tMap_5 = new Var__tMap_5__Struct();
// ###############################

// ###############################
// # Outputs initialization
out5Struct out5_tmp = new out5Struct();
out6Struct out6_tmp = new out6Struct();
// ###############################

        
        



        









 



/**
 * [tMap_5 begin ] stop
 */



	
	/**
	 * [tMap_4 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_4", false);
		start_Hash.put("tMap_4", System.currentTimeMillis());
		
	
	currentComponent="tMap_4";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"out3");
					}
				
		int tos_count_tMap_4 = 0;
		




// ###############################
// # Lookup's keys initialization
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_4__Struct  {
	double CAHT;
}
Var__tMap_4__Struct Var__tMap_4 = new Var__tMap_4__Struct();
// ###############################

// ###############################
// # Outputs initialization
out4Struct out4_tmp = new out4Struct();
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
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"out2");
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
	double CANTTC;
	int Volume_Total;
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
	 * [tMap_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_2", false);
		start_Hash.put("tMap_2", System.currentTimeMillis());
		
	
	currentComponent="tMap_2";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row8");
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
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_2__Struct  {
	int qte_vendu;
	double Pertes;
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
	row8.id_produit = current_tSortRow_1_SortIn.id_produit;
	row8.loaded = current_tSortRow_1_SortIn.loaded;
	row8.quantity_pierced_chef = current_tSortRow_1_SortIn.quantity_pierced_chef;
	row8.quantity_declass_chef = current_tSortRow_1_SortIn.quantity_declass_chef;
	row8.quantity_not_sale_chef = current_tSortRow_1_SortIn.quantity_not_sale_chef;
	row8.quantity_claim_chef = current_tSortRow_1_SortIn.quantity_claim_chef;
	row8.quantity_missing_chef = current_tSortRow_1_SortIn.quantity_missing_chef;
	row8.dt = current_tSortRow_1_SortIn.dt;
	row8.price = current_tSortRow_1_SortIn.price;
	row8.prix = current_tSortRow_1_SortIn.prix;
	row8.label = current_tSortRow_1_SortIn.label;
	row8.catalog_id = current_tSortRow_1_SortIn.catalog_id;
	row8.Prix_Mali_Guinee = current_tSortRow_1_SortIn.Prix_Mali_Guinee;
	row8.Prix__Gambie = current_tSortRow_1_SortIn.Prix__Gambie;
	row8.nompilier = current_tSortRow_1_SortIn.nompilier;
	row8.sku_commcare = current_tSortRow_1_SortIn.sku_commcare;
	row8.volume_unitaire = current_tSortRow_1_SortIn.volume_unitaire;
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
						
							,"row8"
						
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
								
                        		    		    row4HashKey.secteur = row8.label ;
                        		    		

								
		                        	row4HashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_row4.lookup( row4HashKey );

	  							

	  							

 								
								  
								  if(!tHash_Lookup_row4.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_2 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row4 != null && tHash_Lookup_row4.getCount(row4HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row4' and it contains more one result from keys :  row4.secteur = '" + row4HashKey.secteur + "'");
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
        
Var__tMap_2__Struct Var = Var__tMap_2;
Var.qte_vendu = (row8.loaded 
 - row8.quantity_pierced_chef
 - row8.quantity_declass_chef 
 - row8.quantity_missing_chef 
 - row8.quantity_not_sale_chef 
 - row8.quantity_claim_chef ) ;
Var.Pertes = ( 
    (row4.region_commercial.equals("BAMAKO (MALI)") || row4.region_commercial.equals("CONAKRY"))?

    row8.quantity_declass_chef * Integer.valueOf(row8.Prix_Mali_Guinee)
 
   : (
   		 row4.region_commercial.equals("BANJUL")?
  		      row8.quantity_declass_chef * row8.Prix__Gambie
  		 
  	: (
         TalendDate.compareDate(row8.dt, TalendDate.parseDate("yyyy-MM-dd", "2021-12-31")) <= 0 ?
               row8.quantity_declass_chef  * Integer.valueOf(row8.price)  
        
     : (
          TalendDate.compareDate(row8.dt, TalendDate.parseDate("yyyy-MM-dd", "2022-01-01")) >= 0 
           && TalendDate.compareDate(row8.dt, TalendDate.parseDate("yyyy-MM-dd", "2023-07-31")) <= 0 
           && row8.sku_commcare.contains("S02") 
           && row8.catalog_id == 1 ?
               row8.quantity_declass_chef  * Integer.valueOf(row8.price)
                   
      : (
        
           TalendDate.compareDate(row8.dt, TalendDate.parseDate("yyyy-MM-dd", "2024-03-04")) < 0 
            && row8.sku_commcare.equals("VS0500") 
            && row8.catalog_id == 1 ?
               row8.quantity_declass_chef  * Integer.valueOf(row8.price) 
                          
      : (
           TalendDate.compareDate(row8.dt, TalendDate.parseDate("yyyy-MM-dd", "2024-05-13")) < 0 
            && (row8.sku_commcare.equals("P20") || row8.sku_commcare.equals("VP5000")) 
            && row8.catalog_id == 1 ?
               row8.quantity_declass_chef * Integer.valueOf(row8.price)
                                   
       : row8.quantity_declass_chef  * Integer.valueOf(row8.prix)
                 
        )
      )
    ) 
  ) 
 ) 
) ;// ###############################
        // ###############################
        // # Output tables

out2 = null;

if(!rejectedInnerJoin_tMap_2 ) {

// # Output table : 'out2'
out2_tmp.id_secteur = row4.id_secteur ;
out2_tmp.id_produit = row8.id_produit ;
out2_tmp.nompilier = row8.nompilier ;
out2_tmp.qte_vendu = Var.qte_vendu ;
out2_tmp.Pertes = Var.Pertes ;
out2_tmp.dt = row8.dt ;
out2_tmp.region_commercial = row4.region_commercial ;
out2_tmp.catalog_id = row8.catalog_id ;
out2_tmp.Prix_Mali_Guinee = row8.Prix_Mali_Guinee ;
out2_tmp.Prix__Gambie = row8.Prix__Gambie ;
out2_tmp.price = row8.price ;
out2_tmp.prix = row8.prix ;
out2_tmp.sku_commcare = row8.sku_commcare ;
out2_tmp.volume_unitaire = row8.volume_unitaire ;
out2_tmp.zone_supervision = row4.zone_supervision ;
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
	 * [tMap_3 main ] start
	 */

	

	
	
	currentComponent="tMap_3";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"out2"
						
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
								
                        		    		    row5HashKey.date = out2.dt  == null ? null : new java.util.Date(out2.dt .getTime());
                        		    		

								
		                        	row5HashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_row5.lookup( row5HashKey );

	  							

	  							

 								
								  
								  if(!tHash_Lookup_row5.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_3 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row5 != null && tHash_Lookup_row5.getCount(row5HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row5' and it contains more one result from keys :  row5.date = '" + row5HashKey.date + "'");
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
        
Var__tMap_3__Struct Var = Var__tMap_3;
Var.CANTTC = ( 
    (out2.region_commercial.equals("BAMAKO (MALI)") || out2.region_commercial.equals("CONAKRY"))?

    out2.qte_vendu * Integer.valueOf(out2.Prix_Mali_Guinee)
 
   : (
   		 out2.region_commercial.equals("BANJUL")?
  	out2.qte_vendu * out2.Prix__Gambie
  		 
  	: (
         TalendDate.compareDate(out2.dt, TalendDate.parseDate("yyyy-MM-dd", "2021-12-31")) <= 0 ?
               out2.qte_vendu * Integer.valueOf(out2.price)  
        
     : (
          TalendDate.compareDate(out2.dt, TalendDate.parseDate("yyyy-MM-dd", "2022-01-01")) >= 0 
           && TalendDate.compareDate(out2.dt, TalendDate.parseDate("yyyy-MM-dd", "2023-07-31")) <= 0 
           && out2.sku_commcare.contains("S02") 
           && out2.catalog_id == 1 ?
               out2.qte_vendu * Integer.valueOf(out2.price)
                   
      : (
        
           TalendDate.compareDate(out2.dt, TalendDate.parseDate("yyyy-MM-dd", "2024-03-04")) < 0 
            && out2.sku_commcare.equals("VS0500") 
            && out2.catalog_id == 1 ?
               out2.qte_vendu * Integer.valueOf(out1.price) 
                          
      : (
           TalendDate.compareDate(out2.dt, TalendDate.parseDate("yyyy-MM-dd", "2024-05-13")) < 0 
            && (out2.sku_commcare.equals("P20") || out2.sku_commcare.equals("VP5000")) 
            && out2.catalog_id == 1 ?
               out2.qte_vendu * Integer.valueOf(out2.price)
                                   
       : out2.qte_vendu * Integer.valueOf(out2.prix)
                 
        )
      )
    ) 
  ) 
 ) 
) ;
Var.Volume_Total = out2.qte_vendu * out2.volume_unitaire ;// ###############################
        // ###############################
        // # Output tables

out3 = null;

if(!rejectedInnerJoin_tMap_3 ) {

// # Output table : 'out3'
out3_tmp.id_secteur = out2.id_secteur ;
out3_tmp.id_produit = out2.id_produit ;
out3_tmp.id_temps = row5.id_temps ;
out3_tmp.qte_vendu = out2.qte_vendu ;
out3_tmp.Pertes = (Math.floor(out2.Pertes * 100) / 100) ;
out3_tmp.CANTTC = (Math.floor(Var.CANTTC * 100) / 100) ;
out3_tmp.Volume_Total = Var.Volume_Total ;
out3_tmp.nompilier = out2.nompilier ;
out3_tmp.dt = out2.dt ;
out3_tmp.zone_supervision = out2.zone_supervision ;
out3_tmp.sku_commcare = out2.sku_commcare ;
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
	 * [tMap_4 main ] start
	 */

	

	
	
	currentComponent="tMap_4";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"out3"
						
						);
					}
					

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_4 = false;
		

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_4 = false;
		  boolean mainRowRejected_tMap_4 = false;
            				    								  
		// ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_4__Struct Var = Var__tMap_4;
Var.CAHT = (out3.nompilier.equals("LF") ? out3.CANTTC : (out3.CANTTC / 1.18)) ;// ###############################
        // ###############################
        // # Output tables

out4 = null;


// # Output table : 'out4'
out4_tmp.id_secteur = out3.id_secteur ;
out4_tmp.id_produit = out3.id_produit ;
out4_tmp.id_temps = out3.id_temps ;
out4_tmp.qte_vendu = out3.qte_vendu ;
out4_tmp.Pertes = out3.Pertes;
out4_tmp.CANTTC = out3.CANTTC ;
out4_tmp.CAHT = (Math.floor(Var.CAHT * 100) / 100) ;
out4_tmp.Volume_Total = out3.Volume_Total ;
out4 = out4_tmp;
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
// Start of branch "out4"
if(out4 != null) { 



	
	/**
	 * [tMap_5 main ] start
	 */

	

	
	
	currentComponent="tMap_5";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"out4"
						
						);
					}
					

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_5 = false;
		

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_5 = false;
		  boolean mainRowRejected_tMap_5 = false;
            				    								  
		

				///////////////////////////////////////////////
				// Starting Lookup Table "row7" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLooprow7 = false;
       		  	    	
       		  	    	
 							row7Struct row7ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_5) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_5 = false;
								
                        		    		    row7HashKey.id_secteur = out4.id_secteur ;
                        		    		
                        		    		    row7HashKey.id_produit = out4.id_produit ;
                        		    		
                        		    		    row7HashKey.id_temps = out4.id_temps ;
                        		    		

								
		                        	row7HashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_row7.lookup( row7HashKey );

	  							

	  							

 								
								  
								  if(!tHash_Lookup_row7.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_5 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row7 != null && tHash_Lookup_row7.getCount(row7HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row7' and it contains more one result from keys :  row7.id_secteur = '" + row7HashKey.id_secteur + "', row7.id_produit = '" + row7HashKey.id_produit + "', row7.id_temps = '" + row7HashKey.id_temps + "'");
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
        
Var__tMap_5__Struct Var = Var__tMap_5;// ###############################
        // ###############################
        // # Output tables

out6 = null;
out5 = null;

if(!rejectedInnerJoin_tMap_5 ) {

// # Output table : 'out6'
out6_tmp.id_faitcdq = row7.id_faitcdq ;
out6_tmp.id_secteur = out4.id_secteur ;
out6_tmp.id_produit = out4.id_produit ;
out6_tmp.id_temps = out4.id_temps ;
out6_tmp.qte_vendu = out4.qte_vendu ;
out6_tmp.Pertes = out4.Pertes ;
out6_tmp.CANTTC = out4.CANTTC ;
out6_tmp.CAHT = out4.CAHT ;
out6_tmp.Volume_Total = out4.Volume_Total ;
out6 = out6_tmp;
} // closing inner join bracket (1)
// ###### START REJECTS ##### 

// # Output reject table : 'out5'
// # Filter conditions 
if( rejectedInnerJoin_tMap_5 ) {
out5_tmp.id_secteur = out4.id_secteur ;
out5_tmp.id_produit = out4.id_produit ;
out5_tmp.id_temps = out4.id_temps ;
out5_tmp.cattc = out4.CANTTC ;
out5_tmp.caht = out4.CAHT ;
out5_tmp.pertes = out4.Pertes ;
out5_tmp.quantite = out4.qte_vendu ;
out5_tmp.volume_total = out4.Volume_Total ;
out5 = out5_tmp;
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
// Start of branch "out5"
if(out5 != null) { 



	
	/**
	 * [tMap_6 main ] start
	 */

	

	
	
	currentComponent="tMap_6";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"out5"
						
						);
					}
					

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_6 = false;
		

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_6 = false;
		  boolean mainRowRejected_tMap_6 = false;
            				    								  
		

				///////////////////////////////////////////////
				// Starting Lookup Table "row9" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLooprow9 = false;
       		  	    	
       		  	    	
 							row9Struct row9ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_6) { // G_TM_M_020

								

								
	  					
	  							
			  					
			  					
	  					
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
        
Var__tMap_6__Struct Var = Var__tMap_6;
Var.idFaitCDQ = Numeric.sequence("s1",row9.id_faitcdq + 1,1) ;// ###############################
        // ###############################
        // # Output tables

Insert_New_Data = null;


// # Output table : 'Insert_New_Data'
Insert_New_Data_tmp.id_faitcdq = Var.idFaitCDQ ;
Insert_New_Data_tmp.id_secteur = out5.id_secteur ;
Insert_New_Data_tmp.id_produit = out5.id_produit ;
Insert_New_Data_tmp.id_temps = out5.id_temps ;
Insert_New_Data_tmp.cattc = out5.cattc ;
Insert_New_Data_tmp.caht = out5.caht ;
Insert_New_Data_tmp.pertes = out5.pertes ;
Insert_New_Data_tmp.quantite = out5.quantite ;
Insert_New_Data_tmp.volume_total = out5.volume_total ;
Insert_New_Data = Insert_New_Data_tmp;
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
// Start of branch "Insert_New_Data"
if(Insert_New_Data != null) { 



	
	/**
	 * [tDBOutput_1 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"Insert_New_Data"
						
						);
					}
					



        whetherReject_tDBOutput_1 = false;
                    pstmt_tDBOutput_1.setInt(1, Insert_New_Data.id_faitcdq);

                    if(Insert_New_Data.id_secteur == null) {
pstmt_tDBOutput_1.setNull(2, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_1.setLong(2, Insert_New_Data.id_secteur);
}

                    if(Insert_New_Data.id_produit == null) {
pstmt_tDBOutput_1.setNull(3, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_1.setLong(3, Insert_New_Data.id_produit);
}

                    if(Insert_New_Data.id_temps == null) {
pstmt_tDBOutput_1.setNull(4, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_1.setInt(4, Insert_New_Data.id_temps);
}

                    if(Insert_New_Data.cattc == null) {
pstmt_tDBOutput_1.setNull(5, java.sql.Types.DOUBLE);
} else {pstmt_tDBOutput_1.setDouble(5, Insert_New_Data.cattc);
}

                    if(Insert_New_Data.caht == null) {
pstmt_tDBOutput_1.setNull(6, java.sql.Types.DOUBLE);
} else {pstmt_tDBOutput_1.setDouble(6, Insert_New_Data.caht);
}

                    if(Insert_New_Data.pertes == null) {
pstmt_tDBOutput_1.setNull(7, java.sql.Types.DOUBLE);
} else {pstmt_tDBOutput_1.setDouble(7, Insert_New_Data.pertes);
}

                    if(Insert_New_Data.quantite == null) {
pstmt_tDBOutput_1.setNull(8, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_1.setInt(8, Insert_New_Data.quantite);
}

                    if(Insert_New_Data.volume_total == null) {
pstmt_tDBOutput_1.setNull(9, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_1.setInt(9, Insert_New_Data.volume_total);
}

			
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

} // End of branch "Insert_New_Data"



	
		} // close loop of lookup 'row9' // G_TM_M_043
	
	
	/**
	 * [tMap_6 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_6";

	

 



/**
 * [tMap_6 process_data_end ] stop
 */

} // End of branch "out5"




// Start of branch "out6"
if(out6 != null) { 



	
	/**
	 * [tMap_7 main ] start
	 */

	

	
	
	currentComponent="tMap_7";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"out6"
						
						);
					}
					

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_7 = false;
		

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_7 = false;
		  boolean mainRowRejected_tMap_7 = false;
            				    								  
		

				///////////////////////////////////////////////
				// Starting Lookup Table "row10" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLooprow10 = false;
       		  	    	
       		  	    	
 							row10Struct row10ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_7) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_7 = false;
								
                        		    		    row10HashKey.id_secteur = out6.id_secteur ;
                        		    		
                        		    		    row10HashKey.id_produit = out6.id_produit ;
                        		    		
                        		    		    row10HashKey.id_temps = out6.id_temps ;
                        		    		
                        		    		    row10HashKey.cattc = out6.CANTTC ;
                        		    		
                        		    		    row10HashKey.caht = out6.CAHT ;
                        		    		
                        		    		    row10HashKey.pertes = out6.Pertes ;
                        		    		
                        		    		    row10HashKey.quantite = out6.qte_vendu ;
                        		    		
                        		    		    row10HashKey.volume_total = out6.Volume_Total ;
                        		    		

								
		                        	row10HashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_row10.lookup( row10HashKey );

	  							

	  							

 								
								  
								  if(!tHash_Lookup_row10.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_7 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row10 != null && tHash_Lookup_row10.getCount(row10HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row10' and it contains more one result from keys :  row10.id_secteur = '" + row10HashKey.id_secteur + "', row10.id_produit = '" + row10HashKey.id_produit + "', row10.id_temps = '" + row10HashKey.id_temps + "', row10.cattc = '" + row10HashKey.cattc + "', row10.caht = '" + row10HashKey.caht + "', row10.pertes = '" + row10HashKey.pertes + "', row10.quantite = '" + row10HashKey.quantite + "', row10.volume_total = '" + row10HashKey.volume_total + "'");
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
        
Var__tMap_7__Struct Var = Var__tMap_7;// ###############################
        // ###############################
        // # Output tables

Update_Data = null;

if(!rejectedInnerJoin_tMap_7 ) {
} // closing inner join bracket (1)
// ###### START REJECTS ##### 

// # Output reject table : 'Update_Data'
// # Filter conditions 
if( rejectedInnerJoin_tMap_7 ) {
Update_Data_tmp.id_faitcdq = out6.id_faitcdq ;
Update_Data_tmp.id_secteur = out6.id_secteur ;
Update_Data_tmp.id_produit = out6.id_produit ;
Update_Data_tmp.id_temps = out6.id_temps ;
Update_Data_tmp.cattc = out6.CANTTC ;
Update_Data_tmp.caht = out6.CAHT ;
Update_Data_tmp.pertes = out6.Pertes ;
Update_Data_tmp.quantite = out6.qte_vendu ;
Update_Data_tmp.volume_total = out6.Volume_Total ;
Update_Data = Update_Data_tmp;
} // closing filter/reject
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
// Start of branch "Update_Data"
if(Update_Data != null) { 



	
	/**
	 * [tDBOutput_2 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_2";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"Update_Data"
						
						);
					}
					



        whetherReject_tDBOutput_2 = false;
                    if(Update_Data.id_secteur == null) {
pstmt_tDBOutput_2.setNull(1, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_2.setLong(1, Update_Data.id_secteur);
}

                    if(Update_Data.id_produit == null) {
pstmt_tDBOutput_2.setNull(2, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_2.setLong(2, Update_Data.id_produit);
}

                    if(Update_Data.id_temps == null) {
pstmt_tDBOutput_2.setNull(3, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_2.setInt(3, Update_Data.id_temps);
}

                    if(Update_Data.cattc == null) {
pstmt_tDBOutput_2.setNull(4, java.sql.Types.DOUBLE);
} else {pstmt_tDBOutput_2.setDouble(4, Update_Data.cattc);
}

                    if(Update_Data.caht == null) {
pstmt_tDBOutput_2.setNull(5, java.sql.Types.DOUBLE);
} else {pstmt_tDBOutput_2.setDouble(5, Update_Data.caht);
}

                    if(Update_Data.pertes == null) {
pstmt_tDBOutput_2.setNull(6, java.sql.Types.DOUBLE);
} else {pstmt_tDBOutput_2.setDouble(6, Update_Data.pertes);
}

                    if(Update_Data.quantite == null) {
pstmt_tDBOutput_2.setNull(7, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_2.setInt(7, Update_Data.quantite);
}

                    if(Update_Data.volume_total == null) {
pstmt_tDBOutput_2.setNull(8, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_2.setInt(8, Update_Data.volume_total);
}

                    pstmt_tDBOutput_2.setInt(9 + count_tDBOutput_2, Update_Data.id_faitcdq);


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

} // End of branch "Update_Data"




	
	/**
	 * [tMap_7 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_7";

	

 



/**
 * [tMap_7 process_data_end ] stop
 */

} // End of branch "out6"




	
	/**
	 * [tMap_5 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_5";

	

 



/**
 * [tMap_5 process_data_end ] stop
 */

} // End of branch "out4"




	
	/**
	 * [tMap_4 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_4";

	

 



/**
 * [tMap_4 process_data_end ] stop
 */

} // End of branch "out3"




	
	/**
	 * [tMap_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_3";

	

 



/**
 * [tMap_3 process_data_end ] stop
 */

} // End of branch "out2"




	
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
					if(tHash_Lookup_row4 != null) {
						tHash_Lookup_row4.endGet();
					}
					globalMap.remove( "tHash_Lookup_row4" );

					
					
				
// ###############################      





				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row8");
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
					if(tHash_Lookup_row5 != null) {
						tHash_Lookup_row5.endGet();
					}
					globalMap.remove( "tHash_Lookup_row5" );

					
					
				
// ###############################      





				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"out2");
			  	}
			  	
 

ok_Hash.put("tMap_3", true);
end_Hash.put("tMap_3", System.currentTimeMillis());




/**
 * [tMap_3 end ] stop
 */

	
	/**
	 * [tMap_4 end ] start
	 */

	

	
	
	currentComponent="tMap_4";

	


// ###############################
// # Lookup hashes releasing
// ###############################      





				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"out3");
			  	}
			  	
 

ok_Hash.put("tMap_4", true);
end_Hash.put("tMap_4", System.currentTimeMillis());




/**
 * [tMap_4 end ] stop
 */

	
	/**
	 * [tMap_5 end ] start
	 */

	

	
	
	currentComponent="tMap_5";

	


// ###############################
// # Lookup hashes releasing
					if(tHash_Lookup_row7 != null) {
						tHash_Lookup_row7.endGet();
					}
					globalMap.remove( "tHash_Lookup_row7" );

					
					
				
// ###############################      





				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"out4");
			  	}
			  	
 

ok_Hash.put("tMap_5", true);
end_Hash.put("tMap_5", System.currentTimeMillis());




/**
 * [tMap_5 end ] stop
 */

	
	/**
	 * [tMap_6 end ] start
	 */

	

	
	
	currentComponent="tMap_6";

	


// ###############################
// # Lookup hashes releasing
					if(tHash_Lookup_row9 != null) {
						tHash_Lookup_row9.endGet();
					}
					globalMap.remove( "tHash_Lookup_row9" );

					
					
				
// ###############################      





				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"out5");
			  	}
			  	
 

ok_Hash.put("tMap_6", true);
end_Hash.put("tMap_6", System.currentTimeMillis());




/**
 * [tMap_6 end ] stop
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
			  		runStat.updateStat(resourceMap,iterateId,2,0,"Insert_New_Data");
			  	}
			  	
 

ok_Hash.put("tDBOutput_1", true);
end_Hash.put("tDBOutput_1", System.currentTimeMillis());




/**
 * [tDBOutput_1 end ] stop
 */







	
	/**
	 * [tMap_7 end ] start
	 */

	

	
	
	currentComponent="tMap_7";

	


// ###############################
// # Lookup hashes releasing
					if(tHash_Lookup_row10 != null) {
						tHash_Lookup_row10.endGet();
					}
					globalMap.remove( "tHash_Lookup_row10" );

					
					
				
// ###############################      





				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"out6");
			  	}
			  	
 

ok_Hash.put("tMap_7", true);
end_Hash.put("tMap_7", System.currentTimeMillis());




/**
 * [tMap_7 end ] stop
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
			  		runStat.updateStat(resourceMap,iterateId,2,0,"Update_Data");
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
				
					     			//free memory for "tMap_7"
					     			globalMap.remove("tHash_Lookup_row10"); 
				     			
					     			//free memory for "tMap_6"
					     			globalMap.remove("tHash_Lookup_row9"); 
				     			
					     			//free memory for "tMap_5"
					     			globalMap.remove("tHash_Lookup_row7"); 
				     			
					     			//free memory for "tMap_3"
					     			globalMap.remove("tHash_Lookup_row5"); 
				     			
					     			//free memory for "tMap_2"
					     			globalMap.remove("tHash_Lookup_row4"); 
				     			
							//free memory for "tSortRow_1_SortIn"
							globalMap.remove("tSortRow_1");
						
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
	 * [tMap_3 finally ] start
	 */

	

	
	
	currentComponent="tMap_3";

	

 



/**
 * [tMap_3 finally ] stop
 */

	
	/**
	 * [tMap_4 finally ] start
	 */

	

	
	
	currentComponent="tMap_4";

	

 



/**
 * [tMap_4 finally ] stop
 */

	
	/**
	 * [tMap_5 finally ] start
	 */

	

	
	
	currentComponent="tMap_5";

	

 



/**
 * [tMap_5 finally ] stop
 */

	
	/**
	 * [tMap_6 finally ] start
	 */

	

	
	
	currentComponent="tMap_6";

	

 



/**
 * [tMap_6 finally ] stop
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
	 * [tMap_7 finally ] start
	 */

	

	
	
	currentComponent="tMap_7";

	

 



/**
 * [tMap_7 finally ] stop
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
	


public static class row3Struct implements routines.system.IPersistableComparableLookupRow<row3Struct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[0];
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
			if(length > commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART, 0, length, utf8Charset);
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
			if(length > commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART) {

        	try {

        		int length = 0;
		
					this.produits = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART) {

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
			   		// linked node: tMap_1 - inputs:(row1,row3,row2) outputs:(out1)
			   
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
				
				 
	final String decryptedPassword_tDBInput_2 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:OXzdNrflypaG41r7MQI/UgLchvW0sgtwVCKKiV8nr2CS1Ft+XhI=");
				
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
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[0];
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
	
						result = prime * result + ((this.secteur == null) ? 0 : this.secteur.hashCode());
					
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
		
						if (this.secteur == null) {
							if (other.secteur != null)
								return false;
						
						} else if (!this.secteur.equals(other.secteur))
						
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

		other.secteur = this.secteur;
	            	
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
			if(length > commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART, 0, length, utf8Charset);
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
			if(length > commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART) {

        	try {

        		int length = 0;
		
					this.secteur = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART) {

        	try {

        		int length = 0;
		
					this.secteur = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.secteur,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.secteur,dos);
					
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
					
						this.region_commercial = readString(dis,ois);
					
						this.zone_supervision = readString(dis,ois);
					
						this.hub = readString(dis,ois);
					
						this.pays = readString(dis,ois);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
			            this.id_secteur = objectIn.readLong();
					
						this.region_commercial = readString(dis,objectIn);
					
						this.zone_supervision = readString(dis,objectIn);
					
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

		
		            	dos.writeLong(this.id_secteur);
					
						writeString(this.region_commercial, dos, oos);
					
						writeString(this.zone_supervision, dos, oos);
					
						writeString(this.hub, dos, oos);
					
						writeString(this.pays, dos, oos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
					objectOut.writeLong(this.id_secteur);
					
						writeString(this.region_commercial, dos, objectOut);
					
						writeString(this.zone_supervision, dos, objectOut);
					
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
		
						returnValue = checkNullsAndCompare(this.secteur, other.secteur);
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
			   		// source node:tDBInput_4 - inputs:(after_tDBInput_1) outputs:(row4,row4) | target node:tAdvancedHash_row4 - inputs:(row4) outputs:()
			   		// linked node: tMap_2 - inputs:(row8,row4) outputs:(out2)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row4 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row4Struct> tHash_Lookup_row4 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row4Struct>getLookup(matchingModeEnum_row4);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row4", tHash_Lookup_row4);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row4 begin ] stop
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
				
				 
	final String decryptedPassword_tDBInput_4 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:vHmlw6IvSjlAcnGoyQKk8XkQC+QIVDjJiGqBWI1IBr7RmjlRy8I=");
				
				String dbPwd_tDBInput_4 = decryptedPassword_tDBInput_4;
				
				String url_tDBInput_4 = "jdbc:postgresql://" + "163.172.166.119" + ":" + "5432" + "/" + "leuk_analytics";
				
				conn_tDBInput_4 = java.sql.DriverManager.getConnection(url_tDBInput_4,dbUser_tDBInput_4,dbPwd_tDBInput_4);
		        
				conn_tDBInput_4.setAutoCommit(false);
			
		    
			java.sql.Statement stmt_tDBInput_4 = conn_tDBInput_4.createStatement();

		    String dbquery_tDBInput_4 = "SELECT \n  \"public\".\"Dim_Geographie\".\"id_secteur\", \n  \"public\".\"Dim_Geographie\".\"region_commercial\", \n  \"pu"
+"blic\".\"Dim_Geographie\".\"zone_supervision\", \n  \"public\".\"Dim_Geographie\".\"secteur\", \n  \"public\".\"Dim_Geogra"
+"phie\".\"hub\", \n  \"public\".\"Dim_Geographie\".\"pays\"\nFROM \"public\".\"Dim_Geographie\"";
		    

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
								row4.id_secteur = 0;
							} else {
		                          
            row4.id_secteur = rs_tDBInput_4.getLong(1);
            if(rs_tDBInput_4.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_4 < 2) {
								row4.region_commercial = null;
							} else {
	                         		
        	row4.region_commercial = routines.system.JDBCUtil.getString(rs_tDBInput_4, 2, false);
		                    }
							if(colQtyInRs_tDBInput_4 < 3) {
								row4.zone_supervision = null;
							} else {
	                         		
        	row4.zone_supervision = routines.system.JDBCUtil.getString(rs_tDBInput_4, 3, false);
		                    }
							if(colQtyInRs_tDBInput_4 < 4) {
								row4.secteur = null;
							} else {
	                         		
        	row4.secteur = routines.system.JDBCUtil.getString(rs_tDBInput_4, 4, false);
		                    }
							if(colQtyInRs_tDBInput_4 < 5) {
								row4.hub = null;
							} else {
	                         		
        	row4.hub = routines.system.JDBCUtil.getString(rs_tDBInput_4, 5, false);
		                    }
							if(colQtyInRs_tDBInput_4 < 6) {
								row4.pays = null;
							} else {
	                         		
        	row4.pays = routines.system.JDBCUtil.getString(rs_tDBInput_4, 6, false);
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
	 * [tDBInput_4 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_4";

	

 



/**
 * [tDBInput_4 finally ] stop
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
		

		globalMap.put("tDBInput_4_SUBPROCESS_STATE", 1);
	}
	


public static class row5Struct implements routines.system.IPersistableComparableLookupRow<row5Struct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[0];
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
		final row5Struct other = (row5Struct) obj;
		
						if (this.date == null) {
							if (other.date != null)
								return false;
						
						} else if (!this.date.equals(other.date))
						
							return false;
					

		return true;
    }

	public void copyDataTo(row5Struct other) {

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

	public void copyKeysDataTo(row5Struct other) {

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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART) {

        	try {

        		int length = 0;
		
					this.date = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART) {

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
    public int compareTo(row5Struct other) {

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
			   		// source node:tDBInput_3 - inputs:(after_tDBInput_1) outputs:(row5,row5) | target node:tAdvancedHash_row5 - inputs:(row5) outputs:()
			   		// linked node: tMap_3 - inputs:(out2,row5) outputs:(out3)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row5 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row5Struct> tHash_Lookup_row5 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row5Struct>getLookup(matchingModeEnum_row5);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row5", tHash_Lookup_row5);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row5 begin ] stop
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
				
				 
	final String decryptedPassword_tDBInput_3 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:dZUVITtkC9YCDR4uktaHRMOrKq1KF1cPSFRALQlos+fd6ypApgQ=");
				
				String dbPwd_tDBInput_3 = decryptedPassword_tDBInput_3;
				
				String url_tDBInput_3 = "jdbc:postgresql://" + "163.172.166.119" + ":" + "5432" + "/" + "leuk_analytics";
				
				conn_tDBInput_3 = java.sql.DriverManager.getConnection(url_tDBInput_3,dbUser_tDBInput_3,dbPwd_tDBInput_3);
		        
				conn_tDBInput_3.setAutoCommit(false);
			
		    
			java.sql.Statement stmt_tDBInput_3 = conn_tDBInput_3.createStatement();

		    String dbquery_tDBInput_3 = "SELECT \n  \"public\".\"Dim_Temps\".\"id_temps\", \n  \"public\".\"Dim_Temps\".\"date\", \n  \"public\".\"Dim_Temps\".\"an"
+"nee\", \n  \"public\".\"Dim_Temps\".\"numero_mois\", \n  \"public\".\"Dim_Temps\".\"mois\", \n  \"public\".\"Dim_Temps\".\""
+"annee_mois\", \n  \"public\".\"Dim_Temps\".\"numero_jours_semaine\", \n  \"public\".\"Dim_Temps\".\"jour_semaine\", \n  \"p"
+"ublic\".\"Dim_Temps\".\"semaine\", \n  \"public\".\"Dim_Temps\".\"trimestre\", \n  \"public\".\"Dim_Temps\".\"semestre\"\nF"
+"ROM \"public\".\"Dim_Temps\"\nWHERE  \"public\".\"Dim_Temps\".\"date\" Between CURRENT_DATE - INTERVAL '2 DAY' and CURRE"
+"NT_DATE - INTERVAL '1 DAY'\nORDER BY    \"public\".\"Dim_Temps\".\"id_temps\" ASC";
		    

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
								row5.id_temps = 0;
							} else {
		                          
            row5.id_temps = rs_tDBInput_3.getInt(1);
            if(rs_tDBInput_3.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_3 < 2) {
								row5.date = null;
							} else {
										
			row5.date = routines.system.JDBCUtil.getDate(rs_tDBInput_3, 2);
		                    }
							if(colQtyInRs_tDBInput_3 < 3) {
								row5.annee = null;
							} else {
		                          
            row5.annee = rs_tDBInput_3.getInt(3);
            if(rs_tDBInput_3.wasNull()){
                    row5.annee = null;
            }
		                    }
							if(colQtyInRs_tDBInput_3 < 4) {
								row5.numero_mois = null;
							} else {
		                          
            row5.numero_mois = rs_tDBInput_3.getInt(4);
            if(rs_tDBInput_3.wasNull()){
                    row5.numero_mois = null;
            }
		                    }
							if(colQtyInRs_tDBInput_3 < 5) {
								row5.mois = null;
							} else {
	                         		
        	row5.mois = routines.system.JDBCUtil.getString(rs_tDBInput_3, 5, false);
		                    }
							if(colQtyInRs_tDBInput_3 < 6) {
								row5.annee_mois = null;
							} else {
	                         		
        	row5.annee_mois = routines.system.JDBCUtil.getString(rs_tDBInput_3, 6, false);
		                    }
							if(colQtyInRs_tDBInput_3 < 7) {
								row5.numero_jours_semaine = null;
							} else {
		                          
            row5.numero_jours_semaine = rs_tDBInput_3.getInt(7);
            if(rs_tDBInput_3.wasNull()){
                    row5.numero_jours_semaine = null;
            }
		                    }
							if(colQtyInRs_tDBInput_3 < 8) {
								row5.jour_semaine = null;
							} else {
	                         		
        	row5.jour_semaine = routines.system.JDBCUtil.getString(rs_tDBInput_3, 8, false);
		                    }
							if(colQtyInRs_tDBInput_3 < 9) {
								row5.semaine = null;
							} else {
	                         		
        	row5.semaine = routines.system.JDBCUtil.getString(rs_tDBInput_3, 9, false);
		                    }
							if(colQtyInRs_tDBInput_3 < 10) {
								row5.trimestre = null;
							} else {
	                         		
        	row5.trimestre = routines.system.JDBCUtil.getString(rs_tDBInput_3, 10, false);
		                    }
							if(colQtyInRs_tDBInput_3 < 11) {
								row5.semestre = null;
							} else {
	                         		
        	row5.semestre = routines.system.JDBCUtil.getString(rs_tDBInput_3, 11, false);
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
	 * [tAdvancedHash_row5 main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row5";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row5"
						
						);
					}
					


			   
			   

					row5Struct row5_HashRow = new row5Struct();
		   	   	   
				
				row5_HashRow.id_temps = row5.id_temps;
				
				row5_HashRow.date = row5.date;
				
				row5_HashRow.annee = row5.annee;
				
				row5_HashRow.numero_mois = row5.numero_mois;
				
				row5_HashRow.mois = row5.mois;
				
				row5_HashRow.annee_mois = row5.annee_mois;
				
				row5_HashRow.numero_jours_semaine = row5.numero_jours_semaine;
				
				row5_HashRow.jour_semaine = row5.jour_semaine;
				
				row5_HashRow.semaine = row5.semaine;
				
				row5_HashRow.trimestre = row5.trimestre;
				
				row5_HashRow.semestre = row5.semestre;
				
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
	 * [tDBInput_3 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_3";

	

 



/**
 * [tDBInput_3 finally ] stop
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
		

		globalMap.put("tDBInput_3_SUBPROCESS_STATE", 1);
	}
	


public static class row7Struct implements routines.system.IPersistableComparableLookupRow<row7Struct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public int id_faitcdq;

				public int getId_faitcdq () {
					return this.id_faitcdq;
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
				
			    public Integer quantite;

				public Integer getQuantite () {
					return this.quantite;
				}
				
			    public Integer volume_total;

				public Integer getVolume_total () {
					return this.volume_total;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.id_secteur == null) ? 0 : this.id_secteur.hashCode());
					
						result = prime * result + ((this.id_produit == null) ? 0 : this.id_produit.hashCode());
					
						result = prime * result + ((this.id_temps == null) ? 0 : this.id_temps.hashCode());
					
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
					

		return true;
    }

	public void copyDataTo(row7Struct other) {

		other.id_faitcdq = this.id_faitcdq;
	            other.id_secteur = this.id_secteur;
	            other.id_produit = this.id_produit;
	            other.id_temps = this.id_temps;
	            other.cattc = this.cattc;
	            other.caht = this.caht;
	            other.pertes = this.pertes;
	            other.quantite = this.quantite;
	            other.volume_total = this.volume_total;
	            
	}

	public void copyKeysDataTo(row7Struct other) {

		other.id_secteur = this.id_secteur;
	            	other.id_produit = this.id_produit;
	            	other.id_temps = this.id_temps;
	            	
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART) {

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
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART) {

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
		
			            this.id_faitcdq = dis.readInt();
					
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
					
						this.quantite = readInteger(dis,ois);
					
						this.volume_total = readInteger(dis,ois);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
			            this.id_faitcdq = objectIn.readInt();
					
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
					
						this.quantite = readInteger(dis,objectIn);
					
						this.volume_total = readInteger(dis,objectIn);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
		            	dos.writeInt(this.id_faitcdq);
					
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
					
					writeInteger(this.quantite, dos, oos);
					
					writeInteger(this.volume_total, dos, oos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
					objectOut.writeInt(this.id_faitcdq);
					
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
					
					writeInteger(this.quantite, dos, objectOut);
					
					writeInteger(this.volume_total, dos, objectOut);
					
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
		sb.append("id_faitcdq="+String.valueOf(id_faitcdq));
		sb.append(",id_secteur="+String.valueOf(id_secteur));
		sb.append(",id_produit="+String.valueOf(id_produit));
		sb.append(",id_temps="+String.valueOf(id_temps));
		sb.append(",cattc="+String.valueOf(cattc));
		sb.append(",caht="+String.valueOf(caht));
		sb.append(",pertes="+String.valueOf(pertes));
		sb.append(",quantite="+String.valueOf(quantite));
		sb.append(",volume_total="+String.valueOf(volume_total));
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

					
						returnValue = checkNullsAndCompare(this.id_produit, other.id_produit);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.id_temps, other.id_temps);
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
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public int id_faitcdq;

				public int getId_faitcdq () {
					return this.id_faitcdq;
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
				
			    public Integer quantite;

				public Integer getQuantite () {
					return this.quantite;
				}
				
			    public Integer volume_total;

				public Integer getVolume_total () {
					return this.volume_total;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
							result = prime * result + (int) this.id_faitcdq;
						
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
		
						if (this.id_faitcdq != other.id_faitcdq)
							return false;
					

		return true;
    }

	public void copyDataTo(OnRowsEndStructtSortRow_2 other) {

		other.id_faitcdq = this.id_faitcdq;
	            other.id_secteur = this.id_secteur;
	            other.id_produit = this.id_produit;
	            other.id_temps = this.id_temps;
	            other.cattc = this.cattc;
	            other.caht = this.caht;
	            other.pertes = this.pertes;
	            other.quantite = this.quantite;
	            other.volume_total = this.volume_total;
	            
	}

	public void copyKeysDataTo(OnRowsEndStructtSortRow_2 other) {

		other.id_faitcdq = this.id_faitcdq;
	            	
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART) {

        	try {

        		int length = 0;
		
			        this.id_faitcdq = dis.readInt();
					
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
					
						this.quantite = readInteger(dis);
					
						this.volume_total = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART) {

        	try {

        		int length = 0;
		
			        this.id_faitcdq = dis.readInt();
					
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
					
						this.quantite = readInteger(dis);
					
						this.volume_total = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id_faitcdq);
					
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
				
						writeInteger(this.quantite,dos);
					
					// Integer
				
						writeInteger(this.volume_total,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id_faitcdq);
					
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
				
						writeInteger(this.quantite,dos);
					
					// Integer
				
						writeInteger(this.volume_total,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id_faitcdq="+String.valueOf(id_faitcdq));
		sb.append(",id_secteur="+String.valueOf(id_secteur));
		sb.append(",id_produit="+String.valueOf(id_produit));
		sb.append(",id_temps="+String.valueOf(id_temps));
		sb.append(",cattc="+String.valueOf(cattc));
		sb.append(",caht="+String.valueOf(caht));
		sb.append(",pertes="+String.valueOf(pertes));
		sb.append(",quantite="+String.valueOf(quantite));
		sb.append(",volume_total="+String.valueOf(volume_total));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(OnRowsEndStructtSortRow_2 other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.id_faitcdq, other.id_faitcdq);
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
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public int id_faitcdq;

				public int getId_faitcdq () {
					return this.id_faitcdq;
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
				
			    public Integer quantite;

				public Integer getQuantite () {
					return this.quantite;
				}
				
			    public Integer volume_total;

				public Integer getVolume_total () {
					return this.volume_total;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
							result = prime * result + (int) this.id_faitcdq;
						
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
		
						if (this.id_faitcdq != other.id_faitcdq)
							return false;
					

		return true;
    }

	public void copyDataTo(row6Struct other) {

		other.id_faitcdq = this.id_faitcdq;
	            other.id_secteur = this.id_secteur;
	            other.id_produit = this.id_produit;
	            other.id_temps = this.id_temps;
	            other.cattc = this.cattc;
	            other.caht = this.caht;
	            other.pertes = this.pertes;
	            other.quantite = this.quantite;
	            other.volume_total = this.volume_total;
	            
	}

	public void copyKeysDataTo(row6Struct other) {

		other.id_faitcdq = this.id_faitcdq;
	            	
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART) {

        	try {

        		int length = 0;
		
			        this.id_faitcdq = dis.readInt();
					
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
					
						this.quantite = readInteger(dis);
					
						this.volume_total = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART) {

        	try {

        		int length = 0;
		
			        this.id_faitcdq = dis.readInt();
					
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
					
						this.quantite = readInteger(dis);
					
						this.volume_total = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id_faitcdq);
					
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
				
						writeInteger(this.quantite,dos);
					
					// Integer
				
						writeInteger(this.volume_total,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id_faitcdq);
					
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
				
						writeInteger(this.quantite,dos);
					
					// Integer
				
						writeInteger(this.volume_total,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id_faitcdq="+String.valueOf(id_faitcdq));
		sb.append(",id_secteur="+String.valueOf(id_secteur));
		sb.append(",id_produit="+String.valueOf(id_produit));
		sb.append(",id_temps="+String.valueOf(id_temps));
		sb.append(",cattc="+String.valueOf(cattc));
		sb.append(",caht="+String.valueOf(caht));
		sb.append(",pertes="+String.valueOf(pertes));
		sb.append(",quantite="+String.valueOf(quantite));
		sb.append(",volume_total="+String.valueOf(volume_total));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row6Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.id_faitcdq, other.id_faitcdq);
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



		row6Struct row6 = new row6Struct();
row7Struct row7 = new row7Struct();




	
	/**
	 * [tSortRow_2_SortOut begin ] start
	 */

	

	
		
		ok_Hash.put("tSortRow_2_SortOut", false);
		start_Hash.put("tSortRow_2_SortOut", System.currentTimeMillis());
		
	
		currentVirtualComponent = "tSortRow_2";
	
	currentComponent="tSortRow_2_SortOut";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row6");
					}
				
		int tos_count_tSortRow_2_SortOut = 0;
		


class Comparablerow6Struct extends row6Struct implements Comparable<Comparablerow6Struct> {
	
	public int compareTo(Comparablerow6Struct other) {

		return 0;
	}
}

java.util.List<Comparablerow6Struct> list_tSortRow_2_SortOut = new java.util.ArrayList<Comparablerow6Struct>();


 



/**
 * [tSortRow_2_SortOut begin ] stop
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
				
				 
	final String decryptedPassword_tDBInput_5 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:LjwGgyiw+/QgCsO1iaDzMy2PFHOL9lawocSRfpsSLpL7knPwIVM=");
				
				String dbPwd_tDBInput_5 = decryptedPassword_tDBInput_5;
				
				String url_tDBInput_5 = "jdbc:postgresql://" + "163.172.166.119" + ":" + "5432" + "/" + "leuk_analytics";
				
				conn_tDBInput_5 = java.sql.DriverManager.getConnection(url_tDBInput_5,dbUser_tDBInput_5,dbPwd_tDBInput_5);
		        
				conn_tDBInput_5.setAutoCommit(false);
			
		    
			java.sql.Statement stmt_tDBInput_5 = conn_tDBInput_5.createStatement();

		    String dbquery_tDBInput_5 = "SELECT \n  \"public\".\"Fait_CDQ\".\"id_faitcdq\", \n  \"public\".\"Fait_CDQ\".\"id_secteur\", \n  \"public\".\"Fait_CDQ\""
+".\"id_produit\", \n  \"public\".\"Fait_CDQ\".\"id_temps\", \n  \"public\".\"Fait_CDQ\".\"cattc\", \n  \"public\".\"Fait_CDQ"
+"\".\"caht\", \n  \"public\".\"Fait_CDQ\".\"pertes\", \n  \"public\".\"Fait_CDQ\".\"quantite\", \n	--\"public\".\"Dim_Temps"
+"\".\"date\",\n  \"public\".\"Fait_CDQ\".\"volume_total\"\nFROM \"public\".\"Fait_CDQ\"\nINNER JOIN \"public\".\"Dim_Temps"
+"\" On \"public\".\"Fait_CDQ\".\"id_temps\" = \"public\".\"Dim_Temps\".\"id_temps\"\nwhere \"public\".\"Dim_Temps\".\"dat"
+"e\"  between CURRENT_DATE - INTERVAL '5 day' and CURRENT_DATE - INTERVAL '1 day'\nORDER BY    \"public\".\"Fait_CDQ\".\""
+"id_faitcdq\" asc";
		    

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
								row6.id_faitcdq = 0;
							} else {
		                          
            row6.id_faitcdq = rs_tDBInput_5.getInt(1);
            if(rs_tDBInput_5.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_5 < 2) {
								row6.id_secteur = null;
							} else {
		                          
            row6.id_secteur = rs_tDBInput_5.getLong(2);
            if(rs_tDBInput_5.wasNull()){
                    row6.id_secteur = null;
            }
		                    }
							if(colQtyInRs_tDBInput_5 < 3) {
								row6.id_produit = null;
							} else {
		                          
            row6.id_produit = rs_tDBInput_5.getLong(3);
            if(rs_tDBInput_5.wasNull()){
                    row6.id_produit = null;
            }
		                    }
							if(colQtyInRs_tDBInput_5 < 4) {
								row6.id_temps = null;
							} else {
		                          
            row6.id_temps = rs_tDBInput_5.getInt(4);
            if(rs_tDBInput_5.wasNull()){
                    row6.id_temps = null;
            }
		                    }
							if(colQtyInRs_tDBInput_5 < 5) {
								row6.cattc = null;
							} else {
	                         		
            row6.cattc = rs_tDBInput_5.getDouble(5);
            if(rs_tDBInput_5.wasNull()){
                    row6.cattc = null;
            }
		                    }
							if(colQtyInRs_tDBInput_5 < 6) {
								row6.caht = null;
							} else {
	                         		
            row6.caht = rs_tDBInput_5.getDouble(6);
            if(rs_tDBInput_5.wasNull()){
                    row6.caht = null;
            }
		                    }
							if(colQtyInRs_tDBInput_5 < 7) {
								row6.pertes = null;
							} else {
	                         		
            row6.pertes = rs_tDBInput_5.getDouble(7);
            if(rs_tDBInput_5.wasNull()){
                    row6.pertes = null;
            }
		                    }
							if(colQtyInRs_tDBInput_5 < 8) {
								row6.quantite = null;
							} else {
		                          
            row6.quantite = rs_tDBInput_5.getInt(8);
            if(rs_tDBInput_5.wasNull()){
                    row6.quantite = null;
            }
		                    }
							if(colQtyInRs_tDBInput_5 < 9) {
								row6.volume_total = null;
							} else {
		                          
            row6.volume_total = rs_tDBInput_5.getInt(9);
            if(rs_tDBInput_5.wasNull()){
                    row6.volume_total = null;
            }
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
	 * [tSortRow_2_SortOut main ] start
	 */

	

	
	
		currentVirtualComponent = "tSortRow_2";
	
	currentComponent="tSortRow_2_SortOut";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row6"
						
						);
					}
					



	Comparablerow6Struct arrayRowtSortRow_2_SortOut = new Comparablerow6Struct();

	arrayRowtSortRow_2_SortOut.id_faitcdq = row6.id_faitcdq;
	arrayRowtSortRow_2_SortOut.id_secteur = row6.id_secteur;
	arrayRowtSortRow_2_SortOut.id_produit = row6.id_produit;
	arrayRowtSortRow_2_SortOut.id_temps = row6.id_temps;
	arrayRowtSortRow_2_SortOut.cattc = row6.cattc;
	arrayRowtSortRow_2_SortOut.caht = row6.caht;
	arrayRowtSortRow_2_SortOut.pertes = row6.pertes;
	arrayRowtSortRow_2_SortOut.quantite = row6.quantite;
	arrayRowtSortRow_2_SortOut.volume_total = row6.volume_total;	
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
	 * [tSortRow_2_SortOut end ] start
	 */

	

	
	
		currentVirtualComponent = "tSortRow_2";
	
	currentComponent="tSortRow_2_SortOut";

	

row6Struct[] array_tSortRow_2_SortOut = list_tSortRow_2_SortOut.toArray(new Comparablerow6Struct[0]);

java.util.Arrays.sort(array_tSortRow_2_SortOut);

globalMap.put("tSortRow_2",array_tSortRow_2_SortOut);


				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row6");
			  	}
			  	
 

ok_Hash.put("tSortRow_2_SortOut", true);
end_Hash.put("tSortRow_2_SortOut", System.currentTimeMillis());




/**
 * [tSortRow_2_SortOut end ] stop
 */


	
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
			   		// source node:tSortRow_2_SortIn - inputs:(OnRowsEnd) outputs:(row7,row7) | target node:tAdvancedHash_row7 - inputs:(row7) outputs:()
			   		// linked node: tMap_5 - inputs:(out4,row7) outputs:(out5,out6)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row7 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row7Struct> tHash_Lookup_row7 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row7Struct>getLookup(matchingModeEnum_row7);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row7", tHash_Lookup_row7);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row7 begin ] stop
 */



	
	/**
	 * [tSortRow_2_SortIn begin ] start
	 */

	

	
		
		ok_Hash.put("tSortRow_2_SortIn", false);
		start_Hash.put("tSortRow_2_SortIn", System.currentTimeMillis());
		
	
		currentVirtualComponent = "tSortRow_2";
	
	currentComponent="tSortRow_2_SortIn";

	
		int tos_count_tSortRow_2_SortIn = 0;
		


row6Struct[] array_tSortRow_2_SortIn = (row6Struct[]) globalMap.remove("tSortRow_2");

int nb_line_tSortRow_2_SortIn = 0;

row6Struct current_tSortRow_2_SortIn = null;

for(int i_tSortRow_2_SortIn = 0; i_tSortRow_2_SortIn < array_tSortRow_2_SortIn.length; i_tSortRow_2_SortIn++){
	current_tSortRow_2_SortIn = array_tSortRow_2_SortIn[i_tSortRow_2_SortIn];
	row7.id_faitcdq = current_tSortRow_2_SortIn.id_faitcdq;
	row7.id_secteur = current_tSortRow_2_SortIn.id_secteur;
	row7.id_produit = current_tSortRow_2_SortIn.id_produit;
	row7.id_temps = current_tSortRow_2_SortIn.id_temps;
	row7.cattc = current_tSortRow_2_SortIn.cattc;
	row7.caht = current_tSortRow_2_SortIn.caht;
	row7.pertes = current_tSortRow_2_SortIn.pertes;
	row7.quantite = current_tSortRow_2_SortIn.quantite;
	row7.volume_total = current_tSortRow_2_SortIn.volume_total;
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
	 * [tAdvancedHash_row7 main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row7";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row7"
						
						);
					}
					


			   
			   

					row7Struct row7_HashRow = new row7Struct();
		   	   	   
				
				row7_HashRow.id_faitcdq = row7.id_faitcdq;
				
				row7_HashRow.id_secteur = row7.id_secteur;
				
				row7_HashRow.id_produit = row7.id_produit;
				
				row7_HashRow.id_temps = row7.id_temps;
				
				row7_HashRow.cattc = row7.cattc;
				
				row7_HashRow.caht = row7.caht;
				
				row7_HashRow.pertes = row7.pertes;
				
				row7_HashRow.quantite = row7.quantite;
				
				row7_HashRow.volume_total = row7.volume_total;
				
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
				
					te.setVirtualComponentName(currentVirtualComponent);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
							//free memory for "tSortRow_2_SortIn"
							globalMap.remove("tSortRow_2");
						
				try{
					
	
	/**
	 * [tDBInput_5 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_5";

	

 



/**
 * [tDBInput_5 finally ] stop
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
		

		globalMap.put("tDBInput_5_SUBPROCESS_STATE", 1);
	}
	


public static class row9Struct implements routines.system.IPersistableRow<row9Struct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[0];

	
			    public int id_faitcdq;

				public int getId_faitcdq () {
					return this.id_faitcdq;
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
				
			    public Integer quantite;

				public Integer getQuantite () {
					return this.quantite;
				}
				
			    public Integer volume_total;

				public Integer getVolume_total () {
					return this.volume_total;
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART) {

        	try {

        		int length = 0;
		
			        this.id_faitcdq = dis.readInt();
					
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
					
						this.quantite = readInteger(dis);
					
						this.volume_total = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART) {

        	try {

        		int length = 0;
		
			        this.id_faitcdq = dis.readInt();
					
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
					
						this.quantite = readInteger(dis);
					
						this.volume_total = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id_faitcdq);
					
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
				
						writeInteger(this.quantite,dos);
					
					// Integer
				
						writeInteger(this.volume_total,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id_faitcdq);
					
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
				
						writeInteger(this.quantite,dos);
					
					// Integer
				
						writeInteger(this.volume_total,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id_faitcdq="+String.valueOf(id_faitcdq));
		sb.append(",id_secteur="+String.valueOf(id_secteur));
		sb.append(",id_produit="+String.valueOf(id_produit));
		sb.append(",id_temps="+String.valueOf(id_temps));
		sb.append(",cattc="+String.valueOf(cattc));
		sb.append(",caht="+String.valueOf(caht));
		sb.append(",pertes="+String.valueOf(pertes));
		sb.append(",quantite="+String.valueOf(quantite));
		sb.append(",volume_total="+String.valueOf(volume_total));
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
			   		// linked node: tMap_6 - inputs:(out5,row9) outputs:(Insert_New_Data)
			   
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
				
				 
	final String decryptedPassword_tDBInput_7 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:m3fIZsP3O3+ddUZ7//uNrtMJCadI9e+aA5lHNFEf8wMdkGOBRaU=");
				
				String dbPwd_tDBInput_7 = decryptedPassword_tDBInput_7;
				
				String url_tDBInput_7 = "jdbc:postgresql://" + "163.172.166.119" + ":" + "5432" + "/" + "leuk_analytics";
				
				conn_tDBInput_7 = java.sql.DriverManager.getConnection(url_tDBInput_7,dbUser_tDBInput_7,dbPwd_tDBInput_7);
		        
				conn_tDBInput_7.setAutoCommit(false);
			
		    
			java.sql.Statement stmt_tDBInput_7 = conn_tDBInput_7.createStatement();

		    String dbquery_tDBInput_7 = "SELECT \n  \"public\".\"Fait_CDQ\".\"id_faitcdq\", \n  \"public\".\"Fait_CDQ\".\"id_secteur\", \n  \"public\".\"Fait_CD"
+"Q\".\"id_produit\", \n  \"public\".\"Fait_CDQ\".\"id_temps\", \n  \"public\".\"Fait_CDQ\".\"cattc\", \n  \"public\".\"Fa"
+"it_CDQ\".\"caht\", \n  \"public\".\"Fait_CDQ\".\"pertes\", \n  \"public\".\"Fait_CDQ\".\"quantite\",\n  \"public\".\"Fai"
+"t_CDQ\".\"volume_total\"\nFROM \"public\".\"Fait_CDQ\"\nORDER BY \"public\".\"Fait_CDQ\".\"id_faitcdq\" desc\nLIMIT 1;";
		    

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
								row9.id_faitcdq = 0;
							} else {
		                          
            row9.id_faitcdq = rs_tDBInput_7.getInt(1);
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
								row9.cattc = null;
							} else {
	                         		
            row9.cattc = rs_tDBInput_7.getDouble(5);
            if(rs_tDBInput_7.wasNull()){
                    row9.cattc = null;
            }
		                    }
							if(colQtyInRs_tDBInput_7 < 6) {
								row9.caht = null;
							} else {
	                         		
            row9.caht = rs_tDBInput_7.getDouble(6);
            if(rs_tDBInput_7.wasNull()){
                    row9.caht = null;
            }
		                    }
							if(colQtyInRs_tDBInput_7 < 7) {
								row9.pertes = null;
							} else {
	                         		
            row9.pertes = rs_tDBInput_7.getDouble(7);
            if(rs_tDBInput_7.wasNull()){
                    row9.pertes = null;
            }
		                    }
							if(colQtyInRs_tDBInput_7 < 8) {
								row9.quantite = null;
							} else {
		                          
            row9.quantite = rs_tDBInput_7.getInt(8);
            if(rs_tDBInput_7.wasNull()){
                    row9.quantite = null;
            }
		                    }
							if(colQtyInRs_tDBInput_7 < 9) {
								row9.volume_total = null;
							} else {
		                          
            row9.volume_total = rs_tDBInput_7.getInt(9);
            if(rs_tDBInput_7.wasNull()){
                    row9.volume_total = null;
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
		   	   	   
				
				row9_HashRow.id_faitcdq = row9.id_faitcdq;
				
				row9_HashRow.id_secteur = row9.id_secteur;
				
				row9_HashRow.id_produit = row9.id_produit;
				
				row9_HashRow.id_temps = row9.id_temps;
				
				row9_HashRow.cattc = row9.cattc;
				
				row9_HashRow.caht = row9.caht;
				
				row9_HashRow.pertes = row9.pertes;
				
				row9_HashRow.quantite = row9.quantite;
				
				row9_HashRow.volume_total = row9.volume_total;
				
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
	


public static class row10Struct implements routines.system.IPersistableComparableLookupRow<row10Struct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public int id_faitcdq;

				public int getId_faitcdq () {
					return this.id_faitcdq;
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
				
			    public Integer quantite;

				public Integer getQuantite () {
					return this.quantite;
				}
				
			    public Integer volume_total;

				public Integer getVolume_total () {
					return this.volume_total;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.id_secteur == null) ? 0 : this.id_secteur.hashCode());
					
						result = prime * result + ((this.id_produit == null) ? 0 : this.id_produit.hashCode());
					
						result = prime * result + ((this.id_temps == null) ? 0 : this.id_temps.hashCode());
					
						result = prime * result + ((this.cattc == null) ? 0 : this.cattc.hashCode());
					
						result = prime * result + ((this.caht == null) ? 0 : this.caht.hashCode());
					
						result = prime * result + ((this.pertes == null) ? 0 : this.pertes.hashCode());
					
						result = prime * result + ((this.quantite == null) ? 0 : this.quantite.hashCode());
					
						result = prime * result + ((this.volume_total == null) ? 0 : this.volume_total.hashCode());
					
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
					
						if (this.quantite == null) {
							if (other.quantite != null)
								return false;
						
						} else if (!this.quantite.equals(other.quantite))
						
							return false;
					
						if (this.volume_total == null) {
							if (other.volume_total != null)
								return false;
						
						} else if (!this.volume_total.equals(other.volume_total))
						
							return false;
					

		return true;
    }

	public void copyDataTo(row10Struct other) {

		other.id_faitcdq = this.id_faitcdq;
	            other.id_secteur = this.id_secteur;
	            other.id_produit = this.id_produit;
	            other.id_temps = this.id_temps;
	            other.cattc = this.cattc;
	            other.caht = this.caht;
	            other.pertes = this.pertes;
	            other.quantite = this.quantite;
	            other.volume_total = this.volume_total;
	            
	}

	public void copyKeysDataTo(row10Struct other) {

		other.id_secteur = this.id_secteur;
	            	other.id_produit = this.id_produit;
	            	other.id_temps = this.id_temps;
	            	other.cattc = this.cattc;
	            	other.caht = this.caht;
	            	other.pertes = this.pertes;
	            	other.quantite = this.quantite;
	            	other.volume_total = this.volume_total;
	            	
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART) {

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
					
						this.quantite = readInteger(dis);
					
						this.volume_total = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART) {

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
					
						this.quantite = readInteger(dis);
					
						this.volume_total = readInteger(dis);
					
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
				
						writeInteger(this.quantite,dos);
					
					// Integer
				
						writeInteger(this.volume_total,dos);
					
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
				
						writeInteger(this.quantite,dos);
					
					// Integer
				
						writeInteger(this.volume_total,dos);
					
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
		
			            this.id_faitcdq = dis.readInt();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
			            this.id_faitcdq = objectIn.readInt();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
		            	dos.writeInt(this.id_faitcdq);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
					objectOut.writeInt(this.id_faitcdq);
					
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
		sb.append("id_faitcdq="+String.valueOf(id_faitcdq));
		sb.append(",id_secteur="+String.valueOf(id_secteur));
		sb.append(",id_produit="+String.valueOf(id_produit));
		sb.append(",id_temps="+String.valueOf(id_temps));
		sb.append(",cattc="+String.valueOf(cattc));
		sb.append(",caht="+String.valueOf(caht));
		sb.append(",pertes="+String.valueOf(pertes));
		sb.append(",quantite="+String.valueOf(quantite));
		sb.append(",volume_total="+String.valueOf(volume_total));
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

					
						returnValue = checkNullsAndCompare(this.quantite, other.quantite);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.volume_total, other.volume_total);
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
			   		// source node:tDBInput_6 - inputs:(after_tDBInput_1) outputs:(row10,row10) | target node:tAdvancedHash_row10 - inputs:(row10) outputs:()
			   		// linked node: tMap_7 - inputs:(out6,row10) outputs:(Update_Data)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row10 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row10Struct> tHash_Lookup_row10 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row10Struct>getLookup(matchingModeEnum_row10);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row10", tHash_Lookup_row10);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row10 begin ] stop
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
				
				 
	final String decryptedPassword_tDBInput_6 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:lbvK+ELLT+Gty+hmu5Ye5t3YGKJeozNR4WZ4Z+bR4ZOVooHccP8=");
				
				String dbPwd_tDBInput_6 = decryptedPassword_tDBInput_6;
				
				String url_tDBInput_6 = "jdbc:postgresql://" + "163.172.166.119" + ":" + "5432" + "/" + "leuk_analytics";
				
				conn_tDBInput_6 = java.sql.DriverManager.getConnection(url_tDBInput_6,dbUser_tDBInput_6,dbPwd_tDBInput_6);
		        
				conn_tDBInput_6.setAutoCommit(false);
			
		    
			java.sql.Statement stmt_tDBInput_6 = conn_tDBInput_6.createStatement();

		    String dbquery_tDBInput_6 = "SELECT \n  \"public\".\"Fait_CDQ\".\"id_faitcdq\", \n  \"public\".\"Fait_CDQ\".\"id_secteur\", \n  \"public\".\"Fait_CDQ\""
+".\"id_produit\", \n  \"public\".\"Fait_CDQ\".\"id_temps\", \n  \"public\".\"Fait_CDQ\".\"cattc\", \n  \"public\".\"Fait_CDQ"
+"\".\"caht\", \n  \"public\".\"Fait_CDQ\".\"pertes\", \n  \"public\".\"Fait_CDQ\".\"quantite\", \n	--\"public\".\"Dim_Temps"
+"\".\"date\",\n  \"public\".\"Fait_CDQ\".\"volume_total\"\nFROM \"public\".\"Fait_CDQ\"\nINNER JOIN \"public\".\"Dim_Temps"
+"\" On \"public\".\"Fait_CDQ\".\"id_temps\" = \"public\".\"Dim_Temps\".\"id_temps\"\nwhere \"public\".\"Dim_Temps\".\"dat"
+"e\"  between CURRENT_DATE - INTERVAL '5 day' and CURRENT_DATE - INTERVAL '1 day'\nORDER BY    \"public\".\"Fait_CDQ\".\""
+"id_faitcdq\" asc";
		    

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
								row10.id_faitcdq = 0;
							} else {
		                          
            row10.id_faitcdq = rs_tDBInput_6.getInt(1);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 2) {
								row10.id_secteur = null;
							} else {
		                          
            row10.id_secteur = rs_tDBInput_6.getLong(2);
            if(rs_tDBInput_6.wasNull()){
                    row10.id_secteur = null;
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 3) {
								row10.id_produit = null;
							} else {
		                          
            row10.id_produit = rs_tDBInput_6.getLong(3);
            if(rs_tDBInput_6.wasNull()){
                    row10.id_produit = null;
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 4) {
								row10.id_temps = null;
							} else {
		                          
            row10.id_temps = rs_tDBInput_6.getInt(4);
            if(rs_tDBInput_6.wasNull()){
                    row10.id_temps = null;
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 5) {
								row10.cattc = null;
							} else {
	                         		
            row10.cattc = rs_tDBInput_6.getDouble(5);
            if(rs_tDBInput_6.wasNull()){
                    row10.cattc = null;
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 6) {
								row10.caht = null;
							} else {
	                         		
            row10.caht = rs_tDBInput_6.getDouble(6);
            if(rs_tDBInput_6.wasNull()){
                    row10.caht = null;
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 7) {
								row10.pertes = null;
							} else {
	                         		
            row10.pertes = rs_tDBInput_6.getDouble(7);
            if(rs_tDBInput_6.wasNull()){
                    row10.pertes = null;
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 8) {
								row10.quantite = null;
							} else {
		                          
            row10.quantite = rs_tDBInput_6.getInt(8);
            if(rs_tDBInput_6.wasNull()){
                    row10.quantite = null;
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 9) {
								row10.volume_total = null;
							} else {
		                          
            row10.volume_total = rs_tDBInput_6.getInt(9);
            if(rs_tDBInput_6.wasNull()){
                    row10.volume_total = null;
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
	 * [tAdvancedHash_row10 main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row10";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row10"
						
						);
					}
					


			   
			   

					row10Struct row10_HashRow = new row10Struct();
		   	   	   
				
				row10_HashRow.id_faitcdq = row10.id_faitcdq;
				
				row10_HashRow.id_secteur = row10.id_secteur;
				
				row10_HashRow.id_produit = row10.id_produit;
				
				row10_HashRow.id_temps = row10.id_temps;
				
				row10_HashRow.cattc = row10.cattc;
				
				row10_HashRow.caht = row10.caht;
				
				row10_HashRow.pertes = row10.pertes;
				
				row10_HashRow.quantite = row10.quantite;
				
				row10_HashRow.volume_total = row10.volume_total;
				
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
	 * [tDBInput_6 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_6";

	

 



/**
 * [tDBInput_6 finally ] stop
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
		

		globalMap.put("tDBInput_6_SUBPROCESS_STATE", 1);
	}
	


public static class row2Struct implements routines.system.IPersistableComparableLookupRow<row2Struct> {
    final static byte[] commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[0];
    static byte[] commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[0];
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
			if(length > commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART, 0, length, utf8Charset);
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
			if(length > commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART.length) {
				if(length < 1024 && commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART.length == 0) {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[1024];
				} else {
   					commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART, 0, length);
			strReturn = new String(commonByteArray_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART) {

        	try {

        		int length = 0;
		
					this.sku_commcare = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_WAREHOUSE_Alimentation_FAIT_CHEF_DE_QUART) {

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
			   		// source node:tDBInput_8 - inputs:(after_tDBInput_1) outputs:(row2,row2) | target node:tAdvancedHash_row2 - inputs:(row2) outputs:()
			   		// linked node: tMap_1 - inputs:(row1,row3,row2) outputs:(out1)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row2 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row2Struct> tHash_Lookup_row2 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row2Struct>getLookup(matchingModeEnum_row2);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row2", tHash_Lookup_row2);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row2 begin ] stop
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
				
				 
	final String decryptedPassword_tDBInput_8 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:YWWnDV7/qb29yiFqZgo2hiobcUV8KLTurDRPcG/x9dv5m6b/f7A=");
				
				String dbPwd_tDBInput_8 = decryptedPassword_tDBInput_8;
				
				String url_tDBInput_8 = "jdbc:postgresql://" + "163.172.166.119" + ":" + "5432" + "/" + "leuk_analytics";
				
				conn_tDBInput_8 = java.sql.DriverManager.getConnection(url_tDBInput_8,dbUser_tDBInput_8,dbPwd_tDBInput_8);
		        
				conn_tDBInput_8.setAutoCommit(false);
			
		    
			java.sql.Statement stmt_tDBInput_8 = conn_tDBInput_8.createStatement();

		    String dbquery_tDBInput_8 = "SELECT \n  \"public\".\"catalogue_produit\".\"sku_commcare\", \n  \"public\".\"catalogue_produit\".\"prix__mali_guinee\","
+" \n  \"public\".\"catalogue_produit\".\"prix_gambie\"\nFROM \"public\".\"catalogue_produit\"";
		    

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
								row2.sku_commcare = null;
							} else {
	                         		
        	row2.sku_commcare = routines.system.JDBCUtil.getString(rs_tDBInput_8, 1, false);
		                    }
							if(colQtyInRs_tDBInput_8 < 2) {
								row2.prix__mali_guinee = null;
							} else {
		                          
            row2.prix__mali_guinee = rs_tDBInput_8.getInt(2);
            if(rs_tDBInput_8.wasNull()){
                    row2.prix__mali_guinee = null;
            }
		                    }
							if(colQtyInRs_tDBInput_8 < 3) {
								row2.prix_gambie = null;
							} else {
	                         		
            row2.prix_gambie = rs_tDBInput_8.getDouble(3);
            if(rs_tDBInput_8.wasNull()){
                    row2.prix_gambie = null;
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
	 * [tDBInput_8 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_8";

	

 



/**
 * [tDBInput_8 finally ] stop
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
		

		globalMap.put("tDBInput_8_SUBPROCESS_STATE", 1);
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
	
	
		 
	final String decryptedPassword_tDBConnection_1 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:4sFqOBtK0RpD5YFHR1N1vrpm4zKXLmqCzkbH8DBdRurBmje25lBNFQSP");
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
	
	
		 
	final String decryptedPassword_tDBConnection_2 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:K3Y6/Zy1WwDWn97PPMPkAIkvcGPjJoYMZXn0gdkMquDYbuT6Dgo=");
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

	



	java.sql.Connection conn_tDBClose_1 = (java.sql.Connection)globalMap.get("conn_tDBConnection_1");
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

	



	java.sql.Connection conn_tDBClose_2 = (java.sql.Connection)globalMap.get("conn_tDBConnection_2");
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
   	 				runStat.updateStatOnConnection("OnComponentOk8", 0, "ok");
				}
				tChronometerStop_2Process(globalMap);



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
	

public void tChronometerStop_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tChronometerStop_2_SUBPROCESS_STATE", 0);

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
	 * [tChronometerStop_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tChronometerStop_2", false);
		start_Hash.put("tChronometerStop_2", System.currentTimeMillis());
		
	
	currentComponent="tChronometerStop_2";

	
		int tos_count_tChronometerStop_2 = 0;
		
	
	long timetChronometerStop_2;
	
		timetChronometerStop_2 = System.currentTimeMillis() - startTime;
		
	   		System.out.print("[ tChronometerStop_2 ]  ");
		
	  	System.out.println("" + "  " + timetChronometerStop_2 + " milliseconds");
	  	 
	
	Long currentTimetChronometerStop_2 = System.currentTimeMillis();
	globalMap.put("tChronometerStop_2", currentTimetChronometerStop_2);
	
	globalMap.put("tChronometerStop_2_STOPTIME", currentTimetChronometerStop_2);
	globalMap.put("tChronometerStop_2_DURATION", timetChronometerStop_2);
 



/**
 * [tChronometerStop_2 begin ] stop
 */
	
	/**
	 * [tChronometerStop_2 main ] start
	 */

	

	
	
	currentComponent="tChronometerStop_2";

	

 


	tos_count_tChronometerStop_2++;

/**
 * [tChronometerStop_2 main ] stop
 */
	
	/**
	 * [tChronometerStop_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tChronometerStop_2";

	

 



/**
 * [tChronometerStop_2 process_data_begin ] stop
 */
	
	/**
	 * [tChronometerStop_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tChronometerStop_2";

	

 



/**
 * [tChronometerStop_2 process_data_end ] stop
 */
	
	/**
	 * [tChronometerStop_2 end ] start
	 */

	

	
	
	currentComponent="tChronometerStop_2";

	

 

ok_Hash.put("tChronometerStop_2", true);
end_Hash.put("tChronometerStop_2", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk9", 0, "ok");
				}
				tJava_2Process(globalMap);



/**
 * [tChronometerStop_2 end ] stop
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
	 * [tChronometerStop_2 finally ] start
	 */

	

	
	
	currentComponent="tChronometerStop_2";

	

 



/**
 * [tChronometerStop_2 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tChronometerStop_2_SUBPROCESS_STATE", 1);
	}
	

public void tJava_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tJava_2_SUBPROCESS_STATE", 0);

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
	 * [tJava_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tJava_2", false);
		start_Hash.put("tJava_2", System.currentTimeMillis());
		
	
	currentComponent="tJava_2";

	
		int tos_count_tJava_2 = 0;
		


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
 * [tJava_2 begin ] stop
 */
	
	/**
	 * [tJava_2 main ] start
	 */

	

	
	
	currentComponent="tJava_2";

	

 


	tos_count_tJava_2++;

/**
 * [tJava_2 main ] stop
 */
	
	/**
	 * [tJava_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tJava_2";

	

 



/**
 * [tJava_2 process_data_begin ] stop
 */
	
	/**
	 * [tJava_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tJava_2";

	

 



/**
 * [tJava_2 process_data_end ] stop
 */
	
	/**
	 * [tJava_2 end ] start
	 */

	

	
	
	currentComponent="tJava_2";

	

 

ok_Hash.put("tJava_2", true);
end_Hash.put("tJava_2", System.currentTimeMillis());




/**
 * [tJava_2 end ] stop
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
	 * [tJava_2 finally ] start
	 */

	

	
	
	currentComponent="tJava_2";

	

 



/**
 * [tJava_2 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tJava_2_SUBPROCESS_STATE", 1);
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
        final Alimentation_FAIT_CHEF_DE_QUART Alimentation_FAIT_CHEF_DE_QUARTClass = new Alimentation_FAIT_CHEF_DE_QUART();

        int exitCode = Alimentation_FAIT_CHEF_DE_QUARTClass.runJobInTOS(args);

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
            java.io.InputStream inContext = Alimentation_FAIT_CHEF_DE_QUART.class.getClassLoader().getResourceAsStream("warehouse/alimentation_fait_chef_de_quart_0_1/contexts/" + contextStr + ".properties");
            if (inContext == null) {
                inContext = Alimentation_FAIT_CHEF_DE_QUART.class.getClassLoader().getResourceAsStream("config/contexts/" + contextStr + ".properties");
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
            System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : Alimentation_FAIT_CHEF_DE_QUART");
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
 *     513713 characters generated by Talend Open Studio for Data Integration 
 *     on the 26 février 2025 à 14:58:47 UTC
 ************************************************************************************************/