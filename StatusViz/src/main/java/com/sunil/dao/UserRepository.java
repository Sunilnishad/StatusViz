package com.sunil.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunil.lp.contact.Feature;

public interface UserRepository extends JpaRepository<Feature,Long> {

	Feature findByFeatureId(String featureId);
}
