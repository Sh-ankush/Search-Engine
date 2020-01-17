package pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FARMER_PRODUCT")
public class FarmerProduct 
{
	private Integer p_Id;
	private String p_category;
	private String p_name;
	private double p_price;
	private int p_quantity;
	private String p_quality;

	public FarmerProduct() 
	{
		super();
	  System.out.println("In Farmer Product pojo default constructor");	
	}

	public FarmerProduct(Integer p_Id, String p_category, String p_name, double p_price, int p_quantity,
			String p_quality) {
		super();
		this.p_Id = p_Id;
		this.p_category = p_category;
		this.p_name = p_name;
		this.p_price = p_price;
		this.p_quantity = p_quantity;
		this.p_quality = p_quality;
	}
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PRODUCT_ID")
	public Integer getP_Id()
	{
		return p_Id;
	}
    
	
	@Column(name = "PRODUCT_CATEGORY",length = 50)
	public String getP_category() 
	{
		return p_category;
	}

	
	@Column(name = "PRODUCT_NAME")
	public String getP_name() 
	{
		return p_name;
	}

	@Column(name = "PRODUCT_PRICE")
	public double getP_price() 
	{
		return p_price;
	}

	@Column(name = "PRODUCT_QUANTITY")
	public int getP_quantity() 
	{
		return p_quantity;
	}

	@Column(name = "PRODUCT_QUALITY")
	public String getP_quality() 
	{
		return p_quality;
	}

	
	public void setP_Id(Integer p_Id) 
	{
		this.p_Id = p_Id;
	}

	
	public void setP_category(String p_category) 
	{
		this.p_category = p_category;
	}

	
	public void setP_name(String p_name) 
	{
		this.p_name = p_name;
	}


	public void setP_price(double p_price)
	{
		this.p_price = p_price;
	}


	public void setP_quantity(int p_quantity)
	{
		this.p_quantity = p_quantity;
	}

	public void setP_quality(String p_quality) {
		this.p_quality = p_quality;
	}

	@Override
	public String toString() {
		return "FarmerProduct [p_Id=" + p_Id + ", p_category=" + p_category + ", p_name=" + p_name + ", p_price="
				+ p_price + ", p_quantity=" + p_quantity + ", p_quality=" + p_quality + "]";
	}
	
	
}

