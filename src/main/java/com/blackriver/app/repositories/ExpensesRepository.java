package com.blackriver.app.repositories;

import com.blackriver.app.domain.Expenses;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by Bipin on 5/6/2016.
 */
public interface ExpensesRepository extends PagingAndSortingRepository<Expenses, Integer> {
}
