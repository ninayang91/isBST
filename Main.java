import java.util.ArrayList;
import java.util.LinkedList;

import org.w3c.dom.Node;

public class Main {

	public static void main(String[] args) {

		
		TreeNode f =new TreeNode(3,null,null);
		TreeNode e =new TreeNode(1,null,null);
		TreeNode c =new TreeNode(5,null,null);
		TreeNode d= new TreeNode(2,e,f);
		TreeNode b= new TreeNode(4,d,null);
		TreeNode a= new TreeNode(5,b,c);
		System.out.println(isBST2(a));


	}
	public static boolean isBST(TreeNode t){
		return isBST(t,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}

	public static boolean isBST(TreeNode t, int leftMax, int rightMin){
		if(t==null) return true;
		if(leftMax>t.data || t.data>=rightMin)return false;//leftMax<=t.data<rightMin true
		if(!isBST(t.left,leftMax,t.data) || !isBST(t.right,t.data,rightMin))return false;
		return true;
	}
	
	public static int last_printed=Integer.MIN_VALUE;
	public static boolean isBST2(TreeNode t){
		if(t==null) return true;
		if(!isBST2(t.left)) return false;
		
		//last_printed is left value
		if(t.data<=last_printed)return false;//last_printed<t.data true
		last_printed=t.data;
		
		if(!isBST2(t.right)) return false;
		return true;
	}
	public static void printTree(TreeNode root){
		if(root==null) return;
		if(root.left!=null)printTree(root.left);
		System.out.println(root.data);
		if(root.right!=null)printTree(root.right);
	}

}
