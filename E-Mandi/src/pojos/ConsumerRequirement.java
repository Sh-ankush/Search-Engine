package pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ConsumerRequirement 
{
	private Integer p_Id;//join from product table
	private String c_id;//join from consumer table
	private int c_requirement_id;
	private String c_pcategory;//need to be normalized
	private String c_pname;//need to be normalized
	private String c_pquantity;//need to be normalized
	private String c_pquality;//need to be normalized
	private LocalDate c_expected_date;//need to be normalized
	
	public ConsumerRequirement() {
		super();
		System.out.println("Inside CosumerRequirement");
	}

	public ConsumerRequirement(Integer p_Id, String c_id, int c_requirement_id, String c_pcategory, String c_pname,
			String c_pquantity, String c_pquality, LocalDate c_expected_date) {
		super();
		this.p_Id = p_Id;
		this.c_id = c_id;
		this.c_requirement_id = c_requirement_id;
		this.c_pcategory = c_pcategory;
		this.c_pname = c_pname;
		this.c_pquantity = c_pquantity;
		this.c_pquality = c_pquality;
		this.c_expected_date = c_expected_date;
	}

	//join table
	public Integer getP_Id() {
		return p_Id;
	}
	//join table
	public String getC_id() {
		return c_id;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getC_requirement_id() {
		return c_requirement_id;
	}

	@Column(name = "PRODUCT_CATEGORY",length = 50)
	public String getC_pcategory() {
		return c_pcategory;
	}
	
	@Column(name = "PRODUCT_NAME")
	public String getC_pname() {
		return c_pname;
	}
	@Column(name = "PRODUCT_QUANTITY")
	public String getC_pquantity() {
		return c_pquantity;
	}
	@Column(name = "PRODUCT_QUALITY")
	public String getC_pquality() {
		return c_pquality;
	}
	@Column(name = "PRODUCT_ExpectedDate")
	public LocalDate getC_expected_date() {
		return c_expected_date;
	}

	public void setP_Id(Integer p_Id) {
		this.p_Id = p_Id;
	}

	public void setC_id(String c_id) {
		this.c_id = c_id;
	}

	public void setC_requirement_id(int c_requirement_id) {
		this.c_requirement_id = c_requirement_id;
	}

	public void setC_pcategory(String c_pcategory) {
		this.c_pcategory = c_pcategory;
	}

	public void setC_pname(String c_pname) {
		this.c_pname = c_pname;
	}

	public void setC_pquantity(String c_pquantity) {
		this.c_pquantity = c_pquantity;
	}

	public void setC_pquality(String c_pquality) {
		this.c_pquality = c_pquality;
	}

	public void setC_expected_date(LocalDate c_expected_date) {
		this.c_expected_date = c_expected_date;
	}

	@Override
	public String toString() {
		return "ConsumerRequirement [p_Id=" + p_Id + ", c_id=" + c_id + ", c_requirement_id=" + c_requirement_id
				+ ", c_pcategory=" + c_pcategory + ", c_pname=" + c_pname + ", c_pquantity=" + c_pquantity
				+ ", c_pquality=" + c_pquality + ", c_expected_date=" + c_expected_date + "]";
	}
	
	
	
	
	
	    

}
