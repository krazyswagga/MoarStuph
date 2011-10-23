package me.samkio.mo.blocks.cyrstals;

import me.samkio.mo.MoarStuph;

import org.getspout.spoutapi.block.design.GenericBlockDesign;
import org.getspout.spoutapi.block.design.Quad;
import org.getspout.spoutapi.block.design.SubTexture;
import org.getspout.spoutapi.block.design.Texture;

public final class CrystalDesign extends GenericBlockDesign {
	float thickness = 0.14F;
	float pointy = 0.2F;
	SubTexture subTex;
	int id = 0;

	public CrystalDesign(int tID, MoarStuph m) {
		Texture texture = m.OreTextureFile;
		setBoundingBox(0, 0, 0, 1, 1, 1).setQuadNumber(45);
		setTexture(m, texture.getTexture()).setMinBrightness(1F).setMaxBrightness(1F);
		this.subTex = texture.getSubTexture(tID);
		this.generateShard(0.8F, 0.20F, 0.1F, 0.5F, 0.5F, 0F, 0F); //Beast Shard
		this.generateShard(0.6F, 0.20F, 0.1F, 0.5F, 0.5F, 0.5F, 0F);
		this.generateShard(0.6F, 0.20F, 0.1F, 0.5F, 0.5F, -0.5F, 0F);	
		this.generateShard(0.6F, 0.20F, 0.1F, 0.5F, 0.5F, 0F, -0.5F);
		this.generateShard(0.6F, 0.20F, 0.1F, 0.5F, 0.5F, 0F, 0.5F);
	}

	private void generateShard(float height, float thickness, float pointy,	
			float x, float z, float rollz, float rollx) {
		float shardP1 = (float) (x - (thickness / 2)), shardP2 = (float) (z + (thickness / 2));
		if(rollz>1 || rollz<-1) return;
		if(rollx>1 || rollx<-1) return;
		//Rollz is Left/Right
		//Rollx is Top/Btm
	
		double degreeRollz = Math.asin(rollz);
		double degreeRollx = Math.asin(rollx);
		height = (float) ((Math.cos(degreeRollz)*height)+(Math.cos(degreeRollx)*height))/2;
		float shardP2Z = (float) (shardP2+Math.sin(degreeRollz)*height);
		float shardP1Z = (float) (shardP1+Math.sin(degreeRollz)*height);
		//height = (float) (Math.cos(degreeRollx)*height);
		float shardP2X = (float) (shardP2+Math.sin(degreeRollx)*height);
		float shardP1X = (float) (shardP1+Math.sin(degreeRollx)*height);
		
		Quad bottomShard1 = new Quad(id, subTex);
		bottomShard1.addVertex(0, shardP1, 0F, shardP1);
		bottomShard1.addVertex(1, shardP1, 0F, shardP2);
		bottomShard1.addVertex(2, shardP2, 0F, shardP2);
		bottomShard1.addVertex(3, shardP2, 0F, shardP1);
		id++;
		Quad shardLeft1 = new Quad(id, subTex);
		shardLeft1.addVertex(0, shardP1, 0F, shardP1);
		shardLeft1.addVertex(1, shardP1, 0F, shardP2);
		shardLeft1.addVertex(2, shardP1X, height, shardP2Z); 
		shardLeft1.addVertex(3, shardP1X, height, shardP1Z); 
		id++;
		Quad shardTop1 = new Quad(id, subTex);
		shardTop1.addVertex(0, shardP1, 0F, shardP2);
		shardTop1.addVertex(1, shardP2, 0F, shardP2);
		shardTop1.addVertex(2, shardP2X, height, shardP2Z);
		shardTop1.addVertex(3, shardP1X, height, shardP2Z);
		id++;
		Quad shardRight1 = new Quad(id, subTex);
		shardRight1.addVertex(0, shardP2, 0F, shardP2);
		shardRight1.addVertex(1, shardP2, 0F, shardP1);
		shardRight1.addVertex(2, shardP2X, height, shardP1Z);
		shardRight1.addVertex(3, shardP2X, height, shardP2Z);
		id++;
		Quad shardBtm1 = new Quad(id, subTex);
		shardBtm1.addVertex(0, shardP2, 0F, shardP1);
		shardBtm1.addVertex(1, shardP1, 0F, shardP1);
		shardBtm1.addVertex(2, shardP1X, height, shardP1Z);
		shardBtm1.addVertex(3, shardP2X, height, shardP1Z);
        z = (float) (z+Math.sin(degreeRollz)*(height+pointy));
        x = (float) (x+Math.sin(degreeRollx)*(height+pointy));
		id++;
		Quad shardTip1_1 = new Quad(id, subTex);
		shardTip1_1.addVertex(0, shardP1X, height, shardP1Z);
		shardTip1_1.addVertex(1, shardP1X, height, shardP2Z);
		shardTip1_1.addVertex(2, x, height + pointy, z);
		shardTip1_1.addVertex(3, x, height + pointy, z);
		id++;
		Quad shardTip2_1 = new Quad(id, subTex);
		shardTip2_1.addVertex(0, shardP1X, height, shardP2Z);
		shardTip2_1.addVertex(1, shardP2X, height, shardP2Z);
		shardTip2_1.addVertex(2, x, height + pointy, z);
		shardTip2_1.addVertex(3, x, height + pointy, z);
		id++;
		Quad shardTip3_1 = new Quad(id, subTex);
		shardTip3_1.addVertex(0, shardP2X, height, shardP2Z);
		shardTip3_1.addVertex(1, shardP2X, height, shardP1Z);
		shardTip3_1.addVertex(2, x, height + pointy, z);
		shardTip3_1.addVertex(3, x, height + pointy, z);
		id++;
		Quad shardTip4_1 = new Quad(id, subTex);
		shardTip4_1.addVertex(0, shardP2X, height, shardP1Z);
		shardTip4_1.addVertex(1, shardP1X, height, shardP1Z);
		shardTip4_1.addVertex(2, x, height + pointy, z);
		shardTip4_1.addVertex(3, x, height + pointy, z);
		id++;
		this.setQuad(bottomShard1).setQuad(shardLeft1).setQuad(shardTop1)
				.setQuad(shardRight1).setQuad(shardBtm1).setQuad(shardTip1_1)
				.setQuad(shardTip2_1).setQuad(shardTip3_1).setQuad(shardTip4_1);
	}

}