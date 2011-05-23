/**
 * 
 */
package sim.data;

/**
 * @author valer
 *
 */
public interface MetricsVisitor {

	void visit(MethodMetrics methodMetrics);
	
    void visit(SystemMetrics systemMetrics);
    
}
