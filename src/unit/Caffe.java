package unit;

import visitor.*;
import type.*;
import visitor.CaffePartVisitor;

public class Caffe implements CaffePart {

	CaffePart [] parts;
	public Caffe () {
		
		parts = new CaffePart[] {new Sugar(),new Milk(), new Espresso()};
	}
	@Override
	public void accept(CaffePartVisitor caffePartVisitor) {
		caffePartVisitor.visit(this);

		for (int i = 0; i < parts.length; i++) {
	         parts[i].accept(caffePartVisitor);
	      }

	}

}
