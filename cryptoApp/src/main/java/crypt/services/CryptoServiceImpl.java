package crypt.services;

import crypt.dao.PortfolioDao;
import crypt.entities.Portfolio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

@Repository
public class CryptoServiceImpl implements CryptoService {
    @Autowired
    PortfolioDao portfolioDao;

    @Override
    public Portfolio getPortfolio(int id) throws DataAccessException {

        return portfolioDao.getPortfolio(id);
    }
}
