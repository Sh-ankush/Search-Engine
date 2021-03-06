package pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="CONSUMERS")
public class ConsumerPojo 
{
	

	private int c_Id;
	
	private int c_pan;
	private String c_name;
	private String c_email;
	private String c_company;
	private String c_address;
	private String c_contact;
	private String c_city;
	private String c_state;
	private String c_pincode;
	private String c_password;
	
	
	public ConsumerPojo() 
	{
		super();
         System.out.println("In Consumer default pojo constructor");
	}
	
	
	public ConsumerPojo(int c_Id, int c_pan, String c_name, String c_email, String c_company, String c_address,
			String c_contact, String c_city, String c_state, String c_pincode, String c_password)
	{
		super();
		this.c_Id = c_Id;
		this.c_pan = c_pan;
		this.c_name = c_name;
		this.c_email = c_email;
		this.c_company = c_company;
		this.c_address = c_address;
		this.c_contact = c_contact;
		this.c_city = c_city;
		this.c_state = c_state;
		this.c_pincode = c_pincode;
		this.c_password = c_password;
	}



	public void setC_Id(int c_Id) {
		this.c_Id = c_Id;
	}


	public void setC_pan(int c_pan) {
		this.c_pan = c_pan;
	}


	public void setC_name(String c_name) {
		this.c_name = c_name;
	}


	public void setC_email(String c_email) {
		this.c_email = c_email;
	}


	public void setC_company(String c_company) {
		this.c_company = c_company;
	}


	public void setC_address(String c_address) {
		this.c_address = c_address;
	}


	public void setC_contact(String c_contact) {
		this.c_contact = c_contact;
	}


	public void setC_city(String c_city) {
		this.c_city = c_city;
	}


	public void setC_state(String c_state) {
		this.c_state = c_state;
	}


	public void setC_pincode(String c_pincode) {
		this.c_pincode = c_pincode;
	}


	public void setC_password(String c_password) {
		this.c_password = c_password;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getC_Id()
	{
		return c_Id;
	}

	@NotNull
	@Column(name="CONSUMER_NAME",length = 10,nullable = false)
	public String getC_name()
	{
		return c_name;
	}
	
	@NotNull
	@Column(name="CONSUMER_PANCARD",length = 10, unique = true, nullable = false)
	public int getC_pan() 
	{
		return c_pan;
	}


    @NotNull
	@Column(name="CONSUMER_EMAIL",length = 30,nullable = false)
	public String getC_email() 
    {
		return c_email;
	}

	@Column(name="CONSUMER_COMPANY",length = 100)
	public String getC_company()
	{
		return c_company;
	}

	@Column(name="CONSUMER_ADDRESS")
	public String getC_address()
	{
		return c_address;
	}

	@Size(min = 10,max = 13)
	@Column(name="CONSUMER_CONTACT")
	public String getC_contact() 
	{
		return c_contact;
	}

	@Column(name="CONSUMER_CITY",length = 20)
	public String getC_city()
	{
		return c_city;
	}

	@Column(name="CONSUMER_STATE",length = 30)
	public String getC_state() 
	{
		return c_state;
	}

	@Column(name="CONSUMER_PINCODE",length = 6)
	public String getC_pincode() 
	{
		return c_pincode;
	}

	@Column(name="CONSUMER_PASSWORD")
	public String getC_password() 
	{
		return c_password;
	}




	@Override
	public String toString()
	{
		return "Consumer [c_Id=" + c_Id + ", c_pan=" + c_pan + ", c_name=" + c_name + ", c_email=" + c_email
				+ ", c_company=" + c_company + ", c_address=" + c_address + ", c_contact=" + c_contact + ", c_city="
				+ c_city + ", c_state=" + c_state + ", c_pincode=" + c_pincode + "]";
	}
	
	
	



}
