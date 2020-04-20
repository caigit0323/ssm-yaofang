package sss;

public class TicketOffice {

	private int ticketNum = 0;  
	  
	    public TicketOffice(int ticketNum) {  
	        super();  
	        this.ticketNum = ticketNum;  
	    }  
	      
	    public int getTicketNum() {  
	        return ticketNum;  
	    }  
	  
	    public void setTicketNum(int ticketNum) {  
	        this.ticketNum = ticketNum;  
	    }  
	      
	    /** 
	     *  售票厅卖票的方法，这个方法操作了售票厅对象唯一的状态--剩余火车票数量。 
	     *  该方法此处并未进行互斥控制。 
	     */  
	    public void sellOneTicket(){  
	          
	        ticketNum--;  
	        // 打印剩余票的数量  
	        if(ticketNum >= 0){  
	              
	            System.out.println("售票成功，剩余票数： " + ticketNum);  
	        }else{  
	              
	            System.out.println("售票失败，票已售罄！");  
	        }  
	          
	    }  
	      
	    public static void main(String[] args) {  
	          
	        final TicketOffice ticketOffice = new TicketOffice(100);  
	          
	        // 启动10个线程，即10个窗口开始卖票  
	        for(int i=0;i<10;i++){  
	              
	            new Thread(new Runnable(){  
	  
	                @Override  
	                public void run() {  
	                      
	                    // 当还有剩余票的时候，就去执行  
	                    while(ticketOffice.getTicketNum() > 0){  
	                          
	                        ticketOffice.sellOneTicket();  
	                    }  
	                      
	                }  
	                  
	            }).start();  
	        }  
	    }  
	  
	}  


