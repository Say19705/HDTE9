import java.util.*;
import java.util.Map;
import java.util.concurrent.*;

public class SplayTree implements Map{
	SplayTree splayTree = new SplayTree();

	@Override
	public void putAll(Map other) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean containsKey(Object key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object get(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object put(Object key, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object remove(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Collection values() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private String key;
    private Object value;
    private SplayTree left, right;
    //TreeNode treen = new TreeNode();
    
    //TreeNode root;

    public SplayTree(String key, Object value)
    {
      this.key = key;
      this.value = value;
    }
    

    public SplayTree() {
		// TODO Auto-generated constructor stub
	}


	public Object get( String key )
    {
      if (this.key.equals(key))
      {
        return value;
      }

      if (key.compareTo(this.key) < 0 )
      {
        return left == null ? null : left.get(key);
      }
      else
      {
        return right == null ? null : right.get(key);
      }
    }

    public void put(String key, Object value)
    {
      if (key.compareTo(this.key) < 0)
      {
        if (left != null)
        {
          left.put(key, value);
        }
        else
        {
          left = new SplayTree(key, value);
        }
      }
      else if (key.compareTo(this.key) > 0)
      {
        if (right != null)
        {
          right.put(key, value);
        }
        else
        {
          right = new SplayTree(key, value);
        }
      }
      else
      {
        this.value = value;
      }
    }
    
    public void inOrder(SplayTree bt) {
    	if(bt==null) {
    		return;
    	}
    	if(left != null) {
    		System.out.println(left.key+" "+left.value);
    		if(left.left!= null) {
    			System.out.println(left.left.key+" "+left.left.value);
    			if(left.left.left!= null) {
        			System.out.println(left.left.left.key+" "+left.left.left.value);
        			if(left.left.left.left!= null) {
            			System.out.println(left.left.left.left.key+" "+left.left.left.left.value);
        			}
        			if(left.left.left.right!= null) {
            			System.out.println(left.left.left.right.key+" "+left.left.left.right.value);
        			}
    			}
    			if(left.left.right!= null) {
        			System.out.println(left.left.left.key+" "+left.left.left.value);
        			if(left.left.left.right!= null) {
            			System.out.println(left.left.left.right.key+" "+left.left.left.right.value);
        			}
    			}
    		}
    		if (left.right != null) {
    			System.out.println(left.right.key+" "+left.right.value);
    			if(left.right.right!= null) {
        			System.out.println(left.right.right.key+" "+left.right.right.value);
        			if(left.right.right.right!= null) {
            			System.out.println(left.left.left.left.key+" "+left.left.left.left.value);
        			}
        			if(left.right.right.left!= null) {
            			System.out.println(left.left.left.right.key+" "+left.left.left.right.value);
        			}
    			}
    			if(left.right.left!= null) {
        			System.out.println(left.right.left.key+" "+left.right.left.value);
        			if(left.right.left.left!= null) {
            			System.out.println(left.left.left.left.key+" "+left.left.left.left.value);
        			}
        			if(left.right.left.right!= null) {
            			System.out.println(left.left.left.right.key+" "+left.left.left.right.value);
        			}
    			}
    		}
    		System.out.println(bt.key+" " +bt.value);
    	}
    	else if (right != null) {
    		System.out.println(bt.key+ " " +bt.value);
    		System.out.println(right.key+" "+right.value);
    		if(right.left!= null) {
    			System.out.println(right.left.key+" "+right.left.value);
    			if(right.left.left!= null) {
        			System.out.println(right.left.left.key+" "+right.left.left.value);
        		}
    			if(right.left.right!= null) {
        			System.out.println(right.left.left.key+" "+right.left.left.value);
        		}
    		}
    		if (right.right != null) {
    			System.out.println(right.right.key+" "+right.right.value);
    			if(right.left.right!= null) {
        			System.out.println(right.left.right.key+" "+right.left.right.value);
        		}
    			if(right.left.right!= null) {
        			System.out.println(right.left.right.key+" "+right.left.right.value);
        		}
    		}
    	}
    	//inOrder(left);
    	//inOrder(left);
    }

}

