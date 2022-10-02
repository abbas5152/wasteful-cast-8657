package com.covid.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalVaccineExceptionHandler {

//	
//	@ExceptionHandler(VaccineNotFoundException.class)
//	    public ResponseEntity<MyErrorDetails> globalExceptionHandler(VaccineNotFoundException ve, WebRequest wr){
//	    	
//	    	        MyErrorDetails mrd= new MyErrorDetails();
//	    	        		
//	    	        mrd.setTimestap(LocalDateTime.now());
//	    	        mrd.setMessage(ve.getMessage());
//	    	        mrd.setDetails(wr.getDescription(false));
//	    	        
//	    	        return new ResponseEntity<MyErrorDetails>(mrd, HttpStatus.BAD_REQUEST);
//	    }
	

	@ExceptionHandler(AppointmentException.class)
	    public ResponseEntity<MyErrorDetails> globalExceptionHandler(AppointmentException ve, WebRequest wr){
	    	
	    	        MyErrorDetails mrd= new MyErrorDetails();
	    	        		
	    	        mrd.setTimestap(LocalDateTime.now());
	    	        mrd.setMessage(ve.getMessage());
	    	        mrd.setDetails(wr.getDescription(false));
	    	        
	    	        return new ResponseEntity<MyErrorDetails>(mrd, HttpStatus.BAD_REQUEST);
	    }
	
	@ExceptionHandler(IdCardNotFoundException.class)
    public ResponseEntity<MyErrorDetails> globalExceptionHandler(IdCardNotFoundException ve, WebRequest wr){
    	
    	        MyErrorDetails mrd= new MyErrorDetails();
    	        		
    	        mrd.setTimestap(LocalDateTime.now());
    	        mrd.setMessage(ve.getMessage());
    	        mrd.setDetails(wr.getDescription(false));
    	        
    	        return new ResponseEntity<MyErrorDetails>(mrd, HttpStatus.BAD_REQUEST);
    }
	
	@ExceptionHandler(IdCardNotRegisterException.class)
    public ResponseEntity<MyErrorDetails> globalExceptionHandler(IdCardNotRegisterException ve, WebRequest wr){
    	
    	        MyErrorDetails mrd= new MyErrorDetails();
    	        		
    	        mrd.setTimestap(LocalDateTime.now());
    	        mrd.setMessage(ve.getMessage());
    	        mrd.setDetails(wr.getDescription(false));
    	        
    	        return new ResponseEntity<MyErrorDetails>(mrd, HttpStatus.BAD_REQUEST);
    }
	
	@ExceptionHandler(LoginException.class)
    public ResponseEntity<MyErrorDetails> globalExceptionHandler(LoginException ve, WebRequest wr){
    	
    	        MyErrorDetails mrd= new MyErrorDetails();
    	        		
    	        mrd.setTimestap(LocalDateTime.now());
    	        mrd.setMessage(ve.getMessage());
    	        mrd.setDetails(wr.getDescription(false));
    	        
    	        return new ResponseEntity<MyErrorDetails>(mrd, HttpStatus.BAD_REQUEST);
    }
	
	
	



	
	@ExceptionHandler(MemberNotFoundException.class)
	public ResponseEntity<MyErrorDetails> globalExceptionHandler(MemberNotFoundException ve, WebRequest wr){
		
		        MyErrorDetails mrd= new MyErrorDetails();
		        		
		        mrd.setTimestap(LocalDateTime.now());
		        mrd.setMessage(ve.getMessage());
		        mrd.setDetails(wr.getDescription(false));
		        
		        return new ResponseEntity<MyErrorDetails>(mrd, HttpStatus.BAD_REQUEST);
	}
	
	
	@ExceptionHandler(MemberNotRegisterException.class)
	public ResponseEntity<MyErrorDetails> globalExceptionHandler(MemberNotRegisterException ve, WebRequest wr){
		
		        MyErrorDetails mrd= new MyErrorDetails();
		        		
		        mrd.setTimestap(LocalDateTime.now());
		        mrd.setMessage(ve.getMessage());
		        mrd.setDetails(wr.getDescription(false));
		        
		        return new ResponseEntity<MyErrorDetails>(mrd, HttpStatus.BAD_REQUEST);
	}
	    
	@ExceptionHandler(UserException.class)
	public ResponseEntity<MyErrorDetails> SendExceptionMessage(UserException e, WebRequest wr){
		
		    MyErrorDetails mrd= new MyErrorDetails();
		    
		    mrd.setTimestap(LocalDateTime.now());
		    mrd.setMessage(e.getMessage());
		    mrd.setDetails(wr.getDescription(false));
		    
		    return new ResponseEntity<MyErrorDetails>(mrd, HttpStatus.BAD_REQUEST);
		    
	}
	
	@ExceptionHandler(VaccineCenterException.class)
	public ResponseEntity<MyErrorDetails> SendExceptionMessage(VaccineCenterException e, WebRequest wr){
		
		    MyErrorDetails mrd= new MyErrorDetails();
		    
		    mrd.setTimestap(LocalDateTime.now());
		    mrd.setMessage(e.getMessage());
		    mrd.setDetails(wr.getDescription(false));
		    
		    return new ResponseEntity<MyErrorDetails>(mrd, HttpStatus.BAD_REQUEST);
		    
	}
	
	@ExceptionHandler(VaccineCenterNotFoundException.class)
	public ResponseEntity<MyErrorDetails> SendExceptionMessage(VaccineCenterNotFoundException e, WebRequest wr){
		
		    MyErrorDetails mrd= new MyErrorDetails();
		    
		    mrd.setTimestap(LocalDateTime.now());
		    mrd.setMessage(e.getMessage());
		    mrd.setDetails(wr.getDescription(false));
		    
		    return new ResponseEntity<MyErrorDetails>(mrd, HttpStatus.BAD_REQUEST);
		    
	}
	
	@ExceptionHandler(VaccineInventoryNotFound.class)
	public ResponseEntity<MyErrorDetails> SendExceptionMessage(VaccineInventoryNotFound e, WebRequest wr){
		
		    MyErrorDetails mrd= new MyErrorDetails();
		    
		    mrd.setTimestap(LocalDateTime.now());
		    mrd.setMessage(e.getMessage());
		    mrd.setDetails(wr.getDescription(false));
		    
		    return new ResponseEntity<MyErrorDetails>(mrd, HttpStatus.BAD_REQUEST);
		    
	}
	
	
	@ExceptionHandler(VaccineNotFoundException.class)
	public ResponseEntity<MyErrorDetails> SendExceptionMessage(VaccineNotFoundException e, WebRequest wr){
		
		    MyErrorDetails mrd= new MyErrorDetails();
		    
		    mrd.setTimestap(LocalDateTime.now());
		    mrd.setMessage(e.getMessage());
		    mrd.setDetails(wr.getDescription(false));
		    
		    return new ResponseEntity<MyErrorDetails>(mrd, HttpStatus.BAD_REQUEST);
		    
	}
	
	@ExceptionHandler(VaccineRegistrationException.class)
	public ResponseEntity<MyErrorDetails> SendExceptionMessage(VaccineRegistrationException e, WebRequest wr){
		
		    MyErrorDetails mrd= new MyErrorDetails();
		    
		    mrd.setTimestap(LocalDateTime.now());
		    mrd.setMessage(e.getMessage());
		    mrd.setDetails(wr.getDescription(false));
		    
		    return new ResponseEntity<MyErrorDetails>(mrd, HttpStatus.BAD_REQUEST);
		    
	}
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> SendExceptionMessage(Exception e, WebRequest wr){
		
		    MyErrorDetails mrd= new MyErrorDetails();
		    
		    mrd.setTimestap(LocalDateTime.now());
		    mrd.setMessage(e.getMessage());
		    mrd.setDetails(wr.getDescription(false));
		    
		    return new ResponseEntity<MyErrorDetails>(mrd, HttpStatus.BAD_REQUEST);
		    
	}
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<MyErrorDetails> SendExceptionMessage(NoHandlerFoundException e, WebRequest wr){
		
		    MyErrorDetails mrd= new MyErrorDetails();
		    
		    mrd.setTimestap(LocalDateTime.now());
		    mrd.setMessage(e.getMessage());
		    mrd.setDetails(wr.getDescription(false));
		    
		    return new ResponseEntity<MyErrorDetails>(mrd, HttpStatus.BAD_REQUEST);
		    
	}
	    
}
