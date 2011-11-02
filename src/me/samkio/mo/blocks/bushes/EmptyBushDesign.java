package me.samkio.mo.blocks.bushes;

import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.block.design.Quad;
import org.getspout.spoutapi.block.design.Texture;

import me.samkio.mo.MoarStuph;

public class EmptyBushDesign extends GenericCubeBlockDesign {
	private static int[] ids = {19,3,3,3,3,19};
	
	public EmptyBushDesign(MoarStuph p) {
		super(p, p.TreeTextureFile, ids);
		this.setMinBrightness(1F).setMaxBrightness(1F);
		Texture texture = p.TreeTextureFile;
		
		this.setQuadNumber(6);
		
		Quad bottom = new Quad(0, texture.getSubTexture(19));
		bottom.addVertex(3, 0.0f, 0.0f, 0.0f);
		bottom.addVertex(0, 1.0f, 0.0f, 0.0f);
		bottom.addVertex(1, 1.0f, 0.0f, 1.0f);
		bottom.addVertex(2, 0.0f, 0.0f, 1.0f);
		
		Quad front = new Quad(1, texture.getSubTexture(3));
		front.addVertex(0, 0.0f, 0.0f, 0.0f);
		front.addVertex(3, 1.0f, 0.0f, 0.0f);
		front.addVertex(2, 1.0f, 1.0f, 0.0f);
		front.addVertex(1, 0.0f, 1.0f, 0.0f);
		
		Quad back = new Quad(2, texture.getSubTexture(3));
		back.addVertex(3, 0.0f, 0.0f, 1.0f);
		back.addVertex(0, 1.0f, 0.0f, 1.0f);
		back.addVertex(1, 1.0f, 1.0f, 1.0f);
		back.addVertex(2, 0.0f, 1.0f, 1.0f);
		
		Quad left = new Quad(3, texture.getSubTexture(3));
		left.addVertex(3, 0.0f, 0.0f, 0.0f);
		left.addVertex(2, 0.0f, 1.0f, 0.0f);
		left.addVertex(1, 0.0f, 1.0f, 1.0f);
		left.addVertex(0, 0.0f, 0.0f, 1.0f);
		
		Quad right = new Quad(4, texture.getSubTexture(3));
		right.addVertex(0, 1.0f, 0.0f, 0.0f);
		right.addVertex(1, 1.0f, 1.0f, 0.0f);
		right.addVertex(2, 1.0f, 1.0f, 1.0f);
		right.addVertex(3, 1.0f, 0.0f, 1.0f);
		
		Quad top = new Quad(5, texture.getSubTexture(19));
		top.addVertex(2, 0.0f, 1.0f, 0.0f);
		top.addVertex(1, 1.0f, 1.0f, 0.0f);
		top.addVertex(0, 1.0f, 1.0f, 1.0f);
		top.addVertex(3, 0.0f, 1.0f, 1.0f);
		
		this.setQuad(bottom).setQuad(front).setQuad(back).setQuad(left).setQuad(right).setQuad(top);
		
	}

}
