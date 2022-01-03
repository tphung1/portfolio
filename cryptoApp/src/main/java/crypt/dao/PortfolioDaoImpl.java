package crypt.dao;

import crypt.entities.Portfolio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class PortfolioDaoImpl implements PortfolioDao {
    @Autowired //dependency injection
    JdbcTemplate jdbc;

    @Override
    public Portfolio getPortfolio(int userID) {
        final String GET_PORTFOLIO = "SELECT * FROM portfolioTable WHERE userID = ?;";

        return jdbc.queryForObject(GET_PORTFOLIO, new portfolioMapper(), userID);
    }

    public static final class portfolioMapper implements RowMapper<Portfolio> {

        @Override
        public Portfolio mapRow(ResultSet resultSet, int i) throws SQLException {
            Portfolio portfolio = new Portfolio();
            portfolio.setPortfolioID(resultSet.getInt("portfolioID"));
            portfolio.setUserID(resultSet.getInt("userID"));
            portfolio.setCryptoName(resultSet.getString("cryptoName"));
            portfolio.setHolding(resultSet.getDouble("holding"));
            portfolio.setBalance(resultSet.getDouble("balance"));
            portfolio.setQuantity(resultSet.getDouble("quantity"));
            portfolio.setPrice(resultSet.getDouble("price"));

            return portfolio;
        }
    }

}
