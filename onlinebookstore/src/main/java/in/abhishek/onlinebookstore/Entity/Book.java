package in.abhishek.onlinebookstore.Entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="BOOK_MST")
@Setter
@Getter
@ToString
public class Book 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	private Integer ID;
	
	@Column(name="SKU")
	private String SKU;
	
	@Column(name="NAME")
	private String NAME;
	
	@Column(name="DESCRIPTION")
	private String DESCRIPTION;
	
	@Column(name="UNITE_PRICE")
	private BigDecimal UNITE_PRICE;
	
	@Column(name="IMAGE_URL")
	private String IMAGE_URL;
	
	@Column(name="ACTIVE")
	private String ACTIVE;
	
	
	@Column(name="UNITE_IN_STOCK")
	private String UNITE_IN_STOCK;
	
	@Column(name="CRT_DATE")
	private Date CRT_DATE;
	
	@Column(name="LST_UPD_DATE")
	private Date LST_UPD_DATE;
	
	
	
	@ManyToOne
	@JoinColumn(name="CATEGORY_ID",nullable=false)
	private  BookCategory category;



	public Integer getID() {
		return ID;
	}



	public void setID(Integer iD) {
		ID = iD;
	}



	public String getSKU() {
		return SKU;
	}



	public void setSKU(String sKU) {
		SKU = sKU;
	}



	public String getNAME() {
		return NAME;
	}



	public void setNAME(String nAME) {
		NAME = nAME;
	}



	public String getDESCRIPTION() {
		return DESCRIPTION;
	}



	public void setDESCRIPTION(String dESCRIPTION) {
		DESCRIPTION = dESCRIPTION;
	}



	public BigDecimal getUNITE_PRICE() {
		return UNITE_PRICE;
	}



	public void setUNITE_PRICE(BigDecimal uNITE_PRICE) {
		UNITE_PRICE = uNITE_PRICE;
	}



	public String getIMAGE_URL() {
		return IMAGE_URL;
	}



	public void setIMAGE_URL(String iMAGE_URL) {
		IMAGE_URL = iMAGE_URL;
	}



	public String getACTIVE() {
		return ACTIVE;
	}



	public void setACTIVE(String aCTIVE) {
		ACTIVE = aCTIVE;
	}



	public String getUNITE_IN_STOCK() {
		return UNITE_IN_STOCK;
	}



	public void setUNITE_IN_STOCK(String uNITE_IN_STOCK) {
		UNITE_IN_STOCK = uNITE_IN_STOCK;
	}



	public Date getCRT_DATE() {
		return CRT_DATE;
	}



	public void setCRT_DATE(Date cRT_DATE) {
		CRT_DATE = cRT_DATE;
	}



	public Date getLST_UPD_DATE() {
		return LST_UPD_DATE;
	}



	public void setLST_UPD_DATE(Date lST_UPD_DATE) {
		LST_UPD_DATE = lST_UPD_DATE;
	}



	public BookCategory getCategory() {
		return category;
	}



	public void setCategory(BookCategory category) {
		this.category = category;
	}
	
	
	
}
