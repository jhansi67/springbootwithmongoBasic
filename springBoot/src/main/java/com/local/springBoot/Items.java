package com.local.springBoot;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "items")
public class Items {

	    @Id
	    String id;
	    String itemName;
	    String itemDesc;
	    Double itemPrice;
	    String itemImage;

	    

	    public Items() {
			
		}

		public Items(String id, String itemName, String itemDesc, Double itemPrice, String itemImage) {
			super();
			this.id = id;
			this.itemName = itemName;
			this.itemDesc = itemDesc;
			this.itemPrice = itemPrice;
			this.itemImage = itemImage;
		}

		public String getId() {
	        return id;
	    }

	    public void setId(String id) {
	        this.id = id;
	    }

	    public String getitemName() {
	        return itemName;
	    }

	    public void setitemName(String itemName) {
	        this.itemName = itemName;
	    }

	    public String getitemDesc() {
	        return itemDesc;
	    }

	    public void setitemDesc(String itemDesc) {
	        this.itemDesc = itemDesc;
	    }

	    public Double getitemPrice() {
	        return itemPrice;
	    }

	    public void setitemPrice(Double itemPrice) {
	        this.itemPrice = itemPrice;
	    }

	    public String getitemImage() {
	        return itemImage;
	    }

	    public void setitemImage(String itemImage) {
	        this.itemImage = itemImage;
	    }
	}


