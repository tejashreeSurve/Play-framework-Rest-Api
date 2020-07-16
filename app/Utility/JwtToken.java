package Utility;

import java.util.Date;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JwtToken {

	SignatureAlgorithm algorithm = SignatureAlgorithm.HS256;

	static String secretKey = "iamsecretkey";

	public String generateToken(String email) {
		return Jwts.builder().setId(email).setIssuedAt(new Date(System.currentTimeMillis()))
				.signWith(algorithm, secretKey).compact();
	}
	
	public String getToken(String token) {
		Claims claims = null; 
		try {
			claims = Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token).getBody();
		}catch(Exception e) {
			System.out.println("Invalide Token "+e);
		}
		return claims.getId();
	}
}
