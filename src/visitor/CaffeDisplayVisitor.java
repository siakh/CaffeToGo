package visitor;

import type.CaffeMild;
import type.Espresso;
import type.Milk;
import type.Sugar;
import unit.Caffe;

public class CaffeDisplayVisitor implements CaffePartVisitor {

	@Override
	public void visit(Caffe caffe) {
	      System.out.println("Extra Caffe with:");
	      System.out.println("-----------------");

	}

	@Override
	public void visit(Espresso espresso) {
	      System.out.println("Espresso shot.");

	}

	@Override
	public void visit(Sugar sugar) {
	      System.out.println("Sugar.");

	}

	@Override
	public void visit(CaffeMild caffeMild) {
	      System.out.println("Displaying Caffe Mild.");

	}

	@Override
	public void visit(Milk milk) {
	      System.out.println("Milk.");

	}

}
