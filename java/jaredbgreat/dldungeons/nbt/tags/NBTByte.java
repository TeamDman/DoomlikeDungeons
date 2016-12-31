package jaredbgreat.dldungeons.nbt.tags;

/* 
 * This mod is the creation and copyright (c) 2015 
 * of Jared Blackburn (JaredBGreat).
 * 
 * It is licensed under the creative commons 4.0 attribution license: 
 * https://creativecommons.org/licenses/by/4.0/legalcode
*/		

import net.minecraft.nbt.NBTTagCompound;

public class NBTByte implements ITag {
	public final String label; // The label to uniquely identify the tag
	public final String name;  // The name / label of the tag in NBT
	public final byte   data;  // The data carried by the tag in the NBT
	
	
	/**
	 * The constructor for use with text data; it will convert a text based 
	 * value to a byte.
	 * 
	 * @param label
	 * @param name
	 * @param data
	 */
	public NBTByte(String label, String name, String data) {
		this.label = label;
		this.name  = name;
		this.data  = Byte.parseByte(data);
	}
	
	
	/**
	 * A constructor to use if a byte is actually already available.
	 * 
	 * @param label
	 * @param name
	 * @param data
	 */
	public NBTByte(String label, String name, byte data) {
		this.label = label;
		this.name  = name;
		this.data  = data;
	}
	
	
	@Override
	public void write(NBTTagCompound cmp) {
		cmp.setByte(name, data);
	}

}
