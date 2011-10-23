package me.samkio.mo.blocks.misc.microwave;

import me.samkio.mo.MoarStuph;

import org.getspout.spoutapi.block.design.GenericBlockDesign;
import org.getspout.spoutapi.block.design.Quad;
import org.getspout.spoutapi.block.design.SubTexture;
import org.getspout.spoutapi.block.design.Texture;

public final class MicrowaveDesign extends GenericBlockDesign {
	public MicrowaveDesign(MoarStuph m) {
		Texture texture = m.MiscTextureFile;
		setBoundingBox(0, 0, 0, 1,  1, 1).setQuadNumber(11);
		setTexture(m, texture.getTexture()).setMinBrightness(1F).setMaxBrightness(1F);
		SubTexture subTex = texture.getSubTexture(0);
		SubTexture front = texture.getSubTexture(1);
		SubTexture back = texture.getSubTexture(2);
		SubTexture bottom = texture.getSubTexture(3);
		
		Quad bottom1 = new Quad(0, subTex);
		bottom1.addVertex(0, 0F, 0.01F, 1F);
		bottom1.addVertex(1, 1F, 0.01F, 1F);
		bottom1.addVertex(2, 1F, 0.01F, 0F);
		bottom1.addVertex(3, 0F, 0.01F, 0F);
		Quad bottom2 = new Quad(1, bottom);
		bottom2.addVertex(3, 0F, 0.01F, 1F);
		bottom2.addVertex(2, 1F, 0.01F, 1F);
		bottom2.addVertex(1, 1F, 0.01F, 0F);
		bottom2.addVertex(0, 0F, 0.01F, 0F);
		
		Quad left1 = new Quad(2, subTex);
		left1.addVertex(0, 0F, 0F, 0F);
		left1.addVertex(1, 1F, 0F, 0F);
		left1.addVertex(2, 1F, 1F, 0F);
		left1.addVertex(3, 0F, 1F, 0F);
		
		Quad left2 = new Quad(3, subTex);
		left2.addVertex(3, 0F, 0F, 0F);
		left2.addVertex(2, 1F, 0F, 0F);
		left2.addVertex(1, 1F, 1F, 0F);
		left2.addVertex(0, 0F, 1F, 0F);
		
		Quad back1 = new Quad(4, subTex);
		back1.addVertex(0, 1F, 0F, 0F);
		back1.addVertex(1, 1F, 0F, 1F);
		back1.addVertex(2, 1F, 1F, 1F);
		back1.addVertex(3, 1F, 1F, 0F);
		
		Quad back2 = new Quad(5, back);
		back2.addVertex(3, 1F, 0F, 0F);
		back2.addVertex(2, 1F, 0F, 1F);
		back2.addVertex(1, 1F, 1F, 1F);
		back2.addVertex(0, 1F, 1F, 0F);
		
		Quad right1 = new Quad(6, subTex);
		right1.addVertex(0, 0F, 0F, 1F);
		right1.addVertex(1, 1F, 0F, 1F);
		right1.addVertex(2, 1F, 1F, 1F);
		right1.addVertex(3, 0F, 1F, 1F);
		
		Quad right2 = new Quad(7, subTex);
		right2.addVertex(3, 0F, 0F, 1F);
		right2.addVertex(2, 1F, 0F, 1F);
		right2.addVertex(1, 1F, 1F, 1F);
		right2.addVertex(0, 0F, 1F, 1F);
		
		Quad front1 = new Quad(8, front);
		front1.addVertex(1, 0F, 0F, 0F);
		front1.addVertex(2, 0F, 0F, 1F);
		front1.addVertex(3, 0F, 1F, 1F);
		front1.addVertex(0, 0F, 1F, 0F);
		
		Quad top1 = new Quad(9, subTex);
		top1.addVertex(0, 1F, 1F, 0F);
		top1.addVertex(1, 1F, 1F, 1F);
		top1.addVertex(2, 0F, 1F, 1F);
		top1.addVertex(3, 0F, 1F, 0F);
		
		Quad top2 = new Quad(10, subTex);
		top2.addVertex(3, 1F, 1F, 0F);
		top2.addVertex(2, 1F, 1F, 1F);
		top2.addVertex(1, 0F, 1F, 1F);
		top2.addVertex(0, 0F, 1F, 0F);
		
	    this.setQuad(bottom1).setQuad(bottom2).setQuad(left1).setQuad(left2).setQuad(back1).setQuad(back2).setQuad(right2).setQuad(right1).setQuad(front1).setQuad(top1).setQuad(top2);
	}

	

}