package Utility;

import java.util.Date;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JwtToken {
	// algrithm to varify signature
	SignatureAlgorithm algorithm = SignatureAlgorithm.HS256;
	// secret Key to return id which is been set
	static String secretKey = "iamsecretkey";

	// generate token method
	public String generateToken(String email) {
		return Jwts.builder().setId(email).setIssuedAt(new Date(System.currentTimeMillis()))
			.signWith(algorithm, secretKey).compact();
	}
	
	// get id for which token is generated
	public String getToken(String token) {
		Claims claims = null; 
		try {
			claims = Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token).getBody();
		}catch(Exception e) {
			System.out.println("Invalide Token "+e);
		}
		return claims.getId();
	}
	
	public void refreshToken(String token) {
		  final Claims claims = Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token).getBody();
		  claims.setExpiration(new Date(System.currentTimeMillis()));
		  Jwts.builder().setClaims(claims).signWith(algorithm, secretKey).compact();
		}
}
