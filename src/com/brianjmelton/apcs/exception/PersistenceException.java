/*
 * Copyright 2014 Brian Melton
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.brianjmelton.apcs.exception;

/**
 * Wrapper for Throwables in persist & restore operations.
 * 
 * @author brianmelton
 * @since July 2014
 * 
 */
public class PersistenceException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * Constructs a new {@link PersistenceException} from the {@link Throwable}
	 * which caused it
	 * 
	 * @param t
	 *            the catalyst {@link Throwable} for this {@link Exception}
	 */
	public PersistenceException(Throwable t) {
		super(t);
	}
}
