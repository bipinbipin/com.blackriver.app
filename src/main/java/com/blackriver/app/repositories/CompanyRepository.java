package com.blackriver.app.repositories;

import com.blackriver.app.domain.Company;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by Bipin on 5/6/2016.
 */
public interface CompanyRepository extends PagingAndSortingRepository<Company, Integer> {
}
