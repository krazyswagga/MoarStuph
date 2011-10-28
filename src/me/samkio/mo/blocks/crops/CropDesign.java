package me.samkio.mo.blocks.crops;

import me.samkio.mo.MoarStuph;

import org.getspout.spoutapi.block.design.GenericBlockDesign;
import org.getspout.spoutapi.block.design.Quad;
import org.getspout.spoutapi.block.design.Texture;

public final class CropDesign extends GenericBlockDesign {
	
	public CropDesign(MoarStuph ms, Texture texture, int[] textureId) {
		setTexture(ms, texture.getTexture()).setMinBrightness(1F).setMaxBrightness(1F);
		setBoundingBox(0F, 0F, 0F, 0.15F, 0.60F, 0.60F);
		setQuadNumber(6);
		setMinBrightness(1F).setMaxBrightness(1.0F).setTexture(ms, texture);

		Quad bottom = new Quad(0, texture.getSubTexture(textureId[0]));
		bottom.addVertex(0, 0.40F, 0.0F, 0.60F);
		bottom.addVertex(1, 0.60F, 0.0F, 0.40F);
		bottom.addVertex(2, 0.40F, 0.0F, 0.40F);
		bottom.addVertex(3, 0.60F, 0.0F, 0.60F);
		//setLightSource(0, 0, -1, 0);
		
		Quad spout1 = new Quad(1, texture.getSubTexture(textureId[0]));
		spout1.addVertex(0, 0.40F, 0.15F, 0.60F);
		spout1.addVertex(1, 0.60F, 0.15F, 0.40F);
		spout1.addVertex(2, 0.40F, 0.0F, 0.40F);
		spout1.addVertex(3, 0.60F, 0.0F, 0.60F);
		//setLightSource(1, 0, -1, 0);

		Quad spout2 = new Quad(2, texture.getSubTexture(textureId[0]));
		spout2.addVertex(0, 0.40F, 0.0F, 0.60F);
		spout2.addVertex(1, 0.60F, 0.15F, 0.40F);
		spout2.addVertex(2, 0.40F, 0.15F, 0.40F);
		spout2.addVertex(3, 0.60F, 0.0F, 0.60F);
		//setLightSource(1, 0, -1, 0);
		
		Quad spout3 = new Quad(3, texture.getSubTexture(textureId[0]));
		spout3.addVertex(0, 0.40F, 0.0F, 0.60F);
		spout3.addVertex(1, 0.60F, 0.0F, 0.40F);
		spout3.addVertex(2, 0.40F, 0.15F, 0.40F);
		spout3.addVertex(3, 0.60F, 0.15F, 0.60F);
		///setLightSource(1, 0, -1, 0);
		
		Quad spout4 = new Quad(4, texture.getSubTexture(textureId[0]));
		spout4.addVertex(0, 0.40F, 0.15F, 0.60F);
		spout4.addVertex(1, 0.60F, 0.0F, 0.40F);
		spout4.addVertex(2, 0.40F, 0.0F, 0.40F);
		spout4.addVertex(3, 0.60F, 0.15F, 0.60F);
		//setLightSource(1, 0, -1, 0);
		
		Quad top = new Quad(5, texture.getSubTexture(textureId[0]));
		top.addVertex(0, 0.40F, 0.15F, 0.60F);
		top.addVertex(1, 0.60F, 0.15F, 0.40F);
		top.addVertex(2, 0.40F, 0.15F, 0.40F);
		top.addVertex(3, 0.60F, 0.15F, 0.60F);
		//setLightSource(0, 0, -1, 0);

		setQuad(bottom).setQuad(spout1).setQuad(spout2).setQuad(spout3).setQuad(spout4).setQuad(top);
	}
}