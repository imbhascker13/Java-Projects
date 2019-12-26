package com.mindtree.springbootmvc.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Block {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int blockId;
	private String blockName;

	@OneToMany(cascade = CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name = "blockId")
	private List<Shop> shop;

	public Block() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Block(int blockId, String blockName, List<Shop> shop) {
		super();
		this.blockId = blockId;
		this.blockName = blockName;
		this.shop = shop;
	}

	public int getBlockId() {
		return blockId;
	}

	public void setBlockId(int blockId) {
		this.blockId = blockId;
	}

	public String getBlockName() {
		return blockName;
	}

	public void setBlockName(String blockName) {
		this.blockName = blockName;
	}

	public List<Shop> getShop() {
		return shop;
	}

	public void setShop(List<Shop> shop) {
		this.shop = shop;
	}


}
