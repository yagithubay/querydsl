/**
 * 
 */
package com.mysema.query.sql.dml;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nullable;

import net.jcip.annotations.Immutable;

import com.mysema.query.types.Expr;
import com.mysema.query.types.Path;
import com.mysema.query.types.SubQueryExpression;

/**
 * @author tiwe
 *
 */
@Immutable
public class SQLInsertBatch {        
    
    private final List<Path<?>> columns;
    
    private final List<Expr<?>> values;
    
    @Nullable
    private final SubQueryExpression<?> subQuery;
    
    public SQLInsertBatch(List<Path<?>> c, List<Expr<?>> v, @Nullable SubQueryExpression<?> sq) {
        columns = new ArrayList<Path<?>>(c);
        values = new ArrayList<Expr<?>>(v);
        subQuery = sq;
    }

    public List<Path<?>> getColumns() {
        return columns;
    }

    public List<Expr<?>> getValues() {
        return values;
    }

    public SubQueryExpression<?> getSubQuery() {
        return subQuery;
    }
    
    
}